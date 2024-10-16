package api.cucumber.steps;

import com.fasterxml.jackson.databind.deser.CreatorProperty;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PostSteps {
    WebDriver driver = null;

    @Given("Open the browser")
    public void openTheBrowser() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            System.out.println("Successfully opened chrome Browser");
        } else {
            System.out.println("Failed to open chrome Browser");
        }
    }

    @When("I open Admin Upload Portal")
    public void iOpenAdminUploadPortal() {
        driver.get("http://localhost:4000/");
        //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println(" Successfully open Admin Upload Portal");
    }

    @And("I check the First dropdown option")
    public void iCheckTheFirstDropdownOption() {
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div"));
        // Adjust locator to your dropdown
        // Click the dropdown to open it (if necessary)
        dropdownElement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement dropdownElement1 = driver.findElement(By.xpath("//*[@id=\":r0:\"]/li[1]"));
        dropdownElement1.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("Java");

    }

    @And("I check the Second dropdown option")
    public void iCheckTheSecondDropdownOption() {
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div"));
        // Adjust locator to your dropdown
        // Click the dropdown to open it (if necessary)
        dropdownElement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement dropdownElement1 = driver.findElement(By.xpath("//*[@id=\":r0:\"]/li[2]"));
        dropdownElement1.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("Python");
    }

    @And("I check the Third dropdown option")
    public void iCheckTheThirdDropdownOption() {
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div"));
        // Adjust locator to your dropdown
        // Click the dropdown to open it (if necessary)
        dropdownElement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement dropdownElement1 = driver.findElement(By.xpath("//*[@id=\":r0:\"]/li[3]"));
        dropdownElement1.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("ISTQB");

    }

    @And("click on upload button")
    public void clickOnUploadButton() {
        WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
        uploadButton.click();
        System.out.println("User is able to clicked on upload button");
    }

    @Then("Close the browser")
    public void closeTheBrowser() {
    driver.quit();
    }


}













/*
    @Given("I am logged in as an admin")

    @Given("I navigate to the bulk upload page")
    public void i_navigate_to_the_bulk_upload_page() {
        driver.get("URL_OF_THE_BULK_UPLOAD_PAGE");
    }

    @When("I select the {string} exam from the dropdown")
    public void i_select_the_exam_from_the_dropdown(String exam) {
        driver.findElement(By.id("exam-dropdown")).sendKeys(exam);
    }

    @When("I browse and upload a valid CSV file")
    public void i_browse_and_upload_a_valid_csv_file() {
        driver.findElement(By.id("file-upload")).sendKeys("path/to/valid_file.csv");
    }

    @When("I do not select any file")
    public void i_do_not_select_any_file() {
        // Do nothing as the file is not selected
    }

    @When("I browse and upload an invalid file type")
    public void i_browse_and_upload_an_invalid_file_type() {
        driver.findElement(By.id("file-upload")).sendKeys("path/to/invalid_file.txt");
    }

    @When("I click the {string} button")
    public void i_click_the_button(String buttonName) {
        driver.findElement(By.id(buttonName.toLowerCase() + "-button")).click();
    }

    @Then("I should see {string} message")
    public void i_should_see_message(String message) {
        String actualMessage = driver.findElement(By.id("upload-status")).getText();
        assertEquals(message, actualMessage);
    }

    @When("the file upload fails")
    public void the_file_upload_fails() {
        // Simulate file upload failure (this can be done by mocking the backend response in tests)
    }

*/



