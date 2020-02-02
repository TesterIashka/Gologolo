package fromTests;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OpenBankRates {

    public SelenideElement openLink = $("div.g a[href*='https://www.open.ru/']");
    public void openFirstPage (String link){
        open(link);
    }
}
