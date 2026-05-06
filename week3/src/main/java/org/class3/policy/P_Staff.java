package org.class3.policy;

public class P_Staff implements policy{
    public boolean SubCheck(int generation){
        return generation > 13;
    }
}
