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
     * @param firstName First name of the person
     * @param lastName Last name of the person
     * @param address A valid mailing address
     * @param email A valid email address
     * @param phoneNumber A valid phone number
     * @param birthday Birthday object for the person
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
     * @return First name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName First name of the person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return Last name of the person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName Last name of the person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return A valid mailing address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address A valid mailing address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return A valid Email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email A valid Email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return A valid phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 
     * @param phoneNumber A valid phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 
     * @return the birthday object for the person
     */
    public BirthdayDateTime getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday the birthday object for the person
     */
    public void setBirthday(BirthdayDateTime birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return all values of the people class
     */
    @Override
    public String toString() {
        return "People{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday.toString() + '}';
    }
}
