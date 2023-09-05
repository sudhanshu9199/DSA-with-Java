                    /* Medium */

    /*Q) Tower of Hanoi. */
// public class recursion_2Questions{
//     public static void towerOfHanoi(int n, String src, String helper, String dest) {
//         if(n == 1){
//             System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }



/*Q) Print String in reverse. 'abcd' */
// public class recursion_2Questions{
//     public static void printRev(String str, int idx) {
//         if(idx == 0){
//             System.out.println(idx);
//             return;
//         }
//         System.out.println(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length()-1);
//     }
// }



/*Q) Check if anarray is sorted(Strickly Increasing). */

// public class recursion_2Questions{
//     public static boolean isSorted(int arr[], int idx) {
//         if(idx == arr.length-1){
//             return true;
//         }
//         else if (arr[idx]< arr[idx+1]){
//             //array is sorted till now
//             return isSorted(arr, idx+1);
//         }
//         else{
//             return false;
//         }
//     }
//         public static void main(String[] args) {
//             int arr[] = {1,3,2,8,};
//             System.out.println(isSorted(arr, 0));
        
//     }
// }
/* DRY RUN: 
   Now, let's break down the code execution:

1. The 'main' method is called.
2. An integer array 'arr' is defined with values.
3. 'isSorted(arr, 0)' is called, indicating that we want to check if the array is sorted starting from index 0.

Inside isSorted function:

1. 'idx' is initially 0, which is not equal to 'arr.length - 1' (3), so we move to the next step.
2. It checks if 'arr[0] < arr[1]', which is true because 1 is less than 3.
3. Since the condition is true, it recursively calls 'isSorted(arr, idx + 1)' with 'idx' incremented by 1 (now idx = 1).

Inside the new recursive call:

1. 'idx' is now 1, which is still not equal to 'arr.length - 1'.
2. It checks if 'arr[1] < arr[2]', which is false because 3 is not less than 2.
3. Since the condition is false, it returns 'false' immediately because the array is no longer sorted.
So, the output of the code is 'false', indicating that the array is not sorted in ascending order beyond the index 0.
 */




           /*OR */
// public class recursion_2Questions{
//     public static boolean isSorted(int arr[], int idx) {
//         if(idx == arr.length-1){
//             return true;
//         }
//         else if (arr[idx]>= arr[idx+1]){
//             //array is unsorted
//             return false;
//         }
//         else{
//             return isSorted(arr, idx+1);
//         }
//     }
//         public static void main(String[] args) {
//             int arr[] = {1,3,2,8,15,25,14,98,15478,9891};
//             System.out.println(isSorted(arr, 0));
        
//     }
// }



/*Q) Print a string in reverse. */

// public class recursion_2Questions{
//     public static void printRev(String str, int idx) {
//         if(idx == 0){
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length()-1);
//     }
// }  //OUTPUT: d  c  b  a

/*DRY RUN:
  Now, let's break down the code execution:

1. The 'main' method is called.
2. A string 'str' is defined with the value "abcd".
3. 'printRev(str, str.length() - 1)' is called, indicating that we want to print the characters of the string in reverse order starting from the last character.

Inside printRev function:

1. 'idx' is initially set to 'str.length() - 1', which is 3 (the index of the last character 'd').
2. It checks if idx is equal to 0, which is false in this case.
3. It prints the character at index idx, which is 'd', without moving to the next line.
4. It then recursively calls printRev(str, idx - 1) with idx decremented by 1 (now idx = 2).
5. Inside the new recursive call:

1.idx is now 2.
2.It checks if idx is equal to 0, which is false.
3.It prints the character at index idx, which is 'c', without moving to the next line.
4.It then recursively calls printRev(str, idx - 1) with idx decremented by 1 (now idx = 1).

Inside the next recursive call:

1. idx is now 1.
2.It checks if idx is equal to 0, which is false.
3.It prints the character at index idx, which is 'b', without moving to the next line.
4.It then recursively calls printRev(str, idx - 1) with idx decremented by 1 (now idx = 0).
Inside the final recursive call:

1. idx is now 0.
2. It checks if idx is equal to 0, which is true.
3. It prints the character at index idx, which is 'a', and moves to the next line.
4. The function returns, and the recursion unwinds.
 */



 /*Q) Move all 'x' to the end of the string. */
