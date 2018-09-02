import java.util.Scanner;

public class temperature {

/*
Write a program that has a variable named temperature and assign a value of between 92.0 and 104.0 to it.

Get the temperature from the user.

Using an else structure, determine if the temperature is low (below 97.5), normal (between 97.5 and 99.5)
or high (over 99.5). Display to the screen text that indicates what the temperature is, and if it is high, low,
or normal. Make sure to test the program with each of the three possible value ranges to make sure that it works.{
*/

    public static void main(String[] args) {

        double user_TEMP;
        double defined_LTEMP = 91.9;
        double defined_HTEMP = 104.1;

        Scanner user_INPUT = new Scanner(System.in); // collecting users input
//        user_TEMP = user_INPUT.nextDouble(); --- Before System out. -- no good9

        System.out.println("Enter a temperature between 92.0 and 104.0: ");
        user_TEMP = user_INPUT.nextDouble();

        if (user_TEMP > defined_LTEMP && user_TEMP < defined_HTEMP) {
            if (user_TEMP < 97.5) {
                System.out.println(user_TEMP + " is below normal temperature.");

            } else if (user_TEMP > 97.4 && user_TEMP < 99.6) {
                System.out.println(user_TEMP + " is normal temperature.");

            } else if (user_TEMP > 99.5) {
                System.out.println(user_TEMP + " is high");

            }
        }
        else if (user_TEMP < 92.0 || user_TEMP > 104.0){
                System.out.println("ERROR, that was not between 92.0 and 104.0");
            }


        }
    }


