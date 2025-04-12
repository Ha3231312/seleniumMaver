package com.anhtester.Bai5LocationElement;

public class LocatorsCRM {

    //login page
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String InputEmail = "//input[@id='email']";
    public static String InputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password']";
    public static String alertMassage = "//div[@id='alerts']/div";

    //Dashboard page
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuCustomer = "//span[normalize-space()='Customers']";
        //public static String menuCustomer = "//aside[@id='menu']//span[normalize-space()='Customers']";
    public static String iconProfile = "//li[contains(@class,'header-user-profile')]";

    //(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span
    public static String totalInvoiceAwaitingPayment = "(//span[normalize-space()='Invoice Awaiting payment']/parent::div)/follow-sibling::span";
    public static String totalConvertedLeads = "(//span[normalize-space()='Converted Leads']/parent::div)/follow-sibling::span";
    public static String totalProjectInProgress = "(//span[normalize-space()='Project In Progress']/parent::div)/follow-sibling::span";
    public static String totalTasksNotFinished = "(//span[normalize-space()='Tasks Not Finished']/parent::div)/follow-sibling::span";

    //Customer page
    public static String headerCustomerPage = "//span[normalize-space()='Customers Summary']";
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//a[normalize-space()='Import Customers']";
    //public static String inputSearchCustomer = "//div[@id='top_search']//input[@type='search']";
    public static String inputSearchCustomer = "//div[@id='clients_filter']/descendant::input";
    public static String inputCompany = "//input[@id='company']";
    public static String inputVat = "//input[@id='vat']";
    public static String inputPhongNumber = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroup = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//button[@data-id='groups_in[]']/following-sibling::div//input";
    public static String itemVIP = "//button[@data-id='groups_in[]']/following-sibling::div//span[normalize-space()='VIP']";
    public static String dropdownLanguage = "//button[@data-id='default_language']";
    public static String itemVietname = "//span[normalize-space()='Vietnamese']";
    public static String inputCity = "//input[@id='city']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputSearchCountry = "//button[@data-id='country']//following-sibling::div//input";
    public static String inputVietnamCountry = "//button[@data-id='country']/following-sibling::div//span[normalize-space()='Vietnam']";
    public static String buttonSave = "//div[@id = 'profile-save-section']//button[normalize-space()='Save']";
    public static String itemCustomerFirst = "//table[@id='clients']/tbody/tr[1]/td[3]/a";





    //Task Page
    public static String buttonNewTask = "//a[normalize-space()='New.Task']";

    //Proposal static
    public static String buttonNewProposal = "//a[normalize-space()='New.Proposal']";




}
