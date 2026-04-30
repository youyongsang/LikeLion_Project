package org.class3.policy;

import com.sun.jdi.IntegerValue;

public class P_Staff implements policy{
    public boolean SubCheck(int generation){
        return generation > 13;
    }
}
