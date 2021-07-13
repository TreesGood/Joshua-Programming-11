package com.company;

public class Students {
    //has methods to construct students, print "Name: *name* Grade *subject* when teacher object is printed adn generate a unique id for each student"

    private String firstname;
    private String lastname;
    private int grade;
    static private int studentid = 1;
    private int idNum;

//getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //constructor
    Students(String firstname, String lastname, int grade){
        this.firstname = firstname;
        this.lastname = lastname;
        this.grade = grade;
        //unique student number
        idNum = studentid;
        studentid++;


    }
    //when printed "Name:name Grade: grade"
    public String toString(){
        return  "Name: "+ firstname + " " + lastname + "    Grade: "+grade;
    }

}
