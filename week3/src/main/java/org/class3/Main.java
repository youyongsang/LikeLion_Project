package org.class3;

import org.class3.Role.Alumni;
import org.class3.Role.Lion;
import org.class3.Role.Staff;
import org.class3.Role.Role;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name1, name2, name3, major1, major2, major3, part1,
                part2, part3, studentId, position, curjob;
        int generation1, generation2, generation3;
        Scanner sc = new Scanner(System.in);

        System.out.println("=======아기사자 정보입력========");
        System.out.print("이름: ");
        name1 = sc.next();
        System.out.print("전공: ");
        major1 = sc.next();
        System.out.print("기수: ");
        generation1 = sc.nextInt();
        System.out.print("파트: ");
        part1 = sc.next();
        System.out.print("학번: ");
        studentId = sc.next();

        System.out.println("=======운영진 정보입력========");
        System.out.print("이름: ");
        name2 = sc.next();
        System.out.print("전공: ");
        major2 = sc.next();
        System.out.print("기수: ");
        generation2 = sc.nextInt();
        System.out.print("파트: ");
        part2 = sc.next();
        System.out.print("직책: ");
        position = sc.next();

        System.out.println("=======수료생 정보입력========");
        System.out.print("이름: ");
        name3 = sc.next();
        System.out.print("전공: ");
        major3 = sc.next();
        System.out.print("기수: ");
        generation3 = sc.nextInt();
        System.out.print("파트: ");
        part3 = sc.next();
        System.out.print("현재 직무: ");
        curjob = sc.next();

        Role lion = new Lion(name1, major1, generation1, part1, studentId);
        Role staff = new Staff(name2, major2, generation2, part2, position);
        Role alumni = new Alumni(name3, major3, generation3, part3, curjob);

        System.out.println("=======결과 출력=======");
        lion.print();
        staff.print();
        alumni.print();

        System.out.println("=======조건 정책 결과=======");
        lion.printCheck();
        staff.printCheck();
        alumni.printCheck();
    }
}