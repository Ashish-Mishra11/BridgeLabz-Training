package com.day01.browserbuddy;
class BrowserTab {

    HistoryNode current;

    BrowserTab(String homePage) {
        current = new HistoryNode(homePage);
    }

    void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
        System.out.println("Visited " + url);
    }

    void back() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    void forward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    String getCurrentPage() {
        return current.url;
    }
}
