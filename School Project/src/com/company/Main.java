package com.company;

public class Main {

    public static void main(String[] args) {

        //Demonstration of code


        //create new school
        School SomeSchool = new School("HighSchool", "Vancouver", 10);

        //add students
        SomeSchool.AddStudent(new Students("Bob","Smith",11));
        SomeSchool.AddStudent(new Students("Fred","Johns",9));
        SomeSchool.AddStudent(new Students("Joey","Decker",8));
        SomeSchool.AddStudent(new Students("Baily","Padilla",12));
        SomeSchool.AddStudent(new Students("Willow","Rodgers",10));
        SomeSchool.AddStudent(new Students("Adam","Spencer",8));
        SomeSchool.AddStudent(new Students("Sara","Lynn",11));
        SomeSchool.AddStudent(new Students("Landon","Holmes",9));
        SomeSchool.AddStudent(new Students("Sheldon","Cooper",12));
        SomeSchool.AddStudent(new Students("Bart","Simpson",10));

        //add teachers
        SomeSchool.AddTeacher(new Teachers("Barabra","Pegg","Music"));
        SomeSchool.AddTeacher(new Teachers("Jean","Gunnhildr","Career Ed"));
        SomeSchool.AddTeacher(new Teachers("Luka","Martin","Math"));

        //show students and teachers
        SomeSchool.ShowStudents();
        SomeSchool.ShowTeachers();

        //remove some students
        SomeSchool.RemoveStudent(9);
        SomeSchool.RemoveStudent(2);

        //remove a teacher
        SomeSchool.RemoveTeacher(0);

        //show students and teachers
        System.out.println("\n\n");
        SomeSchool.ShowStudents();
        SomeSchool.ShowTeachers();






    }
}
