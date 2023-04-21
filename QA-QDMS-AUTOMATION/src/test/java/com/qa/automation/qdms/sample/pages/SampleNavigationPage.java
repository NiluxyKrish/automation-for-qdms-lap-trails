package com.qa.automation.qdms.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.automation.qdms.base.DriverIntialization;

public class SampleNavigationPage extends DriverIntialization {

  public static WebElement sampleXpath() {
    return driver.findElement(By.xpath("//a[@class='sc-bdVaJa ieeiNp'][@href='#/samples']"));
  }

  public static WebElement rawMaterialMainXpath() {
    return driver.findElement(By.xpath("//a[@href=\'#/samples\']"));
  }

  public static WebElement finishProductMainXpath() {
    return driver.findElement(By.xpath("//a[@href=\'#/finshproductsamples\']"));
  }

  public static WebElement incommingSampleXpath() {
    return driver.findElement(By.xpath("//div[@class='sc-htoDjs jApeNY']/div[1]/div[1]"));
  }

  public static WebElement inprocessSampleXpath() {
    return driver.findElement(By.xpath("//div[@class='sc-htoDjs jApeNY']/div[2]/div[1]"));
  }

  public static WebElement labTrialSampleXpath() {
    return driver.findElement(By.xpath("//div[@class='sc-htoDjs jApeNY']/div[1]/div[1]"));
  }

  public static WebElement productionSampleXpath() {
    return driver.findElement(By.xpath("//div[@class='sc-htoDjs jApeNY']/div[2]/div[1]"));
  }
}
