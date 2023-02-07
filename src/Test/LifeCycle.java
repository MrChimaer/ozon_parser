import com.codeborne.selenide.*;

import common.Authorization;
import common.Wrapper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class LifeCycle extends Wrapper{

    @Test
    public void test(){

        Authorization.login();
        click("Каталог");
        click("Смартфоны");
        ElementsCollection phones = $$x("//div[@class='j9x xj9']").first(10);
        System.out.println(phones);
        phones.get(1)
    }


    @Test
    public void test2(){
        Authorization.login();
        SelenideElement by = $$x("//*").findBy(Condition.interactable);

        System.out.println(by);
    }
}
