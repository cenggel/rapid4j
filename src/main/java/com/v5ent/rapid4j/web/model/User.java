package com.v5ent.rapid4j.web.model;

import java.util.Date;

/**
 * 用户模型
 * 
 * @author Mignet
 * @since 2014年7月5日 下午12:07:20
 **/
public class User {
    private Long id;

    private String username;

    private String password;

    private String state;

    private Date createTime;
    
    private String firstname;
    private String lastname;
    private String emailaddress;
    private Date update_time;
    private Date lastlogin_time;


    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Date getLastlogin_time() {
		return lastlogin_time;
	}

	public void setLastlogin_time(Date lastlogin_time) {
		this.lastlogin_time = lastlogin_time;
	}

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", state=" + state + ", createTime=" + createTime + "]";
    }

}