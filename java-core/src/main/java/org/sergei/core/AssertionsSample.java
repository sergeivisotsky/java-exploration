package org.sergei.core;

/**
 * @author Sergei Visotsky
 */
public class AssertionsSample {

    public static void main(String[] args) {
        int a = 55;
        assert a > 5 : "yes";
        
        String printHello = getReturnString(null);
        System.out.println(printHello);
    }
    
    public static String getReturnString(String param) {
        param = new String();
        assert param != null;
        return param;
    }
    
}
