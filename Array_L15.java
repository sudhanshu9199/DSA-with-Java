/* Taking Input, Array Reference, Cloning and Copy |Lecture 15 */

// public class Array_L15 {   //1D Array
//     public static void main(String[] args) {
//         int number[] = new int[4];
//         number[0] = 5;
//         number[1] = 6;
//         number[2] = 7;
//         number[3] = 8;
//         // System.out.println(number[2]);
//         for(int i = 0; i< 4;i++){
//             System.out.println("Number is "+number[i]);
//         }
//     }
// }


/*User input in Array */
// import java.util.Scanner;
// public class Array_L15{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int i = 0; i<size /* or arr.length */;i++){ //input
//             arr[i] = sc.nextInt();
//         }

//         //output
//         for(int i = 0; i<size; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }




/* Cloning an array */
// import java.util.*;
// public class Array_L15{
//     public static void main(String[] args) {
//         int a[] = {5,8,69,78,25};
//         int n = a.length;
//         int b[] = Arrays.copyOf(a,4);
//         b[0] = 1;
//         System.out.println("Orignal array");
//         for(int i = 0; i< n; i++){
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//         System.out.println("\nCloned Array");
//         for(int i = 0; i< b.length; i++){
//             System.out.print(b[i]+ " ");
//         }
//     }
// }
// output: Orignal array
// 5 8 69 78 25

// Cloned Array
// 1 8 69 78



/*QUESTION.1. COUNT THE NUMBER OF OCCURENCES OF A PARTICULAR ELEMENT X. */

// import java.util.*;
// public class Array_L15{
//     public static int countOccurrences(int[] arr, int x) {
//         int count = 0;
//         for(int i = 0; i<arr.length;i++){
//             if(arr[i] == x){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];
//         System.out.print("Enter "+size+" elements: ");
//         System.out.println();
//         for(int i= 0; i<arr.length; i++){
//             System.out.print("Enter Elements ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter x: ");
//         int x = sc.nextInt();

//         System.out.println("Count of x is "+countOccurrences(arr, x));
//     }
// }



/*QUESTION.2. Find the last occurrence of an element x in a given array. */


// import java.util.*;
// public class Array_L15{

//     public static int lastOccurrence(int x, int[] arr){
//     int lastIndex = -1;
//     for(int i = 0; i<arr.length; i++){
//         if(arr[i] == x){
//             lastIndex = i;
//         }
//     }
//     return lastIndex;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         //input
//         for(int i = 0; i< arr.length; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter x: ");
//         int x = sc.nextInt();

//         System.out.println("Last Occurrence of x is "+ lastOccurrence(x, arr));
//     }
// }



/*QUESTION.3. COUNT THE NUMBER OF ELEMENTS STRICTLY GREATER THAN VALUE X. */
// import java.util.*;
// public class Array_L15{
//     public static int countElement(int a[], int x){
//         int count = 0;
//         for(int i = 0; i<a.length; i++){
//             if(a[i]>x){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of Array: ");
//         int x = sc.nextInt();
//         int a[] = new int[x];

//         for(int i = 0; i<x; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             a[i] = sc.nextInt();
//         }
//         System.out.println(countElement(a, x));  //wrong
//     }
// }

       /* OR */
// import java.util.*;
// public class Array_L15
// {
// public static int countOfElements(int
// a[], int x){
// int count = 0;
// for(int i = 0; i < a.length; i++) {
// if(a[i] > x)
// count++;
// }
// return count;
// }
// public static void main(String[] args) {
// int a[] = { 1, 4, 7, 9 , 1};
// System.out.println(countOfElements(a,1));
// }
// }



/*QUESTION.4. CHECK IF THE GIVEN ARRAY IS SORTED OR NOT. */

// import java.util.Scanner;

// public class Array_L15{
//     public static boolean check(int arr[]){
//         boolean ans=true;
//         for(int i = 1; i<arr.length; i++){
//             if(arr[i] <arr[i-1]){
//                 ans = false;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         System.out.println();
//         int arr[] = new int[size];

//         for(int i = 0; i<size; i++){
//             System.out.print("Element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(check(arr));
//     }
// }


/*PRACTICE QUESTIONS
1Q. Given an unsorted array arr[] of size N having both negative and positive integers, place
all negative elements at the end of array without changing the order of positive elements
and negative elements
 */

// import java.util.Scanner;

// public class Array_L15{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of Array: ");
//         int size = sc.nextInt();

//         int arr[] = new int[size];
//         for(int i = 0; i<size;i++){
//             System.out.print("Element "+i+" : ");
//             arr[i] = sc.nextInt();
//         }
//         int ans[] = new int[size];
//         int idx = 0;
//         for(int i = 0; i<size; i++){
//             if(arr[i]>= 0){
//                 ans[idx] = arr[i];
//                 idx++;
//             }
//         }
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i]<0){
//                 ans[idx] = arr[i];
//                 idx++;
//             }
//         }

//         for(int i = 0; i<size;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
//  }




 /*2Q. Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
union between these two arrays and print the number of elements of the union set.
Union of the two arrays can be defined as the set containing distinct elements from both
the arrays. If there are repetitions, then only one occurrence of element should be printed
in the union. */

// import java.util.*;
// public class Array_L15{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Size of Array 1: ");
//         int m = sc.nextInt();
//         System.out.print("Enter size of Array 2: ");
//         int n = sc.nextInt();
//         //Array
//         int a[] = new int[n];
//         int b[] = new int[m];
//         System.out.println("Enter Elements of Array 1.");
//         for(int i = 0; i<n; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Enter Elements of Array 2.");
//         for(int i = 0; i<m; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             b[i] = sc.nextInt();
//             boolean check = false;
//             for(int j = 0; j< n; j++){
//                 if(b[i] == a[i]){
//                     check = true;
//                     break;
//                 }
//             }
//             if(!check){
//                 System.out.println(b[i]);
//             }
//         }   //wrong
//     }
// }




/*3. Given an array arr[] and an integer K where K is smaller than size of array, the task is to
find the Kth smallest element in the given array. It is given that all array elements are
distinct. */

// import java.util.*;
// public class Array_L15{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0; i<size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter any interger: ");
//         int k = sc.nextInt();
//         Arrays.sort(arr);  // this line is sorting the arrays elements.
//         System.out.println(arr[k-1]);
//     }
// }





/*4. Given an unsorted array A of size N that contains only non-negative integers, find a
continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left
to right.
You need to print the start and end index of answer subarray. */

import java.util.*;
public class Array_L15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int N = sc.nextInt();
        int S = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i<N; i++){
            System.out.print("Enter element ["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j =0;
        int sum = 0;
        while(j<N){
            sum += arr[j];
            if(sum > S){
                while(sum > S && i<j){
                    sum-= arr[i];
                    i++;
                }
            }
            if(sum == S){
                System.out.print(i+"");
                System.out.print(j);
                break;
            }
            j++;
        }
    }
}      




/* 5. Write a Java program to test the equality of two arrays. */
// import java.util.*;
// public class Array_L15{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int arr2[] = new int[size];
//         System.out.println("Enter elements of Array 1.");
//         for(int i = 0; i< size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         boolean ans = true;
//         System.out.println("Enter element of Array 2.");
//         for(int i = 0; i<size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr2[i] = sc.nextInt();
//             if(arr2[i]!= arr[i]){
//                 ans = false;
//                 break;
//             }
//         }
//         System.out.println(ans);
//     }
// }


