package baitap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = getArr();


        System.out.println("Mảng số là : ");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm là: ");
        int num = Integer.parseInt(scanner.nextLine());



        boolean check = searchNumber(arr, num, row, col);

        if (check) {
            System.out.println("Số " + num + "tại vị trí:");
            for (int i = 0; i < col.size(); i++) {
                System.out.println("Dòng " + row.get(i) + ", Cột " + col.get(i));
            }
        } else {
            System.out.println(" không được tìm thấy số :" + num);
        }
    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static boolean searchNumber(int[][] arr, int number, List<Integer> row, List<Integer> col) {
        boolean check= false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    row.add(i);
                    col.add(j);
                    check = true;
                }
            }
        }
        return check;
    }


}
