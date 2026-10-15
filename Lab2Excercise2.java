package Excercise2;

import java.util.Scanner;

public class Lab2Excercise2 {
    public static void giaiPhuongTrinhBacNhat(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            double x = (double) -b / a;
            System.out.println("Phuong trinh co 1 nghiem x = " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH NGHIEM CUA PHUONG TRINH BAC HAI");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong a = ");
        int a = scanner.nextInt();

        System.out.print("Nhap vao so nguyen duong b = ");
        int b = scanner.nextInt();

        System.out.print("Nhap vao so nguyen duong c = ");
        int c = scanner.nextInt();

        if (a == 0) {
            giaiPhuongTrinhBacNhat(b, c);
        } else {
            double delta = (double) b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet x1 = %.3f, x2 = %.3f" + x1, x2);
            }
        }
        scanner.close();
    }
}
