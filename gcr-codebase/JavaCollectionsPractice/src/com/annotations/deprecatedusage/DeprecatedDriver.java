package com.annotations.deprecatedusage;
public class DeprecatedDriver {

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();
        api.newFeature();
    }
}
