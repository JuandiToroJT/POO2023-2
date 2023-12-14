/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2023back;

/**
 *
 * @author anony
 */
public class GradeBook {
    private String CourseName;
    
    public void displayMessage(){
        System.out.println("Welcome bitch, el curso es " + getCourseName());
    }

    public GradeBook() {
    }
    
    public GradeBook(String CourseName) {
        this.CourseName = CourseName;
    }

    /**
     * @return the CourseName
     */
    public String getCourseName() {
        return CourseName;
    }

    /**
     * @param CourseName the CourseName to set
     */
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
}
