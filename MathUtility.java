package utilities;

public class MathUtility {
    public static int sumOfTwoNumber(int num1, int num2){
        return num1+num2;
    }
    public static double sumOfTwoNumber(double num1, double num2){
        return num1+num2;
    }


    public static int subtractionOfTwoNumber(int num1, int num2){
        return num1-num2;
    }
    public static double subtractionOfTwoNumber(double num1, double num2){
        return num1-num2;
    }


    public static int multiplicationOfTwoNumber(int num1, int num2){
        return num1*num2;
    }
    public static double multiplicationOfTwoNumber(double num1, double num2){
        return num1*num2;
    }


    public static int divideOfTwoNumber(int num1, int num2){
        return num1/num2;
    }
    public static double divideOfTwoNumber(double num1, double num2){
        return num1/num2;
    }


    public static boolean isEven(int number){

        if (number%2==0){
            return true;
        }else
            return false;
    }
    public static boolean isOdd(int number){

        if (number%2!=0){
            return false;
        }else
            return true;
    }


    public static int maxOfTwoNumber(int num1,int num2){
        if (num1 > num2){
            return num1;
        }else
            return num2;
    }
    public static double maxOfTwoNumber(double num1,double num2){
        if (num1 > num2){
            return num1;
        }else
            return num2;
    }



    public static int minOfTwoNumber(int num1,int num2){
        if (num1 < num2){
            return num1;
        }else
            return num2;
    }
    public static double minOfTwoNumber(double num1,double num2){
        if (num1 < num2){
            return num1;
        }else
            return num2;
    }



    public static int square(int number){
        return number*number;
    }
    public static double square(double number){
        return number*number;
    }



    public static int cube(int number){
        return number*number*number;
    }
    public static double cube(double number){
        return number*number*number;
    }


}
/*
            2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers
			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals
			2.5 Create a method that can return the multiplication of two integers
			2.6 Create a method that can return the multiplication of two decimals
			2.7 Create a method that passes two double parameters and return the division result
			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number
			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers
			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers
			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double
			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double
 */