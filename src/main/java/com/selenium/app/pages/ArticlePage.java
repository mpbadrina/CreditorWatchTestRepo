package com.selenium.app.pages;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.gson.JsonArray;
import com.selenium.app.CreditorWatchApp;

public class ArticlePage extends AbstractPage {
    private static final Logger log = LogManager.getLogger("CategoryPage");
    
    public ArticlePage(CreditorWatchApp app) {
    	this.app = app;
    	waitUntilPageRefreshed();
    }
    
    public JsonArray getAnchorTagsText(){
    	
    	log.info("Get Anchor Tags Text from article");
    	
    	WebElement webElement = getDriver().findElement(By.className("entry-content"));
    	List<WebElement> tags = webElement.findElements(By.tagName("a"));
    	
    	JsonArray jsonTags = new JsonArray();
        
    	for(WebElement tag : tags) {
    		if(!tag.getText().isEmpty()) {
        		jsonTags.add(tag.getText());
    		}
    	}
    	
    	return jsonTags;
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
