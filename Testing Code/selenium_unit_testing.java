package selenium_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;


class selenium_unit_testing {
	private WebDriver driver1;
	public selenium_unit_testing() {
		System.setProperty("webdriver.gecko.driver", "/home/raihan/Downloads/selenium-java-3.141.59/geckodriver");
		driver1=new FirefoxDriver();
		driver1.get("http://localhost/Dummy Project/Registration.php");
		driver1.manage().window().maximize();
		
	}
	
	@Test
	void testcase1() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement age=driver1.findElement(By.id("uage"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		username.sendKeys("abc");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		age.sendKeys("26");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	
	@Test
	void testcase2() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcd");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase3() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcdefghij");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	
	@Test
	void testcase4() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcdefghijk");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase5() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcd1234");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase6() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		//username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase7() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("12345");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase8() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	
	@Test
	void testcase9() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@def.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase10() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase11() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("@.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase12() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase13() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abcdefgh");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	
	@Test
	void testcase14() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("1234567");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase15() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase16() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("14");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase17() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("15");
		username.sendKeys("abcde");
		//uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase18() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("40");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	
	@Test
	void testcase19() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("60");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase20() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("61");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase21() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		//age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}

	@Test
	void testcase22() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("0162129752");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	
	@Test
	void testcase23() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01621297528");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase24() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("016212975289");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase25() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		//mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase26() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
	@Test
	void testcase27() throws InterruptedException {
		WebElement username=driver1.findElement(By.id("uname"));
		WebElement uemail=driver1.findElement(By.id("femail"));
		WebElement mobile=driver1.findElement(By.id("fmobile"));
		WebElement passwd=driver1.findElement(By.id("fpass"));
		WebElement fsubmit=driver1.findElement(By.id("fsubmit"));
		WebElement box=driver1.findElement(By.id("must_check"));
		WebElement age=driver1.findElement(By.id("uage"));
		age.sendKeys("26");
		username.sendKeys("abcde");
		uemail.sendKeys("abc@xyz.com");
		passwd.sendKeys("12345");
		mobile.sendKeys("01213141516");
		//box.click();
		fsubmit.click();
		List<WebElement> lbutton=driver1.findElements(By.id("login_button"));
		Thread.sleep(5000);
		driver1.close();
		assertNotEquals(0,lbutton.size());
	}
}
