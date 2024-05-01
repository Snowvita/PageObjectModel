package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By welcomeMessage = By.className("welcome-message");
    private By login = By.className("login-btn");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        return driver.findElement(welcomeMessage).getText();
    }
    public void clickLogin(){
        driver.findElement(login);
    }
}