package org.class3.Role;
import org.class3.policy.policy;

public abstract class Role {
    private String name;
    private String major;
    private String generation;
    private String part;
    public Role(String name, String major, String generation, String part) { //공통 정보로 생성하는 기본 생성자
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }
    public abstract policy getpolicy(); // 객체의 구현체를 호출하는 메서드

    boolean check(){
        return getpolicy().method(); // 해당 구현체에 있는 과제 제출 가능 여부 boolean 메서드 호출
    }

    public abstract void print(); // 객체 정보를 출력하는 메서드

    public void printinfo(){
        System.out.printf("이름: %s | 전공: %s | 기수: %s | 파트: %s\n", name, major, generation, part); // lion과 staff의 공통 내용을 출력하는 메서드
    }

    public String checkmessage(){ // 과제 제출 가능 여부에 따른 가능 불가능 출력 메서드
        return check() ? "가능" : "불가능";
    }
}
