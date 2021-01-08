package WebTest;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class CreateAccount extends Util
{
    public void clickoncreateaccount()
    {
        String MainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.xpath("//input[@id=\"login-customer[email]\"]")).sendKeys("mital+\"+System.currentTimeMillis()+\"@gmail.com");


                // Closing the Child Window.
                driver.close();
            }
            // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);

        }

}}
