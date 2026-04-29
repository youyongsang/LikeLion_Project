package org.class3.Role;
import org.class3.policy.P_Lion;
import org.class3.policy.policy;

public class Lion extends Role {
    private String studentId;

    public Lion(String name, String major, String generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }
    public policy getpolicy(){
        return new P_Lion(); // lion 구현체 반환
    }

    public boolean check(){
        return getpolicy().method();
    }

    public void print(){
        System.out.println("역할: 아기사자");
        printinfo();
        System.out.println("학번: " + studentId);
        System.out.println("과제 제출 가능 여부: " + checkmessage());
        System.out.println("-----------------------");
    }
}
