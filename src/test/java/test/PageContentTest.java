package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageContentTest extends BaseTest {
    @Test(groups = {"sanity"})
    public void testPageContent() {
        String content = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(content, "Welcome to CI/CD Automation");
    }
}
