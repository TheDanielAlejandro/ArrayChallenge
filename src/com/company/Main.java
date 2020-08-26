package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = getIntegers();
        printArray(array);
        printArray(halal(array));
    }


    public static int[] getIntegers() {                                                                                 // . Creating method getIntegers.
        Scanner scanner = new Scanner(System.in);                                                                       // . The method ask the user for the length of the array.
        System.out.println("Choose length array: \r");
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {                                                                        // . A for statement to get through the whole array and fill it with the value from the user.
            System.out.println("Insert value: \r");
            array[i] = scanner.nextInt();
        }
        return array;                                                                                                   // . Returning the array.
    }


    public static void printArray(int[] array) {                                                                        // . Method that prints a string for each value of the array.
        for (int i = 0; i < array.length; i++) {
            System.out.println("The value in the position: " + i + " in the array, is: " + array[i]);
        }
    }

    public static int[] halal(int[] array) {                                                                            // . Method that inverts the array passed as a parameter.
        int[] secondArray = new int[array.length];                                                                      // . Creating another array to store the values obtained.
        int storage = 0;                                                                                                // . Creating 2 variables 1 to store the temporary value, the second to be a index for the second array.
        int countdown = 1;


        for (int i = 0; i < array.length; i++) {                                                                        // . Creating a for statement to go through the whole array in input.
            if(i==0){                                                                                                   // . Checking if is the first cycle.
                storage = array[i];                                                                                     // . If it is, save the value of the array in the storage variable.
                secondArray[(secondArray.length - countdown)] = storage;                                                // . In the final array in the position - countdown , storing the value from the storage variable.
            }else{                                                                                                      // . If is not the first cycle.
                if (storage < array[i]) {                                                                               // . Checking if the value in the storage variable is lesser than the value in the next position of the array.
                    storage = array[i];                                                                                 // . If it is taking the value from the array and setting it in the storage variable.
                    countdown++;                                                                                        // . Adding 1 to the countdown variable, this variable is used to move backwards in the final array.
                    secondArray[(secondArray.length - countdown)] = storage;                                            // . In the final array in the position - countdown, storing the value fromm the storage variable.
                } else {                                                                                                // . If the storage variable is higher than the value of the array in the position i.
                    secondArray[(secondArray.length - countdown)] = array[i];                                           // . In the final array in the position - countdown, storing the value from the array in position i.
                    secondArray[(secondArray.length - countdown - 1)] = storage;                                        // . In the final array in position - countdown -1 (the previous position), storing the value from the storage variable.
                    countdown++;                                                                                        // . Adding 1 to the countdown variable.
                }
            }
        }
        return secondArray;                                                                                             // . Returning the final array.
        }
}