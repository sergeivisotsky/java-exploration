package org.sergei.core.localization;

import java.util.Locale;

public class LocaleSample {

    public static void main(String[] args) {

        Locale lv = new Locale("lv", "LATVIA");
        System.out.println("Latvia locale: " + lv);

        String lvLang = lv.getDisplayLanguage();
        System.out.println("Latvian language: " + lvLang);

    }

}
