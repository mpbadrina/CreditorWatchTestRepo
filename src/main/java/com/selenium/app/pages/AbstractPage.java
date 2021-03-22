package com.selenium.app.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.app.CreditorWatchApp;

public abstract class AbstractPage {
	private static final Logger log = LogManager.getLogger("AbstractPage");

	protected CreditorWatchApp app;

	protected WebDriver getDriver() {
		return app.getDriver();
	}

	protected void clickLinkText(String text) {
		WebElement webElement = getDriver().findElement(By.linkText(text));
		webElement.click();
	}

	protected void selectFromDropdown(String id, String text) {
		Select selectCategory = new Select(getDriver().findElement(By.id(id)));
		selectCategory.selectByVisibleText(text);
	}

	abstract public boolean isPageOpen();

	abstract public void waitUntilLoaded();

}
