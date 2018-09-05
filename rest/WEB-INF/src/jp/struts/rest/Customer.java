package jp.struts.rest;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import jp.struts.rest.ini;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;

	private int    id;
	private String name;
	private String reading;
	private String password;
	private int    type;
	private String address;
	private String phone;
	private String mail;
	private String exp;
	private int    comm;

	public Customer(){ super(); }

	public int    getId()      { return id; }
	public String getName()    { return name; }
	public String getReading() { return reading; }
	public String getPassword(){ return password; }
	public int    getType()    { return type; }
	public String getAddress() { return address; }
	public String getPhone()   { return phone; }
	public String getMail()    { return mail; }
	public String getExp()     { return exp; }
	public int    getComm()    { return comm; }

	public void setId      (int    id)      { this.id       = id; }
	public void setName    (String name)    { this.name     = name; }
	public void setReading (String reading) { this.reading  = reading; }
	public void setPassword(String password){ this.password = password; }
	public void setType    (int    type)    { this.type     = type; }
	public void setAddress (String address) { this.address  = address; }
	public void setPhone   (String phone)   { this.phone    = phone; }
	public void setMail    (String mail)    { this.mail     = mail; }
	public void setExp     (String exp)     { this.exp      = exp; }
	public void setComm    (int    comm)    { this.comm     = comm; }

	public static ArrayList<Customer> getList(){
		String            sql = null;
		Connection        con = null;
		PreparedStatement pst = null;

		ArrayList<Customer> al = new ArrayList<Customer>();
		try {
			Class.forName(ini.CName);
			con = DriverManager.getConnection(ini.Url, ini.LoginId, ini.Password);
			sql = "SELECT * FROM " + ini.T_customer;
			pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				Customer t = new Customer();
				t.setId      (rs.getInt   ("cst_id"));
				t.setName    (rs.getString("cst_name"));
				t.setReading (rs.getString("name_reading"));
				t.setPassword(rs.getString("password"));
				t.setType    (rs.getInt   ("type"));
				t.setAddress (rs.getString("address"));
				t.setPhone   (rs.getString("phone"));
				t.setMail    (rs.getString("mail"));
				t.setExp     (rs.getString("exp"));
				t.setComm    (rs.getInt   ("comm"));
				al.add(t);
			}
			rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				pst.close();
				con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return al;
	}

	public void pickUpUser(){
		String            sql = null;
		Connection        con = null;
		PreparedStatement pst = null;

		try {
			Class.forName(ini.CName);
			con = DriverManager.getConnection(ini.Url, ini.LoginId, ini.Password);
			sql = "SELECT * FROM " + ini.T_customer + " WHERE cst_name = ? AND password = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, getName());
			pst.setString(2, getPassword());
			ResultSet rs = pst.executeQuery();
			rs.next();
			setId      (rs.getInt   ("cst_id"));
			setName    (rs.getString("cst_name"));
			setReading (rs.getString("name_reading"));
			setPassword(rs.getString("password"));
			setType    (rs.getInt   ("type"));
			setAddress (rs.getString("address"));
			setPhone   (rs.getString("phone"));
			setMail    (rs.getString("mail"));
			setExp     (rs.getString("exp"));
			setComm    (rs.getInt   ("comm"));
			rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				pst.close();
				con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public void pickUpId(){
		String            sql = null;
		Connection        con = null;
		PreparedStatement pst = null;

		try {
			Class.forName(ini.CName);
			con = DriverManager.getConnection(ini.Url, ini.LoginId, ini.Password);
			sql = "SELECT * FROM " + ini.T_customer + " WHERE cst_id = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, getId());
			ResultSet rs = pst.executeQuery();
			rs.next();
			setId      (rs.getInt   ("cst_id"));
			setName    (rs.getString("cst_name"));
			setReading (rs.getString("name_reading"));
			setPassword(rs.getString("password"));
			setType    (rs.getInt   ("type"));
			setAddress (rs.getString("address"));
			setPhone   (rs.getString("phone"));
			setMail    (rs.getString("mail"));
			setExp     (rs.getString("exp"));
			setComm    (rs.getInt   ("comm"));
			rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try{
				pst.close();
				con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public boolean execute(int mode){
		String            sql = null;
		Connection        con = null;
		PreparedStatement pst = null;

		try{
			Class.forName(ini.CName);
			con = DriverManager.getConnection(ini.Url, ini.LoginId, ini.Password);

			if(mode == ini.AuthNewExecute){
				sql = "INSERT INTO " + ini.T_customer + "(cst_Name, name_reading, password, type, address, phone, mail, exp, comm) "
			           + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
				pst = con.prepareStatement(sql);
				pst.setString(1, getName());
				pst.setString(2, getReading());
				pst.setString(3, getPassword());
				pst.setInt   (4, getType());
				pst.setString(5, getAddress());
				pst.setString(6, getPhone());
				pst.setString(7, getMail());
				pst.setString(8, getExp());
				pst.setInt   (9, getComm());
			}
			if(mode == ini.AuthDelExecute){
				sql = "DELETE FROM " + ini.T_customer + " WHERE cst_id = ?";
				pst = con.prepareStatement(sql);
				pst.setInt(1, getId());
			}
			if(mode == ini.AuthUpExecute){
				sql = "UPDATE " + ini.T_customer + " SET "
					+ "password = ?, address = ?, phone = ?, mail = ?, comm = ? WHERE cst_id = ?";
				pst = con.prepareStatement(sql);
				pst.setString(1, getPassword());
				pst.setString(2, getAddress());
				pst.setString(3, getPhone());
				pst.setString(4, getMail());
				pst.setInt   (5, getComm());
				pst.setInt   (6, getId());
			}
			pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally{
			try{
				pst.close();
				con.close();
			}
			catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
}
