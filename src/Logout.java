import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Logout extends base {

    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/emailEditText\"]")
        .sendKeys("tesaja09@gmail.com");

        // Isi Password
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/passwordEditText\"]")
        .sendKeys("password1234567");

        // Klik tombol Login
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.mobilebalikin:id/loginButton\"]")
        .click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Tunggu hingga semua elemen dengan resourceId muncul
        List<WebElement> navItems = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
            MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example.mobilebalikin:id/navigation_bar_item_icon_view\")")));

        // Langsung ambil elemen dengan index 2 (elemen ke-3)
        navItems.get(2).click();

   
        driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.mobilebalikin:id/logoutButton\"]").click();
        driver.quit();
    }
}
