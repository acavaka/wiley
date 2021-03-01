package web;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class firstTest {

    @Before
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://www.wiley.com/en-ru");
    }

    @Test
    public void testWhoWeServeDropdown() {

        $(By.cssSelector(".navigation-menu-items > li:nth-child(1) > a")).shouldHave(text("WHO WE SERVE")).click();
        $("ul.ps-container:nth-child(3)").shouldBe(visible);
        $$("ul.ps-container:nth-child(3) li.dropdown-item").shouldHave(
                texts(
                        "Students",
                        "Instructors",
                        "Book Authors",
                        "Professionals",
                        "Researchers",
                        "Institutions",
                        "Librarians",
                        "Corporations",
                        "Societies",
                        "Journal Editors",
                        "Bookstores",
                        "Government")
        );
    }
}
