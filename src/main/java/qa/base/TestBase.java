package qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/Benaka/Desktop/framework/FrameWorkDevelopment/src/main/java/qa/properties/config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
