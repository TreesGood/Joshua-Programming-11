package sample;

import java.io.*;
import java.util.ArrayList;

public class AddFriend {
    private static String Username;
    private static String Firstname;
    private static String Lastname;
    private static int age;
    private static String Gender;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> FriendsList = new ArrayList<>();

    public static ArrayList AddAllFriends(String fileName) throws IOException {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String FriendString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("@")) {
                FriendString += line;
            } else{
                readFriendString(FriendString);
                FriendString = "";
            }
        }

        return FriendsList;

    }

    //reads the Friend String
    private static void readFriendString(String string) {
        int position = 0;
        int prevcommalocation = 0;
        int commanum = 0;
        int age = 0;
        boolean FriendAlreadyThere = false;
        String firstname = "";
        String lastname = "";
        String username = "";
        String gender = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                position = i;
                if (commanum == 0) {
                    username = string.substring(prevcommalocation, position);

                }
                if (commanum == 1) {
                    firstname = string.substring(prevcommalocation+1,position);
                }
                if (commanum == 2) {
                    lastname = string.substring(prevcommalocation+1, position);

                }
                if (commanum == 3) {
                    gender = string.substring(prevcommalocation+1, position);
                    System.out.println(String.valueOf(position));
                    age = Integer.parseInt(string.substring(position+1,string.length()));

                }
                commanum++;

                prevcommalocation = position;


            }

        }
        //checks if friend is already on th list

        position =0;
         prevcommalocation = 0;
         commanum = 0;
        Friend newFriend = new Friend(username,firstname,lastname,gender,age);
         for(Friend f:FriendsList){
             if(f.compareFriends(newFriend)){
                 FriendAlreadyThere = true;
             }

         }
         if(!FriendAlreadyThere){
        FriendsList.add(newFriend);
}
    }
}
