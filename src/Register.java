import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Register extends base {

    public static void main(String[] args) throws Exception {

        // Inisialisasi driver
        AndroidDriver<AndroidElement> driver = capabilities();

        // Klik tombol 'Daftar'
        driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.example.mobilebalikin:id/registerTextView\"]").click();

        // Tunggu sebentar biar halaman daftar muncul (optional)
        Thread.sleep(2000);

        // Isi form register

        // Full Name
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/nameEditText\"]").sendKeys("Aulia Vika Rahman");

        // Email
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/emailEditText\"]").sendKeys("auliaauliarahman09@gmail.com");

        // Password
        driver.findElementByXPath("//android.widget.EditText[@resource-id=\"com.example.mobilebalikin:id/passwordEditText\"]").sendKeys("password123");

        // Klik tombol Daftar
        driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.example.mobilebalikin:id/registerButton\"]").click();

        // Tunggu hasil register (optional, misalnya 3 detik)
        Thread.sleep(3000);

        System.out.println("Test Register Berhasil Dijalanin!");

        // Tutup driver
        driver.quit();
    }
}
