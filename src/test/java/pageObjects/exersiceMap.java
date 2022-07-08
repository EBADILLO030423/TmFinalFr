package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exersiceMap {
	WebDriver driver;

	public exersiceMap(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailInput;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement passwordInput;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	public WebElement submitLoginButton;

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signInButton;

	@FindBy(xpath = "//a[@class='home']")
	public WebElement homeButton;

	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_product=1&controller=product']")
	public WebElement fadedShortSleeveTShirts;

	@FindBy(xpath = "//p[@id='add_to_cart']")
	public WebElement addToCartButton;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	public WebElement proceedToCheckout;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium' and @title='Proceed to checkout']")
	public WebElement proceedToCheckout2;

	@FindBy(xpath = "//textarea[@name='message']")
	public WebElement writeAMessage;

	@FindBy(xpath = "//button[@name='processAddress']")
	public WebElement proceedToCheckout3;

	@FindBy(xpath = "//input[@id='cgv']")
	public WebElement termsOfService;

	@FindBy(xpath = "//button[@name='processCarrier']")
	public WebElement proceedToCheckout4;

	@FindBy(xpath = "//a[@class='bankwire']")
	public WebElement payByBankWire;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium' and @type='submit']")
	public WebElement confirmOrder;
	
}
