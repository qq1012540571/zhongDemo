<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width" />
	<title>中民积分宝-小积分，大保障！网购获中民积分，兑换高额保障或超值好礼</title>
	<meta name="keywords" content="中民,积分,中民积分,中民积分宝,积分兑换,网购获中民积分,网上购物获积分,积分换礼品" />
	<meta name="description"
		content="中民积分宝现与天猫、淘宝、京东、携程等多家电商网站及知名品牌店铺达成合作,通过中民积分宝前往淘宝、天猫、京东、携程等200+电商平台购物获中民积分，中民积分宝可兑换高至300万保额保险，小积分大保障！还可兑换超值好礼和红酒，惊喜连连。" />
	<link
		href="https://img2.zm123.com/MVC_IE/Scripts/jquery.bxslider/bxslider-4-4.1.3/jquery.bxslider.css?v=20190624450350"
		rel="stylesheet" type="text/css" />
	<link href="https://img2.zm123.com/MVC/Content/rebate/header_20181019.css?v=20190624450350" rel="stylesheet"
		type="text/css" />
	<link href="https://img2.zm123.com/MVC/Content/rebate/index_rebate.css?v=20190624450350" rel="stylesheet"
		type="text/css" />
	<link href="https://img2.zm123.com/MVC/Content/mall/zmmall_20171115.css?v=20190624450350" rel="stylesheet"
		type="text/css" />
	<link href="https://images.zm123.com/zmjfb/css/hompage201907.css" rel="stylesheet" type="text/css" />
	<link href="https://img2.zm123.com/MVC/Content/common.css?v=20190624450350" rel="stylesheet" type="text/css" />
	<script src="https://img2.zm123.com/MVC_IE/Scripts/jquery-1.8.3.min.js" type="text/javascript"></script>
	<script type="text/javascript"
		src="http://images.zhongmin.cn/zhongmin2017/index/js/jquery.flexslider-min.js"></script>
	<script src="https://images.zm123.com/zmjfb/js/home2019.js"> </script>
	<script src="https://images.zm123.com/zmjfb/js/jquery.carouFredSel-6.1.0-packed.js"></script>
	<script src="js/JsonpAjax.js"></script>
</head>

