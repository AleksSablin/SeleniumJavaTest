

<a href="https://selenium.dev"><img src="https://avatars.mds.yandex.net/i?id=bc343f52743c44359e2483527748411041d7285a-8534972-images-thumbs&n=13" width="170" alt="Selenium"/></a>
<a href="https://logodix.com"><img src="https://logodix.com/logo/1798548.png" width="300" alt="intellij-idea"/></a>
<a href="https://avatars.dzeninfra.ru"><img src="https://logocharts.com/wp-content/uploads/2021/12/Java-Logo-1600x1600.png" width="200" alt="Java"/></a>

<b>
 <h2>What is Selenium?</h2>
</b>
<p>Due to the diverse focus
of the software, and confusion in terminology, many people mistake Selenium for a specific product for a single service. Selenium is a free (open source) automated testing environment
that is used to test web applications in
different browsers and on different platforms. We can use different programming languages, such as Java, to create Selenium test scripts, 
C#, Python, Ruby, PHP, etc
. Selenium Software is not just a tool, but a software package (a set of tools),
each part of which meets different needs in the organization of testing. Here is a list of tools that are included in Selenium Software</p>
<ol>
  <li>Selenium WebDriver</li>
  <li>Selenium RC</li>
  <li>Selenium Grid</li>
</ol>

<h2>Why do We need to use Selenium?</h2>
<p>Selenium is now the standard for automating the execution of tests in browsers. Selenium is open source, no licensing costs are required, which is a great advantage
compared to other testing tools</p>
Advantages of using Selenium:
<ul>
  <li>Test scripts can be written in any of these programming languages: Java, Python, 
C #, PHP, Ruby, Perl</li>
  <li>Tests can be performed on any of these operating systems: Windows, Mac, or Linux.</li>
  <li>Tests can be performed in any browser: Mozilla 
Firefox, Internet Explorer, Google Chrome, Microsoft 
Edge, Safari or Opera.</li>
  <li>Selenium can be integrated with tools such as TestNG and JUnit to manage test
cases and generate reports</li>
  <li>Selenium can be integrated with Maven, Jenkins and Docker to ensure continuous testing</li>
</ul>


## Pre-requisites
##### Installation and Launch
<ol>
 
 <li>Step I : Install IntelliJ IDEA</li>
  <ul><li>https://www.jetbrains.com/idea/download/?ysclid=lu9zuetvnf195589274&section=windows</li></ul>
 <li>Step II : Connect Selenium to the IntelliJ project</li>
 <ul><li>Log in to www.selenium.dev/downloads/</li></ul>
<br>
<h2>1)Find Java among the available languages and click on Download</h2>
<img src="https://testsetup.ru/selenium/java/img/intellij_selenium_02.webp"/>
<br>
<h2>2)Unpack the archive. The content will be something like this</h2>
<img src="https://testsetup.ru/selenium/java/img/intellij_selenium_03.webp"/>
<br>
<h2>3)Open your project in IntelliJ and click File → Project Structure
Select Modules, then click on the plus sign on the right and select 1. JARs or directories…</h2>
<img src="https://testsetup.ru/selenium/java/img/intellij_selenium_09.webp"/>
<br>
<h2>4)Go to the folder where you just unpacked the archive and select everything.jar files from the root and from the libs subfolder
Click OK</h2>
<img src="https://testsetup.ru/selenium/java/img/intellij_selenium_10.webp"/>
<br>
<h2>You have successfully imported the packages to your PC!!!</h2>
The next step to make sure that Selenium is connected successfully is to paste the following code and compile it.
<br>

#### Code Snippets

```java


        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        public class Main {
        public static void main(String[] args) {

                WebDriver driver = new FirefoxDriver();

           }
        }
```
<h2>If you do not want or cannot edit the PATH variable, try registering the path to the driver - before the WebDriver driver line = ... insert</h2>
<br>

```java
System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
```

<h2>First of all, you need to connect By in Java, this is done as follows:</h2>
<br>

```java
  import org.openqa.selenium.By;
```

