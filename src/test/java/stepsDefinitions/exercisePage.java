package stepsDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.exersiceMap;

public class exercisePage {
	WebDriver driver = setupClass.driver;
	exersiceMap exc;
	
	@Given("The user should be able to be at home page")
	public void the_user_is_in_the_home_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		exc = new exersiceMap(driver);
		driver.get("http://automationpractice.com/index.php");
	}

	@When("User should be able to click on sign in button")
	public void user_click_on_sign_on_button() {
		exc.signInButton.click();
	}

	@When("User should be able to send an email")
	public void user_send_an_email_as(String email) {
		exc.emailInput.sendKeys(email);

	}

	@When("User should be able to send a password")
	public void user_send_password_as(String password) {
		exc.passwordInput.sendKeys(password);
	}

	@When("User should be able to click on Sign in button")
	public void user_click_on_sign_in_button() {
		exc.submitLoginButton.click();
	}

	@When("User should be able to go to the home page")
	public void user_go_to_the_home_page() {
		exc.homeButton.click();
	}

	@When("User should be able to click on the Faded Short Sleeve T-shirts item")
	public void user_click_on_the_faded_short_sleeve_t_shirts_item() {
		exc.fadedShortSleeveTShirts.click();
	}

	@When("User should be able to add the cart the Faded Short Sleeve T-shirts item")
	public void user_add_to_the_cart_the_faded_short_sleeve_t_shirts_item() {
		exc.addToCartButton.click();
	}

	@When("User should be able to click on Proceed to checkout button")
	public void user_click_on_proceed_to_checkout_button() {
		exc.proceedToCheckout.click();
	}

	@When("User should be able to click on the second Proceed to checkout button")
	public void user_click_on_the_second_proceed_to_checkout_button() {
		exc.proceedToCheckout2.click();
	}

	@When("User should be able to add a comment on the box")
	public void user_add_a_comment_on_the_box() {
		exc.writeAMessage.sendKeys("hi :)");
	}

	@When("User should be able to click on the third Procees to checkout button")
	public void user_click_on_the_third_procees_to_checkout_button() {
		exc.proceedToCheckout3.click();
	}

	@When("User should be able to accept the Terms of service")
	public void user_accept_the_terms_of_service() {
		exc.termsOfService.click();
	}

	@When("User should be able to click on the fourth Procees to checkout button")
	public void user_click_on_the_fourth_procees_to_checkout_button() {
		exc.proceedToCheckout4.click();
	}

	@When("User should be able to choose to pay by bank wire")
	public void user_choose_to_pay_by_bank_wire() {
		exc.payByBankWire.click();
	}

	@When("User should be able to confirm the order")
	public void user_confirm_the_order() {
		exc.confirmOrder.click();
	}

	@Then("User should be able to see the order confirmation")
	public void user_should_see_the_order_confirmation() {
	
	}
	
}

