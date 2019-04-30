package com.mevericks.automation.web.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;


/**
 * Created by Binoy on 4/28/2019.
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StepDefinitions {

    String webDriverLocation = ".\\drivers\\chromedriver.exe";

    public static WebDriver driver;


    @Given("^user navigate to \"([^\"]*)\" login page$")
    public void iNavigateTo(String arg0) throws Throwable {
        System.setProperty("webdriver.chrome.driver", webDriverLocation);
        ChromeOptions options=new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        //1-Allow, 2-Block, 0-default
        options.setExperimentalOption("prefs",prefs);
        driver = new ChromeDriver(options);
        String webPage = "https://www.reddit.com/login/";
        driver.manage().window().maximize();
        driver.get(webPage);
       // driver.quit();

    }

    @And("^user login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userTryToLoginWithAnd(String arg0, String arg1) throws Throwable {
        driver.findElement(By.id("loginUsername")).sendKeys("mavdabbler");
        driver.findElement(By.id("loginPassword")).sendKeys("mavdabblerismavdabbler");
        driver.findElement(By.xpath("//div[@class='Container']/div[@class='PageColumns']//form[@action='/login']//button[@class='AnimatedForm__submitButton']")).submit();


    }

    @And("^user logged into the reddit home page$")
    public void userLoggedIntoThredditHomePage() throws Throwable {

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains("reddit: the front page of the internet"));
          // accept it- In your case it allows notification
        System.out.println("testcase passed");

    }

    @And("^user able to view his subscribed subreddits$")
    public void userAbleToViewHisSubscribesSubreddits() throws Throwable {
        WebElement dropdown = driver.findElement(By.cssSelector("[role='navigation']"));
        dropdown.click();
        if(driver.findElements(By.xpath("//div[@id='SHORTCUT_FOCUSABLE_DIV']//header//div[@role='menu']/div[3]")).size() != 0){
            System.out.println("Subreddits are Present");
        }else{
            System.out.println("Subreddits are Absent");
        }



    }

    @And("^user able to view one of his subscribed subreddits$")
    public void userAbleToViewOneOfHisSubscribedSubreddits() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("r/MavericksDnD")).click();
        WebDriverWait wait = new WebDriverWait(driver, 200);

    }

    @And("^user creates a comment on a post$")
    public void userCreatesACommentOnAPost() throws Throwable {

        WebElement element = driver.findElement(By.id("header-search-bar"));
        element.sendKeys("Mavericks QA Assignment - 2019");
        element.submit();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html//div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div/div[2]")));
        driver.findElement(By.xpath("html//div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div[1]")));
        DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy HH:mm a");
        Date date = new Date();
        String date1= dateFormat.format(date);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/div")));
        driver.findElement(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div[1]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/div")).sendKeys(date1 + " John Doe");
        driver.findElement(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div[1]/div/div[2]/div[2]/div/div/div[3]/div")).click();
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @And("^user upvote a post$")
    public void userUpvoteHisPost() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div/div/div[4]/div/div/div/div/div/div/div[2]/div[1]/button[1]")));
        driver.findElement(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div/div/div[4]/div/div/div/div/div/div/div[2]/div[1]/button[1]")).click();


       // throw new PendingException();
    }

    @And("^user downvote a post$")
    public void userDownvoteAPost() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div/div/div[4]/div/div/div/div/div/div/div[2]/div[1]/button[1]")));
        driver.findElement(By.xpath("//*[@id='overlayScrollContainer']/div[1]/div/div/div[4]/div/div/div/div/div/div/div[2]/div[1]/button[1]")).click();
       // throw new PendingException();
    }

    @And("^user logged out from the reddit site$")
    public void userLoggedOutFromTheRedditSite() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"USER_DROPDOWN_ID\"]")));
        driver.findElement(By.xpath("//*[@id=\"USER_DROPDOWN_ID\"]")).click();
        driver.findElement(By.xpath("//a[7]")).click();
        driver.quit();

        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

}