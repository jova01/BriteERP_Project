package com.BriteERP.utilities;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
