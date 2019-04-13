
package com.medicap.model;
import java.sql.Date;
import java.sql.Time;
public class appointment {
    
private int a_id;
private String day;
private Date date;
private Time time;
private int p_id;
private int d_id;

public appointment(int a_id, String day, Date date, Time time, int p_id, int d_id )
{
    this.a_id=a_id;
    this.day=day;
    this.date=date;
    this.time=time;
    this.p_id=p_id;
    this.d_id=d_id;
}
public appointment()
{}

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }



}
