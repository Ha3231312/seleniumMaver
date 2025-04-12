package com.anhtester.ThucHanhCRM01;

import com.anhtester.Bai5LocationElement.LocatorsCRM;
import com.anhtester.Common.BaseTest;
import com.anhtester.Common.CreateValueDynamic;
import org.openqa.selenium.By;

import java.util.Objects;

public class ThucHanhCRM_Part1 extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        createDriver();

        loginCRM();

        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.headerCustomerPage)).getText());

        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();

        //Tạo tên company động dùng cho các trường hợp yc nhập các trường duy nhất không được trùng
        //CreateValueDynamic.generateCompanyName() là value động
        //driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys(CreateValueDynamic.generateCompanyName());

        //Do generateCompanyName là value động nên cần lấy ra để xem value là gì để verify lại ở các bước cối
        //driver.findElement(By.xpath(LocatorsCRM.inputCompany)).getAttribute("value");
        //System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputCompany)).getAttribute("value"));

        String companyName = CreateValueDynamic.generateCompanyName();
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys(companyName);

        driver.findElement(By.xpath(LocatorsCRM.inputVat)).sendKeys("10");
        driver.findElement(By.xpath(LocatorsCRM.inputPhongNumber)).sendKeys("0978545838");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("https://vnptit.vn/");
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys("VIP");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.itemVIP)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownLanguage)).click();
        driver.findElement(By.xpath(LocatorsCRM.itemVietname)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Ha Noi");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Ha Noi");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Hoan Kiem");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("12345");
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Ha Noi");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownCountry)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).sendKeys("Vietnam");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.inputVietnamCountry)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
        //Check alert massage nếu có
        //check theo item customer hiện tại trong customer list
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).sendKeys(companyName);
        Thread.sleep(7000);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.itemCustomerFirst)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.itemCustomerFirst)).getText());
        driver.findElement(By.xpath(LocatorsCRM.itemCustomerFirst)).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputCompany)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputVat)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputPhongNumber)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.dropdownGroup)).getAttribute("value"));
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.dropdownLanguage)).getAttribute("value"));


        //Check data customer đúng hết sau khi add


        //Cuoi cùng phải check integration ( liên kết với các module khác)
        //Ví dụ là sẽ phaải hiển thị trên 1 trang khác



        closeDriver();





    }
}
