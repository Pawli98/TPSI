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

public class Teacher extends Person
{
    private String courseName;
    private String emailAddress;
    

    public Teacher(String firstName, String lastName, String emailAddress, String courseName) 
    {
        super(firstName, lastName, emailAddress);
        this.courseName = courseName;
        this.emailAddress = emailAddress;
      
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }
    
 
}
    