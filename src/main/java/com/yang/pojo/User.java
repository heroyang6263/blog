package com.yang.pojo;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.login_enable
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    private String loginEnable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.login_enable
     *
     * @return the value of user.login_enable
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public String getLoginEnable() {
        return loginEnable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.login_enable
     *
     * @param loginEnable the value for user.login_enable
     *
     * @mbggenerated Tue Apr 07 01:20:15 CST 2020
     */
    public void setLoginEnable(String loginEnable) {
        this.loginEnable = loginEnable == null ? null : loginEnable.trim();
    }
}