package com.selenium.test;

import org.testng.annotations.Test;

import com.common.utilities.JsonReader;
import com.google.gson.JsonArray;
import com.selenium.app.pages.ArticlePage;
import com.selenium.app.pages.BlogPage;
import com.selenium.app.pages.CategoryPage;
import com.selenium.app.pages.HomePage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;

/**
 * Test Anchor Tags present in Page
 */
public class AnchorTagTest extends CreditorWatchTestBase {
	private static final Logger log = LogManager.getLogger("AnchorTagTest");

	@Test
	public void validateAnchorTagsInArticle() {
		HomePage homePage = new HomePage(app);
		AssertJUnit.assertEquals("Wrong Home Page Title", "Business Credit Scores and Company Checks | CreditorWatch",
				app.getPageTitle());

		BlogPage blogPage = homePage.goToBlog();
		AssertJUnit.assertEquals("Wrong Blog Page Title", "CreditorWatch Blog - News | Articles | Knowledge",
				app.getPageTitle());

		CategoryPage categoryPage = blogPage.selectCategory("Risk Management");
		AssertJUnit.assertEquals("Wrong Category Page Title", "Risk Management Archives - CreditorWatch Blog",
				app.getPageTitle());

		ArticlePage articlePage = categoryPage
				.openArticle("Using the PPSR to Protect Your Business in the COVID-19 Aftermath");
		AssertJUnit.assertEquals("Wrong Article Page Title",
				"Using the PPSR to Protect Your Business in the COVID-19 Aftermath - CreditorWatch Blog",
				app.getPageTitle());

		JsonArray actualTags = articlePage.getAnchorTagsText();
		JsonArray expectedTags = JsonReader.getJsonArrayFromFile("src/main/resources/expected.json");
		AssertJUnit.assertEquals("Wrong Angchor Tags Text", expectedTags, actualTags);
	}
}
