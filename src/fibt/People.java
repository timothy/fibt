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

    public People(String firstName, String lastName, String address, String email, String phoneNumber, BirthdayDateTime birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BirthdayDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(BirthdayDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "People{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + '}';
    }
}
