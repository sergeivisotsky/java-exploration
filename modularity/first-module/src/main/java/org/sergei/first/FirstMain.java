package org.sergei.first;

import org.sergei.second.sub.Additional;
import org.sergei.second.sub.IAdditional;
import org.sergei.third.sub.Advanced;
import org.sergei.third.sub.IAdvanced;

public class FirstMain {

    public static void main(String[] args) {
        System.out.println("Let's explore Java modules!");
        IAdditional additional = new Additional();
        String hello = additional.print("Hello");
        System.out.println(hello);

        IAdvanced advanced = new Advanced();
        String advancedHello = advanced.printInAdvancedMode("Hello");
        System.out.println(advancedHello);
    }

}
