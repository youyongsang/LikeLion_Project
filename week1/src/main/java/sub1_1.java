import java.util.Arrays;
import java.util.Scanner;

public class sub1_1 {
    public static void main(String[] args) {
        final int LIONMAX = 5;
        String[] memberList;
        String member;
        int imember = 0;
        String end;
        String name;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.printf("\uD83E\uDD81 저장할 아기사자 수를 %d 이상 입력해주세요: ", LIONMAX);
                member = sc.next();
                if (!member.matches("\\d+")) {
                    System.out.println("! 오류 숫자만 입력해주세요.");
                    System.out.println("\uD83D\uDEA8 [오류] 5이상 입력해주세요.");
                    continue;
                }
                else
                    imember = Integer.parseInt(member);
                if (imember < 5) {
                    System.out.println("\uD83D\uDEA8 [오류] 5이상 입력해주세요.");
                } else
                    break;
            } while (true);
            sc.nextLine(); // 개행 문자 제거용5
            memberList = new String[imember];
            System.out.println("\uD83D\uDD8C\uFE0F 아기사자 이름을 입력해주세요.");
            for (int i = 0; i < imember; i++) {
                do {
                    name = sc.nextLine();
                    if(name.isEmpty()){
                        System.out.println("빈 문자열을 입력하시면 안됩니다.");
                        continue;
                    }
                    for (String s : memberList) {
                        if (name.equals(s)) {
                            flag = true;
                            break;
                        }
                        else {
                            flag = false;
                        }
                    }
                    if(flag){
                        System.out.println("중복된 이름은 사용하실 수 없습니다.");
                    }
                    else {
                        break;
                    }
                }
                while(true);
                memberList[i] = name;
            }
            System.out.println("\uD83D\uDCCB 아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i < imember; i++) {
                System.out.printf("\uD83E\uDD81 %d. %s\n", i + 1, memberList[i]);
            }
            System.out.println("===============");
            do {
                System.out.println("프로그램을 종료하려면 'exit'를 입력하세요.");
                System.out.println("계속 아기사자를 등록하려면 'restart'를 입력하세요.");
                end = sc.next();
                if (end.equals("exit")) {
                    System.out.println("아기사자 명단 관리 프로그램을 종료합니다.");
                    return;

                }
                else if( end.equals("restart"))
                break;
                else{
                    System.out.println("exit 혹은 restart를 입력하세요.");
                }
            } while(true);
        }while(true);
    }
}
