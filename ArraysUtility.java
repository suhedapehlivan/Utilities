package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // method prints each integer of an integer array in seperate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // it prints each decimal number from double array in seperate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // it prints each char of char array from array in seperate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    // it prints each String of string array from array in seperate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }





    // find the max number from integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers[numbers.length - 1];
    }

    // find the max number from double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers[numbers.length - 1];
    }




    // find the min number from integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers[0];
    }

    // find the min decimal from double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers); // the last one is maximum number
        return numbers[0];
    }




    // checks if the given integer is contained in the given array, returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    // checks if the given double is contained in the given array, returns boolean.
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    // checks if the given char is contained in the given array, returns boolean.
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }


    // checks if the given String is contained in the given array, returns boolean.
    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equals(element))
                result = true;

        }
        return result;
    }





    //	adds the given int element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element; //element need to be assigned to the last index
        return result;
    } // function to add one element to array

    // adds the given double element to array, returns a new array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;

        }
        result[i] = element;//element need to be assigned to the last index
        return result;
    }

    // adds the given String element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;//element need to be assigned to the last index
        return result;

    }

    // adds the given char element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        // result[result.length-1]= element; we can write like this
        result[i] = element; //i is the last index of array
        return result;
    }




    //gives the frequency of an element in an array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) { // each represents ech elements of the arrar
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //gives the frequency of a double from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) { // each represents ech elements of the arrar
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //gives the frequency of a char from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) { // each represents ech elements of the arrar
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //gives the frequency of a string from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) { // each represents ech elements of the arrar
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }





    // Returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};  // new int [0]
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequence is 1 that means the element is uniq.
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // Returns the unique doubles of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};  // new int [0]
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequence is 1 that means the element is uniq.
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // Returns the unique char of the array as a new array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};  // new int [0]
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequence is 1 that means the element is uniq.
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // Returns the unique String of the array as a new array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};  // new int [0]
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { // if the frequence is 1 that means the element is uniq.
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }




    // removes the index from array, returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];

        int j = 0; // in the for each loop we don't access to the index of int [] result, so we create j which will represent the indexes of array result when the loop executed for each time

        //from his line we write the code again with for loop
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching with the given index
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the decimals given index from array, returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the char given index from array, returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes the String given index from array, returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {  // if the given index is out of boundry
            System.err.println("Invalid index :" + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }





    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // merge the given two double arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // merge the given two char arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    // merge the given two String arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }




    // reverse the int array returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j] = array[i];
        }
        return result;
    }

    // reverse the double array returns a new array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j] = array[i];
        }
        return result;
    }

    // reverse the char array returns a new array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j] = array[i];
        }
        return result;
    }

    // reverse the String array returns a new array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        // we can declare j outside the loop. j=0;
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            // array[i]=  array [i] represents the index number of arrays, we get each element from array
            // this new array needs to be started from new array's index 0,
            //j is the index number of new integer array
            result[j] = array[i];
        }
        return result;
    }




    // replaces/ changes the element in the given array returns new array
    public static int [] replace (int [] array, int index, int newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }

    // replaces/ changes the doubles  in the given array returns new array
    public static double [] replace (double [] array, int index, double newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }

    // replaces/ changes the chars in the given array returns new array
    public static char [] replace (char [] array, int index, char newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }

    // replaces/ changes the chars in the given array returns new array
    public static String [] replace (String [] array, int index, String newElement){
        if (index<0 || index>array.length-1){
            System.err.println("ınvalid index :" + index);
            System.exit(0);}
        array[index]= newElement;
        return array;
    }





    // replaces all the matching old value (int) in the array to the new value
    public static int [] replaceAll (int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldValue){
                array[i]= newValue;
            }
        } return array;
    }

    // replaces all the matching old value (double) in the array to the new value
    public static double [] replaceAll (double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldValue){
                array[i]= newValue;
            }
        } return array;
    }

    // replaces all the matching old value (char) in the array to the new value
    public static char [] replaceAll (char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]== oldValue){
                array[i]= newValue;
            }
        } return array;
    }

    // replaces all the matching old value (String) in the array to the new value
    public static String [] replaceAll (String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i]= newValue;
            }
        } return array;
    }




    // removes the duplicated integers from the given array and returns new array
    public static int [] removeDuplicates (int [] array) {
        int [] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicated decimals from the given array and returns new array
    public static double [] removeDuplicates (double [] array) {
        double [] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicated chars from the given array and returns new array
    public static char [] removeDuplicates (char [] array) {
        char [] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    // removes the duplicated Strings from the given array and returns new array
    public static String [] removeDuplicates (String [] array) {
        String [] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)) {
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
