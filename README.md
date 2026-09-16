# Selenium TestNG Framework (Java + Maven)

TestNG-driven UI automation built while training in **Manual + Automation Testing (Selenium with Java)**.
It covers a SuiteCRM regression suite, end-to-end e-commerce flows, dynamic date-picker automation
and TestNG feature practice (DataProvider, parameters, groups, parallel runs).

> **Author:** Sunny Kumar - QA Tester (Manual + Automation)
> [LinkedIn](https://www.linkedin.com/in/sunny-kumar-9ba6002a2) · [Manual testing documentation](https://github.com/SunnyKumar2904/manual-testing-documentation) · [POM framework](https://github.com/SunnyKumar2904/selenium-pom-framework)

---

## Tech Stack

| Component | Technology |
|---|---|
| Language | Java |
| Automation tool | Selenium WebDriver 4 |
| Test framework | TestNG |
| Build tool | Maven |
| IDE | Eclipse |
| Browsers | Microsoft Edge, Google Chrome |
| Reporting | TestNG HTML reports, Extent Reports |

---

## What Is Covered

### 1. SuiteCRM regression suite - `src/test/java/Crm_TestNg/`

13 TestNG tests across 7 record-creation modules on [demo.suiteondemand.com](https://demo.suiteondemand.com).

| Class | Module | Tests |
|---|---|---|
| `Create_Account.java` | Login + Accounts | 2 |
| `Create_lead.java` | Leads (25+ form fields) | 4 |
| `Create_Contacts.java` | Contacts | 3 |
| `Create_Opportunity.java` | Opportunities | 1 |
| `Create_Tasks.java` | Tasks | 1 |
| `Create_Call.java` | Calls | 1 |
| `Create_Document.java` | Documents | 1 |

`BaseTest.java` holds the driver lifecycle: `@BeforeTest` launches EdgeDriver, applies a 10-second
implicit wait and opens the application; `@AfterTest` quits the browser. Every test class extends it,
so one browser session is shared across the suite. `@Test(priority = n)` makes login run first.

The earlier standalone versions of these CRM scripts are in `src/test/java/com/crm_apps/login/`.

### 2. Sauce Demo - `com/crm_apps/login/SwagLabs.java`

End-to-end purchase journey on [saucedemo.com](https://www.saucedemo.com): login, adding all six
products from their detail pages, cart, checkout information and order completion.

### 3. Tricentis Demo Web Shop - `demowebshop/loginDemoShop.java`

Registration with a unique email per run (`java.util.Random`), product search, add to cart, shipping
estimate with `Select` dropdowns, and the billing, shipping, payment and confirm-order steps through
to the PDF invoice on [demowebshop.tricentis.com](https://demowebshop.tricentis.com).

### 4. Dynamic date-picker automation - `DatePicker/`

Scripts that select a target date on MakeMyTrip, Goibibo, Yatra, Ixigo, EaseMyTrip, ClearTrip and the
jQuery UI datepicker. Each reads the calendar heading, clicks **Next Month** until the month/year
matches, then clicks the matching day from `findElements()`. The jQuery UI widget is handled with
`switchTo().frame()`.

### 5. TestNG practice - `Testng_DataProvider/`, `Practice_Testngxml/`, `Practice_Testngxml2/`

- `@DataProvider` with 1D and 2D arrays (positive and negative login data)
- `invocationCount` and parallel execution from `testng.xml`
- `@Parameters` with `@Optional`, `groups` (positive / negative), package-level suites

---

## How to Run

**Prerequisites:** JDK (set `maven.compiler.release` in `pom.xml` to your JDK version), Maven, Microsoft Edge / Chrome.

```bash
git clone https://github.com/SunnyKumar2904/selenium-testng-framework.git
cd selenium-testng-framework
mvn clean test
```

Run the CRM suite from Eclipse: right-click `Crm_TestNg` -> **Run As -> TestNG Test**.
Date-picker scripts have a `main()` method: right-click -> **Run As -> Java Application**.

---

## Related Work

- **[selenium-pom-framework](https://github.com/SunnyKumar2904/selenium-pom-framework)** - Page Object Model framework with config-driven browsers, Extent Reports and screenshot on failure
- **[manual-testing-documentation](https://github.com/SunnyKumar2904/manual-testing-documentation)** - test scenarios, test cases, bug report, RTM and test summary report for Sauce Demo
- **[selenium-automation-project](https://github.com/SunnyKumar2904/selenium-automation-project)** - the original WebDriver scripts

*Portfolio project. All scripts run against publicly available demo applications intended for automation practice.*
