package org.cbd.pojo;

public class Guanjianci {
    private Integer id;

    private String wangzhan;

    private String year;

    private String month;

    private String day;

    private String hour;

    private String xingqi;

    private String gjc;

    private String gjccishu;

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

    public String getGjc() {
        return gjc;
    }

    public void setGjc(String gjc) {
        this.gjc = gjc == null ? null : gjc.trim();
    }

    public String getGjccishu() {
        return gjccishu;
    }

    public void setGjccishu(String gjccishu) {
        this.gjccishu = gjccishu == null ? null : gjccishu.trim();
    }
}