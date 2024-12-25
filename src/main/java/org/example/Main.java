package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //chekSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(taskFive(19, 2));
        //taskSix(7);
        //System.out.println(taskSeven(7));
        //taskEight("test\n", 5);
        //System.out.println(taskNine(2024));
        //invertArray();
        //System.out.println(Arrays.toString(fillArray()));
        //System.out.println(Arrays.toString(
        //        twelveArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));;
        //thirteenArr(6);
        //printArrayInConsole(retLenArr(5, 7));


    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void chekSumSign() {
        int a = 1;
        int b = 2;
        if(a+b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 0;
        if(value <= 0)
            System.out.println("Красный");
        else if(value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 8;
        int b = 6;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    static boolean taskFive(int a, int b) {
        return(10 <= a + b) && (a + b <= 20);
    }

    static void taskSix(int a) {
        if(a >=0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    static boolean taskSeven(int a){
        if(a < 0)
            return true;
        else return false;
    }

    static void taskEight(String str, int a){
        System.out.println(str.repeat(a));
    }

    static boolean taskNine(int year){
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            return true;
        else return false;
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i+1;

        return arr;
    }

    static int[] twelveArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;

    }

    static void thirteenArr(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            table[i][i] = 1;
            table[i][size - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(table));
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(table[i]));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len];
        // Заполнение массива значениями initialValue
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }

    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

}