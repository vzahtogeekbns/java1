package lesson2.homework;

import java.util.Arrays;

public class HomeWork {
    // TODO: 17.01.2020
    public static void main(String[] args) {
        System.out.println("hello");

        int[] oneArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        changeNulltoOne(oneArray);

        int[] twoTask = {0, 3, 6, 9, 12, 15, 18, 21};
        printNewArray(twoTask);

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        replaceArrayValues(array3);

        printTable();
    }

    static void changeNulltoOne(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 1) data[i] = 0;
        }

        System.out.println("1 task result: " + Arrays.toString(data));
    }

    static void printNewArray(int[] data) {
        int[] newArr = new int[8];
        for (int i=0; i < newArr.length; i++) {
            newArr[i] = data[i];
        }

        System.out.println("2 task result: " + Arrays.toString(newArr));
    }

    static void replaceArrayValues(int[] data) {
        int[] newArr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 6) {
                newArr[i] = data[i] * 2;
            } else {
                newArr[i] = data[i];
            }
        }

        System.out.println("3 task result: " + Arrays.toString(newArr));
    }

    static void printTable() {
        int[][] arrTable = new int[12][12];
        System.out.println("4 task result:");
        for (int i=0; i < arrTable.length; i++) {
            for (int j=0; j < arrTable[i].length; j++) {
                if (j == i) {
                    arrTable[i][j] = 1;
                } else {
                    arrTable[i][j] = 0;
                }

                System.out.print(arrTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}

