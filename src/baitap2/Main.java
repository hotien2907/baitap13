package baitap2;

public class Main {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int searchMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = getArr();


        System.out.print("Mảng la: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        int min = searchMin(arr);

        System.out.println("Số nhỏ nhất trong mảng là: " + min);
    }
}
