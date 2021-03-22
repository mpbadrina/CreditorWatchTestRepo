package com.selenium.app.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.selenium.app.CreditorWatchApp;

public class BlogPage extends AbstractPage {
    private static final Logger log = LogManager.getLogger("BlogPage");

    public BlogPage(CreditorWatchApp app) {
    	this.app = app;
    	waitUntilPageRefreshed();
    }

    public CategoryPage selectCategory(String category) {
    	log.info("Select Category '{}' from dropdown", category);
    	
    	Select selectCategory = new Select(getDriver().findElement(By.id("cat")));
    	selectCategory.selectByVisibleText(category);
		
    	return new CategoryPage(app);
    }

	@Override
	public boolean isPageOpen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void waitUntilLoaded() {
		// TODO Auto-generated method stub
	}

}
