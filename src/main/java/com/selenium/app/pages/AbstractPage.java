package com.selenium.app.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.selenium.app.CreditorWatchApp;

public abstract class AbstractPage {
    private static final Logger log = LogManager.getLogger("AbstractPage");
    
    protected CreditorWatchApp app;
    
    public WebDriver getDriver() {
    	return app.getDriver();
    }

    /**
     * Returns only when the page is fully refreshed
     */
    public void waitUntilPageRefreshed() {
    }

    abstract public boolean isPageOpen();

    abstract public void waitUntilLoaded();
    
}
