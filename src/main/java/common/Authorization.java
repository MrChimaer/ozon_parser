package common;

import static com.codeborne.selenide.Selenide.open;

public class Authorization {
    public static void login(){
        open("https://www.ozon.ru/my/main");
    }
}
