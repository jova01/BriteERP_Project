package com.BriteERP.pages.CRM_Module;


import com.BriteERP.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CrmPage extends BasePage {
    @FindBy(xpath = "//*[@class = \'oe_menu_text\' and contains(text(), \'CRM\')]")
    public WebElement crmlocator;

    @FindBy (css= "[class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createButtonLocator;

    @FindBy (xpath = "//*[contains(@placeholder, 'Customer Deal')]")
    public WebElement opportunityTitleLocator;

    @FindBy (xpath = "//tbody/tr[2]/td[2]/div/div/input")
    public WebElement CustomerLocator;

    @FindBy (xpath = "//tbody/tr[3]/td[2]/div/input")
    public WebElement ExpectedRevenurLocator;

    @FindBy (xpath = "//td/div/a[3]")
    public WebElement priorityLocator;

    @FindBy (xpath = "//*[text()='Create']")
    public WebElement createOpportunityLocator;

    @FindBy (xpath = "//div[@class = 'btn-group btn-group-sm o_cp_switch_buttons']/button[4]")
    public WebElement pivotLocator;

    @FindBy (css= "[class= 'o_pivot_header_cell_opened']")
    public WebElement minusLocator;

    @FindBy (css = "[class = 'o_pivot_header_cell_closed']")
    public WebElement plusLocator;

    @FindBy (xpath = "//a[text() = 'Opportunity'] ")
    public WebElement dropDownMenuOpportunityLocator;

    @FindBy (xpath = "//td[text()='Apple']/following-sibling::td[1]")
    public WebElement pivotSecondOpporunityLocator;

    @FindBy(xpath = "//div[@class = 'btn-group btn-group-sm o_cp_switch_buttons']/button[2]")
    public WebElement listLocator;

    @FindBy (xpath = "//td[text()='Apple']/following-sibling::td[6]")
    public WebElement listBoardSecondOpporunityLocator;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement pivotTableTotalLocator;


    // //tr//td[text()='Shall not Perish']
}



