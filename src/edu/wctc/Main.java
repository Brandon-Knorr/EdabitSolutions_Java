package edu.wctc;

public class Main {
    public static void main(String[] args) {

    }

    // THESE ARE THE SOLUTIONS TO EDABIT 'VERY EASY' CHALLENGES IN JAVA

    /*
    Upvotes vs Downvotes
    - Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed.
    -This is calculated by subtracting the number of downvotes from upvotes.
    */

    public static int getVoteCount(int upvotes,int downvotes) {
        return upvotes - downvotes;
    }



    /*
    Basic Variable Assignment
    -A student learning Java was trying to make a function.
    -His code should concatenate a passed string name with string "Edabit" and store it in a variable called result.
    -He needs your help to fix this code.

    public static String nameString(String name) {
		  String b == "Edabit";
		  String result == name + b;
		  return result;
	}
    */

    public static String nameString(String name) {
        String b = "Edabit";
        String result = name + b;
        return result;
    }



    /*
    Football Points
    - Create a function that takes the number of wins, draws and losses
     and calculates the number of points a football team has obtained so far.
         - wins get 3 points
        - draws get 1 point
        - losses get 0 points
     */

    public static int footballPoints(int wins, int draws, int loses) {
        int w = wins * 3;
        int d = draws * 1;
        int l = loses * 0;
        int total = w + d + l;
        return total;
    }



    /*
    Are the Numbers Equal?
    - Create a function that takes two integers and checks if they are equal.
     */

    public static boolean isEqual(int num1, int num2) {
        return num1 == num2;
    }
}
