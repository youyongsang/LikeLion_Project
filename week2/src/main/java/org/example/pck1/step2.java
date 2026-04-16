package org.example.pck1;

import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        String name, studentName, major;
        Scanner sc = new Scanner(System.in);
        String check, mod, word;
        System.out.println("아기사자 이름을 입력해주세요.");
        name = sc.nextLine();
        System.out.println("전공을 입력해주세요.");
        studentName = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        major = sc.nextLine();
        Lion lion = new Lion(name, studentName, major);
        do{
            System.out.println("아기사자 정보를 수정하시겠습니까? (네 / 아니오)");
            check = sc.nextLine();
            if(check.equals("네")){
                System.out.println("수정할 정보를 입력해주세요. (이름 / 전공 / 기수)");
                mod = sc.nextLine();
                switch (mod){
                    case("이름"):
                        System.out.println("변경할 " + mod + "을(를) 입력해주세요.");
                        word = sc.nextLine();
                        System.out.println(mod +  " 변경 요청을 받았습니다.");
                        if(lion.check(word, mod))
                            lion.setName(word);
                        lion.print();
                        break;
                    case("전공"):
                        System.out.println("변경할 " + mod + "을(를) 입력해주세요.");
                        word = sc.nextLine();
                        System.out.println(mod +  " 변경 요청을 받았습니다.");
                        if(lion.check(word, mod))
                            lion.setStudentName(word);
                        lion.print();
                        break;
                    case("기수"):
                        System.out.println("변경할 " + mod + "을(를) 입력해주세요.");
                        word = sc.nextLine();
                        System.out.println(mod +  " 변경 요청을 받았습니다.");
                        if(lion.check(word, mod))
                            lion.setMajor(word);
                        lion.print();
                        break;
                    default:
                        System.out.println("옳바른 요청이 아닙니다. 처음부터 다시 진행합니다.");
                }
            }
            else if(check.equals("아니오")) {
                break;
            }
            else System.out.println("옳바른 요청이 아닙니다. 처음부터 다시 진행합니다.");
        }while(true);
        System.out.println("아기사자 정보 수정을 종료합니다.");
    }
}