<H2>It is often not enough just to find an element. To perform some actions on the found, connect the WebElement</H2>
<br>

```java
import org.openqa.selenium.WebElement;
```
<h2>Example of searching for items</h2>

A small example of searching for items.
<p>
Examine the page www.urn.su/ui/basic_test/
</p>
Test objectives:
<ul>
  <li>Fill out the "Website" form and click on the "Go to" button</li>
  <li>Click on the first link with the text "Renovation"</li>
  <li>Click on the second element with the text "Italy"</li>
 <li>Click on the second image</li>
</ul>

<h2 align="center">  Filling in a simple form </h2>
Let's use the most reliable method - by id. After examining the source code of the page, you will see the following code

```xml
<input type="text" id="name1" name="url1">
```
Therefore, the required id is "name1"

```java
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverDemo1 {

    public class main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // 1. По id

        driver.get("http://www.urn.su/ui/basic_test/");

        WebElement searchField =
        driver.findElement(By.id("name1"));

        searchField.sendKeys("topbicycle.ru");
        searchField.submit();
  }
}
```
<h2 align="center">  Click on the link - search by text </h2>

Using linkText, we will find all the links with the text Renovation, select the first one and click on it.

```java
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverDemo1 {

    public class main(String[] args) {

        WebDriver driver = new ChromeDriver();         
        // 2. По linkText

        driver.get("http://www.urn.su/ui/basic_test/");

        WebElement renovationLink =
        driver.findElements(By.linkText("Renovation")).get(0);
        renovationLink.click();
  }
}
```

<h2 align="center"> Click on the link - search by CSS selector</h2>

All links in this example also have the same text - Italy. But we can't use the same technique, so let's study the page code and find out that the desired link has a march8 class

We will look for a link, that is, cssSelector a, with the march8 class

```java
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverDemo1 {

    public class main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // 3. По cssSelector

        driver.get("http://www.urn.su/ui/basic_test/");

        WebElement march8Link =
        driver.findElements(By.cssSelector("a[class=march8]")).get(0);
        march8Link.click();
  }
}

```

<h2 align="center"> Click on the image</h2>
Now let's look at the picture. Let's use the tag search.

```java
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverDemo1 {

    public class main(String[] args) {

        WebDriver driver = new ChromeDriver();                             
        // 4. По tagName

        driver.get("http://www.urn.su/ui/basic_test/");

        WebElement imageLink =
        driver.findElements(By.tagName("img")).get(1);
        imageLink.click();
    }
}
```

<h2 align="center"> Wait for the element to appear</h2>
The elements can be loaded onto the page at different speeds. To save yourself from unnecessary headaches, you need to make the most of Selenium's capabilities

