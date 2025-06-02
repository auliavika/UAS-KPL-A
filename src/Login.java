import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login extends base {

    public static void main(String[] args) throws Exception {

        // Inisialisasi driver
        AndroidDriver<AndroidElement> driver = capabilities();

        // Tunggu aplikasi terbuka (optional, biar aman)
        Thread.sleep(2000);

        // Isi Email
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/emailEditText\"]")
                .sendKeys("auliaauliarahman09@gmail.com");

        // Isi Password
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/passwordEditText\"]")
                .sendKeys("password123");

        // Klik tombol Login
        driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.mobilebalikin:id/loginButton\"]")
                .click();

        // Tunggu halaman dashboard muncul (optional, bisa ditambah validasi)
        Thread.sleep(3000);

        System.out.println("Test Login Berhasil Dijalanin!");

        // Tutup driver
        driver.quit();
    }
}
