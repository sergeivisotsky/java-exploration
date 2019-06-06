package org.sergei.core.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesSample {

    private static final String BUNDLE_NAME = "greeting";
    private static final String PROPERTY = "question";
    private static final String EN_LANG = "en";
    private static final String LV_LANG = "lv";
    private static final String RU_LANG = "ru";
    private static final String US = "US";
    private static final String LV = "LV";
    private static final String RU = "RU";

    private static void getBundleByLocale(String lang, String country,
                                          String bundleName, String property) {
        Locale.setDefault(new Locale(lang, country));
        ResourceBundle bundle = ResourceBundle.getBundle(bundleName);
        System.out.println("Current locale: " + Locale.getDefault());
        System.out.println("Greeting on " + lang + " language: " + bundle.getString(property));
    }

    public static void main(String[] args) {

        // English version
        getBundleByLocale(EN_LANG, US, BUNDLE_NAME, PROPERTY);

        // Latvian version
        getBundleByLocale(LV_LANG, LV, BUNDLE_NAME, PROPERTY);

        // Russian version
        getBundleByLocale(RU_LANG, RU, BUNDLE_NAME, PROPERTY);
    }

}
