package org.cbd.pojo;

public class Zhuji {
    private Integer id;

    private String wangzhan;

    private String year;

    private String month;

    private String day;

    private String hour;

    private String xingqi;

    private String zjip;

    private String zjwangyeshu;

    private String zjwenjianshu;

    private String zjzijie;

    private String zjriqi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWangzhan() {
        return wangzhan;
    }

    public void setWangzhan(String wangzhan) {
        this.wangzhan = wangzhan == null ? null : wangzhan.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public String getXingqi() {
        return xingqi;
    }

    public void setXingqi(String xingqi) {
        this.xingqi = xingqi == null ? null : xingqi.trim();
    }

    public String getZjip() {
        return zjip;
    }

    public void setZjip(String zjip) {
        this.zjip = zjip == null ? null : zjip.trim();
    }

    public String getZjwangyeshu() {
        return zjwangyeshu;
    }

    public void setZjwangyeshu(String zjwangyeshu) {
        this.zjwangyeshu = zjwangyeshu == null ? null : zjwangyeshu.trim();
    }

    public String getZjwenjianshu() {
        return zjwenjianshu;
    }

    public void setZjwenjianshu(String zjwenjianshu) {
        this.zjwenjianshu = zjwenjianshu == null ? null : zjwenjianshu.trim();
    }

    public String getZjzijie() {
        return zjzijie;
    }

    public void setZjzijie(String zjzijie) {
        this.zjzijie = zjzijie == null ? null : zjzijie.trim();
    }

    public String getZjriqi() {
        return zjriqi;
    }

    public void setZjriqi(String zjriqi) {
        this.zjriqi = zjriqi == null ? null : zjriqi.trim();
    }
}