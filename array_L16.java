/* Problem 1. Find the total number of pairs in the array whose sum is equal to the given value x. 
  Array[4, 6, 3, 5, 8, 2] ; target = 7
*/

// import java.util.Scanner;
// public class array_L16 {

//     public static int pairSum(int arr[], int target){
//         int ans = 0;

//         for(int i = 0; i<arr.length; i++){ //first number
//             for(int j = i+1 ;j<arr.length; j++){ //second number
//                 if(arr[i] + arr[j] == target){
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i=0;i<arr.length;i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter target sum: ");
//         int target = sc.nextInt();

//         System.out.println("Two pairs formed: "+(pairSum(arr, target)));

//     }
// }




/* Problem 2. Count the number of triplets whose sum is sum is equal to the given value x.
 Array [1, 4, 5, 6, 3] ; target = 12
*/


// import java.util.*;
// public class array_L16{

//     public static int tripletsSum(int arr[], int target){
//         int ans = 0;
//         for(int i = 0; i< arr.length;i++){
//             for(int j = i+1; j<arr.length;i++){
//                 for(int k = j+1; j< arr.length; k++){
//                     if(arr[i]+arr[j]+arr[k] == target){
//                         ans++;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int i = 0; i<arr.length; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter target sum: ");
//         int target = sc.nextInt();

//         System.out.println("Triplets pair: "+(tripletsSum(arr, target)));
//     }   // it is not total correct, do correct
// }


                 /* OR */



// import java.util.*;

// public class array_L16 {

//     public static int tripletsSum(int arr[], int target) {
//         int ans = 0;
//         for (int i = 0; i < arr.length - 2; i++) {
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                 for (int k = j + 1; k < arr.length; k++) {
//                     if (arr[i] + arr[j] + arr[k] == target) {
//                         ans++;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print("Enter element [" + i + "] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter target sum: ");
//         int target = sc.nextInt();

//         System.out.println("Triplets pair: " + tripletsSum(arr, target));
//     }
// }



/*           Pattern: ARRAY MANIPULATION */
/*Problem 3. Find the unique number in a given Array only positive elements in array where all the elements are being repeated twice with one value begin unique.
 Array [1, 2, 3, 4, 2, 1, 3]
*/
/*Algorithm
 * 1.Traverse all pairs. (means: to cross or trav).
 * 2. Equal pairs --> Mark :-1
 * 3. Traverse array again, value > 0 is our answer.
 */

//  import java.util.*;
//  public class array_L16{
//     public static int findUnique(int[] arr, int size){
//         for(int i = 0; i<size; i++){
//             for(int j = i + 1; j<size; j++){
//                 if(arr[i] == arr[j]){
//                     arr[i] = -1;
//                     arr[j] = -1;
//                 }
//             }
//         }
//         int ans = -1;
//         for(int i = 0; i<size; i++){
//             if(arr[i] > 0){
//                 ans = arr[i];
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size];

//         for(int i = 0; i< size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Unique element: "+ findUnique(arr, size));
//     }
//  }



 /*Problem 4. Find the second largest element in the given Array. Ans will always in the given Array.
  Ex - Array[9, 8, 9, 6, 9, 5, 8] ; max-9 ; second max- 8
  Ex - Array[0, -2, 0, -3, 0, -4] ; max -0; second max- -2
  */
  // Integer.MIN_VALUE : (mx= -infinite) USED for find out minimum.
  // Intefer.MAX_VALUE : (mn = +infinite) Used for find out maximum.

  /*ALGORITHM:
   * 1. Find maximum
   * 2. Mark all maximums as -infinite
   * 3. Find maximum ----> second max.
   */

// import java.util.*;
// public class array_L16{
//     public static int findMax(int arr[], int size){
//         int mx = Integer.MIN_VALUE;
//         for(int i = 0; i< size; i++){
//             if(arr[i] > mx){
//                 mx = arr[i];
//             }
//         }
//         return mx;
//     }
//     public static int findSecondMax(int[] arr, int size){
//         int mx = findMax(arr,size);

//         for(int i = 0; i<size; i++){
//             if(arr[i] == mx){
//                 arr[i] = Integer.MIN_VALUE;
//             }
//         }
//         int SecondMax = findMax(arr, size);
//         return SecondMax;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0; i<size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Largest element is "+(findMax(arr, size)));
//         System.out.println("Second largest element is "+(findSecondMax(arr, size)));
//     }
// }





