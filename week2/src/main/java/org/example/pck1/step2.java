package org.example.pck1;

import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        String name, studentName, major;
        Scanner sc = new Scanner(System.in);
        System.out.println("아기사자 이름을 입력해주세요.");
        name = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        studentName = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        major = sc.nextLine();
        Lion lion = new Lion(name, studentName, major);
    }
}