//  public class recursion_2Questions{
//     public static void moveAllX(String str, int idx, int count, String newString) {
//         if(idx == str.length()){
//             for(int i=0;i<count; i++){
//                 newString+='x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         }
//         else{
//             newString += currChar;
//             moveAllX(str, idx+1, count, newString);
//         }
        
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, "");
//     }
//  }

 /*DRY RUN:
   1. The 'main' method is called.
2. A string 'str' is defined with the value "axbcxxd".
3.'moveAllX(str, 0, 0, "")' is called, indicating that we want to move all occurrences of 'x' to the end of the string.

Inside 'moveAllX' function:

1. 'idx' is initially set to 0.
2. It checks if 'idx' is equal to str.length(), which is false in this case.
3. It checks the character at index idx, which is 'a'.
4. Since 'a' is not 'x', it adds 'a' to the newString and makes a recursive call 'moveAllX(str, idx + 1, count, newString)' with newString updated to "a".

Inside the new recursive call:

1. 'idx' is now 1.
2. It checks if idx is equal to str.length(), which is false.
3. It checks the character at index idx, which is 'x'.
4. Since 'x' is 'x', it increments count to 1 and proceeds without adding 'x' to newString.

This process continues, and the function keeps moving through the string, incrementing count for each 'x' encountered, and adding non-'x' characters to newString.

Finally, when idx becomes equal to str.length(), it means the entire string has been processed. It creates a string of 'x' characters based on the count and adds it to the end of newString. Then, it prints newString.
  */


  /*Q) Remove duplicates in a string. "abbccda"*/
//   public class recursion_2Questions{
//     public static boolean[] map = new boolean[26];
//     public static void removeDuplicates(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(map[currChar-'a']){
//             removeDuplicates(str, idx+1, newString);
//         }
//         else{
//             newString += currChar;
//             map[currChar -'a']= true;
//             removeDuplicates(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDuplicates(str, 0, "");
//     }
//   }  //OUTPUT: abcd

/* Dry RUN:
 Here's the dry run explanation:

1.We have a class named recursion_2Questions with an array map of booleans with a size of 26 (representing the lowercase English alphabet).

2.In the removeDuplicates method, we start with an empty newString and a given input string str which is initially "abbccda".
 The variable idx starts at 0.

3.Inside the removeDuplicates method, we check if idx is equal to the length of the string str. If it is, we print the newString
 (which contains the string without duplicates) and return.

4.If idx is not equal to the length of the string, we proceed with the following steps:

a. We get the character at the current index (idx) from the string str and store it in currChar.

b. We check if map[currChar - 'a'] is true. This map array is used to keep track of whether a character has been encountered before.
 It maps characters to their corresponding positions in the English alphabet (0-25). For example, 'a' maps to 0, 'b' to 1, and so on.

c. If map[currChar - 'a'] is true, it means that the character currChar has been encountered before, so we recursively call removeDuplicates
 with the next index (idx + 1) without adding currChar to the newString.

d. If map[currChar - 'a'] is false, it means that the character currChar is encountered for the first time. We add currChar to the newString,
 mark it as encountered in the map array by setting map[currChar - 'a'] to true, and then recursively call removeDuplicates with the next index (idx + 1).

5. In the main method, we initialize the input string str to "abbccda" and call removeDuplicates with the initial values of idx (0) and an
 empty newString.

Now, let's see how the code processes the input "abbccda":

removeDuplicates("abbccda", 0, "")
currChar = 'a', map[0] is false
newString = "a"
Call removeDuplicates("abbccda", 1, "a")
currChar = 'b', map[1] is false
newString = "ab"
Call removeDuplicates("abbccda", 2, "ab")
currChar = 'b', map[1] is true
Skip 'b'
Call removeDuplicates("abbccda", 3, "ab")
... (continue)
... (continue)
... (continue)
As the code progresses, it checks each character in the input string "abbccda" and appends it to the newString only if it hasn't been
 encountered before. The final result is printed to the console.
 */


