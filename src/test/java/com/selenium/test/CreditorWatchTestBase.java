package com.selenium.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.common.utilities.TestFixture;
import com.selenium.app.CreditorWatchApp;

/**
 * Test for Creditor Watch Web Application.
 */
public class CreditorWatchTestBase
{
    private static final Logger log = LogManager.getLogger("CreditorWatchTestBase");
    
    protected static CreditorWatchApp app = new CreditorWatchApp();
    protected static TestFixture testFixture = new TestFixture();

    @BeforeSuite(alwaysRun = true)
    public void initialize() {
        app.initializeWebDriver(testFixture);
        
        log.info("Start of Test Execution");
    }

    @AfterSuite(alwaysRun = true)
    public void shutdown() {
        app.shutdown();
        
        log.info("End of Test Execution");
    }

}
