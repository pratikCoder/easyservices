package com.services.easyservices.db.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "login_id")
    private Integer login_id;

    @Column(name = "username")
    private Integer username;

    @Column(name = "password")
    private String password;

    @Column(name = "last_login_date")
    private Date last_login_date;

    @Column(name = "last_password_update_date")
    private Date last_password_update_date;

    @Column(name = "creation_username")
    private String creation_username;

    @Column(name = "updation_username")
    private String updation_username;

    @Column(name = "creation_date")
    private Date creation_date;
    
    @Column(name = "updation_date")
    private Date updaion_date;

    @Column(name = "creation_ip")
    private String creation_ip;

    @Column(name = "updation_ip")
    private String updation_ip;

	public LoginEntity() {
		super();
	}

	public LoginEntity(Integer login_id, Integer username, String password, Date last_login_date,
			Date last_password_update_date, String creation_username, String updation_username, Date creation_date,
			Date updaion_date, String creation_ip, String updation_ip) {
		super();
		this.login_id = login_id;
		this.username = username;
		this.password = password;
		this.last_login_date = last_login_date;
		this.last_password_update_date = last_password_update_date;
		this.creation_username = creation_username;
		this.updation_username = updation_username;
		this.creation_date = creation_date;
		this.updaion_date = updaion_date;
		this.creation_ip = creation_ip;
		this.updation_ip = updation_ip;
	}

	public Integer getLogin_id() {
		return login_id;
	}

	public void setLogin_id(Integer login_id) {
		this.login_id = login_id;
	}

	public Integer getUsername() {
		return username;
	}

	public void setUsername(Integer username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLast_login_date() {
		return last_login_date;
	}

	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}

	public Date getLast_password_update_date() {
		return last_password_update_date;
	}

	public void setLast_password_update_date(Date last_password_update_date) {
		this.last_password_update_date = last_password_update_date;
	}

	public String getCreation_username() {
		return creation_username;
	}

	public void setCreation_username(String creation_username) {
		this.creation_username = creation_username;
	}

	public String getUpdation_username() {
		return updation_username;
	}

	public void setUpdation_username(String updation_username) {
		this.updation_username = updation_username;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getUpdaion_date() {
		return updaion_date;
	}

	public void setUpdaion_date(Date updaion_date) {
		this.updaion_date = updaion_date;
	}

	public String getCreation_ip() {
		return creation_ip;
	}

	public void setCreation_ip(String creation_ip) {
		this.creation_ip = creation_ip;
	}

	public String getUpdation_ip() {
		return updation_ip;
	}

	public void setUpdation_ip(String updation_ip) {
		this.updation_ip = updation_ip;
	}

	@Override
	public String toString() {
		return "LoginEntity [login_id=" + login_id + ", username=" + username + ", password=" + password
				+ ", last_login_date=" + last_login_date + ", last_password_update_date=" + last_password_update_date
				+ ", creation_username=" + creation_username + ", updation_username=" + updation_username
				+ ", creation_date=" + creation_date + ", updaion_date=" + updaion_date + ", creation_ip=" + creation_ip
				+ ", updation_ip=" + updation_ip + "]";
	}	    
}
