package com.annotations.deprecatedusage;
public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature");
    }

    public void newFeature() {
        System.out.println("This is the new feature");
    }
}
