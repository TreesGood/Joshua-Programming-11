package sample;

public class Friend {

    private int age;
    private String firstname;
    private String lastname;
    private String username;
    private String gender;

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }


    Friend(String Username, String Firstname,String Lastname, String Gender, int Age){
        this.username = Username;
        this.firstname = Firstname;
        this.lastname = Lastname;
        this.gender = Gender;
        this.age = Age;


    }
    public String toString(){
        return username;
    }

}



