package org.class4.package1;

import org.class4.Role.Lion;
import org.class4.Role.Role;
import org.class4.Role.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Role> list = new ArrayList<>();
        String name, major, part, position, studentId;
        Role role;
        int generation;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=======멤버 관리 시스템======");
            System.out.println("1. 멤버 등록");
            System.out.println("2. 전체 멤버 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int check1 = sc.nextInt();
            switch (check1) {
                case (1):
                    System.out.println("----멤버 등록----");
                    System.out.print("역할 선택 (1: 아기사자, 2: 운영진)");
                    int check2 = sc.nextInt();
                    switch (check2) {
                        case (1):
                            System.out.print("이름: ");
                            name = sc.next();
                            if (isDuplicate(list, name)) {
                                System.out.println("이미 존재하는 이름입니다.");
                                return;
                            }
                            System.out.print("전공: ");
                            major = sc.next();
                            System.out.print("기수: ");
                            generation = sc.nextInt();
                            System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
                            part = sc.next();
                            System.out.print("학번: ");
                            studentId = sc.next();
                            role = new Lion(name, major, generation, part, studentId);
                            list.add(role);
                            break;
                        case (2):
                            System.out.print("이름: ");
                            name = sc.next();
                            if (isDuplicate(list, name)) {
                                System.out.println("이미 존재하는 이름입니다.");
                                return;
                            }
                            System.out.print("전공: ");
                            major = sc.next();
                            System.out.print("기수: ");
                            generation = sc.nextInt();
                            System.out.print("직책 (대표/부대표/파트장/멘토): ");
                            position = sc.next();
                            System.out.print("학번: ");
                            studentId = sc.next();
                            role = new Staff(name, major, generation, position, studentId);
                            list.add(role);
                            break;
                    }
                    break;
                case (2):
                    System.out.println("---전체 멤버 목록---");
                    for (int i = 0; i < list.size(); i++) {
                        Role r = list.get(i);
                        if (r instanceof Lion) {
                            System.out.println((i + 1) + ". [아기사자] "
                                    + r.getName() + " - "
                                    + r.getGeneration() + "기");
                        }
                        else if (r instanceof Staff) {
                            System.out.println((i + 1) + ". [운영진] "
                                    + r.getName() + " - "
                                    + r.getGeneration() + "기");
                        }
                    }
                    System.out.println("총 " + list.size() + "명");
                    break;
                case (3):
                    String findName;
                    boolean check = false;
                    System.out.println("---이름으로 검색---");
                    System.out.print("검색할 이름: ");
                    findName = sc.next();
                    for (int i = 0; i < list.size(); i++) {
                        Role r = list.get(i);
                        if (Objects.equals(r.getName(), findName)){
                            System.out.println("[검색 결과]");
                            r.print();
                            check = true;
                            break;
                        }
                    }
                    if (!check){
                        System.out.println("해당 이름이 존재하지 않습니다.");
                    }
                    break;
                case (4):
                    return;
                default:
                    System.out.println("맞는 선택지를 입력하셔야합니다.");
            }
        }
        while (true);
    }
    public static boolean isDuplicate(ArrayList<Role> list, String name){
        for (Role r : list) {
            if ((r.getName().equals(name))){
                return true;
            }
        }
        return false;
    }
}

