package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;

import data.Xls_Reader;



public class Base {
	
//	public static Properties prop;
//	public static Xls_Reader reader;
//	public static String Url;
//	public static ExtentReports extend;
//	
//	
//	
//	public static void setup() throws IOException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
//		 WebDriver dr = new ChromeDriver();
//		dr.get("https://dev.produgie.com/auth/verify-email");
//		dr.manage().window().maximize();
//		parameterization();
//		dr.get(Url);
//			
//				
//	}
//	
//	public static String getdata(String Data) throws IOException
//	{
//		prop = new Properties();
//		try {
//			
//			InputStream input= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\TestData\\config.properties");
//			prop.load(input);
//		}catch(FileNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		
//		String data = prop.getProperty(Data);
//		return data;
//		
//	}
//	
//	public static void parameterization() throws IOException {
//		 Url=getdata("url");
//		 
//	}

		public static WebDriver driver;
		public static Properties prop;
		public static String Url;
		
		public static String getObject(String Data)  {
			try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//data//config.properties");
			prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return Data;
		}
		
		public static void intialze() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
//			String br = prop.getProperty("browser");
//			if(br.equals("chrome")) {
//				System.setProperty("webdriver.chrome.driver", "D:\\java\\software\\chromedriver.exe");
//				driver = new ChromeDriver();
//			}
//			else if(br.equals("FF")) {
//				System.setProperty("webdriver.gecko.driver", "D:\\java\\software\\geckodriver.exe");
//				driver = new FirefoxDriver();
//			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(prop.getProperty(Url));
		}
		public static void parameterization() throws IOException {
			
			 Url=getObject("url");
			 
		}
	}


