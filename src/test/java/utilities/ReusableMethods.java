package utilities;

import org.apache.commons.io.FileUtils;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.AdminPage;
import pages.HomeNavBarPage;
import pages.StudentLoginPage;
import pages.TeacherApplyLeavePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ReusableMethods {


    // Webelement'lerden olusan listeyi,
    // String'lerden olusan listeye ceviren bir method olusturalim

    public static List<String> stringListeyeCevir(List<WebElement> elementListesi) {

        List<String> stringListesi = new ArrayList<>();

        for (WebElement eachElement : elementListesi) {

            stringListesi.add(eachElement.getText());
        }

        return stringListesi;
    }

    public static void bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {

        }

    }

    public static void switchToWindowByTitle(WebDriver driver, String istenenSayfaTitle) {
        Set<String> acikOlanWindowlarinWHDSeti = driver.getWindowHandles();
        for (String eachWhd : acikOlanWindowlarinWHDSeti) {

            driver.switchTo().window(eachWhd);
            ReusableMethods.bekle(1);

            if (driver.getTitle().equals(istenenSayfaTitle)) {
                break;
            }

        }
    }

    public static void switchToWindowByUrl(WebDriver driver, String istenenSayfaUrl) {
        Set<String> acikOlanWindowlarinWHDSeti = driver.getWindowHandles();
        for (String eachWhd : acikOlanWindowlarinWHDSeti) {

            driver.switchTo().window(eachWhd);
            ReusableMethods.bekle(1);

            if (driver.getCurrentUrl().equals(istenenSayfaUrl)) {
                break;
            }

        }
    }

    public static void getScreenshotTumSayfa(WebDriver driver, String ssIsmi) {
        // 1.adim olusturacagimiz dosyayolunu hazirlayalim
        String dosyaYolu = "target/screenshots/" + ssIsmi + ".png";

        // 2. TakesScreenshot objesi olusturalim

        // TakesScreenshot tss = new TakesScreenshot();
        // 'TakesScreenshot' is abstract; cannot be instantiated

        TakesScreenshot tss = (TakesScreenshot) driver;

        // 3.adim screenshot'i kaydedecegimiz File'i olusturalim

        File tumsayfaSS = new File(dosyaYolu);

        // 4.adim screenshot'i alip gecici dosua olarak kaydedin

        File geciciResim = tss.getScreenshotAs(OutputType.FILE);

        // 5.adim gecici resmi asil dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciResim, tumsayfaSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getScreenshotTumSayfa(WebDriver driver) {

        // 240924202034
        LocalDateTime ldt = LocalDateTime.now(); // 2024-09-24T20-23-24-123432

        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = ldt.format(istenenFormat);

        // 1.adim olusturacagimiz dosyayolunu hazirlayalim
        String dosyaYolu = "target/screenshots/TumSayfaSS" + tarihEtiketi + ".png";

        // 2. TakesScreenshot objesi olusturalim

        // TakesScreenshot tss = new TakesScreenshot();
        // 'TakesScreenshot' is abstract; cannot be instantiated

        TakesScreenshot tss = (TakesScreenshot) driver;

        // 3.adim screenshot'i kaydedecegimiz File'i olusturalim

        File tumsayfaSS = new File(dosyaYolu);

        // 4.adim screenshot'i alip gecici dosua olarak kaydedin

        File geciciResim = tss.getScreenshotAs(OutputType.FILE);

        // 5.adim gecici resmi asil dosyaya kopyalayalim

        try {
            FileUtils.copyFile(geciciResim, tumsayfaSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getScreenshotWebElement(WebDriver driver, WebElement webElement) {

        LocalDateTime ldt = LocalDateTime.now(); // 2024-09-24T20-23-24-123432

        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihEtiketi = ldt.format(istenenFormat);

        // 1.adim olusturacagimiz dosyayolunu hazirlayalim
        String dosyaYolu = "target/screenshots/WebElementSS" + tarihEtiketi + ".png";

        // 2- kullanacagimiz WebElementi locate edip, WebElement olarak kaydedin
        //    parametre olarak gonderilen webElement'in ss alinacak

        // 3- kaydedecegimiz file'i olusturun

        File webElementSS = new File(dosyaYolu);

        // 4- webElement uzerinden screenshot'i alip, gecici dosya olarak kaydedin

        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);

        // 5- gecici dosyayi asil dosyaya kopyala

        try {
            FileUtils.copyFile(geciciDosya, webElementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    public static void login(String url, String username, String password) {

        StudentLoginPage studentLoginPage = new StudentLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty(url));

        //studentLoginPage.studentLoginUsername.click();
        studentLoginPage.studentLoginUsername.sendKeys(username);
        ReusableMethods.bekle(2);
        studentLoginPage.studentLoginPassword.sendKeys(password);
        studentLoginPage.studentLoginSignInButton.click();
        ReusableMethods.bekle(1);

    }

    public static void teacherLogin(String url, String username, String password) {
        TeacherApplyLeavePage teacherApplyLeavePage = new TeacherApplyLeavePage();
        Driver.getDriver().get(url);

        // teacherApplyLeavePage.labelTeacherUsername.click();
        teacherApplyLeavePage.labelTeacherUsername.sendKeys(username);
        ReusableMethods.bekle(1);
        // teacherApplyLeavePage.labelTeacherPassword.click();
        teacherApplyLeavePage.labelTeacherPassword.sendKeys(password);
        ReusableMethods.bekle(1);
        teacherApplyLeavePage.teacherSignInButton.click();
        bekle(2);
    }


    private static int timeout = 5;

    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void erisimTesti(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(actualUrl, expectedUrl);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofMinutes(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver ->
                ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println("Timeout waiting for Page Load Request to complete.");
        }
    }


    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    public static void selectCheckBox(WebElement element, boolean check) {
        if (check && !element.isSelected() || !check && element.isSelected()) {
            element.click();
        }
    }

    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> options = select.getOptions();
        int optionIndex = 1 + random.nextInt(options.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript(command, element);
    }

    public static void clickWithJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static List<String> getStringList(List<WebElement> kaynakList) {

        List<String> stringList = new ArrayList<>();

        for (WebElement eachElement : kaynakList
        ) {

            stringList.add(eachElement.getText());

        }


        return stringList;
    }

    public static void adminlogin(String url, String username, String password) {
        AdminPage adminPage = new AdminPage();
        Driver.getDriver().get(ConfigReader.getProperty(url));

        adminPage.labelUsername.sendKeys(username);
        ReusableMethods.bekle(2);
        adminPage.labelPassword.sendKeys(password);
        adminPage.SignInButton.click();
        ReusableMethods.bekle(1);

    }


    public static String ilkSayfaWhdIleIkinciSayfaWhdBul(WebDriver driver, String ilkSayfaWhd) {

        Set<String> tumWhdSeti = driver.getWindowHandles();

        tumWhdSeti.remove(ilkSayfaWhd);

        for (String each : tumWhdSeti
        ) {
            return each;
        }

        return null; // bu satirin hic calismayacagini biliyoruz
        // sadece javanin endiselerini gidermek icin yazdik

    }


    public static void verifyUrlChangeAfterClick(WebElement elementToClick) {
        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        String beforeClickUrl = Driver.getDriver().getCurrentUrl();
        elementToClick.click();
        ReusableMethods.bekle(1);
        String afterClickUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertNotEquals(beforeClickUrl, afterClickUrl);


    }


    public static void verifyUrlChangeAfterClickDropdw(WebElement elementToClick) {
        HomeNavBarPage homeNavBarPage = new HomeNavBarPage();

        Driver.getDriver().get(ConfigReader.getProperty("homePage"));
        homeNavBarPage.topbarAcadDropDw.click();
        String beforeClickUrl = Driver.getDriver().getCurrentUrl();
        elementToClick.click();
        ReusableMethods.bekle(1);
        String afterClickUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertNotEquals(beforeClickUrl, afterClickUrl);

    }

}