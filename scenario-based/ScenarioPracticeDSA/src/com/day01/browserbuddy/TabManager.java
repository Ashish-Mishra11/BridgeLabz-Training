package com.day01.browserbuddy;
import java.util.Stack;

class TabManager {

    Stack<BrowserTab> closedTabs;

    TabManager() {
        closedTabs = new Stack<>();
    }

    void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
        System.out.println("Tab closed");
    }

    BrowserTab reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No tabs to restore");
            return null;
        }
        System.out.println("Tab restored");
        return closedTabs.pop();
    }
}
