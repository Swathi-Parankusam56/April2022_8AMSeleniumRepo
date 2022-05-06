package autoit;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadUsingOptions 
{

	public static void main(String[] args) throws Exception 
	{
		// https://src.chromium.org/viewvc/chrome/trunk/src/chrome/common/pref_names.cm?revision=291266
		// http://kb.mozillazine.org/About:config_entries
		
		String fileType = "PDF";
		WebDriver driver;
	
		
		//For Chrome Browser
		
		
		 WebDriverManager.chromedriver().setup(); 
		 ChromeOptions option = new ChromeOptions(); 
		 option.addArguments("user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Google\\Chrome\\User Data\\Default"); 
		 HashMap<String, Object> pref = new HashMap<String, Object>();
		 pref.put("plugins.always_open_pdf_externally", true);
		 pref.put("download.default_directory", "C:\\Users\\ravi\\files");
		 option.setExperimentalOption("prefs", pref);
		 driver = new ChromeDriver(option);
		 
		
		
		//For Edge Browser
		
		/*System.setProperty("webdriver.edge.driver", "C:\\Users\\ravi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions option1 = new EdgeOptions();
		option1.addArguments("--user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Microsoft\\Edge\\User Data\\Default");
		HashMap<String, Object> pref1 = new HashMap<String, Object>();
		pref1.put("plugins.always_open_pdf_externally", true);
		pref1.put("download.default_directory", "C:\\Users\\ravi\\files");
		option1.setExperimentalOption("prefs", pref1);
		driver = new EdgeDriver(option1);*/
		
		
		
		//For Firefox Browser
		
		/*WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile profile = p.getProfile("AprilFFProfile");
				
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("browser.download.dir", "C:\\Users\\ravi\\files");
		profile.setPreference("browser.download.folderList", 2);
		option.setProfile(profile);
		driver = new FirefoxDriver(option);*/
		
		 // Used in verions webdriver-2 & 3 series
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		// Used in verion webdriver-4 series
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		driver.manage().timeouts().getPageLoadTimeout();
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample')]")).click();
	}

}
