package org.sergei.core.regexp;

import java.util.regex.Pattern;

/**
 * Parsing URI filters using regular expressions
 */
public class RegExpSample {

    private static final String URL_SAMPLE = "/data/query?order=paid:bw=130,1200";
    private static final String REG_EXP_BW = "[:bw=,]";

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(REG_EXP_BW);
        String[] splitUrl = pattern.split(URL_SAMPLE);

        for (String strElem : splitUrl) {
            System.out.println(strElem);
        }

    }

}
