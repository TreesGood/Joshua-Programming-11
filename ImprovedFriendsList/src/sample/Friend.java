package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {

    private int age;
    private String firstname;
    private String lastname;
    private String username;
    private String gender;


    Friend(String Username, String Firstname,String Lastname, String Gender, int Age){
        this.username = Username;
        this.firstname = Firstname;
        this.lastname = Lastname;
        this.gender = Gender;
        this.age = Age;


    }

    //changes appearence when displayed
    public String toString(){
        return "Username: "+username+"  Firstname: "+firstname+"  Lastname: "+lastname+"  Gender: "+gender+"  Age: "+String.valueOf(age);
    }
//writes the info about the friend to a file
    public void WriteToFile() throws IOException{
        FileWriter fw = new FileWriter("Friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(username+",\r");
        bw.write(firstname+",\r");
        bw.write(lastname+",\r");
        bw.write(gender+",\r");
        bw.write(Integer.toString(age)+"\r");
        bw.write("@\r");
        bw.close();

    }
//compares the firstname and last name of two friends
   public boolean compareFriends(Friend f){
        if(this.firstname.equals(f.firstname)&&this.lastname.equals(f.lastname)){
            return true;
        }else{
            return false;
   }
    }
}