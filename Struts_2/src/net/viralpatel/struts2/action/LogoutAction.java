package net.viralpatel.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
//this is for hot fix changes......fareedh 123456.....anand //123456.......vivek
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
 
    public String execute() {
 
        if (this.username.equals("admin")
              343  && this.password.equals("admin123")) {
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
    }
 234234
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}

