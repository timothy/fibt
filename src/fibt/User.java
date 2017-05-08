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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    String userName;

    public User(String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday) {
        super(firstName, lastName, address, email, phoneNumber, birthday);
    }

    public User(String userName) {
        super(userName, userName, userName, userName, userName, new BirthdayDateTime("00/00/0000"));
        this.userName = userName;
    }
}
