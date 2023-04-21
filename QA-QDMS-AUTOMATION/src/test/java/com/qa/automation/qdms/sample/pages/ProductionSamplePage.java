package com.qa.automation.qdms.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.automation.qdms.base.DriverIntialization;

public class ProductionSamplePage extends DriverIntialization {
  @FindBy(xpath = "//a[@class='sc-bdVaJa ieeiNp'][@href='#/samples']")
  public static WebElement samplexpath;
  // * Sample Page Home Icon Text
  @FindBy(xpath = "//div[normalize-space()='SAMPLES']")
  public static WebElement sampletext;
  // * Top Navigation Finish Product Sample
  @FindBy(xpath = "//header[@class='ant-layout-header']//li[2]")
  public static WebElement topnavfinishproduct;
  // * Top Navigation Finish Product Sample Text
  @FindBy(xpath = "//a[@href='#/finshproductsamples']")
  public static WebElement topnavfinishproducttext;
  // * Plant-Lab Trial Sample Window Heading
  @FindBy(xpath = "//div[@class='ant-typography'][normalize-space()='Plant-Lab Trial Sample']")
  public static WebElement plantlabwindowheadding;
  // * Production Sample Window Heading
  @FindBy(xpath = "//div[@class='ant-typography'][normalize-space()='Production Sample']")
  public static WebElement productionwindowheadding;
  // * Production Sample Left Nevigation
  @FindBy(xpath = "//div[@class='sc-dnqmqq bxMwVY'][normalize-space()='Production Sample']")
  public static WebElement productionsampleLeftNav;
  // * Add Production Sample Add Button Xpath
  @FindBy(xpath = "//div[@class='ant-col ant-col-2']/div/button[@class='ant-btn sc-gZMcBi dMdnOw']")
  public static WebElement addproductionsample;
  // * Add Production Form Heading
  @FindBy(xpath = "//div[@class='sc-VigVT jzVhIp']/p")
  public static WebElement addproductionheading;
  // * Single Radio Button Field
  @FindBy(xpath = "//*[@id='addType']/label[1]")
  public static WebElement singleradiobtn;
  // * Plant Field
  @FindBy(xpath = "//*[@id='plantName']")
  public static WebElement plant;
  // * Finish Product Field
  @FindBy(xpath = "//input[@id='rawMaterialId']")
  public static WebElement finishproduct;
  // * Mix Design Field
  @FindBy(xpath = "//div[@name='mixDesignCode']")
  public static WebElement mixdesign;
  // * Equipment Field
  @FindBy(xpath = "//*[@id='equipmentId']")
  public static WebElement equipment;
  // * Sample Code Field
  @FindBy(xpath = "//*[@id='finishProductCode']")
  public static WebElement samplecode;
  // * Sample Date Field
  @FindBy(xpath = "//*[@id='date']")
  public static WebElement sampledate;
  // * Customer Field
  @FindBy(xpath = "//*[@id='customer']")
  public static WebElement customer;
  // * Project Field
  @FindBy(xpath = "//div[@name='projectId']")
  public static WebElement project;
  // * Work Order Field
  @FindBy(xpath = "//*[@id='workOrderNo']")
  public static WebElement workorder;
  // * Creation Date Field
  @FindBy(xpath = "//*[@id='creationDate']")
  public static WebElement creationdate;
  // * Production Date Field
  @FindBy(xpath = "//*[@id='arrivalDate']")
  public static WebElement productiondate;
  // * Delivery Field
  @FindBy(xpath = "//div[contains(@name,'pourName')]//div[contains(@class,'ant-select-selector')]")
  public static WebElement delivery;
  // * Vehicle No Field
  @FindBy(xpath = "//*[@id='vehicleNo']")
  public static WebElement vehicleno;
  // * Vehicle No Field
  @FindBy(xpath = "//*[@name='sampledTime']")
  public static WebElement sampletime;
  // * Commodity Field
  @FindBy(xpath = "//*[@id='commodity']")
  public static WebElement commodity;
  // * Save Button
  @FindBy(xpath = "//button[contains(@formaction,'test')]")
  public static WebElement save;
  // * Cancel Button
  @FindBy(xpath = "//button[@class='ant-btn']")
  public static WebElement cancelbtn;
  // * Success Message
  @FindBy(xpath = "//div[contains(@class,'ant-notification ant-notification-topRight')]//div")
  public static WebElement successMsg;
  // * First Data Of the Table
  @FindBy(
      xpath = "//body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]")
  public static WebElement firstdata;
  // ============================== TABLE X PATH =======================================
  @FindBy(xpath = "//div[@class='ant-spin-container']")
  public static WebElement Table;
  // ================================== COPY ===========================================
  @FindBy(xpath = "(//span[@aria-label='copy'])")
  public static WebElement copyIcon;
  // ==================================== NEXT BUTTON =================================
  @FindBy(xpath = "//li[@title='Next Page']//button[@type='button']")
  public static WebElement NextButton;
  // ==================================== ADD PROCESS SAMPLE ============================
  @FindBy(xpath = "//button[@class='ant-btn sc-gZMcBi dMdnOw']")
  public static WebElement addProductionSamplecopyPaste;
  // ==================================== CALENDAR SELECT ================================
  @FindBy(xpath = "//input[@id='date']")
  public static WebElement Date;
  // ===================================== SAVE BUTTON ==================================
  @FindBy(xpath = "//button[@formaction='test']")
  public static WebElement SaveButton;
  // ==================================== BODY ===========================================
  @FindBy(xpath = "//input[@id='workOrderNo']")
  public static WebElement ClickPlaceHolderWorkOrdeNo;
  // =================================== TIME FIELD ======================================
  @FindBy(xpath = "//input[@id='creationDate']")
  public static WebElement beforeDateCreationField;
  // =============================== TABLE DATA ============================================
  @FindBy(xpath = "(//td[@class='ant-table-cell'])[11] ")
  public static WebElement aftertableCreationDateField;
  // ============================= STATUS =================================================
  @FindBy(
      xpath = "//body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[16]/span[1]/span[1]")
  public static WebElement StatusBarNew;
  // * Finish Product Validation
  @FindBy(xpath = "//form/div[2]/div[1]/div[1]/div/div[1]/div[2]/div/div[3]")
  public static WebElement finishproductvalidation;
  // * Mix Design Validation
  @FindBy(xpath = "//form/div[2]/div[1]/div[1]/div/div[1]/div[3]/div/div[2]")
  public static WebElement mixdesignvalidation;
  // * Equipment Validation
  @FindBy(xpath = "//form/div[2]/div[1]/div[1]/div/div[2]/div[1]/div/div[2]")
  public static WebElement equipmentvalidation;
  // * Sample Date Validation
  @FindBy(xpath = "//form/div[2]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]")
  public static WebElement sampledatevalidation;
  // * Sample Code Validation
  @FindBy(xpath = "//form/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")
  public static WebElement samplecodevalidation;
  /* Edit Validation */
  // * Production Sample Table Container
  @FindBy(
      xpath = "//*[@id='root']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div[2]")
  public static WebElement productionSampleTable;
  // * Calendar Cancel Icon
  @FindBy(xpath = "(//span[@role='button'])[17]")
  public static WebElement cancelicon;
  // * Sample Date Validation
  @FindBy(xpath = "//form/div[1]/div[1]/div[1]/div/div[2]/div[3]/div/div[2]")
  public static WebElement editsampledatevalidation;
  // * Sample Code Validation
  @FindBy(xpath = "//form/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")
  public static WebElement editsamplecodevalidation;

}
