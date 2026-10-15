package Excercise2;

import java.util.Scanner;

public class Lab2Excercise4 {
    public static void bai01() {
        System.out.println("Lua cho tinh nang 1");

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

    public static void bai02() {
        System.out.println("Lua chon tinh nang 2");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong a = ");
        int a = scanner.nextInt();

        System.out.print("Nhap vao so nguyen duong b = ");
        int b = scanner.nextInt();

        System.out.print("Nhap vao so nguyen duong c = ");
        int c = scanner.nextInt();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                double x = (double) -c / b;
                System.out.println("Phuong trinh co 1 nghiem x = " + x);
            }
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

    public static void bai03() {
        System.out.println("Lua chon tinh tang 3");
        Scanner scanner = new Scanner(System.in);

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LUA CHON TINH NANG");
        System.out.println("1: Giai phuong trinh bac nhat");
        System.out.println("2: Giai phuong trinh bac hai");
        System.out.println("3: Tinh so tien dien");
        System.out.println("4: Ket thuc");

        System.out.print("Chon tinh nang ban muon: ");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                bai01();
                break;
            case 2:
                bai02();
                break;
            case 3:
                bai03();
                break;
            default:
                System.out.println("Ban da chon thoat chuong trinh");
                System.exit(0);
        }
        scanner.close();
    }
}
