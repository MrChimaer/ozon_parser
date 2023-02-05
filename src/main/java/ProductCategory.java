import common.Authorization;
import static com.codeborne.selenide.Selenide.*;
import static common.GetProperty.getBy;

public class ProductCategory {
    public void open(){
        Authorization.login();
        $x(getBy("catalog_button")).click();
        $x(getBy("f"));
    }
}
