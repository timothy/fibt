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
public class Column {

    /**
     * 
     */
    public static enum columnNames {
        fisrtName, lastName, adress, email,
        phoneNum, bDay, age
    }

    /**
     * 
     */
    public static enum columnLetters {
        A, B, C, D, E, F, G
    }

    public static final String fisrtName = "First Name";//A
    public static final String lastName = "Last Name";//B
    public static final String address = "Address";//C
    public static final String email = "Email";//D
    public static final String phoneNum = "Phone Number";//E
    public static final String bDay = "Birth Day";//F
    public static final String age = "Age";//G

    public static final String[] TITLES = {fisrtName, lastName, address, email, phoneNum, bDay, age};
}
