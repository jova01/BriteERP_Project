package com.BriteERP.tests.components.CRM;

import com.BriteERP.utilities.BrowserUtils;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateOpportunity extends TestBase {

    @Test(dataProvider = "credentials")
    public void crmTest(String username, String password){
        extentLogger=report.createTest("Manager shoul be able to create pipeline");

        pages.loginPage().login(username,password);
        pages.createOpportunityPage().CRMLocator.click();

        String item ="Iphone";
        String revenue="12000";
        for (int i=0; i<2; i++) {
            pages.createOpportunityPage().createButtonLocator.click();
            pages.createOpportunityPage().titleLocator.sendKeys(item);
            pages.createOpportunityPage().customerDropDownLocator.click();
            pages.createOpportunityPage().companyNameLocator.click();
            pages.createOpportunityPage().revenueLocator.clear();
            pages.createOpportunityPage().revenueLocator.sendKeys(revenue);
            pages.createOpportunityPage().starLocator.click();
            pages.createOpportunityPage().createLocator.click();
            BrowserUtils.waitPlease(2);
            item="Galaxy";
            revenue="30000";
        }


        pages.createOpportunityPage().listLocator.click();
        pages.createOpportunityPage().googleCheckBoxLocator.click();
        pages.createOpportunityPage().appleCheckBoxLocator.click();
        pages.createOpportunityPage().actionLocator.click();
        pages.createOpportunityPage().DeleteLocator.click();
        pages.createOpportunityPage().OkButtonLocator.click();

        extentLogger.pass("Manager is able to create pipeline");



    }
    @DataProvider(name = "credentials")
    public static Object[][] credentials() {
        return new Object[][] {{ "eventscrmmanager10@info.com", "eventscrmmanager" }};

    }



}

