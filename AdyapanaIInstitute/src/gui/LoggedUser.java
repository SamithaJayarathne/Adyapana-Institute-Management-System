/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author sudan
 */
public class LoggedUser {
    
    private static String userId;
    private static String userEmail;
    private static String userFname;
    private static String userLname;

    /**
     * @return the userId
     */
    public static String getUserId() {
        return userId;
    }

    /**
     * @param aUserId the userId to set
     */
    public static void setUserId(String aUserId) {
        userId = aUserId;
    }

    /**
     * @return the userEmail
     */
    public static String getUserEmail() {
        return userEmail;
    }

    /**
     * @param aUserEmail the userEmail to set
     */
    public static void setUserEmail(String aUserEmail) {
        userEmail = aUserEmail;
    }

    /**
     * @return the userFname
     */
    public static String getUserFname() {
        return userFname;
    }

    /**
     * @param aUserFname the userFname to set
     */
    public static void setUserFname(String aUserFname) {
        userFname = aUserFname;
    }

    /**
     * @return the userLname
     */
    public static String getUserLname() {
        return userLname;
    }

    /**
     * @param aUserLname the userLname to set
     */
    public static void setUserLname(String aUserLname) {
        userLname = aUserLname;
    }
    
}
