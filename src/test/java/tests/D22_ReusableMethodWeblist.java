package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class D22_ReusableMethodWeblist {


    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        AmazonPage amazonPage = new AmazonPage();

        /*
        List<WebElement> allDataWbelement = amazonPage.allDataWebElementList;
        System.out.println(ReusableMethods.getElementsText(allDataWbelement));
        */

        System.out.println(ReusableMethods.getElementsText(amazonPage.allDataWebElementList));
    }
}
