package org.cbd.pojo;

public class Liulanqi {
    private Integer id;

    private String wangzhan;

    private String year;

    private String month;

    private String day;

    private String hour;

    private String xingqi;

    private String llq;

    private String llqwangyeshu;

    private String llqwenjianshu;

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

    public String getLlq() {
        return llq;
    }

    public void setLlq(String llq) {
        this.llq = llq == null ? null : llq.trim();
    }

    public String getLlqwangyeshu() {
        return llqwangyeshu;
    }

    public void setLlqwangyeshu(String llqwangyeshu) {
        this.llqwangyeshu = llqwangyeshu == null ? null : llqwangyeshu.trim();
    }

    public String getLlqwenjianshu() {
        return llqwenjianshu;
    }

    public void setLlqwenjianshu(String llqwenjianshu) {
        this.llqwenjianshu = llqwenjianshu == null ? null : llqwenjianshu.trim();
    }
}