package kk.practise.Java反射机制;

/**
 * @author kangkai on 2018/1/2.
 */
public class UserInfo {
    private Integer id;
    private String userName;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return this.getClass().getName();
    }

}
