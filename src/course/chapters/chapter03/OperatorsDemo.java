package course.chapters.chapter03;

/*
* Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.
* */

public class OperatorsDemo {

    public static void main(String[] args) {
        // Assignment with =
        int speed = 0;

        // Arithmetic operators + - * / %
        int numberValue = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + numberValue);
        int original_result = numberValue;

        numberValue = numberValue - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + numberValue);
        original_result = numberValue;

        numberValue = numberValue * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + numberValue);
        original_result = numberValue;

        numberValue = numberValue / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + numberValue);
        original_result = numberValue;

        numberValue = numberValue + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + numberValue);
        original_result = numberValue;

        numberValue = numberValue % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + numberValue);

        // + for string concatenation
        String concatStr = "value _" + "concatenation value";

        //unary operators
        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);
        System.out.println(++result);   // difference between pre and post
        System.out.println(--result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }

}

// comparison operators
class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
    }
}


// conditions
/*
* &&
* ||
* */
class ConditionalDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}

//Exercises
/*
* Consider the following code snippet.
arrayOfInts[j] > arrayOfInts[j+1]
Which operators does the code contain?
Consider the following code snippet.
int i = 10;
int n = i++%5;
What are the values of i and n after the code is executed?
What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?
To invert the value of a boolean, which operator would you use?
Which operator is used to compare two values, = or == ?
Explain the following code sample: result = someCondition ? value1 : value2;

* */
