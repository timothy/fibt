/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibt;

/**
 * This class contains everything needed for the columns title
 *
 * @author Timothy Bradford
 */
public class Column {

    /**
     * enum of columns by header name
     */
    private enum columnNames {
        fisrtName, lastName, adress, email,
        phoneNum, bDay, age
    }

    /**
     * enum of columns by letter
     */
    private enum columnLetters {
        A, B, C, D, E, F, G
    }

    //local variables of the values of the titles of columns
    private final String fisrtName = "First Name";//A
    private final String lastName = "Last Name";//B
    private final String address = "Address";//C
    private final String email = "Email";//D
    private final String phoneNum = "Phone Number";//E
    private final String bDay = "Birth Day";//F
    private final String age = "Age";//G

    /**
     * String of all the titles used for header. This is in the same order as enums...
     */
    private final String[] TITLES = {fisrtName, lastName, address, email, phoneNum, bDay, age};

    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getbDay() {
        return bDay;
    }

    public String getAge() {
        return age;
    }

    public String[] getTITLES() {
        return TITLES;
    }
}
