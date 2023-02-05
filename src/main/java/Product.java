import common.Authorization;

import static com.codeborne.selenide.Selenide.*;
import static common.GetProperty.getBy;

public class Product {
    public String price;
    public String name;

    public void moveToBasket(){
        $x(getBy("to_basket")).click();

    };
}
