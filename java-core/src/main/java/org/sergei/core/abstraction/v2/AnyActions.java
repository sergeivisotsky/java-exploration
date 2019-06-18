package org.sergei.core.abstraction.v2;

import java.util.List;

/**
 * @author Sergei Visotsky
 */
public class AnyActions extends AbstractActions implements IAdditionalActions {
    @Override
    public String constructCharSequence(List<String> strList) {
        return null;
    }

    @Override
    public String outputFlyText(String flyTxt) {
        return null;
    }

    @Override
    public void developIdeas(List<String> elements) {

    }

    public void writeThoughtsMain(List<String> elem) {
        String str = writeThoughts(elem);
        System.out.println(str);
    }

    public static void main(String[] args) {
        AnyActions anyActions = new AnyActions();
        List<String> strElem = List.of("hello", "develop", "write", "checkout");
        anyActions.writeThoughtsMain(strElem);
    }
}
