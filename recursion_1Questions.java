                /*    EASSY   */


/*Q) Write a program to print number 5 to 1. */
// public class recursion_1Questions{
//     public static void printNumb(int n) {
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n); //n =5
//     }
// }
// //output: 5  4  3  2  1



/*Q) Print numbers from 1 to 5. */
// public class recursion_1Questions{
//     public static void printNumb(int n) {
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);
//     }
// }   // 1  2  3  4  5



/*Q) Print sum of first n natural numbers. */
// public class recursion_1Questions{
//     public static void printSum(int i, int n, int sum) {
//         if (i == n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printSum(i + 1, n, sum);
//     }
//         public static void main(String[] args) {
//             printSum(1, 5, 0);
//     }
// }
//output: 15



/*Q) Write a program to print factorial of a number n. */
// public class recursion_1Questions{
//     public static int calcFactorial (int n) {
//         if(n==0 || n==1){
//             return 1;
//         }
//         int fact_n1 = calcFactorial(n-1);
//         int fact_n = n * fact_n1;
//         return fact_n;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = calcFactorial(n);
//         System.out.println(ans);
//     }
// }   //output: 120



/*Q) Write a program to print the fibonacci sequence till nth term. */
// public class recursion_1Questions{
//     public static void printFib(int a, int b, int n) {
//         if(n ==0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printFib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a = 0, b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printFib(a, b, n-2);
//     }
// }



/*Q) write a program to print x^n (stack height = n). */
// public class recursion_1Questions{
//     public static int calcFactorial(int x, int n) {
//         if(n == 0){  //base case 1
//             return 1;
//         }
//         if(x == 0){  //base case 2
//             return 0;
//         }
//         int xPowern1 = calcFactorial(x, n-1);  //work
//         int xpowern = x * xPowern1;
//         return xpowern;
//     }
//     public static void main(String[] args) {  
//         int x = 2, n = 5;
//         int ans = calcFactorial(x, n);
//         System.out.println(ans);  //32
//     }
// }



/*Q) Write a program to print x^n (stack height = log n) */
// public class recursion_1Questions{
//     public static int calcPower(int x, int n) {
//         if(n == 0){ //base 1
//             return 1;

//         }
//         if(x == 0){ //base 2
//             return 0;
//         }

//         //if n is even
//         if(n%2 == 0){
//             return calcPower(x, n/2) * calcPower(x, n/2);
//         }
//         else{ //n is odd
//             return calcPower(x, n/2) * calcPower(x, n/2) * x;
//         }
//     }
//     public static void main(String[] args) {
//         int x = 2, n=5;
//         int ans = calcPower(x,n);
//         System.out.println(ans);
//     }
// }  //32