package sess04_classes_objects_methods;

/**
 * java program to demonstrate how to use overloaded methods.
 *
 * @author pc
 */
public class MethodOverloadingDemo
{

    //main method begins program execution
    public static void main(String[] args)
    {
        //variable to be used in the program
        int firstNum = 3, secondNum = 5, thirdNum = 7, fourthNum = 8;
        byte firstByte = 4;
        long answer;

        methodOverloading ml = new methodOverloading();
        //Add two integers and display their sum
        answer = ml.addNums(firstNum, secondNum);
        System.out.println("The sum of " + firstNum + "and" + secondNum + " " + "is " + answer);
        //Add three integers and display their sum
        answer = ml.addNums(firstNum, secondNum, thirdNum);
        System.out.println("The sum of " + firstNum + "," + secondNum + "and" + thirdNum + "is " + answer);

        //Add a byte & an integer and display their sum 
        answer = ml.addNums(firstByte, firstNum);
        System.out.println("The sum of " + firstByte + "and" + firstNum + " " + "is " + answer);

        //Add several integers and display their sum
        answer = ml.addNums(firstNum, secondNum, thirdNum, fourthNum, 22, 14, 180);
        System.out.println("The sum of the various integers is " + answer);

    }

}
