# CreditorWatchTestRepo

Automation Technical Assessment Test for EMPATA

### Prerequisites

What things you need to run the test

```
1. Eclipse
2. TestNG plugin for Eclipse
3. Maven
4. Chrome
```

## Getting Started

download test repository

```
git clone https://github.com/mpbadrina/CreditorWatchTestRepo.git
```

# Running the tests

Explain how to run the automated tests for this system

```
1. Open Eclipse
2. File > Import > Maven > Existing Maven Projects
3. Browse Root Directory of test repository (CreditorWatchTestRepo)
4. Wait for project to load then Right Click testng.xml > Run As > TestNG Suite
```

### Break down into end to end tests

Explain what these tests test and why

```
1. Intiantiate webdriver based on env.properties browser setting
2. Navigate to env.properties baseurl which is https://creditorwatch.com.au/
3. Click on Blog
4. Select “Risk Management” from Categories Dropdown
5. Open Using the PPSR to Protect Your Business in the COVID-19 Aftermath
6. Get the anchor tag text from the article and assign it to JsonArray
7. Get the expected JsonArray parsed from expected.json file
8. Compare and validate that actual JsonArray from expected JsonArray based on the anchor tags text of the article
9. Check the test execution logs in target/logs/method-logs/test-execution.log
```

## Authors

* **Mark Badrina**
