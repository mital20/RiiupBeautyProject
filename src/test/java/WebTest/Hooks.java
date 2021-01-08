package WebTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Util
{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browserManager.SetBrowser();

    }
    @After
    public void closebrowser()
    {
//        browserManager.closeBrowser();
    }

}
