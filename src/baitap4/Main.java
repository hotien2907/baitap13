package baitap4;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int[] arrNum = {56,3, 49, 58,22,11};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần tìm là: ");
        int number = Integer.parseInt(scanner.nextLine());

        int index = search(arrNum, number);

        if (index != -1) {
            System.out.println( number +" tại vị trí: " + index);
        } else {
            System.out.println("ko tìm thấy số"  + number);
        }

        int max = max(arrNum);
        System.out.println("Max trong mảng là: " + max);
    }
    private static int search(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}
