package com.qa.automation.qdms.sample.commonmethods;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qa.automation.qdms.base.DriverIntialization;
import com.qa.automation.qdms.commonmethods.PropertiesCommonMethods;

public class ActionCommonMethod extends DriverIntialization {
  public static String enable = "";
  public static int countOfData = 0;

  /**
   * 
   * @param Wookbook :-ExcelBook
   * @param tab :-Excel Sheet Name
   * @param uniqueID :-Test Id
   * @param addButton :-Add Button WebElement
   * @param textBox :-Text Boo
   * @param validationText
   * @param button
   */
  public static void addValidation(String Wookbook, String tab, String uniqueID,
      WebElement addButton, WebElement textBox, WebElement validationText, WebElement button) {
    DataFormatter dataValue = new DataFormatter();
    XSSFWorkbook wbook = null;
    XSSFRow row = null;
    XSSFCell cell = null;

    try {
      String filelocation = "./src/test/resources/Excel/" + Wookbook;
      FileInputStream fileIn = new FileInputStream(filelocation);
      wbook = (XSSFWorkbook) WorkbookFactory.create(fileIn);
      fileIn.close();
    } catch (Exception e) {
    }
    PropertiesCommonMethods.excalRowCount(Wookbook, tab, uniqueID);
    XSSFSheet sheet = wbook.getSheet(tab);
    int r = PropertiesCommonMethods.countRow - 1;
    int stop = sheet.getLastRowNum() + 2;
    for (int i = r; i < stop; i++) {

      row = sheet.getRow(i);
      cell = row.getCell(3);
      String type = dataValue.formatCellValue(cell);

      if (type == "") {
        break;
      }
      row = sheet.getRow(i);
      cell = row.getCell(4);
      String validation1 = dataValue.formatCellValue(cell);
      row = sheet.getRow(i);
      cell = row.getCell(5);
      String expated1 = dataValue.formatCellValue(cell);
      addButton.click();
      try {
        Thread.sleep(800);
      } catch (InterruptedException e2) {
      }

      textBox.click();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      textBox.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      textBox.sendKeys(validation1);
      try {
        Thread.sleep(800);
      } catch (InterruptedException e) {

      }
      String textErrMe = null;
      try {
        textErrMe = validationText.getText();

        if (textErrMe == "") {
          button.click();
          try {
            Thread.sleep(800);
          } catch (InterruptedException e) {
          }
          textErrMe = validationText.getText();

        }
      } catch (Exception e1) {
        button.click();
        try {
          Thread.sleep(800);
          textErrMe = validationText.getText();
        } catch (InterruptedException e) {
        }

      }


      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
      }

      try {
        textErrMe = validationText.getText();
      } catch (Exception e) {
        break;
      }
      button.click();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      Boolean modal = null;
      try {
        modal = driver.findElement(By.className("ant-modal-content")).isDisplayed();
      } catch (Exception e) {
        modal = false;
      }
      PropertiesCommonMethods.cTestReports(type, expated1 + ",Modal Is Displayed-" + true,
          textErrMe + ",Modal Is Displayed-" + modal, "Edit Validation");
      driver.navigate().refresh();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }

  }

  /**
   * 
   * @param Wookbook :-Exceal Name
   * @param tab :-Exceal Tab
   * @param uniqueID :-Test Case Id
   * @param textBox :-TExt Box Finder
   * @param column :-Search Column
   * @param clickcolumn :-Edit Icon Column
   * @param table :-Table finder
   * @param validationText :-Error Message Finder
   * @param button :-Save / Update Button
   */
  public static void editValidation(String Wookbook, String tab, String uniqueID, int column,
      int clickcolumn, WebElement table, WebElement textBox, WebElement validationText,
      WebElement button) {

    DataFormatter dataValue = new DataFormatter();
    XSSFWorkbook wbook = null;
    XSSFRow row = null;
    XSSFCell cell = null;

    try {
      String filelocation = "./src/test/resources/Excel/" + Wookbook;
      FileInputStream fileIn = new FileInputStream(filelocation);
      wbook = (XSSFWorkbook) WorkbookFactory.create(fileIn);
      fileIn.close();
    } catch (Exception e) {
    }
    PropertiesCommonMethods.excalRowCount(Wookbook, tab, uniqueID);
    XSSFSheet sheet = wbook.getSheet(tab);
    int r = PropertiesCommonMethods.countRow - 1;
    int stop = sheet.getLastRowNum() + 2;
    for (int i = r; i < stop; i++) {

      row = sheet.getRow(i);
      cell = row.getCell(3);
      String type = dataValue.formatCellValue(cell);

      if (type == "") {
        break;
      }
      row = sheet.getRow(i);
      cell = row.getCell(4);
      String validation1 = dataValue.formatCellValue(cell);
      row = sheet.getRow(i);
      cell = row.getCell(5);
      String expated1 = dataValue.formatCellValue(cell);
      ActionCommonMethod.editValiAction(column, clickcolumn, table, "edit", Wookbook, tab, uniqueID,
          2);
      textBox.click();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      textBox.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      textBox.sendKeys(validation1);
      try {
        Thread.sleep(800);
      } catch (InterruptedException e) {

      }
      String textErrMe = null;
      try {
        textErrMe = validationText.getText();

        if (textErrMe == "") {
          button.click();
          try {
            Thread.sleep(800);
          } catch (InterruptedException e) {
          }
          textErrMe = validationText.getText();

        }
      } catch (Exception e1) {
        button.click();
        try {
          Thread.sleep(800);
          textErrMe = validationText.getText();
        } catch (InterruptedException e) {
        }

      }


      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
      }

      try {
        textErrMe = validationText.getText();
      } catch (Exception e) {
        break;
      }
      button.click();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
      Boolean modal = null;
      try {
        modal = driver.findElement(By.className("ant-modal-content")).isDisplayed();
      } catch (Exception e) {
        modal = false;
      }
      PropertiesCommonMethods.cTestReports(type, expated1 + ",Modal Is Displayed-" + true,
          textErrMe + ",Modal Is Displayed-" + modal, "Edit Validation");
      driver.navigate().refresh();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }

  }

  public static String visbleEnable(WebElement Element, String discription) {
    Object x = "false";

    try {
      x = Element.getLocation().x;
      x = "true";
      PropertiesCommonMethods.TestReportsq(discription + "-Identify Successfully ✅", "", "",
          discription);
    } catch (Exception e) {
      x = "false";
      PropertiesCommonMethods.TestReportsq(discription + "-Not Identified ⚠️", "true", x,
          discription);

    }
    if (x == "true") {
      Object dis = Element.isDisplayed();
      String dis1 = dis.toString();
      PropertiesCommonMethods.cTestReports("1.Visibility Of " + discription, "true", dis,
          discription);

      if (dis1.equals("true")) {
        Object ene = Element.isEnabled();
        enable = ene.toString();
        PropertiesCommonMethods.cTestReports("2.Enablety Of " + discription, "true", ene,
            discription);
      }
    }
    return enable;
  }

  /**
   * @author Quenthan
   * @param column :-Web Table Search Data Column
   * @param clickColumn :-Web Table Target Poin Column(edit / delete/ view /discription)
   * @param table :-Table Locator
   * @param action :-"edit"/"delete"/"Description"/"Add Key Test"
   * @param r :-Search data Row
   * @param c :-Search data Column
   */
  public static void actionS(int column, int clickColumn, WebElement table, String action,
      String wookBook, String tab, String uniqueId, int c) {

    XSSFRow row = null;
    XSSFCell cell = null;
    DataFormatter dataValue = new DataFormatter();
    FileInputStream fileIn = null;
    String filelocation = null;
    XSSFWorkbook wbook = null;
    Boolean not = false;
    try {
      filelocation = "./src/test/resources/Excel/" + wookBook;

      fileIn = new FileInputStream(filelocation);
      wbook = (XSSFWorkbook) WorkbookFactory.create(fileIn);

    } catch (Exception e) {
      // TODO: handle exception
    }

    XSSFSheet sheet = wbook.getSheet(tab);
    PropertiesCommonMethods.excalRowCount(wookBook, tab, uniqueId);
    int r = PropertiesCommonMethods.countRow - 1;

    row = sheet.getRow(r);
    cell = row.getCell(c);
    String iV = dataValue.formatCellValue(cell);
    // System.out.println(iV);

    int i = 0;
    String value = null;
    String value2 = null;
    if (action == "delete") {
      value = ".anticon-delete";
      value2 = ".ant-popover-content";
    } else if (action == "edit") {
      value = ".anticon-edit";
      value2 = ".ant-modal-content";

    } else if (action == "copy") {
      value = ".anticon-copy";
      value2 = ".anticon-check-circle";

    }

    else if (action == "Description") {
      value = ".anticon-container";
      value2 = ".ant-modal-content";

    } else if (action == "Add Key Test") {
      value = ".anticon-funnel-plot";
      value2 = ".ant-modal-content";
    } else if (action == "Key test") {
      value = ".anticon-key";
      value2 = ".ant-modal-content";
    }

    boolean rept = true;
    List<WebElement> allrows = null;
    int num;

    while (rept == true) {
      allrows = table.findElements(By.cssSelector("tbody tr"));
      num = allrows.size();
      for (i = 0; i < num; i++) {

        List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
        String name = rows.get(column).getText();
        try {
          Thread.sleep(500);
        } catch (InterruptedException e1) {
        }
        rept = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
            .isEnabled();
        // System.out.println(rept);
        if (name.equals(iV)) {
          WebElement input = rows.get(clickColumn).findElement(By.cssSelector(value));
          Boolean dis = input.isDisplayed();
          PropertiesCommonMethods.cTestReports("1." + action.toUpperCase() + "-ICON DISPLAYED",
              "true", dis, action + "-Icon");

          if (dis == true) {
            Boolean ena = input.isEnabled();
            PropertiesCommonMethods.cTestReports("2." + action.toUpperCase() + "-ICON ENABLE",
                "true", ena, action + "-Icon");
            if (ena == true) {
              input.click();
              try {
                Thread.sleep(3000);
              } catch (InterruptedException e) {

              }
              Boolean popup = driver.findElement(By.cssSelector(value2)).isDisplayed();
              PropertiesCommonMethods.cTestReports("3." + action.toUpperCase()
                  + "-POP UP IS DISPLAYED, " + action + "-ICON IS CLICKED", "true", popup,
                  action + "-Icon");
              rept = false;
              not = true;
              break;
            }
          }

        }

      }
      if (rept == true) {
        driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

      }

      else if (rept == false & not == false) {
        extent.createTest("SEARCHING DATA NOT FIND IN TABLE");

      }
    }
  }


  /**
   * @author Quenthan
   * @category Get Cout Table Data
   * @param table:-wenElement
   * @return
   */
  public static int countDataTable(WebElement table) {
    int num = 0;
    int counte = 0;
    boolean nextPage = true;
    List<WebElement> allrows = null;

    while (nextPage == true) {
      {
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e1) {
          // TODO Auto-generated catch block
          // e1.printStackTrace();
        }
        allrows = table.findElements(By.cssSelector("tbody tr"));
        num = allrows.size() - 1;
        counte = counte + num;
        nextPage = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
            .isEnabled();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
        }

        if (nextPage == true) {
          driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
          try {
            Thread.sleep(3000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
          }
        } else {
          break;

        }
      }
    }
    countOfData = counte;
    return countOfData;
  }

  public static void editValiAction(int column, int clickColumn, WebElement table, String action,
      String wookBook, String tab, String uniqueId, int c) {


    XSSFRow row = null;
    XSSFCell cell = null;
    DataFormatter dataValue = new DataFormatter();
    FileInputStream fileIn = null;
    String filelocation = null;
    XSSFWorkbook wbook = null;
    Boolean not = false;
    try {
      filelocation = "./src/test/resources/Excel/" + wookBook;

      fileIn = new FileInputStream(filelocation);
      wbook = (XSSFWorkbook) WorkbookFactory.create(fileIn);

    } catch (Exception e) {
      // TODO: handle exception
    }

    XSSFSheet sheet = wbook.getSheet(tab);
    PropertiesCommonMethods.excalRowCount(wookBook, tab, uniqueId);
    int r = PropertiesCommonMethods.countRow - 1;

    row = sheet.getRow(r);
    cell = row.getCell(c);
    String iV = dataValue.formatCellValue(cell);
    // System.out.println(iV);

    int i = 0;
    String value = null;
    String value2 = null;
    if (action == "delete") {
      value = ".anticon-delete";
      value2 = ".ant-popover-content";
    } else if (action == "edit") {
      value = ".anticon-edit";
      value2 = ".ant-modal-content";

    } else if (action == "copy") {
      value = ".anticon-copy";
      value2 = ".anticon-check-circle";

    }

    else if (action == "Description") {
      value = ".anticon-container";
      value2 = ".ant-modal-content";

    } else if (action == "Add Key Test") {
      value = ".anticon-funnel-plot";
      value2 = ".ant-modal-content";

    }

    boolean rept = true;
    List<WebElement> allrows = null;
    int num;

    while (rept == true) {
      allrows = table.findElements(By.cssSelector("tbody tr"));
      num = allrows.size();
      for (i = 0; i < num; i++) {

        List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
        String name = rows.get(column).getText();
        try {
          Thread.sleep(500);
        } catch (InterruptedException e1) {
        }
        rept = driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']"))
            .isEnabled();
        // System.out.println(rept);
        if (name.equals(iV)) {
          WebElement input = rows.get(clickColumn).findElement(By.cssSelector(value));
          Boolean dis = input.isDisplayed();
          PropertiesCommonMethods.cTestReports("EDIT ICON DISPLAYED", "true", dis,
              action + "Edit Icon");

          if (dis == true) {
            Boolean ena = input.isEnabled();
            PropertiesCommonMethods.cTestReports("EDIT ICON ENABLE", "true", ena,
                action + "Edit Icon");
            if (ena == true) {
              input.click();
              try {
                Thread.sleep(3000);
              } catch (InterruptedException e) {

              }
              Boolean popup = driver.findElement(By.cssSelector(value2)).isDisplayed();
              PropertiesCommonMethods.cTestReports("EDIT ICON IS CLICKED", "true", popup,
                  action + "Edit");
              rept = false;
              not = true;
              break;
            }
          }

        }

      }
      if (rept == true) {
        driver.findElement(By.xpath("//li[@title='Next Page']//button[@type='button']")).click();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

      }

      else if (rept == false & not == false) {
        extent.createTest("SEARCHING DATA NOT FIND IN TABLE");

      }
    }


  }
}
