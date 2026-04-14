package org.example.pck1;

import java.util.Scanner;

public class step1 {
    public static void main(String[] args) {
        boolean flagN = false, flagS = false, flagM = false;
        String [] list = {"이름", "전공", "기수"};
        StringBuilder sb = new StringBuilder();
        String name, studentName, major;
        Scanner sc = new Scanner(System.in);
        System.out.println("아기사자 이름을 입력해주세요.");
        name = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        studentName = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        major = sc.nextLine();

        if(name.isEmpty()){
            flagN = true;
            sb.append(list[0]).append(", ");
        }
        if(studentName.isEmpty()){
            flagS = true;
            sb.append(list[1]).append(", ");
        }
        if(major.isEmpty()){
            flagM = true;
            sb.append(list[2]);
        }
        System.out.println("입력값 검증을 수행합니다.");

        if(flagN || flagS || flagM){
            System.out.println(sb.toString()+"은(는) 비어있을 수 없습니다.");
            return;
        }
        System.out.println("입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
        Lion lion = new Lion(name, studentName, major);
        System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");
        System.out.println("아기사자 정보를 출력합니다.");
        lion.print();
    }
}
