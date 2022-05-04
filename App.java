package EscuelitaTestTGV.Automatizacion01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver","../Automatizacion01/CarpetaDePrubea/chromedriver.exe"); 
   
        WebDriver navegador = new ChromeDriver();
   
        navegador.get("https://www.selenium.dev/");

        Thread.sleep(3000);   
        
       navegador.findElement(By.xpath(null)).click();  		   
   
      
    
    
    
    }
}