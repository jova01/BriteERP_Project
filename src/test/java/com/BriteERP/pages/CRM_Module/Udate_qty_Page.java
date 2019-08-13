package com.BriteERP.pages.CRM_Module;

import com.BriteERP.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Udate_qty_Page extends BasePage {

    @FindBy(css = "[data-menu-xmlid='mrp.menu_mrp_root']")
    public WebElement manufacturingBarLocator;

    @FindBy(css = "[data-menu-xmlid='mrp.menu_mrp_product_form']")
    public WebElement productsLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[5]/div[1]")
    public WebElement firstProductBookLocator;

    @FindBy(css = "button[class='btn btn-sm btn-default']")
    public WebElement updateQTYLocator;

    @FindBy(css = "input[name='new_quantity']")
    public WebElement amountLocator;

    @FindBy(css = "button[name='change_product_qty']")
    public WebElement applyButtonLocator;

    @FindBy(css = "div[class='o_notification_title']")
    public WebElement notificationLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/div/input")
    public WebElement checkBoxLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement actionLocator;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[1]/a")
    public WebElement exportLocator;

    @FindBy(css = "input[value='xls']")
    public WebElement excelFormatLocator;

    @FindBy(css = "button[class='btn btn-sm btn-default o_add_field']")
    public WebElement addButtonLocator;

    @FindBy(css = "div[data-id='priority']")
    public WebElement priorityLocator;

    @FindBy(css = "div[data-id='procurement_group_id']")
    public WebElement procurementDocumentLocator;

    @FindBy(css = "div[data-id='product_id']")
    public WebElement productDocumentLocator;

    @FindBy(css = "div.blockUI.blockOverlay")
    public WebElement loading;

    @FindBy(css = "button[class='btn btn-sm btn-primary']")
    public WebElement exportToFileLocator;
}
