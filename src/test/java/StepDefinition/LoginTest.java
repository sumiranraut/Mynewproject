package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
public static WebDriver driver;

@Given("^user open TestMe App$")
public void useropenTestmeApp()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@When("^user click signup$")
public void userclicksignup()
{
	driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
}
@And("^enter user name as \"([^\"]*)\"$")
public void enterusername(String uname)
{
	driver.findElement(By.id("userName")).sendKeys(uname);
}
@And("^enter first name as \"([^\"]*)\"$")
public void enterfirstname(String fname)
{
	driver.findElement(By.id("firstName")).sendKeys(fname);
}
@And("^enter last name as \"([^\"]*)\"$")
public void enterlastname(String lname)
{
	driver.findElement(By.id("lastName")).sendKeys(lname);;
}
@And("^enter password as \"([^\"]*)\"$")
public void enterpassword(String Password)
{
	driver.findElement(By.id("password")).sendKeys(Password);
}
@And("^enter confirm password as \"([^\"]*)\"$")
public void enterconfpassword(String Cpassword)
{
	driver.findElement(By.name("confirmPassword")).sendKeys(Cpassword);
}
@And("^select Gender as \"([^\"]*)\"$")
public void selectgender(String gender)
{
	if(gender.equalsIgnoreCase("male")) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	else if (gender.equalsIgnoreCase("female"))
	{
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	
}
@And("^enter email as \"([^\"]*)\"$")
public void email(String email)
{
	driver.findElement(By.id("emailAddress")).sendKeys(email);;
}
@And("^enter mobile number as \"([^\"]*)\"$")
public void mobile(String Number)
{
	driver.findElement(By.id("mobileNumber")).sendKeys(Number);
}
@And("^enter dob as \"([^\"]*)\"$")
public void dob(String dob)
{
	driver.findElement(By.id("dob")).sendKeys(dob);
}
@And("^enter Address as \"([^\"]*)\"$")
public void Address(String Address)
{
	driver.findElement(By.id("address")).sendKeys(Address);
}
@And("^enter answer as \"([^\"]*)\"$")
public void Answer(String Answer)
{
	driver.findElement(By.id("answer")).sendKeys(Answer);
}
@Then("^user click Register$")
public void userclickregister()
{
	driver.findElement(By.name("Submit")).click();
}
@When("^user click signin$")
public void userclicksignin()
{
	driver.findElement(By.xpath("//a[@href='login.htm']")).click();
}
@And("^user enter credentials as$")
public void entercredentials(DataTable dt)
{
	List<String> cred = dt.asList(String.class);
	driver.findElement(By.name("userName")).sendKeys(cred.get(0));
	driver.findElement(By.name("password")).sendKeys(cred.get(1));
	driver.findElement(By.name("Login")).click();
}
@And("^Alex enter in search box$")
public void enterinsearchbox()
{
	driver.findElement(By.id("myInput")).sendKeys("Head");
}
@And("^user click on Find Details$")
public void findetails()
{
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}
@Then("^user click on Add to cart$")
public void addcart()
{
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
}
}

