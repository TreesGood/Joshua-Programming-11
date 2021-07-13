package com.company;
import java.util.ArrayList;

public class School {
    //holds the arrays of teachers and students, has methods to add/remove teachers/students, construct schools, show all teachers/students


    //fields
    /*
    Im a bit confused here, the instructions say that the school class should have an
    ArrayList of courses, but the starter file does not contain an ArrayList for Courses
    nor is Courses mentioned anywhere else.
     */
    ArrayList<Students> StudentsList = new ArrayList<>();
    ArrayList<Teachers>  TeachersList = new ArrayList<>();

    private String name;
    private String City;
    private int rating;


    //getters and setters


    public ArrayList<Teachers> getTeachersList() {
        return TeachersList;
    }

    public void setTeachersList(ArrayList<Teachers> teachersList) {
        TeachersList = teachersList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //constructor
    School(String name, String City, int rating){
        this.name = name;
        this.City = City;
        this.rating  = rating;
    }

//adding/removing teachers and students
    public void AddTeacher(Teachers Teacher){
        TeachersList.add(Teacher);
    }
    public void AddStudent(Students Student){
        StudentsList.add(Student);
    }
    public void RemoveTeacher(int position){
        TeachersList.remove(position);
    }
    public void RemoveStudent(int position){
        StudentsList.remove(position);
    }

    //Showing students and teachers
    public void ShowStudents(){
        for(int i=0; i< StudentsList.size(); i++){
            System.out.println(StudentsList.get(i));
        }
    }
    public void ShowTeachers(){
        for(int i=0; i< TeachersList.size(); i++){
            System.out.println(TeachersList.get(i));
        }
    }




}
