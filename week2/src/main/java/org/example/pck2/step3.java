package org.example.pck2;
import org.example.pck1.Lion;

public class step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("김멋대", "컴퓨터공학과", "14");

        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("name 필드 값을 변경합니다.");
        lion.name = "홍길동";
        System.out.println("public 필드 접근 성공");
        System.out.println("아기사자 정보를 출력합니다.");
        lion.print();

//        System.out.println("Step 3-2. default 필드 접근을 시도합니다.");
//        System.out.println("studentname 필드 값을 변경합니다.");
//        lion.studentname = "지능미디어학과";
//        System.out.println("default 필드 접근 성공");
//        System.out.println("아기사자 정보를 출력합니다.");
//        lion.print()

//        System.out.println("Step 3-3. private 필드 접근을 시도합니다.");
//        System.out.println("major 필드 값을 변경합니다.");
//        lion.major = "15";
//        System.out.println("private 필드 접근 성공");
//        System.out.println("아기사자 정보를 출력합니다.");
//        lion.print();
    }
}