In the following example, you can visit the site search page urn.su wait for the Yandex script to load, insert the word java into the search, just to be safe, wait for the Find button to load and click on it.

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class WebDriverExplicitWait {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 50);

        driver.get("http://www.urn.su/search.php");

        try {
            WebElement yandexField =
            wait.until(presenceOfElementLocated(By.name("text")));
            yandexField.sendKeys("java");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            WebElement yButton =
            wait.until(presenceOfElementLocated(By.className("ya-site-form__submit")));
            yButton.click();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
```


   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Choose the Spring Boot Application file (search for file with @SpringBootApplication)
- Right Click on the file and Run as Java Application
- You are all Set

## Overview

### Introduction

Writing your first automation test is a lot of fun.

Java is one of the most popular programming languages. Java offers both object oriented and functional programming features. Selenium can be used for screen scraping and automating repeated tasks on browser.

We take an hands-on approach using Eclipse as an IDE to illustrate more than 200 Java Coding Exercises, Puzzles and Code Examples. We will also write more than 100 Selenium automation tests with Java for a wide variety of scenarios.

In more than 350 Steps, we explore the most important Java Programming Features and Selenium Automation Testing Scenarios
- Basics of Java Programming - Expressions, Variables and Printing Output
- Using Selenium IDE and Katalon Studio to Record and Replay Automation Testing Scenarios
- Exporting Automation Tests and Setting up new Maven Project for JUnit and TestNG 
- TestNG vs JUnit
- TestNG Advanced Features - XML Suite, Test Reports, Running Tests with Parameters defined in XML and Running Tests in Parallel
- Basics of HTML, CSS and XPath
- Selenium Locators - By Id, By Name, By Link Text, By Partial Link Text, By Class, CSS Selectors and XPath Expressions
- Setting and Reading values from Form Elements - Text, TextArea, CheckBox , Radio Button, Select Box and Multi Select Box
- Advanced Selenium Automation Testing Scenarios - Playing with Windows, Modal Windows (Sleep, Implicit Wait and Explicit Waits), Alert Boxes, Window Handles and New Browser Window Launches, Frames, Taking Screenshots, Executing JavaScript Code, Actions Interface to control mouse and keyboard
- Set up Automation Testing Frameworks - Tables
- Important Interfaces - WebDriver
- Introduction to Cross Browser Automation Testing, Headless Testing and Setting up a Basic Cross Browser Automation Testing Framework
- Writing Data Driven Testing with Data Providers, CSV and Excel Spreadsheets
- Implementing Page Object Model for a Complex Test Scenario
- Scaling up with Selenium Standalone and Grid
- Java Operators - Java Assignment Operator, Relational and Logical Operators, Short Circuit Operators
- Java Conditionals and If Statement
- Methods - Parameters, Arguments and Return Values
- An Overview Of Java Platform - java, javac, bytecode, JVM and Platform Independence - JDK vs JRE vs JVM
- Object Oriented Programming - Class, Object, State and Behavior
- Basics of OOPS - Encapsulation, Abstraction, Inheritance and Polymorphism
- Basics about Java Data Types - Casting, Operators and More
- Java Built in Classes - BigDecimal, String, Java Wrapper Classes
- Conditionals with Java - If Else Statement, Nested If Else, Java Switch Statement, Java Ternary Operator
- Loops - For Loop, While Loop in Java, Do While Loop, Break and Continue
- Java Array and ArrayList - Java String Arrays, Arrays of Objects, Primitive Data Types, toString and Exceptions
- Java Collections - List Interface(ArrayList, LinkedList and Vector), Set Interface (HashSet, LinkedHashSet and TreeSet), Queue Interface (PriorityQueue) and Map Interface (HashMap, HashTable, LinkedHashMap and TreeMap() - Compare, Contrast and Choose
- Generics - Why do we need Generics? Restrictions with extends and Generic Methods, WildCards - Upper Bound and Lower Bound.
- Introduction to Exception Handling - Your Thought Process during Exception Handling. try, catch and finally. Exception Hierarchy - Checked Exceptions vs Unchecked Exceptions. Throwing an Exception. Creating and Throwing a Custom Exception - CurrenciesDoNotMatchException. Try with Resources - New Feature in Java 7.

You will be using Eclipse and Brackets as the IDE. You will be using Maven, npm (Dependency Management), TestNG (XML Test Suite, Parallel, Multiple Browsers), JUnit, Selenium IDE, Katalon Studio, Selenium Standalone and Selenium Grid. We will help you set up each one of these.

- Tools : Maven, JUnit, TestNG (XML Test Suite, Groups, Listeners, Parallel, Multiple Browsers), Selenium IDE, Katalon Studio, Brackets
- Concepts : HTML, DOM, XPath, Selenium Architecture, Reporting (HTML), Parallel Execution (Data Driven Tests, Browsers, Test Ng, Grid), Debugging (Screenshots/logs), Page Object Model, Data Driven(Excel), Keyword Driven, Record and Replay, Selenium Grid, Cross Browser Testing, DRY
- Basics : Selenium Web Driver, Locating Web Elements(link text, name, id, xpath, css), Different Elements(select, radio, web tables, drag and drop, javascript alerts, windows, popups, iframes, switching windows), Wait (Explicit/Implicit), JavaScript Executor Action Class, Mouse movement, Keyboard with Selenium)
- Tips : Selenium Web Driver is an Interface, Headless Testing(PhantomJS, Chrome)
