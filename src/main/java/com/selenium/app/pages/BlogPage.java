package com.selenium.app.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.selenium.app.CreditorWatchApp;

public class BlogPage extends AbstractPage {
	private static final Logger log = LogManager.getLogger("BlogPage");

	public BlogPage(CreditorWatchApp app) {
		this.app = app;
	}

	public CategoryPage selectCategory(String category) {
		log.info("Select Category '{}' from dropdown", category);

		selectFromDropdown("cat", category);

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
