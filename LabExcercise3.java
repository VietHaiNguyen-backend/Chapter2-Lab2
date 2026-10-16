package Excercise2;

import java.util.Scanner;

public class LabExcercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tin dien");

        System.out.print("Nhap sao so dien: ");
        int dien = scanner.nextInt();
        if (dien <= 100) {
            int tien = dien * 1000;
            System.out.println("So tien dien = " + tien);
        } else {
            int tien = 100 * 1000 + (dien - 100) * 1500;
            System.out.println("So tien dien = " + tien);
        }
        scanner.close();
    }
}
