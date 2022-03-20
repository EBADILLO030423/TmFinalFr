package stepsDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.exersiceMap;

public class exercisePage {
	WebDriver driver = setupClass.driver;
	exersiceMap exc;

	@Given("The user is in login page")
	public void the_user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/feature/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://practice.automationbro.com/");
		exc = new exersiceMap(driver);
	}

	@When("User should be able to click on shop button")
	public void user_should_be_able_to_click_on_shop_button() {
		exc.shopButton.click();
	}

	@When("The user should be able to find all products containing the keyword in the product title using search bar")
	public void the_user_should_be_able_to_find_all_products_containing_the_keyword_in_the_product_title_using_search_bar() {
		exc.searchButton.click();
		exc.searchBox.sendKeys("Canon");
		exc.searchBox.sendKeys(Keys.ENTER);
	}

	@When("The user should be able to sort by popularity, average rating, latest and price")
	public void the_user_should_be_able_to_sort_by_popularity_average_rating_latest_and_price() {
		exc.shopButton.click();
		exc.dropDownButton.click();
		exc.dropDown1.click();
		exc.dropDown2.click();
		exc.dropDown3.click();
		exc.dropDown4.click();
		exc.dropDown5.click();
		exc.dropDown6.click();
		List<Float> newPrecios = new ArrayList<Float>();
		List<WebElement> precios = driver.findElements(By.className("price"));
		float temp = 0;
		 for (int i=0; i<precios.size();i++){
			 String precio = precios.get(i).getText();
			 System.out.println("text price" +i+": "+ precio);
			 // Ver si tiene 2 precios
			 if (precio.contains("0 $")) {
				 System.out.println("MAMMAAAAA OHHH YYYHHH");

				 precio= precio.split("0 ")[1];
				 
				 System.out.println(precio);
			 } 

			 precio = precio.substring(1);
			 float newPrecio = Float.parseFloat(precio);
			 if (i>0) {
				 System.out.println("AQUI ANDO HACIENDO LA ASSERTIOOONNNN");
				 System.out.println("amos a comarar: "+temp+"con: "+newPrecio);
				 Assert.assertTrue(temp>=newPrecio);
			 }
			 
			 temp = newPrecio;
			 
			 newPrecios.add(newPrecio);

		    }
//		 System.out.println("MAAAMAAA I KILL A MAAAAN");
//		 for (int i=0; i<newPrecios.size();i++){
//			 System.out.println(newPrecios.get(i));
//		 }
//		 
//		 System.out.println("NOW SORTED ALV");
//		 Collections.sort(newPrecios);
//		 for (int i=0; i<newPrecios.size();i++){
//			 System.out.println(newPrecios.get(i));
//		 }
//		 System.out.println("NOW SORTED ALV inverso");
//		 Collections.sort(newPrecios, Collections.reverseOrder());
//		 for (int i=0; i<newPrecios.size();i++){
//			 System.out.println(newPrecios.get(i));
//		 }
		 
		 
		
	}

	@When("User should be able to see only nine items")
	public void user_should_be_able_to_see_only_nine_items() {
		Assert.assertTrue(exc.primary.isEnabled());
		Assert.assertTrue(exc.buttonOne.isDisplayed());
	}

	@When("User should be able to find products by categories")
	public void user_should_be_able_to_find_products_by_categories() {
		exc.categorias.isDisplayed();
		exc.clothesButton.click();
		exc.shoesButton.click();
		exc.uncategorizedButton.click();
		exc.watchButton.click();
		exc.shopButton.click();
	}

	@When("User should be able to see Last item viewed by user should be displayed on “Recently viewed products”")
	public void user_should_be_able_to_see_last_item_viewed_by_user_should_be_displayed_on_recently_viewed_products() {
		exc.viewRecently.isDisplayed();

	}

	@When("User should be able to click on contact button")
	public void user_should_be_able_to_click_on_contact_button() {
		exc.buttonContact.isSelected();
		exc.buttonContact.click();

	}

	@When("User should be able to see address, email, phone and time information of store.")
	public void user_should_be_able_to_see_address_email_phone_and_time_information_of_store() {
		exc.displayedContactInfo.isDisplayed();

	}

	@When("User should be able to see the contact information when the mouse stay over button")
	public void user_should_be_able_to_see_the_contact_information_when_the_mouse_stay_over_button() {
		Actions action = new Actions(driver);
		action.moveToElement(exc.callUsButton).perform();
		Assert.assertTrue(exc.callUsButton.isDisplayed());
		Assert.assertTrue(exc.callUsButton.isDisplayed());
	}

	@When("User should be able to verify if all the information is correct before send the credentials")
	public void user_should_be_able_to_verify_if_all_the_information_is_correct_before_send_the_credentials() {
		exc.cartButton.click();

	}

	@When("User should be able to click on cart button")
	public void user_should_be_able_to_click_on_cart_button() {
		exc.cartButton.click();
	}

	@When("User should be able to add products from category sections and search results")
	public void user_should_be_able_to_add_products_from_category_sections_and_search_results() {
		exc.shopButton.click();
		exc.searchButton.click();
		exc.searchBox.sendKeys("Canon");
		exc.searchBox.sendKeys(Keys.ENTER);
		exc.cannonBtn.click();
		exc.cannonAdd.click();
		exc.cartButton.click();

	}

	@When("User should be able to see the cart icon in the header must reflect all products added by the user")
	public void user_should_be_able_to_see_the_cart_icon_in_the_header_must_reflect_all_products_added_by_the_user() {
		exc.checkoutButton.click();
	}

	@When("User should have ability to remove item from cart on the header")
	public void user_should_have_ability_to_remove_item_from_cart_on_the_header() {
		exc.cartButton.click();
		exc.deleteOrAdd.click();
	}

	@When("User should have ability to checkout")
	public void user_should_have_ability_to_checkout() {
	}

}
