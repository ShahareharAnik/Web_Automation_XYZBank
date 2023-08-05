package POM;

//import com.sun.xml.internal.ws.resources.UtilMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Webelements {
    WebDriver driver;
    By ManagerLogIn = By.xpath("//button[text()=\"Bank Manager Login\"]");
    By AddCustomerButton = By.xpath(" (//button[text()])[3]");
    By IntName = By.xpath("(//input)[1]");
    By SecondName = By.xpath("(//input)[2]");
    By PostCode = By.xpath("(//input)[3]");
    By AddCustomer = By.xpath(" //button[text()=\"Add Customer\"]");
    By OpenAccount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]");
    By CustomerSelect = By.xpath("//select[@id='userSelect']");
    By Customer= By.xpath("//option[contains(text(),'kanon ahmed')]");
    By CurrencySelect = By.xpath("//select[@id='currency']");
    By Currency = By.xpath("//option[contains(text(),'Dollar')]");
    By Process = By.xpath("//button[contains(text(),'Process')]");
    By Home = By.xpath("//button[contains(text(),'Home')]");
    By CustomerLogIn = By.xpath("//button[contains(text(),'Customer Login')]");
    By CustomerNameSelectSearchBar= By.xpath("//select[@id='userSelect']");
    By CustomerName=By.xpath("//option[contains(text(),'kanon ahmed')]");
    By LogIn = By.xpath("//button[contains(text(),'Login')]");
    By Trans = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]");
    By Dips = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]");
    By withdrow = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]");
    By DipAm = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By DipositButton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By WithAm =By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By Withdrw = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By Reset = By.xpath("//button[contains(text(),'Reset')]");
    By logout = By.xpath("//button[contains(text(),'Logout')]");

    By CustomerTab = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[3]");
    By SearchBar = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By Delete = By.xpath("//button[contains(text(),'Delete')]");

    public Webelements(WebDriver driver){
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void ManagerLogIn() throws InterruptedException {
        Thread.sleep(2000);
            driver.findElement(ManagerLogIn).click();
    }
    public void AddCustomer() throws InterruptedException {
        Thread.sleep(2000);
            driver.findElement(AddCustomerButton).click();
    }
    public void CustomerData(String FirstName, String lastName, String postcode) throws InterruptedException {
            Thread.sleep(1000);
            driver.findElement(IntName).sendKeys(FirstName);
            Thread.sleep(1000);
            driver.findElement(SecondName).sendKeys(lastName);
            Thread.sleep(1000);
            driver.findElement(PostCode).sendKeys(postcode);
    }
    public void clickButton(){
                driver.findElement(AddCustomer).click();
                driver.switchTo().alert().accept();
    }
    public void OpenAccount()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(OpenAccount).click();
    }
    public void Customer()throws InterruptedException{
        driver.findElement(CustomerSelect).click();
        Thread.sleep(1000);
        driver.findElement(Customer).click();
    }
    public void Currency()throws InterruptedException{
        driver.findElement(CurrencySelect).click();
        Thread.sleep(1000);
        driver.findElement(Currency).click();
    }
    public void Process()throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(Process).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(Home).click();

    }
    public void CustomerTAb(){
        driver.findElement(CustomerTab).click();
    }
    public void SearchBox(String s)throws InterruptedException{
        driver.findElement(SearchBar).click();
        Thread.sleep(2000);
        driver.findElement(SearchBar).sendKeys(s);
        Thread.sleep(1000);
    }
    public void Delete()throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(Delete).click();
    }
    public void CustomerLogIn()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(CustomerLogIn).click();
        Thread.sleep(2000);
        driver.findElement(CustomerNameSelectSearchBar).click();
        Thread.sleep(2000);
        driver.findElement(CustomerName).click();
        Thread.sleep(2000);
        driver.findElement(LogIn).click();
    }
    public void Deposit(String s)throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(Dips).click();
        Thread.sleep(2000);
        driver.findElement(DipAm).sendKeys(s);
        Thread.sleep(2000);
        driver.findElement(DipositButton).click();
    }
    public void Withdraw(String s)throws InterruptedException{
        driver.findElement(withdrow).click();
        Thread.sleep(2000);
        driver.findElement(WithAm).sendKeys(s);
        Thread.sleep(2000);
        driver.findElement(Withdrw).click();
        Thread.sleep(2000);
    }
    public void Transiction()throws InterruptedException{
        driver.findElement(Trans).click();
        Thread.sleep(2000);
        driver.findElement(Reset).click();
    }
    public void Logout()throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(logout).click();
        Thread.sleep(1000);
        driver.findElement(Home).click();
        Thread.sleep(2000);
        driver.findElement(ManagerLogIn).click();
        Thread.sleep(2000);
    }
}
