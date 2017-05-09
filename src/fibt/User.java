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

    /**
     * 
     * @return The user's user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName The user's user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @param userName The user's user name
     * @param firstName First name of the person
     * @param lastName Last name of the person
     * @param address A valid mailing address
     * @param email A valid email address
     * @param phoneNumber A valid phone number
     * @param birthday Birthday object for the person
     */
    public User(String userName, String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday) {
        super(firstName, lastName, address, email, phoneNumber, birthday);
    }

    /**
     *
     * @param userName The user's user name
     */
    public User(String userName) {
        super(userName, userName, userName, userName, userName, new BirthdayDateTime("00/00/0000"));
        this.userName = userName;
    }
}
