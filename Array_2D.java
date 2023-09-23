// import java.util.*;
// public class Array_2D{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of Row: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter size of Column: ");
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         //input
//         //control rows
//         for(int i = 0; i<rows; i++){
//             //control columns
//             for(int j = 0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println();
//         //output
//         for(int i = 0; i<rows; i++){
//             for(int j = 0; j<cols; j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


/*Q) Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs. */

// import java.util.Scanner;
// public class Array_2D{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row value: ");
//         int row = sc.nextInt();
//         System.out.print("Enter column value: ");
//         int col = sc.nextInt();

//         int[][] numbers = new int[row][col];

//         //input
//         //row control
//         for(int i = 0; i< row; i++)
//         {
//             //column
//             for(int j = 0; j<col; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         System.out.print("Enter Element you want to found:");
//         int x = sc.nextInt();

//         for(int i = 0; i<row; i++){
//             for(int j = 0; j<col; j++){
//                 if(numbers[i][j]==x){
//                     System.out.println("x found at location ("+i+","+j+")");
//                 }
//             }
//         }

//     //     //output
//     //     for(int i = 0; i<row; i++){
//     //         for(int j = 0; j<col; j++){
//     //             System.out.println(numbers[i][j]+" ");
//     //         }
//     //         System.out.println();
//     //     }
//     // }
// }
// }




/* Homework Problems
 Q) Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners] */
/*Algorithm is : APPROACH : 
Algorithm: (We are given a 2D matrix of n X m ).
1. We will need 4 variables:
a. row_start - initialized with 0.
b. row_end - initialized with n-1.
c. column_start - initialized with 0.
d. column_end - initialized with m-1.
2. First of all, we will traverse in the row row_start from column_start to column_end and we will increase the row_start with 1 as we have
traversed the starting row.
3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.
4. Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.
5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.
6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end.  */
import java.util.Scanner;
public class Array_2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row value: ");
        int row = sc.nextInt();
        System.out.print("Enter column value: ");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col]

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sprial order of matrix is ");
        int rowStart = 0;
        int rowEnd = row-1;
        
        int colStart = 0;
        int colEnd = col-1;
    }
}














/*Q)  */ //Ans.

// public class Array_2D{
//     public static void main(String[] args) {
//         int a = 10;
//         int a = 49;
//         System.out.println(a);
//     } 
// }       //output: Error because here used "int" again.
/*BUT */
// public class Array_2D{
//     public static void main(String[] args) {
//         int a = 10;
//         a = 49;
//         System.out.println(a);
//     }
// } //output: 49 becuse here 'a' variable is updated and we don't use 'int' again.




/*Q)  */
// public class Array_2D{
//     public static void main(String[] args) {
//         int x = 65;
//         System.out.println(x);
//         int x = 54;
//         System.out.println(x);
//     }
// }   //output: Error, because we use 'int' twice time. 



/*Q) int ----> long */
// public class Array_2D{
//     public static void main(String[] args) {
//         int a = 10000;
//         long b = a;
//         System.out.println(b);
//     }
// }   //output: 10000


/*Q) long ---> int */
// public class Array_2D{
//     public static void main(String[] args) {
//         long x = 100000;
//         int y = x;
//         System.out.println(y);
//     }
// }  //ouput: error, it is happen beacuse we don't use (typecast)--> "int y =(int)x