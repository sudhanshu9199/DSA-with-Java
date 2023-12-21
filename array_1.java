// import java.util.*;
// public class array_1{
//     public static void main(String[] args) {
//         int marks[]=new int[3]; // OR int[] marks = new int[3];
//         marks[0]=97;
//         marks[1]=98;
//         marks[2]=95;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         for(int i = 0; i<3; i++){
//             System.out.println(marks[i]);
//         }
//     }
// }
/*97
98
95 */


// import java.util.*;
// public class array_1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for(int i = 0; i<size; i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }




import java.util.*;
public class array_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i= 0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}



/*Q) Take an array as input from the user. Search for a given number x and print the index at which it occurs. */
import java.util.Scanner;
public class array_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size]; //define(def) array
        //input 
        for (int i = 0; i< size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter one Element value To find: ");
        int x = sc.nextInt();
        //output
        for(int i = 0; i<numbers.length;i++){  // OR for(int i = 0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("x found at index: "+i);
            }
        }
    }
}



/*
Homework Problems
Take an array of names as input from the user and print them on the screen.
 */


import java.util.*;
public class array_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numName = sc.nextInt();
        System.out.println();

        String[] names = new String[numName];

        sc.nextLine();
        for(int i = 0; i< numName; i++){
            System.out.print("Enter name "+(i + 1)+": ");
            names[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("Name Entered:");
        for(String name : names){
            System.out.println(name);
        }
        /* or we also able to use this to replace it
           for (int i = 0; i < names.length; i++) {
    String name = names[i];
    // Code to execute for each name
}
         */
    }
}