<body class="bgf5">
	<!-- 头部 -->
	<div class="header wrapper-header">
		<!-- 顶部 -->
		<div class="top">
			<div class="wrapper">
				<div class="topLeft">
					<ul>
						<li class="no_login">
							Hi，欢迎来到中民积分宝，请
							<a href="#" class="fz-org" style="margin-left: 0">登录</a>
							<span class="icon divider"></span>
						</li>
						<li class="no_login">
							<a href="#" class="fz-org">免费注册</a>
						</li>
					</ul>
				</div>
				<div class="topCenter"></div>
				<div class="topRight" id="divLogin">
					<ul>
						<li>
							<a href="#">收藏本站</a>
						</li>
						<li class="  site_nav_wrap">
							<span class="icon divider left"></span>
							<span class="top-i-up">网址导航</span>
							<div class="site-nav" style="display: none">
								<ul>
									<li class="site-nav-item site-nav-item1">
										<p class="titnav">行业</p>
										<ul class="clearfix">
											<li class="itema">
												<a href="#">综合商场</a>
											</li>
											<li class="itema">
												<a href="#">旅行票务</a>
											</li>
											<li class="itema">
												<a href="#">数码家电</a>
											</li>
											<li class="itema">
												<a href="#">配饰鞋包</a>
											</li>
											<li class="itema">
												<a href="#">海淘特卖</a>
											</li>
											<li class="itema">
												<a href="#">美妆个护</a>
											</li>
											<li class="itema">
												<a href="#">食品百货</a>
											</li>
											<li class="itema">
												<a href="#">母婴保健</a>
											</li>
											<li class="itema">
												<a href="#"> 图书影音</a>
											</li>
											<li class="itema">
												<a href="#"> 房车家居</a>
											</li>
										</ul>
									</li>
									<li class="site-nav-item site-nav-item2">
										<p class="titnav">频道</p>
										<ul class="clearfix bdlr">
											<li class="itema">
												<a href="#">兑换权益</a>
											</li>
											<li class="itema">
												<a href="#">兑换红酒</a>
											</li>
											<li class="itema">
												<a href="#">兑换保险</a>
											</li>
											<li class="itema">
												<a href="#">中民甄选</a>
											</li>
											<li class="itema">
												<a href="#">优惠券</a>
											</li>
										</ul>
									</li>
									<li class="site-nav-item site-nav-item3">
										<p class="titnav">服务</p>
										<ul class="clearfix">
											<li class="itema">
												<a href="#">我的订单</a>
											</li>
											<li class="itema">
												<a href="#">兑换记录</a>
											</li>
											<li class="itema">
												<a href="#">售后管理</a>
											</li>
											<li class="itema">
												<a href="#">跳转管理</a>
											</li>
											<li class="itema">
												<a href="#">账户安全</a>
											</li>
											<li class="itema">
												<a href="#">账户安全</a>
											</li>
											<li class="itema">
												<a href="#">意见反馈</a>
											</li>
											<li class="itema">
												<a href="#">在线客服</a>
											</li>
										</ul>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<span class="icon divider left"></span>
							<a href="#" target="_blank">
								帮助中心
							</a>
						</li>
						<li>
							<span class="icon divider left"></span>
							<a href="javascript:ec_cs_fnDialogOK();">
								客服热线：<span class="fz-org fz-w">400-8822-300转8</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- 顶部 end-->
		<!--logo栏-->
		<div class="wrapper logoBox" style="z-index: 8">
			<a class="icon logo rebate" href="/"
				style="background:url(https://images.zm123.com/zmjfb/images/logo.png) no-repeat left center"></a>
			<div class="header-nav">
				<ul>
					<li><a href="#" class="cur">京东</a></li>
					<li> <a href="#">淘宝</a></li>
					<li> <a href="#">优惠券</a></li>
					<li><a href="#">健康计划</a><a href="#">中民积分宝卡</a></li>
					<li class="headerpholi">
						<a href="#" class="headerpho">手机版</a>
						<div class="headerphoalert">
							<img src="https://images.zm123.com/zmjfb/images/headerphoalert.png">
						</div>
					</li>
				</ul>
			</div>
			<!--logo栏右侧-->
			<div class="logoRight">
				<!--搜索-->
				<div class="seachBox" id="searchType">
					<input type="hidden" id="searchSelectedValue" value="1 ">
					<input class="seachInput" type="text" autocomplete="off" style="color: #aaa" placeholder="输入商家名称搜索">
					<input type="button" class="seachBtn">
					<div class="pullAbs2" style="display: none;">
						<!--<p class="tit">搜索“京东”相关商城 </p>
						<ul>
							<li>京东</li>
						</ul>
						<p class="tit">搜索“京东”相关商品 >> </p>
						<ul>
							<li>京东家乐福套装 </li>
							<li>京东化妆品</li>
							<li>京东数码</li>
						</ul>
						<div class="noCont">暂无相关内容</div>
						-->
						
						
					</div>
				</div>
				<!--搜索-->
			</div>
			<!--logo栏右侧-->
		</div>
		<!--logo栏-->
	</div>
	<!-- 头部 end-->
	<!-- 主体 -->
	<div class="bannerindex">
		<div class="banner-box flexslider">
			<ul class="banner-bg-box clearfix slides">
				<li style="background: url(https://images.zm123.com/zmjfb/images/banner.png) center top no-repeat">
					<a href=""></a>
				</li>
				<li style="background: url(https://images.zm123.com/zmjfb/images/banner.png) center top no-repeat">
					<a href=""></a>
				</li>
				<li style="background: url(https://images.zm123.com/zmjfb/images/banner.png) center top no-repeat">
					<a href=""></a>
				</li>
				<li style="background: url(https://images.zm123.com/zmjfb/images/banner.png) center top no-repeat">
					<a href=""></a>
				</li>
				<li style="background: url(https://images.zm123.com/zmjfb/images/banner.png) center top no-repeat">
					<a href=""></a>
				</li>
			</ul>
		</div>
		<div class="bannerBox">
			<div class="tabNav">
				<ul>
					<li class="active">我的主页</li>
					<li>热门商家</li>
				</ul>
			</div>
			<div class="tabCont">
				<div class="boxcont">
					<ul class="shopLogo clearfix">
						<li>
							<a href="#"></a>
							<img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img class="shoptj" src="https://images.zm123.com/zmjfb/images/shoptj.png"><img
								src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%"></li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li class="setZy"><a href="#"></a>设置 >></li>
					</ul>
				</div>
				<div class="boxcont hide">
					<ul class="shopLogo clearfix">
						<li>
							<a href="#"></a>
							<img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img class="shoptj" src="https://images.zm123.com/zmjfb/images/shoptj.png"><img
								src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%"></li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a><img src="https://images.zm123.com/MembersArea/images/fanli/jftaobao.png" height="100%">
						</li>
						<li><a href="#"></a>查看更多 >></li>
					</ul>
				</div>
			</div>
			<div class="bzjh300" style="display: none">
				<img src="https://images.zm123.com/zmjfb/images/bzjh300.png">
			</div>
			<div class="bzjh300" style="display: block">
				<p class="num">1798098</p>
				<img src="https://images.zm123.com/zmjfb/images/bzjhed.png">
			</div>
		</div>
	</div>
	<div class="jflist">
		<div class="wrapper">
			<ul class="clearfix">
				<li><a href="#"><img src="https://images.zm123.com/zmjfb/images/jflist1.png"></a></li>
				<li><a href="#"><img src="https://images.zm123.com/zmjfb/images/jflist2.png"></a></li>
				<li><a href="#"><img src="https://images.zm123.com/zmjfb/images/jflist3.png"></a></li>
			</ul>
		</div>
	</div>
	<div class="wrapper cardbox">
		<div class="tit">
			<span>积分兑换</span>
			<div class="titr">
				<a href="">兑换红酒</a>
				<a href="">兑换保险</a>
				<a href="">兑换权益</a>
				<a href="">更多 ></a>
			</div>
		</div>
		<div id="carousel">
			<ul>
				<li>
					<img src="https://images.zm123.com/rebate/images/Mall/TrueWhite201809211800068530.jpg" />
					<p class="shoptit">网票网2D/3D电影通兑通兑通兑通兑通兑通兑票</p>
					<p class="jf">75600中民积分</p>
				</li>
				<li>
					<img src="https://images.zm123.com/rebate/images/Mall/Truewhite201810191643088530.jpg" />
					<p class="shoptit">网票网2D/3D电影通兑通兑通兑通兑通兑通兑票</p>
					<p class="jf">75600中民积分</p>
				</li>
				<li>
					<img src="https://images.zm123.com/rebate/images/Mall/Truewhite201810191724094620.jpg" />
					<p class="shoptit">网票网2D/3D电影通兑通兑通兑通兑通兑通兑票</p>
					<p class="jf">75600中民积分</p>
				</li>
				<li>
					<img src="https://images.zm123.com/rebate/images/Mall/Truewhite201810191709299000.jpg" />
					<p class="shoptit">网票网2D/3D电影通兑通兑通兑通兑通兑通兑票</p>
					<p class="jf">75600中民积分</p>
				</li>
				<li>
					<img src="https://images.zm123.com/rebate/images/Mall/Truewhite201901211125363470.jpg" />
					<p class="shoptit">网票网2D/3D电影通兑通兑通兑通兑通兑通兑票</p>
					<p class="jf">75600中民积分</p>
				</li>
				<li>
					<img src="https://images.zm123.com/rebate/images/Mall/upload201807021552108270.jpg" />
					<p class="shoptit">九阳多功能豆浆机 </p>
					<p class="jf">75600中民积分</p>
				</li>
			</ul>
			<div class="clearfix"></div>
			<a id="prev" class="prev" href="#">&lt;</a>
			<a id="next" class="next" href="#">&gt;</a>
		</div>
	</div>
	<div class="wrapper cardbox">
		<div class="tit">
			<span>中民优选</span>
			<div class="titr">
				<a href="">更多 ></a>
			</div>
		</div>
		<div>
			<div class="zmGood clearfix">
				<ul class="clearfix">
					<li>
						<a href="#">
							<div class="zmGoodimg"><img
									src="https://images.zm123.com/rebate/images/taobaoCoupon/201907021110063260.jpg"></div>
							<div class="zmGoodinfor">
								<p class="zmGoodmx fz_12 fz_6 type-tm ">
									大容量玻璃杯带盖水瓶过滤水杯男随手杯创意泡茶杯便携杯子1000ml
								</p>
								<div class="zmGoodpr coupeTip clearfix">
									<img class="coupeimg" src="https://images.zm123.com/zmjfb/images/coupeTip.png">
									<div class="f_l lh_3">
										<span class="xprice fz_24"><i class="fz_18 mr_3">¥</i>14.90</span>
										<span class="yprice fz_12 fz_9">¥24.90</span>
									</div>
									<div class="f_r zmGoodj">月销23624件</div>
								</div>
							</div>
						</a>
					</li>
					<li>
						<a href="#">
							<div class="zmGoodimg"><img
									src="https://images.zm123.com/rebate/images/taobaoCoupon/201907021110063260.jpg"></div>
							<div class="zmGoodinfor">
								<p class="zmGoodmx fz_12 fz_6 type-tm ">
									大容量玻璃杯带盖水瓶过滤水杯男随手杯创意泡茶杯便携杯子1000ml
								</p>
								<!-- coupeTip类 显示券后价标志-->
								<div class="zmGoodpr clearfix">
									<img class="coupeimg" src="https://images.zm123.com/zmjfb/images/coupeTip.png">
									<div class="f_l lh_3">
										<span class="xprice fz_24"><i class="fz_18 mr_3">¥</i>14.90</span>
										<span class="yprice fz_12 fz_9">¥24.90</span>
									</div>
									<div class="f_r zmGoodj">月销23624件</div>
								</div>
							</div>
						</a>
					</li>
					<li>
						<a href="#">
							<div class="zmGoodimg"><img
									src="https://images.zm123.com/rebate/images/taobaoCoupon/201907021110063260.jpg"></div>
							<div class="zmGoodinfor">
								<p class="zmGoodmx fz_12 fz_6 type-tm ">
									大容量玻璃杯带盖水瓶过滤水杯男随手杯创意泡茶杯便携杯子1000ml
								</p>
								<!-- coupeTip类 显示券后价标志-->
								<div class="zmGoodpr clearfix">
									<img class="coupeimg" src="https://images.zm123.com/zmjfb/images/coupeTip.png">
									<div class="f_l lh_3">
										<span class="xprice fz_24"><i class="fz_18 mr_3">¥</i>14.90</span>
										<span class="yprice fz_12 fz_9">¥24.90</span>
									</div>
									<div class="f_r zmGoodj">月销23624件</div>
								</div>
							</div>
						</a>
					</li>
					<li>
						<a href="#">
							<div class="zmGoodimg"><img
									src="https://images.zm123.com/rebate/images/taobaoCoupon/201907021110063260.jpg"></div>
							<div class="zmGoodinfor">
								<p class="zmGoodmx fz_12 fz_6 type-tm ">
									大容量玻璃杯带盖水瓶过滤水杯男随手杯创意泡茶杯便携杯子1000ml
								</p>
								<!-- coupeTip类 显示券后价标志-->
								<div class="zmGoodpr clearfix">
									<img class="coupeimg" src="https://images.zm123.com/zmjfb/images/coupeTip.png">
									<div class="f_l lh_3">
										<span class="xprice fz_24"><i class="fz_18 mr_3">¥</i>14.90</span>
										<span class="yprice fz_12 fz_9">¥24.90</span>
									</div>
									<div class="f_r zmGoodj">月销23624件</div>
								</div>
							</div>
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- 主体 end-->
	<!-- 弹框 -->
	<div class="opacitybg" style="display: block"></div>
	<!-- 主页管理 -->
	<div class="showbox zygliq" style="display: none">
		<p class="tit">主页管理</p>
		<div class="xzbox">
			<p class="tit2"><span>我的主页</span><span class="f_r close">保存并关闭</span></p>
			<ul id="selectL" class="clearfix">
				<li onclick="selectlr(this)">
					<img class="tip" src="https://images.zm123.com/zmjfb/images/minuicon.png">
					<img class="logoimg" src="https://images.zm123.com/MembersArea/images/fanli/PC201902151756203570.jpg">
				</li>
				<li onclick="selectlr(this)">
					<img class="tip" src="https://images.zm123.com/zmjfb/images/minuicon.png">
					<img class="logoimg" src="https://images.zm123.com/MembersArea/images/fanli/PC201902151756203570.jpg">
				</li>
				<li onclick="selectlr(this)">
					<img class="tip" src="https://images.zm123.com/zmjfb/images/minuicon.png">
					<img class="logoimg" src="https://images.zm123.com/MembersArea/images/fanli/PC201902151756203570.jpg">
				</li>
			</ul>
		</div>
		<div class="xzbox">
			<div class="tit2">
				<span>添加商家</span>
				<span class="f_r searchzy">
					<input class="ipt" placeholder="输入商家名称">
					<input type="button" class="seachBtn">
				</span>
			</div>
			<ul id="selectR" class="clearfix">
				<li onclick="selectrl(this)">
					<img class="tip" src="https://images.zm123.com/zmjfb/images/addicon.png">
					<img class="logoimg" src="https://images.zm123.com/MembersArea/images/fanli/PC201902151756203570.jpg">
				</li>
			</ul>
		</div>
	</div>
	<!-- 加入中民健康保险计划 -->
	<div class="showbox1 jrzmjkjh" style="display: none">
		<div class="jrzmjkjhcont">
			<a href="#"><img src="https://images.zm123.com/rebate/images/index/close-no.jpg" class="close "></a>
			<p class="fz_9 t1"><img src="https://images.zm123.com/zmjfb/images/dddd.png">加入中民健康保险计划<img
					src="https://images.zm123.com/zmjfb/images/dddd.png"></p>
			<p class="t3">300万保障不花钱</p>
			<div class="divimg">
				<img src="https://www.zm123.com/common/QRCode?type=1&t=1562828425461" width="100%">
			</div>
			<p class="t4">扫一扫，立即加入</p>
		</div>
	</div>
	<!-- 我的中民健康保险计划 -->
	<div class="showbox1 jrzmjkjh" style="display: none">
		<div class="jrzmjkjhcont">
			<a href="#"><img src="https://images.zm123.com/rebate/images/index/close-no.jpg" class="close "></a>
			<p class="t2">我的中民健康保险计划</p>
			<div class="divimg">
				<img src="https://www.zm123.com/common/QRCode?type=1&t=1562828425461" width="100%">
			</div>
			<p class="t4">下载中民积分宝APP<br>查看明细</p>
		</div>
	</div>
	<!-- 我的中民健康保险计划 -->
	<div class="showbox1 jrzmjkjh" style="display: block">
		<div class="jrzmjkjhcont">
			<a href="#"><img src="https://images.zm123.com/rebate/images/index/close-no.jpg" class="close "></a>
			<p class="t2">股票开户获2万中民积分</p>
			<div class="divimg">
				<img src="https://www.zm123.com/common/QRCode?type=1&t=1562828425461" width="100%">
			</div>
			<p class="t4">下载中民积分宝APP<br>立即开户</p>
		</div>
	</div>
	<!-- footer-->
	<div class="footer">
		<div class="wrapper">
			<div class="footPad">
				<div class="clearfix mb20">
					<!--二维码-->
					<div class="qcBox">
						<div class="qcLeft">
							<img class="flo-l mt4 mr8" src="https://images.zm123.com/fanli/images/head_foot/app_downcode.png">
							<div class="flo-l">
								<p class="qcTit">手机APP</p>
								<p>随时随地积分</p>
								<a href="https://service.zm123.com/app_download/V5.5.0.apk" target=" _blank"><img class="mb4"
										src="https://images.zm123.com/fanli/images/head_foot/btn_down_android.png"></a><a
									href="https://itunes.apple.com/cn/app/id993068253?mt=8" target="_blank"><img
										src="https://images.zm123.com/fanli/images/head_foot/btn_down_ios.png"></a>
							</div>
						</div>
						<div class="qcLeft">
							<img class="flo-l mt4 mr8" style="width: 88px; height: 88px;"
								src="https://images.zm123.com/rebate/images/head_foot/wx_qrcode_20190123.jpg">
							<div class="flo-l">
								<p class="qcTit">官方微信</p>
								<p>订单动态提醒</p>
								<p>账户信息全面掌握</p>
								<p>优惠福利送不停</p>
							</div>
						</div>
					</div>
					<!--二维码-->
					<div></div>
					<!--新手指南-->
					<div class="askBox">
						<span class="askTit">新手指南</span>
						<a href="/helpCenter" target="_blank">新手上路指南</a>
						<a href="/helpCenter?cid=11" target="_blank">兑换保险说明</a>
						<a href="/helpCenter?cid=8" target="_blank">换购红酒说明</a>
					</div>
					<div class="askBox">
						<span class="askTit">积分问题</span>
						<a href="/helpCenter?cid=2#div87" target="_blank">购物获积分流程</a>
						<a href="/helpCenter?cid=2#div88" target="_blank">积分订单状态</a>
						<a href="/helpCenter?cid=2#div95" target="_blank">积分到账周期</a>
					</div>
					<div class="askBox">
						<span class="askTit">积分兑换</span>
						<a href="/helpCenter?cid=12#div142" target="_blank">下单购买流程</a>
						<a href="/helpCenter?cid=12#div146" target="_blank">商品签收须知</a>
						<a href="/helpCenter?cid=12#div147" target="_blank">商品退换货说明</a>
					</div>
					<div class="askBox2">
						<p><span class="askTit">客户服务</span></p>
						<p class="mb10">
							在线客服：
							<a href="javascript:;" onclick="ec_cs_fnDialogOK();return false;" target="_blank" rel="nofollow">
								<img src="https://images.zm123.com/fanli/images/head_foot/btn_dkdh.png">
							</a>
						</p>
						<p>热线电话：<span class="call">400-8822-300转8</span></p>
					</div>
					<!--新手指南-->
				</div>

				<!--关于中民-->
				<div class="contactBox"> <a href="/about">关于中民积分宝</a><a href="/about?t=2">联系我们</a><a
						href="/about?t=1">加入我们</a><a href="/helpCenter" style="background:none;">帮助中心</a></div>
				<div class="txtcenter">Copyright©2019 www.zm123.com. All Rights Reserved. <a
						href="https://images.zm123.com/rebate/images/head_foot/business_license.jpg" target="_blank">营业执照</a> <a
						href="https://images.zm123.com/rebate/images/head_foot/publication_management_license.jpg"
						target="_blank">出版物经营许可证</a> <a
						href="https://images.zm123.com/rebate/images/head_foot/food_hygiene_licence.jpg" target="_blank">食品流通许可证</a>
					<a href="http://www.miitbeian.gov.cn" target="_blank">粤ICP备18011416号-1</a></div>
				<!--关于中民-->
			</div>
		</div>
	</div>
	<!-- footer end-->
	<script type="text/javascript">
		// 弹框居中
		function popup(popupName) {
			_windowHeight = $(window).height(),//获取当前窗口高度 
				_windowWidth = $(window).width(),//获取当前窗口宽度 
				_popupHeight = popupName.height(),//获取弹出层高度 
				_popupWeight = popupName.width();//获取弹出层宽度 
			_posiTop = (_windowHeight - _popupHeight) / 2;
			_posiLeft = (_windowWidth - _popupWeight) / 2;
			popupName.css({ "left": _posiLeft + "px", "top": _posiTop + "px" });//设置position 
		}
		$(window).resize(function () {
			popup($(".showbox"));
		});
		$(function () {
			// 主页设置
			$(".setZy").click(function () {
				popup($(".showbox"));
				$('.opacitybg').show();
				$('.zygliq').show();
			});
			$(".close").click(function () {
				$('.opacitybg').hide();
				$('.zygliq').hide();
				$('.jrzmjkjh').hide();
			});
		});
		// 主页管理双向选择
		function selectlr(obj) {
			$(obj).attr("onclick", "selectrl(this)");
			$(obj).remove().appendTo($("#selectR"));
			$('#selectR li .tip').attr('src', 'https://images.zm123.com/zmjfb/images/' + 'addicon.png');
		};
		function selectrl(obj) {
			$(obj).attr("onclick", "selectlr(this)");
			$(obj).remove().appendTo($("#selectL"));
			$('#selectL li .tip').attr('src', 'https://images.zm123.com/zmjfb/images/' + 'minuicon.png');
		};
	</script>
</body>

</html>