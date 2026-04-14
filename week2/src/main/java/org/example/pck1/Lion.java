package org.example.pck1;

import java.util.Scanner;

public class Lion {
    public String name;
    String studentName;
    private String major;

    public  Lion(String name, String studentName, String major){
        boolean flagN = false, flagS = false, flagM = false;
        String [] list = {"이름", "전공", "기수"};
        StringBuilder sb = new StringBuilder();
        System.out.println("객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");
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
        if(flagN || flagS || flagM){
            System.out.println(sb.toString()+"은(는) 비어있을 수 없습니다.");
            return;
        }
        this.name = name;
        this.studentName = studentName;
        this.major = major;
        System.out.println("아기 사자 객체가 자신의 상태를 정상으로 판단했습니다.");
        System.out.println("아기사자 정보를 출력합니다.");
        print();
    }

    public void  print(){
        System.out.printf("이름 : %s | 전공 : %s | 기수 : %s", name, studentName, major);
    }
    
}

