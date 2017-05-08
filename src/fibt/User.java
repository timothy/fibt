/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

/**
 *
 * @author Timothy Bradford
 */
public class User extends People {

    private String userName;

    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param address
     * @param email
     * @param phoneNumber
     * @param birthday
     */
    public User(String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday) {
        super(firstName, lastName, address, email, phoneNumber, birthday);
    }

    /**
     *
     * @param userName
     */
    public User(String userName) {
        super(userName, userName, userName, userName, userName, new BirthdayDateTime("00/00/0000"));
        this.userName = userName;
    }
}
