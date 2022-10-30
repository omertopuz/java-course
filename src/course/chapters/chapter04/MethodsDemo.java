package course.chapters.chapter04;

// METHOD = FUNCTION = BEHAVIOR

import java.util.Scanner;

public class MethodsDemo {

    public static void main(String[] args) {
        // built-in methods
        System.out.println("this is a built-in method");
        interactiveFindEvenOdd();
    }

    public static void findEvenOdd(int num) {
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }

    public static void interactiveFindEvenOdd(){
        // while(true)

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
//reading value from the user
        int num=scan.nextInt();
//method calling
        findEvenOdd(num);
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }
}

/*
* 1. Create a method to find the smallest number among three numbers.
2. Create a method to compute the average of three numbers.
3. Create a method to display the middle character of a string.
4. Create a method to count all vowels in a string.
5. Create a method to count all words in a string.
6. Create a method to compute the sum of the digits in an integer.
7. Create a method to display the first 50 pentagonal numbers.
Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.
Expected Output:

1     5     12    22    35    51    70    92    117   145
176   210   247   287   330   376   425   477   532   590
651   715   782   852   925   1001  1080  1162  1247  1335
1426  1520  1617  1717  1820  1926  2035  2147  2262  2380
2501  2625  2752  2882  3015  3151  3290  3432  3577  3725
Click me to see the solution

8. Create a method to compute the future investment value at a given interest rate for a specified number of years.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5

Expected Output:

Years    FutureValue
1            1104.71
2            1220.39
3            1348.18
4            1489.35
5            1645.31

9. Create a method to print characters between two characters (i.e. A to P ).
Note: Prints 20 characters per line

Expected Output:

( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
< = > ? @ A B C D E F G H I J K L M N O
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
d e f g h i j k l m n o p q r s t u v w
x y z
10. Create a method to check whether a year (integer) entered by the user is a leap year or not.
11. Create a method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
12. Create a method (takes a number n as input) to displays an n-by-n matrix.

Expected Output:

Input a number: 10
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0
13. Write Java methods to calculate the area of a triangle.
14. Create a method to create the area of a pentagon.
*
*
* Write a program with a method named getTotal that accepts two integers as an argument and return its sum. Call this method from main( ) and print the results.
Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false. In main() method accept a string from user and count number of vowels in that string.
A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however, is not prime because it can be divided evenly by 1, 2, 4, and 6.
Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a prime number, or false otherwise. Also write main method that displays prime numbers between 1 to 500.
A nonnegative integer is called a palindrome if it reads forward and backward in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes. Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome; otherwise, it returns false. Also write a program to test your method.
*  */
