package com.company;

public class Teachers {
    //has methods to construct teachers and print "Name: *name* Subject *subject* when teacher object is printed"

    private String firstname;
    private  String lastname;
    private  String subject;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    Teachers(String firstname, String lastname, String subject){
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }
    //when printed "Name:name Subject: subject"
    public String toString(){
        return  "Name: "+ firstname + " " + lastname + "    Subject: " + subject;
    }
}
