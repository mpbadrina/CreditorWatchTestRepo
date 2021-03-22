package com.common.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestFixture {
    private static final Logger log = LogManager.getLogger("TestFixture");

    private static final String ENV_PROPERTIES = "/env.properties";
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseurl";

    private Properties properties = new Properties();

    public TestFixture() {
        initialize();
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
    
    public String getBaseUrl() {
        return get(BASE_URL);
    }
    
    public String getBrowser() {
        return get(BROWSER);
    }
    
    private void initialize() {
    	properties.putAll(loadPropertiesFile(ENV_PROPERTIES));
    }
    
    private Properties loadPropertiesFile(String filename) {

        log.info("Loading properties file '{}'.", filename);

        InputStream is = TestFixture.class.getResourceAsStream(filename);

        Properties propertiesFile = new Properties();

        try {
            propertiesFile.load(is);
        } catch (IOException e) {
            log.error("Unable to load environment properties", e);
        }

        return propertiesFile;
    }

}
