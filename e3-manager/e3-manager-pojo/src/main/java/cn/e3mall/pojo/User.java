package cn.e3mall.pojo;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String manlocation;

    private String phonenumber;
    
    public User() {
    	
    }
    public User(Integer id, String username,String password,String manlocation,String phonenumber){
    	this.id = id;
    	this.username = username;
    	this.password = password;
    	this.manlocation = manlocation;
    	this.phonenumber = phonenumber;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getManlocation() {
        return manlocation;
    }

    public void setManlocation(String manlocation) {
        this.manlocation = manlocation == null ? null : manlocation.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}