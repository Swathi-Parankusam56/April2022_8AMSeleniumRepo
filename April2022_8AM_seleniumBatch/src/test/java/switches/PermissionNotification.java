package switches;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionNotification 
{

	public static void main(String[] args) throws Exception 
	{
		
		//WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		
		//notifications
		//geolocation
		//media-stream
		
		//option.addArguments("disable-notifications");
		//option.addArguments("disable-geolocation");
		//option.addArguments("disable-media-stream");
		
		HashMap<String, Integer> contentSetting = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		contentSetting.put("notifications", 1);
		profile.put("profile.managed_default_content_settings.popups", contentSetting);
		prefs.put("profile", profile);
		option.setExperimentalOption("Prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\Screenshots\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.icicibank.com");
	}

}
