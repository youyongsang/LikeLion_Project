package org.class3.Role;

import org.class3.policy.P_Lion;
import org.class3.policy.policy;

public class Alumni extends Role{
    private String Curjob;

    public Alumni(String name, String major, String generation, String part, String Cutjob) {
        super(name, major, generation, part);
        this.Curjob = Curjob;
    }
    public policy getpolicy(){
        return new P_Lion(); // lion 구현체 반환
    }

    public boolean check(){
        return getpolicy().method();
    }

    public void print(){
        System.out.println("역할: 알럼나이");
        printinfo();
        System.out.println("현재 직무: " + Curjob);
        System.out.println("과제 제출 가능 여부: " + checkmessage());
        System.out.println("-----------------------");
    }
}
