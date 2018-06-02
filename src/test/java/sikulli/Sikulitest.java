package sikulli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulitest {
	public static void main(String[] args) throws FindFailed
	{
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in");
		
		Screen s=new Screen();
		Pattern gmail =new Pattern("C:\\Users\\Admin\\eclipse-workspace\\sikulli\\Locator\\gmail1.PNG");
	    Pattern signin=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\sikulli\\Locator\\signin.PNG");
        Pattern email=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\sikulli\\Locator\\email.PNG");
	    Pattern next=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\sikulli\\Locator\\next.PNG");
	    Pattern pswd=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\sikulli\\Locator\\pswd.PNG");
	    Pattern next1=new Pattern("C:\\Users\\Admin\\eclipse-workspace\\sikulli\\Locator\\next.PNG");
	    s.wait(gmail, 5);	
s.click(gmail);
s.wait(signin, 10);
s.click(signin);
s.wait(email, 10);
s.type(email, "parame.kanniyappan@gmail.com");
s.wait(next, 10);
s.click(next);
s.wait(pswd, 10);
s.type(pswd, "pswd123");
s.wait(next1, 10);
s.click(next1);
	}

}
