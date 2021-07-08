package com.company;

public class Main {

    //Code your solution to problem number one here
    static int problemOne(String s){

        int answer = 0;

        for(int i = s.length(); i>0; i--){

            String substr = s.substring(i-1,i);

            if(substr.equals("a")||substr.equals("e")||substr.equals("i")||substr.equals("o")||substr.equals("u")){

                answer++;

            }
        }
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;

        for(int i = s.length(); i>3; i--){

            String substr = s.substring(i-3,i);

            if(substr.equals("bob")){

                answer++;

            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //string to numbers in an array
        String longeststring = "";
        String testingstring = s.substring(0,1);

        for(int i = 0; i+1 <= s.length(); i++) {
            if(i == 0){
                testingstring = s.substring(0,1);
            }
            else if (s.substring(i-1,i).compareTo(s.substring(i,i+1))<=0){

                testingstring += s.substring(i,i+1);

                if(testingstring.length()>longeststring.length()){

                    longeststring = testingstring;
                }

            }else{
                testingstring = s.substring(i,i+1);
            }
        }

        //your code here
        return longeststring;

    }
    public static void main(String[] args) {
        String s = "qabcdfabcdbob";
        //problem 1
        int answer = problemOne(s);
        System.out.println("Number of vowels: "+answer);

        //problem 2
        int answer2 = problemTwo(s);
        System.out.println("Number of times bob occurs is: "+answer2);

        //problem 3
        String answer3 = problemThree(s);
        System.out.println(answer3);







        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
    }
}
