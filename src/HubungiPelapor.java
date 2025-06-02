import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HubungiPelapor extends base {

    public static void main(String[] args) throws Exception {

        AndroidDriver<AndroidElement> driver = capabilities();
        
     // Isi Email
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/emailEditText\"]")
                .sendKeys("auliaauliarahman09@gmail.com");

        // Isi Password
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/passwordEditText\"]")
                .sendKeys("password123");
        
        // Klik tombol Login
		driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.mobilebalikin:id/loginButton\"]")
        .click();
		
		Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
     // Tunggu card pelapor muncul, klik
        AndroidElement pelaporCard = (AndroidElement) wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath(
                "//androidx.cardview.widget.CardView/android.widget.LinearLayout/android.widget.LinearLayout")));
        pelaporCard.click();

        // Tunggu tombol chat muncul dan klik
        AndroidElement chatButton = (AndroidElement) wait.until(
            ExpectedConditions.elementToBeClickable(By.id("com.example.mobilebalikin:id/chatButton")));
        chatButton.click();
     
        driver.quit();
    }
}