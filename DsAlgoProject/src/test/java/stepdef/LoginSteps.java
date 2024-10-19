package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//loginSteps class
public class LoginSteps {

	WebDriver driver = new ChromeDriver();
	
	@Given("I go to the login page")
	public void i_go_to_the_login_page() {
	    driver.get("https://dsportalapp.herokuapp.com/login");
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
	   WebElement username = driver.findElement(By.name("username"));
	   username.sendKeys("goldaanto@gmail.com");
	   WebElement password = driver.findElement(By.name("password"));
	   password.sendKeys("golda@123");
	   Thread.sleep(2000);
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
	    WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]"));
	    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	    login.click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    boolean flag = driver.findElement(By.linkText("NumpyNinja")).isDisplayed();
	    System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"+flag);
	    if(flag)
	    {
	    	Thread.sleep(2000);
	    	driver.close();
	    	driver.quit();
	    }
	}
	@Given("I go to the Registration page")
	public void i_go_to_the_registration_page() throws InterruptedException {
	   driver.get("https://dsportalapp.herokuapp.com/register");
	   Thread.sleep(2000);
	}

	@When("user enters the username, password and confirm password")
	public void user_enters_the_username_password_and_confirm_password() throws InterruptedException {
	   WebElement username1 = driver.findElement(By.name("username"));
	   username1.sendKeys("goldaanto@yahoo.co.in");
	   WebElement password1 = driver.findElement(By.name("password1"));
	   password1.sendKeys("Golda@123");
	   WebElement password2 = driver.findElement(By.name("password2"));
	   password2.sendKeys("Golda@123");
	   		Thread.sleep(2000);
	}
	

	@When("Clicks on Submit button")
	public void clicks_on_submit_button() {
	    WebElement submitele = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
	    submitele.submit();
	}



	}
