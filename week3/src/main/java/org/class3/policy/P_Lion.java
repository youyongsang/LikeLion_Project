package org.class3.policy;

public class P_Lion implements policy{
    public boolean SubCheck(int generation){
        return generation > 13;
    }
}
