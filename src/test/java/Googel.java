

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import fromTests.OpenBankRates;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;

public class Googel {
    @Test

    public void FirstStep() {

        OpenBankRates openPageBank = new OpenBankRates();
        openPageBank.openFirstPage("http://www.google.com");

        $(By.name("q")).setValue("��������");
        $(By.name("btnK")).click();
        int i = 2; //����������� ����� ��������
        String b = "";
        while (!openPageBank.openLink.exists())
        {
            i = i+1;
            String a = "td [aria-label='Page "+i+"']";
            if ($(a).exists()) {
                $(a).click();
            }
            else
            {
                b = "����������� ������� �� ������";
                break;
            }
        }

        if (b.equals("����������� ������� �� ������"))
        {
            System.out.print(b);
        }
        else
        {
            $(openPageBank.openLink).click();
        }
        Zapros();

        if ($(By.linkText("���� ������ � ��������-�����")).exists())
        {
            $("div span[class*='exchange__rate']").innerText();
        }
    }

    static void Zapros()
    {
        String cookies = "div[class*=close-button]";
        if ($(cookies).exists())
        {
            $(cookies).click();
        }
    }

}
