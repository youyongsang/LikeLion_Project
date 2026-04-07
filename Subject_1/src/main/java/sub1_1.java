import java.util.Scanner;

public class sub1_1 {
    public static void main(String[] args) {
        final int LIONMAX = 5;
        String[] memberList;
        int member;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.printf("\uD83E\uDD81 저장할 아기사자 수를 %d 이상 입력해주세요: ", LIONMAX);
            member = sc.nextInt();
            if(member < 5){
                System.out.println("\uD83D\uDEA8 [오류] 5이상 입력해주세요.");
            }
            else
                break;
        }while(true);
        memberList = new String[member];
        System.out.println("\uD83D\uDD8C\uFE0F 아기사자 이름을 입력해주세요.");
        for(int i = 0; i < member; i++){
            memberList[i] = sc.next();
        }
        System.out.println("\uD83D\uDCCB 아기사자 명단을 최종적으로 출력합니다.");
        for(int i = 0; i < member; i++){
            System.out.printf("\uD83E\uDD81 %d. %s\n", i+1, memberList[i]);
        }
    }
}
