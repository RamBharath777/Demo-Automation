package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleTest extends BaseTest {
    @Test(groups = {"sanity"})
    public void testPageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Welcome to CI/CD Automation");
    }
}
