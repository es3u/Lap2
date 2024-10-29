import javax.swing.text.PasswordView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world!");

        //System.out.println("");

//        1.Write a program to find all of the longest word in a given dictionary.
//        Example:
//        { "cat", "dog", "red", "is", "am" } Expected Output:
//        "cat", "dog", "red"
//
        ArrayList <String> longest = new ArrayList<String>();
        String word ;
        do{
            System.out.println(" enter your word  or write out to exit");
            word = in.nextLine();
            if(word.equals("out"))
                break;

            longest.add(word);

        }while(!word.equals("out"));

        System.out.println(longest);

        System.out.println(longest(longest));
        System.out.println("******End*****");

//2. Write a program that displays the number of occurrences of an element in the array.
//Original Array: [1,1,1,3,3,5] Sample Output: 3 occurs 2 times 1 occurs 3 times 9 occurs 0 time

        System.out.println("enter your size of array ");
    int[]  occurrences = new int[in.nextInt()];

        for (int i = 0; i < occurrences.length; i++) {
            System.out.println("Emter your numbers");
            int i1 = in.nextInt();
            occurrences[i] = i1;
        }
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(occurrences[i]);
        }
    for(int a : occurrences){
        int s = occurrences[0];}

        ///3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order.
//        Original Array:
//[1, 4, 17, 7, 25, 3, 100]
//Expected Output:
//3 largest elements of the said array are: 100 25 17

        int [] largest = {1, 4, 17,7,25,3,100};

        int test =999999;
        ArrayList<Integer> largest2 = new ArrayList<>();
        for(int a : largest){
            int i =0;
            if(a < test)


            i++;
        }

        System.out.println(largest2);


//        4. Create a method to reverse an array of integers. Implement the method without creating a new array.
//Original Array:
//[5,4,3,2,1] Expected Output: Reversed Array:
//1234 5

        int [] revers = {5,4,3,2,1};
            for (int a : revers){
                System.out.print(a);

            }
        System.out.println();
            r(revers);

//        5. Write a menu driven Java program with following option:
//        1. Accept elements of an array
        //    2. Display elements of an array
        //    3. Search the element within array
        //    4. Sort the array
        //5. To Stop the size of the array should be
        //    entered by the user.

        System.out.println("enter the size of the array ");
        int size = in.nextInt();

        int[] array = new int[size];
        boolean stop =true ;

        while(stop ){
        System.out.println("1. Accept elements of an array\n"
                            +"2. Display elements of an array\n"+
                            "3. Search the element within array\n"+
                            "4. Sort the array\n"+
                            "5. To Stop the size of the array should be entered by the user." );
        int lest = in.nextInt();
        switch (lest){
            case 1 :
                for (int i = 0; i < array.length; i++) {
                    System.out.println("enter your elements");
                    int x = in.nextInt();
                    array[i] = x;
                }
                break;
            case 2:
                    for(int i =0 ; i < array.length ; i++){
                         System.out.print(" " + array[i]+" \n");
                    }
                break;
            case 3:
                System.out.println("Enter the index");
                int a1 = in.nextInt();
                for(int a : array){
                    if(a ==a1 ){
                        System.out.println(a);

                    }
                }
                break;
            case 4:

                Arrays.sort(array);
                for(int i =0 ; i < array.length ; i++){
                    System.out.print(" " + array[i]+" \n");
                }
                break;
            case 5:
                stop = false;
                break;
            default:
                System.out.println("Error, please try again");

           }

        }

        System.out.println("Good bye");


        ///////////////////End

        //6. Create a method that generates a random number within a given range. Allow the user to specify the range and call the method to display random numbers.
        //Hint: use Random class Sample Output:
        //     2
        //Enter the minimum value of the range: 10
        //Enter the maximum value of the range: 100
        //Enter the number of random numbers to generate: 5 Random numbers within the specified range:
        //71 - 98 - 96 - 71 - 71

//        Random random = new Random();

        System.out.print("Enter the minimum value of the range: ");
        int min = in.nextInt();
        System.out.print("\nEnter the maximum value of the range: ");
        int max = in.nextInt();
        System.out.print(" \nenter the random: \n");
        int r = in.nextInt();


        for (int i =0 ; i <r ; i++) {

            System.out.println( random(min , max));
        }
//        /////////////end
//
//        7. Write a program that checks the strength of a password. Create a method that evaluates a password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
//                - We have three methods: checkLength, checkSpecialCharacters, and checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
//                - The totalScore is calculated by adding the scores from these methods.
//        - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
//        based on the totalScore. - The criteria for scoring:
//• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
//• Special characters: Absence (0 points), Presence (2 points).
//• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
//        points).

        System.out.println("enter your password:");
        String password = in.nextLine();

        int point = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);

        if(point >= 8)
            System.out.println("pass is strong");
        else
            System.out.println("pass is week");

        /////////////end


//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//       Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//       and each subsequent number in the sequence is the sum of the two preceding ones.



        System.out.print("Enter the number  ");
        int f = in.nextInt();

        gf(f);









    }
    public static ArrayList<String> longest (ArrayList<String> arr){  ////////////////////////////Q-1
        ArrayList<String> longest = new ArrayList<>();
        String s = arr.get(0);
        for(String a : arr){
            if(a.length() > s.length())
                longest.add(a);
            else if(a.length() == s.length())
                longest.add(a);

        }
        return longest;
    }


    public static void r (int[] arr){//////////////////////////////////Q4

        int l = 0;
        int r = arr.length-1;
        int a ;
        while(l<r){
            a  = arr[l];
            arr[l] = arr[r];
            arr[r] = a;
            r--;
            l++;
        }

        for(int s: arr)
        System.out.print(arr[s]);

    }


    public static int random(int min, int max) {
    int a [] = new int [min];
    for (int i = 1 ; i < 5; i++) {
       int i1 =0 ;
        a[i1] = random(min, max);
        i1++;
    }

    System.out.println();
        Random r = new Random();


        return r.nextInt(min, max);
    }

    public static int checkLength(String pass) {


        if (pass.length() >= 6 && pass.length() < 8)
            return  2;
        if (pass.length() >= 8)
            return  3;
        else return 0;
    }

    public static int checkSpecialCharacters(String pass) {


        if (pass.matches("@") || pass.matches("&"))
            return 2;
        else
        return 0;
    }

    public static int checkUpperCaseLowerCase(String pass) {

        for (char a : pass.toCharArray()) {
            if (Character.isUpperCase(a) && Character.isLowerCase(a))
                 return 3;
        }

        return 0 ;



    }


    public static void gf(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0;
        int second = 1;



        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }














}