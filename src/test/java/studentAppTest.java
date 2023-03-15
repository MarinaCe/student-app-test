import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class studentAppTest {
    @Test
    public void openStudentApp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("http://acodemystudentapp-env.eba-d2vctp44d.eu-north-1.elasticbeanstalk.com/");
        driver.close();
        driver.quit();
    }
}