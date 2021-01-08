package WebTest;

import org.openqa.selenium.By;
import sun.plugin2.message.SetChildWindowHandleMessage;

import java.util.Iterator;
import java.util.Set;

public class HomePage extends Util
{
    public void UserClikOnMyAccount()
    {
        driver.findElement(By.xpath("//div[@class=\"header__action-item-content\"]/a[2]")).click();

    }
    public void UserClickOnCategoryLink(String category)
    {
        driver.findElements(By.linkText(category));

    }



    }










    //div[@class="header__action-item-content"]//div[1]//div[1]//div[1]//div[1]//div[1]//p[1]//button[@class="link link--accented"]


