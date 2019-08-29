package com.xiaoqiang.entiy;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 * 
 * @author wcyong
 * 
 * @date 2019-08-13
 */
public class ZmTopcoupon {
    /**
     * 第一页显示结束时间
     */
    private Integer id;

    /**
     * 第一页显示结束时间
     */
    private Long productid;

    /**
     * 第一页显示结束时间
     */
    private String productname;

    /**
     * 第一页显示结束时间
     */
    private Integer bigclassid;

    /**
     * 第一页显示结束时间
     */
    private Integer classid;

    /**
     * 第一页显示结束时间
     */
    private Integer monthsale;

    /**
     * 第一页显示结束时间
     */
    private BigDecimal price;

    /**
     * 第一页显示结束时间
     */
    private BigDecimal commission;

    /**
     * 第一页显示结束时间
     */
    private BigDecimal couponprice;

    /**
     * 第一页显示结束时间
     */
    private BigDecimal couponpercent;

    /**
     * 第一页显示结束时间
     */
    private BigDecimal couponvalue;

    /**
     * 第一页显示结束时间
     */
    private String mainimg;

    @Override
    public String toString() {
        return "ZmTopcoupon{" +
                "id=" + id +
                ", productid=" + productid +
                ", productname='" + productname + '\'' +
                ", bigclassid=" + bigclassid +
                ", classid=" + classid +
                ", monthsale=" + monthsale +
                ", price=" + price +
                ", commission=" + commission +
                ", couponprice=" + couponprice +
                ", couponpercent=" + couponpercent +
                ", couponvalue=" + couponvalue +
                ", mainimg='" + mainimg + '\'' +
                ", platform='" + platform + '\'' +
                ", plattype=" + plattype +
                ", couponid='" + couponid + '\'' +
                ", couponallnum=" + couponallnum +
                ", couponleftnum=" + couponleftnum +
                ", coupondetail='" + coupondetail + '\'' +
                ", coupontakennum=" + coupontakennum +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", pclink='" + pclink + '\'' +
                ", waplink='" + waplink + '\'' +
                ", ioslink='" + ioslink + '\'' +
                ", andlink='" + andlink + '\'' +
                ", addtime=" + addtime +
                ", ison=" + ison +
                ", catName='" + catName + '\'' +
                ", productdetailpage='" + productdetailpage + '\'' +
                ", tbklink='" + tbklink + '\'' +
                ", incomepercent=" + incomepercent +
                ", nick='" + nick + '\'' +
                ", sellerid=" + sellerid +
                ", storename='" + storename + '\'' +
                ", isdelete=" + isdelete +
                ", updatetime=" + updatetime +
                ", isindex=" + isindex +
                ", sort=" + sort +
                ", indexendtime=" + indexendtime +
                ", isfirstpage=" + isfirstpage +
                ", firstpagesort=" + firstpagesort +
                ", firstpageendtime=" + firstpageendtime +
                '}';
    }

    /**
     * 第一页显示结束时间
     */
    private String platform;

    /**
     * 第一页显示结束时间
     */
    private Short plattype;

    /**
     * 第一页显示结束时间
     */
    private String couponid;

    /**
     * 第一页显示结束时间
     */
    private Long couponallnum;

    /**
     * 第一页显示结束时间
     */
    private Long couponleftnum;

    /**
     * 第一页显示结束时间
     */
    private String coupondetail;

    /**
     * 第一页显示结束时间
     */
    private Long coupontakennum;

    /**
     * 第一页显示结束时间
     */
    private Date starttime;

    /**
     * 第一页显示结束时间
     */
    private Date endtime;

    /**
     * 第一页显示结束时间
     */
    private String pclink;

    /**
     * 第一页显示结束时间
     */
    private String waplink;

    /**
     * 第一页显示结束时间
     */
    private String ioslink;

    /**
     * 第一页显示结束时间
     */
    private String andlink;

    /**
     * 第一页显示结束时间
     */
    private Date addtime;

    /**
     * 第一页显示结束时间
     */
    private Short ison;

    /**
     * 第一页显示结束时间
     */
    private String catName;

    /**
     * 第一页显示结束时间
     */
    private String productdetailpage;

    /**
     * 第一页显示结束时间
     */
    private String tbklink;

    /**
     * 第一页显示结束时间
     */
    private BigDecimal incomepercent;

    /**
     * 第一页显示结束时间
     */
    private String nick;

    /**
     * 第一页显示结束时间
     */
    private Long sellerid;

    /**
     * 第一页显示结束时间
     */
    private String storename;

    /**
     * 第一页显示结束时间
     */
    private Short isdelete;

    /**
     * 第一页显示结束时间
     */
    private Date updatetime;

