$(function(){
//当键盘键被松开时发送Ajax获取数据
		$('.seachInput').keyup(function(){
			var keywords = $(this).val();
	
			
			if (keywords=='') { $('.pullAbs2').hide(); return };
			$.ajax({
				type:"POST",
				url: "http://127.0.0.1:9200/mycompany/_search",
				data:JSON.stringify({query:{match_phrase:{companyname:keywords}}}),
				dataType: 'json',
				contentType:'application/json; charset=UTF-8',
				// jsonpCallback: 'fun', //回调函数名(值) value
				success:function(data){
					$('.pullAbs2').empty().show();
					if (data=='')
					{    
						$('.pullAbs2').append('<div class="error">Not find  "' + keywords + '"</div>');
					}
					var day=data.hits.hits;
					var html="<ul>"
					$.each(day, function(idx,obj){
						 html=html+"<li class='company' id='"+obj._source.companyId+"'>"+obj._source.companyname+"</li>"
					})
					html=html+"</ul>";
					$('.pullAbs2').append(html);
				},
				error:function(){
					
				}
			})
		})
//点击搜索数据复制给搜索框
		$(document).on('click','.company',function(){
			var word = $(this).text();
			$('.seachInput').val(word);
			$('.pullAbs2').hide();
			// $('#texe').trigger('click');触发搜索事件
		})
		
			/*鼠标点击其他地方，补全的div消失  */
 		$("body").mouseup(function(){
 			$(".pullAbs2").hide();
 		});
 		

	})