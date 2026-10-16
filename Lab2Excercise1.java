package Excercise2;

import java.util.Scanner;

public class Lab2Excercise1 {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH CUA PHUONG TRINH BAC NHAT");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen a = ");
        int a = scanner.nextInt();

        System.out.print("Nhap vao so nguyen b = ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = (double) -b / a;
            System.out.println("Phuong trinh co 1 nghiem x = " + x);
        }
        scanner.close();
    }
}
