package com.BriteERP.tests.components.CRM;


import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRM_TEST extends TestBase {


    @Test
    public void Test1() {
        extentLogger=report.createTest(" Verify that second opportunity’ Expected Revenue value on the\n" +
                " Pivot board should be the same as the Expected revenue column value on the list board.");

        pages.loginPage().login("eventscrmmanager10@info.com", "eventscrmmanager");
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmpage().crmlocator));
        pages.crmpage().crmlocator.click();

        pages.crmpage().pivotLocator.click();

        pages.crmpage().plusLocator.click();

        pages.crmpage().dropDownMenuOpportunityLocator.click();
        String pivotboardValue = pages.crmpage().pivotSecondOpporunityLocator.getText();

        pages.crmpage().listLocator.click();
        String listValue = pages.crmpage().listBoardSecondOpporunityLocator.getText();

        System.out.println("Expected: "+pivotboardValue+"\n"+"Actual: "+listValue);
        Assert.assertEquals(listValue,pivotboardValue);
        extentLogger.pass("Pivot revenue is equal to Expected revenue column value on the list board");

    }

    @Test
    public void Test2()  {
        extentLogger=report.createTest(" Verify that on the pivot table, the total expected revenue\n" +
                " should be the sum of all opportunities’ expected revenue.");

        pages.loginPage().login("eventscrmmanager10@info.com", "eventscrmmanager");
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmpage().crmlocator));

        pages.crmpage().crmlocator.click();

        pages.crmpage().pivotLocator.click();

        pages.crmpage().minusLocator.click();

        pages.crmpage().plusLocator.click();
        pages.crmpage().dropDownMenuOpportunityLocator.click();
        String expected =pages.crmpage().pivotTableTotalLocator.getText().replace(",", "");

        double total = Double.valueOf(expected);
        int countOfRows = driver.findElements(By.xpath("//tbody/tr")).size();
        double sumOfAllOpportunities = 0;
        for (int i = 2; i<=countOfRows; i++){
            sumOfAllOpportunities+=Double.valueOf(driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText().replace(",",""));
        }
        System.out.println("Expected: "+total+"\n"+"Actual: "+sumOfAllOpportunities);

        Assert.assertEquals(sumOfAllOpportunities, total);

        extentLogger.pass("Total expected revenue is equal to sum of all opportunities revenue");
    }


}