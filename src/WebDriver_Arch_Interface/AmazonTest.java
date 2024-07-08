package WebDriver_Arch_Interface;

public class AmazonTest {
	


	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();//5 
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browserName = "firefox";
		
		WebDriver driver = null;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser...");
			break;
		}

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title : " + title);

		if (title.equals("Amazon")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is not correct");
		}

		driver.findElement("amazon logo");

		driver.sendKeys("Emaild", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginButton");

		driver.close();

	}

}