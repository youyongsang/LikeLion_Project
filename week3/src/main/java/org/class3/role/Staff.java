package org.class3.role;
import org.class3.policy.P_Staff;
import org.class3.policy.policy;

public class Staff extends Role {
    private String position;

    public Staff(String name, String major, String generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }
    public policy getpolicy(){
        return new P_Staff(); // staff 구현체 반환
    }

    public boolean check(){
        return getpolicy().method();
    }

    public void print(){
        System.out.println("역할: 운영진");
        printinfo();
        System.out.println("직책: " + position);
        System.out.println("과제 제출 가능 여부: " + checkmessage());
        System.out.println("-----------------------");
    };


}
