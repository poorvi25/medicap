
package com.medicap.model;


public class user {

  private int u_id;
  private String username;
  private String email;
  private String password;
  private String mobile;
  private String gender;
  private String dob;
  private int city_id;
  private int state_id;
   private int country_id;

    public user(int u_id, String username, String email, String password, String mobile, String gender, String dob, int city_id, int state_id, int country_id)
    {
        this.u_id = u_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.gender = gender;
        this.dob = dob;
        this.city_id = city_id;
        this.state_id = state_id;
        this.country_id = country_id;
    }
  public user() 
  {
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
  
}
   

   