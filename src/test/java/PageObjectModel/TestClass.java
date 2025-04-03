package PageObjectModel;

import org.testng.annotations.Test;


public class TestClass extends BaseClass{
	

	
	@Test
	public void test() {
		PageClass p =new PageClass(driver);
		p.add1mackbook();
		p.add2mackbook();
		p.ValidateSuccesfullyadd();
		p.openshoppingcart();
		p.Validateurl();
		p.Validateunitprice();
		p.Validatetotalprice();
		
	}




}
