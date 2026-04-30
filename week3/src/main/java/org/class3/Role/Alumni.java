package org.class3.Role;

import org.class3.policy.P_Alumni;
import org.class3.policy.policy;

public class Alumni extends Role{
    private String Curjob;

    public Alumni(String name, String major, int generation, String part, String Curjob) {
        super(name, major, generation, part);
        this.Curjob = Curjob;
    }
    public policy getpolicy(){
        return new P_Alumni(); // lion 구현체 반환
    }

    public void print(){
        System.out.println("역할: 알럼나이");
        printinfo();
        System.out.println("현재 직무: " + Curjob);
        System.out.println("과제 제출 가능 여부: " + checkmessage());
        System.out.println("-----------------------");
    }

    public void printCheck(){
        System.out.printf("%s (%d기)\n", getName(), getGeneration());
        System.out.println("기수 조건 충족 여부 : " + checkmessage2());
        System.out.println("-----------------------");
    }
}
