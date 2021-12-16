package net.comcast.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultsPage {

    WebDriver driver;

    public  GoogleSearchResultsPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "result-stats")
    public WebElement resultsCount;


    public int getResultsCount(){

        String [] resultArr = resultsCount.getText().split(" ");
       String  result = resultArr[1].replace(",","");

  return Integer.parseInt(resultArr[1].replace(",",""));


    }

}
