package com.selenium.app.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.selenium.app.CreditorWatchApp;

public class CategoryPage extends AbstractPage {
	private static final Logger log = LogManager.getLogger("CategoryPage");

	public CategoryPage(CreditorWatchApp app) {
		this.app = app;
	}

	public ArticlePage openArticle(String article) {
		log.info("Open Article '{}'", article);

		clickLinkText(article);

		return new ArticlePage(app);
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
