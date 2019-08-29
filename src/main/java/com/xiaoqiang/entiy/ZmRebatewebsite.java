package com.xiaoqiang.entiy;

/**
 * null
 * 
 * @author wcyong
 * 
 * @date 2019-08-14
 */
public class ZmRebatewebsite {
    private Integer id;

    private String name;

    private String url;

    private String logourl;

    private String rebate;

    private String introduction;

    private String overview;

    private Short ison;

    private Short isindex;

    private String firstword;

    private String bgimg;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate == null ? null : rebate.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    public Short getIson() {
        return ison;
    }

    public void setIson(Short ison) {
        this.ison = ison;
    }

    public Short getIsindex() {
        return isindex;
    }

    public void setIsindex(Short isindex) {
        this.isindex = isindex;
    }

    public String getFirstword() {
        return firstword;
    }

    public void setFirstword(String firstword) {
        this.firstword = firstword == null ? null : firstword.trim();
    }

    public String getBgimg() {
        return bgimg;
    }

    public void setBgimg(String bgimg) {
        this.bgimg = bgimg == null ? null : bgimg.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}