/*Problem 5. Given an array 'a' consisting of integers. Return the first value value that is repeating in this array. If no value is begin repeated, return -1.
  ex- Array[1, 5, 3, 4, 6, 3, 4] ; ans = 3
  ex2- Array[1, 2, 4, 6, 7] ; ans = -1
 */

// import java.util.*;
// public class array_L16{
//     public static int firstRepeat(int[] arr, int size){
//         for(int i = 0; i<size; i++){
//             int curr = arr[i];
//             for(int j = i+1; j<size; j++){
//                 if(arr[j] == curr){
//                     return i+1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0; i< size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println((firstRepeat(arr, size)));
//     }
// }


// import java.util.*;
// public class array_L16{
//     public static int firstRepeat(int arr[], int size){
//         int ans = -1;
//         for(int i = 0; i<size; i++){  //first number
//             for(int j = 0; j<size; j++){  //second number
//                 if(arr[i] == arr[j]){ //found answer
//                     return arr[i];
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0; i<size; i++){
//             System.out.print("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//     }
// }




/*Q) Given an array 'a' consisting of integers. Return the last value that is repeating in this array. If no value is being repeated, return -1.
 ex-ex- Array[1, 5, 3, 4, 6, 3, 4] ; ans = 4
 */

// import java.util.*;
// public class array_L16{
//     public static int lastReapting(int arr[], int size){
//         for(int i = size-1; i>0; i--){
//             if(arr[i] == arr[i - 1]){
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0; i< size; i++){
//             System.out.println("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println((lastReapting(arr, size)));
//     }
// }

/* Q) Find the second smallest element in the given Array. */

/*Assignment Questions */
/*Q1) Given an array sorted in increasing order of size n and an integer x, find if there exists a
pair in the array whose absolute difference is exactly x.(n>1) 
 Ex- array[5, 10, 15, 20, 26] ;  x = 10  ; output = yes*/


// import java.util.*;
// public class array_L16{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i = 0; i<size; i++){
//             System.out.println("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter integer number you find in Array: ");
//         int x = sc.nextInt();
//         for(int i = 0; i<size; i++){
//             for(int j = i+1; j<size; j++){
//                 if(arr[j] - arr[i]  == x){
//                     System.out.println("Yes "+x+" number is exist");
//                     return;
//                 }
//             }
//         }
//         System.out.println("No"+x+"number is not exist");
//     }
// }




/*Q2) Given an array of size n, find the total number of occurrences of given number x.
  Ex- Array[3, 5, 0, 7, 8, 3, 0] ; x = 0 ; output: 0 occur 2 times.
 */
/* Explanation:
> Keep a pointer count, and traverse the array, and check for each element being equal to x
 > If current element equals z, increment count
 > Print count in the end. */


// import java.util.*;
// public class array_L16{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i = 0; i< arr.length; i++){
//             System.out.print("Enter element ["+ i +"] : ");
//             arr[i] = sc.nextInt();
//         }
//         System.out.print("Enter the number: ");
//         int x = sc.nextInt();
//         int count = 0;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] ==x){
//                 count++;
//             }
//         }
//         System.out.println(x+" Occur "+count+" times.");
//     }
// }



/*Q3) Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
missing number from the first N integers. There are no duplicates in the list. */
/*Explanation:
> Logic is to mark the element at the curret elemet as idexn egativeN Son whichever element would be
missing, the elemet at the missing element as index would be positive.
> Traverse the give arrayn if the absolute value of curret element is greater tha size of the array, then
cotinue, else multiply the (absolute value of (current elemet) – 1)th index with -1
> Iitialize a variable ans = size + 1
>  Traverse the array ad if the value is positive assig ans = index + 1, print and return
> Print n+1 i the edn this will ru oly whe o elemet is missig from 1 to n. */

// import java.util.*;
// public class array_L16{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for(int i = 0; i<arr.length; i++){
//             System.out.println("Enter element ["+i+"] : ");
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i<size; i++){
//             if(Math.abs(arr[i]) - 1 == size){
//                 continue;
//             }
//             int ind = Math.abs(arr[i]) - 1;
//             arr[ind] *= -1;
//         }
//         int ans = 0;

//         for(int i = 0; i<size; i++){
//             if(arr[i]> 0){
//                 ans = i+1;
//                 System.out.println(ans);
//                 return;
//             }
//         }
//         System.out.println(size+1);
//     }
// }