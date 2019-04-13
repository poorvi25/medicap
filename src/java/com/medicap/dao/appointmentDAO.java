package com.medicap.dao;
import com.medicap.model.appointment;
import com.medicap.service.GetConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class appointmentDAO {
    public static ArrayList<appointment> getAppointmentByPID(int p_id){
        
         Connection con = null;
      ArrayList<appointment>al = new ArrayList<>();
      try{
          con = GetConnection.getConnection();
          String sql = "select * from city where p_id = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,p_id);
          ResultSet rs = ps.executeQuery();
          while(rs.next())
          {
            int a_id = rs.getInt(1);
            String day = rs.getString(2);
            Date date = rs.getDate(3);
            Time time = rs.getTime(4);
            
            int d_id = rs.getInt(6);
            appointment a = new appointment(a_id,day,date,time,p_id,d_id);
            al.add(a);
          }
    }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      
           finally{
          try{
           con.close();
          }
          catch(Exception e)
          {
            e.printStackTrace();
          }
      }
      return al;
      
    }
    public static ArrayList<appointment> getAppointmentByDID(int d_id){
        
         Connection con = null;
      ArrayList<appointment>al2 = new ArrayList<>();
      try{
          con = GetConnection.getConnection();
          String sql = "select * from city where d_id = ?";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,d_id);
          ResultSet rs = ps.executeQuery();
          while(rs.next())
          {
            int a_id = rs.getInt(1);
            String day = rs.getString(2);
            Date date = rs.getDate(3);
            Time time = rs.getTime(4);
            int p_id = rs.getInt(5);
            appointment a2 = new appointment(a_id,day,date,time,p_id,d_id);
            al2.add(a2);
          }
    }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      
           finally{
          try{
           con.close();
          }
          catch(Exception e)
          {
            e.printStackTrace();
          }
      }
      return al2;
      
    }
   public static boolean saveAppointment(appointment appointment)
  {
      Connection con = null;
      boolean status = false;
      try{
        con = GetConnection.getConnection();
        String sql = "insert into appointment(a_id,day,date,time,p_id,d_id) values(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, appointment.getA_id());
        ps.setString(2, appointment.getDay());
        ps.setDate(3, appointment.getDate());
        ps.setTime(4, appointment.getTime());
        ps.setInt(5, appointment.getP_id());
        ps.setInt(6, appointment.getD_id());
        if(ps.executeUpdate()!=0)
          status = true;  
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      
           finally{
          try{
           con.close();
          }
          catch(Exception e)
          {
            e.printStackTrace();
          }
      }
      return status;
      
    }
public static boolean deleteAppointment(int p_id)
  {
      Connection con = null;
      boolean status = false;
      try{
        con = GetConnection.getConnection();
        String sql ="delete from appointment where p_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
       
        if(ps.executeUpdate()!=0)
          status = true;  
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      
           finally{
          try{
           con.close();
          }
          catch(Exception e)
          {
            e.printStackTrace();
          }
      }
      return status;
      
    }
}