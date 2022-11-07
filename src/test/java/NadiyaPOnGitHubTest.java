import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NadiyaPOnGitHubTest {
//    TC_11_01
//1.  Открыть базовую ссылку
//2.  Нажать на пункт меню Guide
//3.  Подтвердить, что вы перешли на страницу со ссылкой https://openweathermap.org/guide
// и что title этой страницы OpenWeatherMap API guide - OpenWeatherMap

    @Test

    public void testOpenAndClickOnGuide() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gsxrp\\OneDrive\\Desktop\\Aplication\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";
        String buttonGuide = "Guide";

        String expectedResult2 = "OpenWeatherMap API guide - OpenWeatherMap";
        String expectedResult1 = "https://openweathermap.org/guide";

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement GuideButton = driver.findElement(By.xpath("//a[@href='/guide']"));
        GuideButton.click();

        String actualResult2 = driver.getTitle();
        String actualResult1 = driver.getCurrentUrl();
        Assert.assertEquals(actualResult1,expectedResult1);
        Assert.assertEquals(actualResult2,expectedResult2);


    }


//    TC_11_02
//1.  Открыть базовую ссылку
//2.  Нажать на единицы измерения Imperial: °F, mph
//3.  Подтвердить, что температура для города показана в Фарингейтах

    @Test
   public void testTemperatureIsInFahrenheit(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\gsxrp\\OneDrive\\Desktop\\Aplication\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org/";

        String imperial = "°F, mph";
        String actualResult = "°F, mph";

        ////p[@class='stick-footer-panel__description' ]






   }
//    TC_11_03
//1.  Открыть базовую ссылку
//2. Подтвердить, что внизу страницы есть панель с текстом “We use cookies which are essential for the site to work.
// We also use non-essential cookies to help us improve our services. Any data collected is anonymised.
// You can allow all cookies or manage them individually.”
//            3. Подтвердить, что на панели внизу страницы есть 2 кнопки “Allow all” и “Manage cookies”
//
//
//    TC_11_04
//1.  Открыть базовую ссылку
//2.  Подтвердить, что в меню Support есть 3 подменю с названиями “FAQ”, “How to start” и “Ask a question”
//




//        TC_11_05
//        1. Открыть базовую ссылку
//        2. Нажать пункт меню Support → Ask a question
//        3. Заполнить поля Email, Subject, Message
//        4. Не подтвердив CAPTCHA, нажать кнопку Submit
//        5. Подтвердить, что пользователю будет показана ошибка “reCAPTCHA verification failed, please try again.”

    @Test
    public void testWhenCaptchaVerificationIsFailed() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\gsxrp\\OneDrive\\Desktop\\Aplication\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver  = new ChromeDriver();

            String url = "https://openweathermap.org/";
            String email = "tester@test.com";
            String subject = "I want to discuss a purchase of OpenWeather products/subscriptions";
            String message = "Please help me";
            String expectedResult = "reCAPTCHA verification failed, please try again";

            driver.get(url);
            driver.manage().window().maximize();

            Thread.sleep(3000);

            WebElement SupportMenu = driver.findElement(By.xpath("//div[@id ='support-dropdown']"));

            SupportMenu.click();
            Thread.sleep(500);

            WebElement searchSupportDropDownMenuAskQuestions = driver.findElement(
                    By.xpath("//ul[@id = 'support-dropdown-menu']/li/a[@href='https://home.openweathermap.org/questions']"));


        searchSupportDropDownMenuAskQuestions.click();
        Thread.sleep(5000);

        WebElement emailElement = driver.findElement(By.id("question_form_email"));
        emailElement.click();
        emailElement.sendKeys(email);





          driver.quit();


        }


//    TC_11_06
//1.  Открыть базовую ссылку
//2.  Нажать пункт меню Support → Ask a question
//3.  Оставить значение по умолчанию в checkbox Are you an OpenWeather user?
//            4. Оставить пустым поле Email
//5. Заполнить поля  Subject, Message
//6. Подтвердить CAPTCHA
//7. Нажать кнопку Submit
//8. Подтвердить, что в поле Email пользователю будет показана ошибка “can't be blank”
//
//    TC_11_07
//1.  Открыть базовую ссылку
//2.  Нажать на единицы измерения Imperial: °F, mph
//
//3.  Нажать на единицы измерения Metric: °C, m/s
//4.  Подтвердить, что в результате этих действий, единицы измерения температуры изменились с F на С
//
//    TC_11_08
//1.  Открыть базовую ссылку
//2.  Нажать на лого компании
//
//3.  Дождаться, когда произойдет перезагрузка сайта, и подтвердить, что текущая ссылка не изменилась
//









}
