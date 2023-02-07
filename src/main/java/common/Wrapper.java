package common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;


import java.util.*;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class Wrapper {


    public static void click(String buttonLabel) {
//        ElementsCollection elements = $$x("//*").filterBy(Condition.interactable);
//        for (SelenideElement element : elements) {
//            if (element.getText().contains(buttonLabel) && element.is(Condition.interactable)) {
//                element.click();
        if ($x("//a[contains(text(),'"+buttonLabel+"')]").is(Condition.interactable)){
            $x("//a[contains(text(),'"+buttonLabel+"')]").click();}
        else if($x("//button//*[contains(text(),'"+buttonLabel+"')]").is(Condition.interactable)){
            $x("//button//*[contains(text(),'"+buttonLabel+"')]").click();}
        else if ($x("//a/span[contains(text(),'"+buttonLabel+"')]").is(Condition.interactable)){
        $x("//a/span[contains(text(),'"+buttonLabel+"')]").click();}
            }
        }
//    }
//}




