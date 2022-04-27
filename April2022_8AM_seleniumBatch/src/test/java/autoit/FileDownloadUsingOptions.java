package autoit;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadUsingOptions 
{

	public static void main(String[] args) 
	{
		String fileType = "DOC, DOCX";
		
		//For Chrome Browser
		
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions option = new
		 * ChromeOptions(); option.
		 * addArguments("user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Google\\Chrome\\User Data\\Default"
		 * ); HashMap<String, Object> pref = new HashMap<String, Object>();
		 * pref.put("plugins.always_open_pdf_externally", true);
		 * pref.put("download.default_directory", "C:\\Users\\ravi\\files");
		 * option.setExperimentalOption("prefs", pref);
		 * 
		 * WebDriver driver = new ChromeDriver(option);
		 * driver.manage().window().maximize();
		 * driver.get("https://file-examples.com/");
		 */
		
		
		
		//For Edge Browser
		
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ravi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions option1 = new EdgeOptions();
		option1.addArguments("--user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Microsoft\\Edge\\User Data\\Default");
		HashMap<String, Object> pref1 = new HashMap<String, Object>();
		pref1.put("plugins.always_open_pdf_externally", true);
		pref1.put("download.default_directory", "C:\\Users\\ravi\\files");
		option1.setExperimentalOption("prefs", pref1);
		
		WebDriver driver = new EdgeDriver(option1);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		
		//For Firefox Browser

		
		
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Download sample')]")).click();
	}

}
