package com.qa.automation.qdms.sample.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlantLabTrailSamplePage {
  // ADD PLANT LAB TRAIL SAPLE XPATH
  @FindBy(xpath = "//span[normalize-space()='Add Plant-Lab Trial Sample']")
  public static WebElement AddPlantTrailSample;
  // PLANT DROPDOWN TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='plantName']")
  public static WebElement PlantTextbox;
  // FINISHED PRODUCT DROPDOWN TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='rawMaterialId']")
  public static WebElement FinishproductTextbox;
  // MIX DESIGN DROPDOWN TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='finsih_product_mixdesign_code']")
  public static WebElement MixdesignTextbox;
  // EQUIPMENT DROPDOWN TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='equipmentId']")
  public static WebElement EquipmentTextbox;
  // SAMPLEDATE TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='date']")
  public static WebElement SampledateTextbox;
  // SAMPLE FINISHED PRODUCT CODE TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='finishProductCode']")
  public static WebElement SampleproductCodeTextbox;
  // CREATION DATE TEXTBOX XPATH
  @FindBy(xpath = "//input[@id='creationDate']")
  public static WebElement CreationDateTextbox;
  // SAVE BUTTON
  @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/button[2]")
  public static WebElement Savebutton;
  // CANCEL BUTTON
  @FindBy(xpath = "//button[@class='ant-btn']")
  public static WebElement Cancelbutton;
  // FIRST ROW OF TABLE
  @FindBy(
      xpath = "//body[1]/div[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[1]\r\n")
  public static WebElement TableFirstRow;
  // EMPTY VALIDATION DROPDOWN MESSAGE FOR PLANT
  @FindBy(
      xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]")
  public static WebElement Plantvalidationempty;
  // EMPTY VALIDATION DROPDOWN MESSAGE FOR FINISHED PRODUCT
  @FindBy(
      xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]")
  public static WebElement finishproductvalidationempty;
  // EMPTY VALIDATION DROPDOWN MESSAGE FOR MIXED DESIGN
  @FindBy(
      xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]")
  public static WebElement Mixdesignvalidationempty;
  // EMPTY VALIDATION DROPDOWN MESSAGE FOR EQUIPMENT
  @FindBy(
      xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/div[2]/div[1]/div[2]")
  public static WebElement Equipementvalidationempty;
  // EMPTY VALIDATION DROPDOWN MESSAGE FOR START DATE
  @FindBy(
      xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[2]")
  public static WebElement Startdatevalidationempty;
  // SPCIEAL CHARECTER VALIDATION DROPDOWN MESSAGE FOR SAMPLE CODE
  @FindBy(xpath = "//div[normalize-space()='Invalid Characters']")
  public static WebElement Spciealcharacterforsamplecodevalidationempty;
  // PLANT COLUMN ROW ONE BY ONE
  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[1]")
  public static List<WebElement> column;
  // SEARCH ICON FOR PLANT FIELD IN LAB TRAIL
  @FindBy(
      xpath = "//th[@class='ant-table-cell ant-table-cell-fix-left ant-table-cell-fix-left-last']//span[@aria-label='search']")
  public static WebElement Plantfieldsearchicon;
  // SEARCH TEXTBOX FOR PLANT FIELD IN LAB TRAIL
  @FindBy(xpath = "//input[@placeholder=' Plant']")
  public static WebElement Plantfieldsearchtextbox;
  // SEARCH BUTTON FOR PLANT FIELD IN LAB TRAIL
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
  public static WebElement PlantfieldsearchButton;
  // SEARCH BUTTON FOR PLANT FIELD IN LAB TRAIL
  @FindBy(xpath = "//button[@class='ant-btn ant-btn-sm']\r\n")
  public static WebElement ResetbuttonPlantfieldsearch;
  // TABLE DATA COUNT CONTAINER
  @FindBy(
      xpath = "//*[@id=\'root\']/div/section/section/main/div/div/div[2]/div/div[1]/div/div/div/div[2]")
  public static WebElement tableContainer;
  // 1ST PAGE IN TABLE PAGINATION
  @FindBy(xpath = "//a[normalize-space()='1']")
  public static WebElement FirstPage;
  // FINISHED PRODUCT COLUMN ROW ONE BY ONE
  @FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr/td[2]")
  public static List<WebElement> columnFP;
  @FindBy(xpath = "//*[@id=\"plantName\"]")
  public static WebElement plantForCheckDisabled;
  @FindBy(
      xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]/div/span[2]")
  public static WebElement plantTextBox;
  @FindBy(xpath = "//*[@id=\"rawMaterialId\"]")
  public static WebElement finishProductForCheckDisabled;
  @FindBy(
      xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div/span[2]")
  public static WebElement finishProductTextBox;
  @FindBy(xpath = "//*[@id=\"finsih_product_mixdesign_code\"]")
  public static WebElement mixedDesignForCheckDisabled;
  @FindBy(
      xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[2]/div[1]/div/div[1]/div/span[2]")
  public static WebElement mixedDesignTextBox;
  @FindBy(xpath = "//*[@id=\"finishProductCode\"]")
  public static WebElement sampleCode;
  @FindBy(
      xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div[1]/div/span[2]/span")
  public static WebElement SampleDateClearButton;
  @FindBy(xpath = "(//button[@type='button'])[5]")
  public static WebElement UpdateButton;
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[2]/div/div[1]")
  public static WebElement sampleCodeValidation;
  @FindBy(xpath = "//button[@class='ant-btn']")
  public static WebElement cancelButtonForEditValidation;
  @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/form/div[3]/div[1]/div/div[2]")
  public static WebElement validationForSampleDate;
  @FindBy(xpath = "//div[@class='ant-modal-content']")
  public static WebElement keyTestModal;
  @FindBy(xpath = "//*[@id=\"rcDialogTitle0\"]")
  public static WebElement KeyTestModalHeading;
  @FindBy(
      xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/label/span")
  public static WebElement keyTestCheckBox;
  @FindBy(xpath = "//div[@class='ant-modal-footer']//button[2]")
  public static WebElement keyTestSaveButton;
  @FindBy(xpath = "//body//div//div[@class='ant-modal-footer']//div//button[1]")
  public static WebElement keyTestCancelButton;
  @FindBy(
      xpath = "//div[@class='ant-table ant-table-small ant-table-fixed-header ant-table-scroll-horizontal']//div[@class='ant-table-container']")
  public static WebElement keyTestTableTitleContainer;
  @FindBy(
      xpath = "//div[@class='ant-table ant-table-small ant-table-fixed-header ant-table-scroll-horizontal']//div[@class='ant-table-body']//table")
  public static WebElement keyTestTableContent;
  // Plant Lab Trial Sample "Previous" Button
  @FindBy(xpath = "//li[@class='ant-pagination-prev']//span[@aria-label='left']//*[name()='svg']")
  public static WebElement PreviousPageBtn;
  // Plant Lab Trial Sample "Next" Button
  @FindBy(xpath = "//li[@class='ant-pagination-next']//span[@aria-label='right']//*[name()='svg']")
  public static WebElement NextPageBtn;
  // Plant Lab Trial Sample "Pagination Second" Button
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/ul/li[4]")
  public static WebElement PaginationSecoundPage;
  // Plant Lab Trial Sample "Default Page" Button
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/ul/li[3]")
  public static WebElement PaginationFirstPage;
  // Plant Lab Trial Sample "Page" Button
  public static String PageBefore =
      "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/ul/li[11]/div/div[2]/div/div/div/div[2]/div/div/div/div[";
  public static String PageAfter = "]/div";
  // Plant Lab Trial Sample "Drop down" Button
  @FindBy(
      xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div[1]/div/div/ul/li[11]/div/div[1]")
  public static WebElement Paginationdropdown;
}
