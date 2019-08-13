package com.BriteERP.utilities;

import com.BriteERP.pages.CRM_Module.CreateOpportunityPage;
import com.BriteERP.pages.CRM_Module.CrmPage;
import com.BriteERP.pages.CRM_Module.Udate_qty_Page;
import com.BriteERP.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private CrmPage crmpage;
    private CreateOpportunityPage createOpportunityPage;
    private Udate_qty_Page udate_qty_page;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


    public CrmPage crmpage() {
        if (crmpage == null) {
            crmpage = new CrmPage();
        }
        return  crmpage;
    }

    public CreateOpportunityPage createOpportunityPage() {
        if (createOpportunityPage== null) {
            createOpportunityPage = new CreateOpportunityPage();
        }
        return  createOpportunityPage;
    }

    public  Udate_qty_Page udate_qty_page() {
        if (udate_qty_page== null) {
            udate_qty_page = new Udate_qty_Page();
        }
        return  udate_qty_page;
    }



}
