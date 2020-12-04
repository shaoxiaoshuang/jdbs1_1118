package org.sxs.pojo;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/2 14:32
 * @Version: V1.0
 */
public class User {

    private String userId;
    private String userName;
    private String passWord;
    private String sex;
    private String borndate;
    private String userTel;
    private String userAddress;
    private String typeID;


    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userId, String userName, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userId, String userName, String passWord, String sex, String borndate, String userTel, String userAddress, String typeID) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.borndate = borndate;
        this.userTel = userTel;
        this.userAddress = userAddress;
        this.typeID = typeID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate='" + borndate + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", typeID='" + typeID + '\'' +
                '}';
    }
}

