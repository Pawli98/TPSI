/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author Student
 */
public class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
}
