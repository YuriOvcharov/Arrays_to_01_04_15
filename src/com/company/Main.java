package com.company;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] arrayGeneration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длинну массива");
        int lenght = scanner.nextInt();
        System.out.println("max");
        int max = scanner.nextInt();
        System.out.println("min");
        int min = scanner.nextInt();
        Random r = new Random();
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = r.nextInt(max + Math.abs(min)) + min;

        }
        return array;
    }

    public static void arrayOut(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" "+array1[i]);
        }
        System.out.println("");
    }

    public static int[] task1(int[] array,int numb) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < numb) {
                newArray[i] = numb;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
    public static int[] task2(int[] array,int a,int b) {
        int[] newArray =new  int[array.length];
        for (int i = 0; i <array.length; i++) {
            if (i >= a && i <= b) {


            newArray[i] = 0;}
            else {
                newArray[i]=array[i];
            }
        }
        return newArray;
    }

    public static int[] task3(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[0] = array[array.length - 1];
        newArray[newArray.length - 1] = array[0];
        return newArray;
    }

    public static String task4(int[] array) {

        int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double summ=sum;
        double avg=summ/array.length;
        return "summ="+sum+" avg="+avg;
    }

    public static double task5(int[] array) {

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i];
        }
        return Math.sqrt(sum);
    }

    public static int task6(int[] array1,int[] array2) {
        int sum=0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i] * array2[i];
        }
        return sum;

    }
    public  static  double task8(int[] array1,int[] array2) {
        double sum=0;
        for (int i = 0; i < array1.length; i++) {
            sum +=( array1[i] -array2[i])*( array1[i] -array2[i]);
        }
        return Math.sqrt(sum);

    }
    public static int[] task7 (int[] array){
        int min, temp;
        int[] newArray =array;
        for (int index = 0; index < newArray.length-1; index++){
            min = index;
            for (int scan = index+1; scan < newArray.length; scan++)
                if (newArray[scan] < newArray[min])
                    min = scan;
            temp = newArray[min];
            newArray[min] = newArray[index];
            newArray[index] = temp;
        }
        return newArray;
    }

    public static String task9(int[] array) {
        int min=0,max=0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                max = array[i];
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return "min= "+min+" Max="+max;
    }
    public static void main(String[] args) {
        int[] array=arrayGeneration();
        System.out.println("ishoniy massiv: ");
        arrayOut(array);

        System.out.println("1)");
        arrayOut(task1(array, 3));

        System.out.println("2)");
        arrayOut(task2(array, 5, 8));
        System.out.println("3)");
        arrayOut(task3(array));
        System.out.println("4)");
        System.out.println(task4(array));
        System.out.println("5)");
        System.out.println(task5(array));
        int[] array2=arrayGeneration();
        System.out.println("ishoniy massivi: ");
        arrayOut(array);
        arrayOut(array2);
        System.out.println("6)");
        System.out.println(task6(array, array2));
        System.out.println("7)");
        arrayOut(task7(array));
        System.out.println("8)");
        System.out.println(task8(array, array2));
        System.out.println("9)");
        System.out.println(task9(array));

    }
}
