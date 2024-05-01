package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample {
    public static void main(String[] args) {
        // Set the path to ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the Dashboard page
        driver.get("file:///C:/Users/Snowvita%20B/Downloads/PageObjectModel/SamplePOM.html");

     // Create DashboardPage object
        DashboardPage dashboardPage = new DashboardPage(driver);

        // Get the welcome message from the dashboard page
        String welcomeMessage = dashboardPage.getWelcomeMessage();
        System.out.println("Welcome Message: " + welcomeMessage);

        dashboardPage.clickLogin();
        
        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Enter username and password
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");

        // Click on login button
        loginPage.clickLoginButton();

        // Close the browser
        //driver.quit();
    }
}