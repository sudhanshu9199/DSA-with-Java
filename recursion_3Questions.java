                      /*Advance Level */

/*Q) Write a program to print all permutations of a string "abc" */
// public class recursion_3Questions {
//     public static void printPerm(String str, String permutation) {
//         if(str.length()==0){
//             System.out.println(permutation);
//             return;
//         }
//         for(int i = 0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             //"abc" --> "ab"
//             String newStr = str.substring(0,i)+str.substring(i+1);
//             printPerm(newStr, permutation+currChar);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         printPerm(str, "");
//     }
// }


/*Q) Write a program to count total paths in a maze to mave from (0,0) to (n,m). n = 3, m = 4. */
// public class recursion_3Questions{
//     public static int countPaths(int i, int j, int n, int m) {
//         if(i == n || j == m){
//             return 0;
//         }
//         if(i == n-1 && j == n-1){
//             return 1;
//         }
//         //move downwords
//         int downPaths = countPaths(i+1, j, n, m);
//         //move right
//         int rightPaths = countPaths(i, j+1, n, m);
//         return downPaths + rightPaths;
//     }
//     public static void main(String[] args) {
//         int n = 3, m = 3;
//         int totalPaths = countPaths(0, 0, n, m);
//         System.out.println(totalPaths);
//     }
// }

/* DRY RUN:
  Now, let's dry run the code:

1. The main method is called with str = "abc" and an empty permutation.

2. Inside the printPerm method:

> The condition str.length() == 0 is checked. Since the input string "abc" is not empty, we proceed to the loop.
3. The loop iterates through the characters of str, starting with 'a'.

4. For each character, we:

Assign currChar as 'a'.
Create a new string newStr by removing the current character 'a' from str. So, newStr becomes "bc".
5. We make a recursive call to printPerm with the updated values:

newStr is "bc".
permutation includes the current character 'a'.
6. This recursive call continues, exploring all possible permutations for the remaining characters 'b' and 'c'.

7. When the input string str becomes empty (i.e., str.length() == 0 is true), we print the permutation, which represents a complete permutation.

8. The program generates and prints all possible permutations of the input string "abc".
 */


 /*Q) Place Tiles of size 1 x m in a floor of size n x m n = 4, m=2. */
//  public class recursion_3Questions{
//     public static int placeTiles(int n, int m) {
//         if(n == m){
//             return 2;
//         }
//         else if(n<m){
//             return 1;
//         }
//         else{
//             //vertically
//             int vertPlacement = placeTiles(n-m, m);
//             //Horizontally
//             int horPlacement = placeTiles(n-1, m);
//             return vertPlacement+horPlacement;
//         }
//     }
//         public static void main(String[] args) {
//             int n = 4, m = 3;
//             System.out.println(placeTiles(n,m));
//         }
//  }

 /*DRY RUN:
   Now, let's dry run the code:

1. The main method is called with n = 4 and m = 3.

2. Inside the placeTiles method:

>. The condition n == m is checked, but it's not true in this case, so we move to the next condition.
3. The condition n < m is checked, but it's also not true because n = 4 and m = 3, so we move to the else block.

4. Inside the else block:

> We calculate vertPlacement by making a recursive call to placeTiles(n - m, m). This means we're considering placing a tile vertically, so we reduce n by m. The new values are n = 1 and m = 3.
> We calculate horPlacement by making a recursive call to placeTiles(n - 1, m). This means we're considering placing a tile horizontally, so we reduce n by 1. The new values are n = 3 and m = 3.
5. For vertPlacement:

> We again enter the placeTiles method with n = 1 and m = 3.
> Since n < m, we return 1.
6. For horPlacement:

> We enter the placeTiles method with n = 3 and m = 3.
> The condition n == m is now true, so we return 2.
7. Returning to the original call:

vertPlacement is 1.
horPlacement is 2.
We return vertPlacement + horPlacement, which is 1 + 2 = 3.
8. The main method prints the result, which is 3.

So, for n = 4 and m = 3, there are 3 different ways to place the tiles to cover the length 4.
  */


/*Q) Find the number of Ways in which you can invite n people to your party, Single or in pairs. n=4 */
// public class recursion_3Questions{
//     public static int callGuests(int n) {
//         if(n<=1){
//             return 1;
//         }
//         //single
//         int ways1 = callGuests(n-1);
//         //pair
//         int ways2 = (n-1) * callGuests(n-2);
//         return ways1+ways2;
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(callGuests(n));
//     }
// } //10