package com.browserbuddy;
import java.util.Stack;

class BrowserBuddy {

      private Stack<TabHistory> closedTabs = new Stack<>();
      private TabHistory currentTab = new TabHistory();

      public TabHistory getCurrentTab() {
            return currentTab;
      }

      // Close tab
      public void closeTab() {

            closedTabs.push(currentTab);
            currentTab = new TabHistory();
            System.out.println("Tab closed.");
      }

      // Reopen last closed tab
      public void reopenTab() {

            if (!closedTabs.isEmpty()) {
                  currentTab = closedTabs.pop();
                  System.out.println("Tab reopened.");
            } else {
                  System.out.println("No tabs to reopen!");
            }
      }
}
