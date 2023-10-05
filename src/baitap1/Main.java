package baitap1;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int searchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.print("Mảng la: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        int max = searchMax(arr);

        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
