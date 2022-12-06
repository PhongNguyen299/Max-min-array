import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int size = scanner.nextInt();
        arr = new int [size];

        for (int i = 0; i < arr.length ;i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        System.out.printf("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        findMaxMinArray(arr);
    }

    public static void findMaxMinArray(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            max = (max < arr[i])? arr[i] : max;
            min = (min > arr[i])? arr[i] : min;
        }
        System.out.println("\nMax is: " + max);
        System.out.println("Min is: " + min);
    }
}