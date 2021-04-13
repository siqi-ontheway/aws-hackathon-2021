package com.hackathon.sales.dataobject;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    private String user;
    private String name;
    private int id;
    private int gender;
    private int age;
    private String telephone;
    private String register_mode;
    private String third_party_id;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.CURRENT_CONNECTIONS
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    private Long currentConnections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.TOTAL_CONNECTIONS
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    private Long totalConnections;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER
     *
     * @return the value of users.USER
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER
     *
     * @param user the value for users.USER
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.CURRENT_CONNECTIONS
     *
     * @return the value of users.CURRENT_CONNECTIONS
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    public Long getCurrentConnections() {
        return currentConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.CURRENT_CONNECTIONS
     *
     * @param currentConnections the value for users.CURRENT_CONNECTIONS
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.TOTAL_CONNECTIONS
     *
     * @return the value of users.TOTAL_CONNECTIONS
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    public Long getTotalConnections() {
        return totalConnections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.TOTAL_CONNECTIONS
     *
     * @param totalConnections the value for users.TOTAL_CONNECTIONS
     *
     * @mbg.generated Mon Apr 12 21:15:56 CST 2021
     */
    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRegister_mode() {
        return register_mode;
    }

    public void setRegister_mode(String register_mode) {
        this.register_mode = register_mode;
    }

    public String getThird_party_id() {
        return third_party_id;
    }

    public void setThird_party_id(String third_party_id) {
        this.third_party_id = third_party_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}