/*Q) Write a program to print all the subsequences of a string. "abc" */
// public class recursion_2Questions{
//   public static void subsequences(String str, int idx, String newString) {
//     if(idx == str.length()){
//       System.out.println(newString);
//     }
//     char currChar = str.charAt(idx);
//     // to be
//     subsequences(str, idx+1, newString+currChar);
//     // or not to be
//     subsequences(str, idx+1, newString);
//   }
//   public static void main(String[] args) {
//     String str = "abc";
//     subsequences(str, 0, "");
//   }
// }
/*DRY RUN:
  Here's the dry run explanation:

1. We have a class named recursion_2Questions.

2. In the subsequences method, we start with an empty newString and a given input string str, which is initially "abc". The variable idx starts at 0.

3. Inside the subsequences method, we check if idx is equal to the length of the string str. If it is, we print the newString (which contains a subsequence of the input string) and return.

4. If idx is not equal to the length of the string, we proceed with the following steps:

a. We get the character at the current index (idx) from the string str and store it in currChar.

b. We recursively call subsequences twice:

First, we call subsequences with the next index (idx + 1) and add currChar to the newString (newString + currChar). This represents the case where we include the current character in the subsequence.

Second, we call subsequences with the next index (idx + 1) without adding currChar to the newString. This represents the case where we do not include the current character in the subsequence.

5. In the main method, we initialize the input string str to "abc" and call subsequences with the initial values of idx (0) and an empty newString.

Now, let's see how the code processes the input "abc":

subsequences("abc", 0, "")
idx = 0, currChar = 'a'
First call: subsequences("abc", 1, "a")
idx = 1, currChar = 'b'
First call: subsequences("abc", 2, "ab")
idx = 2, currChar = 'c'
First call: subsequences("abc", 3, "abc") (Prints "abc")
Second call: subsequences("abc", 3, "ab") (Prints "ab")
Second call: subsequences("abc", 2, "a")
... (continue)
Second call: subsequences("abc", 1, "a")
... (continue)
Second call: subsequences("abc", 0, "")
... (continue)
As the code progresses, it explores all possible subsequences of the input string "abc" and prints each subsequence.
 */


// import java.util.HashSet; //package
// public class recursion_2Questions{
//   public static void subsequences(String str, int idx, String newString, HashSet<String>set) {
//     if(idx == str.length()){
//       if(set.contains(newString)){
//         return;
//       }
//       else{
//         System.out.println(newString);
//         set.add(newString);
//         return;
//       }
//     }
//     char currChar = str.charAt(idx);
//     // to be
//     subsequences(str, idx+1, newString+currChar, set);
//     // or not to be
//     subsequences(str, idx+1, newString, set);
//   }
//   public static void main(String[] args) {
//     String str = "aaa";
//     HashSet<String>set = new HashSet<>();
//     subsequences(str, 0, "", set);
//   }
// } //OutPut: aaa aa a



/*Q) Print keypad combination. */
// public class recursion_2Questions{
//   public static String[]keypad = {".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","xyz"};
//   public static void printComb(String str, int idx, String combination) {
//     if(idx == str.length()){
//       System.out.println(combination);
//       return;
//     }
//     char currChar = str.charAt(idx);
//     String mapping = keypad[currChar -'0'];

//     for(int i = 0; i<mapping.length(); i++){
//       printComb(str, idx+1, combination+mapping.charAt(i));
//     }
//   }
//   public static void main(String args[]){
//     String str = "2";
//     printComb(str, 0, "");
//   }
// }
