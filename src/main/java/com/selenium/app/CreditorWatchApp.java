package com.selenium.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.common.utilities.TestFixture;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class CreditorWatchApp {
	private static final Logger log = LogManager.getLogger("CreditorWatchApp");

	protected WebDriver driver;
	protected TestFixture testFixture;

	public CreditorWatchApp() {
	}

	public void shutdown() {

		if (isInitialized()) {

			log.info("Quitting driver from page '{}'", getPageTitle());

			try {
				driver.quit();
			} catch (WebDriverException webDriverException) {
				log.error("Unable to call driver.quit(), likely browser or driver crash.", webDriverException);
			} finally {
				driver = null;
			}
		}
	}

	public boolean isInitialized() {
		return driver != null;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void loadBaseUrl() {
		log.info("Load Base Url {}", testFixture.getBaseUrl());

		driver.get(testFixture.getBaseUrl());
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void initializeWebDriver(TestFixture testFixture) {
		this.testFixture = testFixture;

		ChromeDriverManager.chromedriver().setup();

		String downloadedChromeVersion = ChromeDriverManager.chromedriver().getDownloadedDriverVersion();
		log.info("Initializing Chrome Driver with version '{}'", downloadedChromeVersion);

		driver = new ChromeDriver();
	}

}
