/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

/**
 * This will store and organize a person's information
 *
 * @author Timothy Bradford
 */
public class People {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phoneNumber;
    private BirthdayDateTime birthday;

    /**
     * 
     * @param firstName
     * @param lastName
     * @param address
     * @param email
     * @param phoneNumber
     * @param birthday 
     */
    public People(String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    /**
     * 
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @return 
     */
    public BirthdayDateTime getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday 
     */
    public void setBirthday(BirthdayDateTime birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "People{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + '}';
    }
}
