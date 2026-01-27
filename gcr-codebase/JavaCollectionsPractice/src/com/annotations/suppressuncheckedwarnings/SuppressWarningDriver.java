package com.annotations.suppressuncheckedwarnings;
import java.util.ArrayList;

public class SuppressWarningDriver {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("JavaHello");
        list.add(100);

        String value = (String) list.get(0);
        System.out.println(value);
    }
}
