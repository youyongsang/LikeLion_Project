package org.class3;

import org.class3.role.Lion;
import org.class3.role.Staff;
import org.class3.role.Role;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name1, name2, major1, major2, generation1, generation2, part1, part2, studentId, position;
        Scanner sc = new Scanner(System.in);

        System.out.println("=======아기사자 정보입력========");
        System.out.print("이름: ");
        name1 = sc.next();
        System.out.print("전공: ");
        major1 = sc.next();
        System.out.print("기수: ");
        generation1 = sc.next();
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
        generation2 = sc.next();
        System.out.print("파트: ");
        part2 = sc.next();
        System.out.print("직책: ");
        position = sc.next();

        Role lion = new Lion(name1, major1, generation1, part1, studentId);
        Role staff = new Staff(name2, major2, generation2, part2, position);

        System.out.println("=======결과 출력=======");
        lion.print();
        staff.print();
    }
}