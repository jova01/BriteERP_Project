package com.BriteERP.tests.components.CRM;



import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpDate_QTY extends TestBase {

    @Test ()
    public void test1(){
        extentLogger=report.createTest("As manager I should be able to update QTY");
        pages.loginPage().login();
        pages.udate_qty_page().manufacturingBarLocator.click();
        pages.udate_qty_page().productsLocator.click();
        pages.udate_qty_page().firstProductBookLocator.click();
        pages.udate_qty_page().updateQTYLocator.click();
        pages.udate_qty_page().amountLocator.clear();
        pages.udate_qty_page().amountLocator.sendKeys("100");
        pages.udate_qty_page().applyButtonLocator.click();

        String expectedResult="Saved";
        String actualResult=pages.udate_qty_page().notificationLocator.getText();

        Assert.assertNotEquals(expectedResult,actualResult);
        extentLogger.pass("As manager I could not update QTY ");

    }

    @Test ()
    public void test2(){
        extentLogger=report.createTest("As manager I should be able to Export any data as Excel file");
        pages.loginPage().login();
        pages.udate_qty_page().manufacturingBarLocator.click();
        pages.udate_qty_page().checkBoxLocator.click();
        pages.udate_qty_page().actionLocator.click();
        pages.udate_qty_page().exportLocator.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",pages.udate_qty_page().priorityLocator);


        pages.udate_qty_page().priorityLocator.click();
        pages.udate_qty_page().addButtonLocator.click();
        pages.udate_qty_page().procurementDocumentLocator.click();
        pages.udate_qty_page().addButtonLocator.click();
        pages.udate_qty_page().productDocumentLocator.click();
        pages.udate_qty_page().addButtonLocator.click();
        pages.udate_qty_page().excelFormatLocator.click();
        pages.udate_qty_page().exportToFileLocator.click();

        System.out.println(pages.udate_qty_page().loading.isDisplayed());
        extentLogger.pass("Manager is able to Export any data as Excel file");


    }



}

