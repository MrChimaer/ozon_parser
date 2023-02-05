package common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebElement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class Wrapper {
    static List<WebElement> elements = new ArrayList<>($$x(""));

    public Wrapper(){

    }
    public static void click(String buttonLabel){
    for (WebElement element: elements){
        if ($x("//a[contains(text(),'"+buttonLabel+"')]").is(Condition.interactable)){
            $x("//a[contains(text(),'"+buttonLabel+"')]").click();}
        else if($x("//button//*[contains(text(),'"+buttonLabel+"')]").is(Condition.interactable)){
            $x("//button//*[contains(text(),'"+buttonLabel+"')]").click();}
        else if ($x("//a/span[contains(text(),'"+buttonLabel+"')]").is(Condition.interactable)){
        $x("//a/span[contains(text(),'"+buttonLabel+"')]").click();}
    break;
    }


    }
}
