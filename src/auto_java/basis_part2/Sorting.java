package auto_java.basis_part2;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        bubleSort();
        findNumber();
    }

    public static void bubleSort() {

        int tmp;
        int[] arr = {2, 48, 3, 15, 21, 1, 3, 72, 4, 42};
        System.out.println("Array before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 2; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Array after sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findNumber() {

        int[] arr = {1, 2, 3, 3, 4, 15, 21, 42, 48, 72};

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number to find: ");
        int el = reader.nextInt();
        reader.close();

        boolean not_found = true;
        int right_pos, left_pos, mid_pos, pos = 11;
        left_pos = 0;
        right_pos = arr.length - 1;

        while (not_found) {
            if (left_pos > right_pos) {
                break;
            }
            mid_pos = left_pos + (right_pos - left_pos) / 2;
            if (arr[mid_pos] < el) {
                left_pos = mid_pos + 1;
            }
            if (arr[mid_pos] > el) {
                right_pos = mid_pos - 1;
            }
            if (arr[mid_pos] == el) {
                pos = mid_pos;
                not_found = false;
            }
        }
        if (not_found) {
            System.out.println("Element " + el + " not found");
        } else {
            System.out.println("Element " + el + " found on position " + pos);
        }
    }
}