package com.BriteERP.pages.CRM_Module;

import com.BriteERP.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateOpportunityPage extends BasePage {

    @FindBy(css = "a[data-menu='261']")
    public WebElement CRMLocator;

    @FindBy(css = "button[class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButtonLocator;

    @FindBy (css = "[placeholder^='e.g. Customer Deal']")
    public WebElement titleLocator;

    @FindBy(css = "input[class='o_input ui-autocomplete-input']")
    public WebElement customerDropDownLocator;

    @FindBy(css = "li[class='ui-menu-item']:nth-of-type(2)")
    public WebElement companyNameLocator;

    @FindBy(css = "[class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement revenueLocator;

    @FindBy(xpath = "//tr//td//div//a[3]")
    public WebElement starLocator;

    @FindBy (css = "button[class='btn btn-sm btn-primary']:nth-of-type(1)")
    public WebElement createLocator;

    @FindBy(css = "button[accesskey='l']")
    public WebElement listLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")
    public WebElement googleCheckBoxLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td[1]/div/input")
    public WebElement appleCheckBoxLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement actionLocator;

    @FindBy(css = "a[data-index='3']")
    public WebElement DeleteLocator;

    @FindBy(css = "button[class='btn btn-sm btn-primary']")
    public WebElement OkButtonLocator;

}
