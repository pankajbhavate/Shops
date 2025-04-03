package PageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageClass {

	WebDriver driver;
	@FindBy(css = "[onclick=\"cart.add('43');\"]")
	WebElement Aaddtocart;
	@FindBy(xpath = "//a[text()=\"shopping cart\"]")
	WebElement Message;
	@FindBy(xpath = "//button[@data-toggle=\"dropdown\"]")
	WebElement Items;
	@FindBy(css = "[class=\"fa fa-shopping-cart\"]")
	WebElement shoppingcart;
	@FindBy(xpath = "//td[text()=\"$602.00\"]")
	WebElement unitprice;
	@FindBy(xpath = "//td[text()=\"$1,204.00\"]")         ////td[text()="$1,204.00"]
	WebElement Totalprice;
	
	public PageClass(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void add1mackbook() {
		Aaddtocart.click();
	}
  public void add2mackbook() {
	  Aaddtocart.click();
  }
  public void ValidateSuccesfullyadd() {
	String message =  Message.getText();
	System.out.println(message);
  }
	public void openshoppingcart() {
		shoppingcart.click();
	}
 
	public void Validateurl() {
	String url =	driver.getCurrentUrl();
	System.out.println(url);
	}
   public void Validateunitprice() {
	String firstprice =   unitprice.getText();
	System.out.println(firstprice);
	assertEquals(firstprice, "dd");
   }
   public void Validatetotalprice() {
  String secondprice	=   Totalprice.getText();
    System.out.println(secondprice);
   }


}
