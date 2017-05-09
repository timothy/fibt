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
    public static enum columnNames {
        fisrtName, lastName, adress, email,
        phoneNum, bDay, age
    }

    /**
     * enum of columns by letter
     */
    public static enum columnLetters {
        A, B, C, D, E, F, G
    }

    //local variables of the values of the titles of columns
    public static final String fisrtName = "First Name";//A
    public static final String lastName = "Last Name";//B
    public static final String address = "Address";//C
    public static final String email = "Email";//D
    public static final String phoneNum = "Phone Number";//E
    public static final String bDay = "Birth Day";//F
    public static final String age = "Age";//G

    /**
     * String of all the titles used for header. This is in the same order as enums...
     */
    public static final String[] TITLES = {fisrtName, lastName, address, email, phoneNum, bDay, age};
}
