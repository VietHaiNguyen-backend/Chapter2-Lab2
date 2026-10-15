package Excercise2;

import java.util.Scanner;

public class MultipleCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao tien thue: ");
        int thue = scanner.nextInt();

        if (thue < 10) {
            System.out.println("Khong dong thue");
        } else if (10 <= thue && thue <= 15) {
            System.out.println("Thue 10%");
        } else if (15 <= thue && thue <= 30) {
            System.out.println("Thue 20%");
        } else {
            System.out.println("Thue 50%");
        }
        scanner.close();
    }
}
