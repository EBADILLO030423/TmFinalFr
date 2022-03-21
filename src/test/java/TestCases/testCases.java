package TestCases;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.exersiceMap;
import stepsDefinitions.setupClass;

public class testCases {
	WebDriver driver = setupClass.driver;
	exersiceMap exc;

	@Test
	public void test1() {
		//Button high to low doesn't work 
		exc.dropDown5.click(); // De menor a mayor no esta bien ordenado
		List<WebElement> precios1 = driver.findElements(By.className("price"));
		float temp1 = 0;
		for (int i = 0; i <= precios1.size(); i++) {
			String precio1 = precios1.get(i).getText();
			if (precio1.contains("0 $")) {

				precio1 = precio1.split("0 ")[1];

			}

			precio1 = precio1.substring(1);
			float newPrecio1 = Float.parseFloat(precio1);
			if (i <= 0) {
				Assert.assertTrue(temp1 >= newPrecio1);
			}

			temp1 = newPrecio1;

			// newPrecios.add(newPrecio);
			fail("Not yet implemented");
		}
	}
}
