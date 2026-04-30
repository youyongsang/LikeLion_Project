package org.class3.Role;
import org.class3.policy.P_Lion;
import org.class3.policy.policy;

public class Lion extends Role {
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }
    public policy getpolicy(){
        return new P_Lion(); // lion 구현체 반환
    }


    public void print(){
        System.out.println("역할: 아기사자");
        printinfo();
        System.out.println("학번: " + studentId);
        System.out.println("과제 제출 가능 여부: " + checkmessage());
        System.out.println("-----------------------");
    }

    public void printCheck(){
        System.out.printf("%s (%d기)\n", getName(), getGeneration());
        System.out.println("기수 조건 충족 여부 : " + checkmessage2());
        System.out.println("-----------------------");
    }
}
