package org.cbd.pojo;

public class Jiqiren {
    private Integer id;

    private String wangzhan;

    private String year;

    private String month;

    private String day;

    private String hour;

    private String xingqi;

    private String jqr;

    private String jqrwenjianshu;

    private String jqrzijie;

    private String jqrriqi;

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

    public String getJqr() {
        return jqr;
    }

    public void setJqr(String jqr) {
        this.jqr = jqr == null ? null : jqr.trim();
    }

    public String getJqrwenjianshu() {
        return jqrwenjianshu;
    }

    public void setJqrwenjianshu(String jqrwenjianshu) {
        this.jqrwenjianshu = jqrwenjianshu == null ? null : jqrwenjianshu.trim();
    }

    public String getJqrzijie() {
        return jqrzijie;
    }

    public void setJqrzijie(String jqrzijie) {
        this.jqrzijie = jqrzijie == null ? null : jqrzijie.trim();
    }

    public String getJqrriqi() {
        return jqrriqi;
    }

    public void setJqrriqi(String jqrriqi) {
        this.jqrriqi = jqrriqi == null ? null : jqrriqi.trim();
    }
}