    /**
     * 第一页显示结束时间
     */
    private Short isindex;

    /**
     * 第一页显示结束时间
     */
    private Integer sort;

    /**
     * 第一页显示结束时间
     */
    private Date indexendtime;

    /**
     * 第一页显示结束时间
     */
    private Short isfirstpage;

    /**
     * 第一页显示结束时间
     */
    private Integer firstpagesort;

    /**
     * 第一页显示结束时间
     */
    private Date firstpageendtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Integer getBigclassid() {
        return bigclassid;
    }

    public void setBigclassid(Integer bigclassid) {
        this.bigclassid = bigclassid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getMonthsale() {
        return monthsale;
    }

    public void setMonthsale(Integer monthsale) {
        this.monthsale = monthsale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getCouponprice() {
        return couponprice;
    }

    public void setCouponprice(BigDecimal couponprice) {
        this.couponprice = couponprice;
    }

    public BigDecimal getCouponpercent() {
        return couponpercent;
    }

    public void setCouponpercent(BigDecimal couponpercent) {
        this.couponpercent = couponpercent;
    }

    public BigDecimal getCouponvalue() {
        return couponvalue;
    }

    public void setCouponvalue(BigDecimal couponvalue) {
        this.couponvalue = couponvalue;
    }

    public String getMainimg() {
        return mainimg;
    }

    public void setMainimg(String mainimg) {
        this.mainimg = mainimg == null ? null : mainimg.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public Short getPlattype() {
        return plattype;
    }

    public void setPlattype(Short plattype) {
        this.plattype = plattype;
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid == null ? null : couponid.trim();
    }

    public Long getCouponallnum() {
        return couponallnum;
    }

    public void setCouponallnum(Long couponallnum) {
        this.couponallnum = couponallnum;
    }

    public Long getCouponleftnum() {
        return couponleftnum;
    }

    public void setCouponleftnum(Long couponleftnum) {
        this.couponleftnum = couponleftnum;
    }

    public String getCoupondetail() {
        return coupondetail;
    }

    public void setCoupondetail(String coupondetail) {
        this.coupondetail = coupondetail == null ? null : coupondetail.trim();
    }

    public Long getCoupontakennum() {
        return coupontakennum;
    }

    public void setCoupontakennum(Long coupontakennum) {
        this.coupontakennum = coupontakennum;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPclink() {
        return pclink;
    }

    public void setPclink(String pclink) {
        this.pclink = pclink == null ? null : pclink.trim();
    }

    public String getWaplink() {
        return waplink;
    }

    public void setWaplink(String waplink) {
        this.waplink = waplink == null ? null : waplink.trim();
    }

    public String getIoslink() {
        return ioslink;
    }

    public void setIoslink(String ioslink) {
        this.ioslink = ioslink == null ? null : ioslink.trim();
    }

    public String getAndlink() {
        return andlink;
    }

    public void setAndlink(String andlink) {
        this.andlink = andlink == null ? null : andlink.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Short getIson() {
        return ison;
    }

    public void setIson(Short ison) {
        this.ison = ison;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public String getProductdetailpage() {
        return productdetailpage;
    }

    public void setProductdetailpage(String productdetailpage) {
        this.productdetailpage = productdetailpage == null ? null : productdetailpage.trim();
    }

    public String getTbklink() {
        return tbklink;
    }

    public void setTbklink(String tbklink) {
        this.tbklink = tbklink == null ? null : tbklink.trim();
    }

    public BigDecimal getIncomepercent() {
        return incomepercent;
    }

    public void setIncomepercent(BigDecimal incomepercent) {
        this.incomepercent = incomepercent;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Long getSellerid() {
        return sellerid;
    }

    public void setSellerid(Long sellerid) {
        this.sellerid = sellerid;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public Short getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Short isdelete) {
        this.isdelete = isdelete;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Short getIsindex() {
        return isindex;
    }

    public void setIsindex(Short isindex) {
        this.isindex = isindex;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getIndexendtime() {
        return indexendtime;
    }

    public void setIndexendtime(Date indexendtime) {
        this.indexendtime = indexendtime;
    }

    public Short getIsfirstpage() {
        return isfirstpage;
    }

    public void setIsfirstpage(Short isfirstpage) {
        this.isfirstpage = isfirstpage;
    }

    public Integer getFirstpagesort() {
        return firstpagesort;
    }

    public void setFirstpagesort(Integer firstpagesort) {
        this.firstpagesort = firstpagesort;
    }

    public Date getFirstpageendtime() {
        return firstpageendtime;
    }

    public void setFirstpageendtime(Date firstpageendtime) {
        this.firstpageendtime = firstpageendtime;
    }
}