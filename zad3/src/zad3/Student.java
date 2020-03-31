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



import java.util.ArrayList;
import java.util.List;


public class Student extends Person{
    private String groupId;
    private String emailAddress;
    private Double grade;
    private List<Double> grades = new ArrayList<>();
    
    
    public Student(String firstName, String lastName, String emailAddress, String groupId) {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
        this.emailAddress = emailAddress;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }
    
    public double getGradesAverage() {
      int sum = 0;
      
      for (int i=0; i< grades.size(); i++) 
      {
            sum += grades.get(i);
      }
      
      return sum / grades.size();
      
    }

   
}




