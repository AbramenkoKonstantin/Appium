import lib.CoreTestCase;
import lib.ui.MainPageObject;
import lib.ui.SearchPageObject;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestSearch extends CoreTestCase {

    private MainPageObject MainPageObject;

    protected void setUp() throws Exception{
        super.setUp();
        MainPageObject = new MainPageObject(driver);
    }

    protected void tearDown(){
        driver.quit();
        super.tearDown();
    }


    @Test
    public void testSearch(){
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Хоббит, или Туда и обратно");
        SearchPageObject.clickAndHold("text", "Повесть английского писателя Джона Р. Р. Толкина");
        SearchPageObject.click("text", "Добавить в список для чтения");
        SearchPageObject.click("resource-id","org.wikipedia:id/onboarding_button");
        SearchPageObject.clearText("org.wikipedia:id/text_input");
        SearchPageObject.sendKeys("org.wikipedia:id/text_input", "Хоббит");
        SearchPageObject.click("resource-id", "android:id/button1");
        SearchPageObject.click("class", "android.widget.ImageButton");
        //SearchPageObject.click("resource-id", "org.wikipedia:id/search_close_btn");
        //SearchPageObject.click("resource-id", "org.wikipedia:id/search_close_btn");
        SearchPageObject.click("resource-id", "org.wikipedia:id/snackbar_action");
        SearchPageObject.click("resource-id", "org.wikipedia:id/item_overflow_menu");
        SearchPageObject.click("text", "Удалить список");
    }


}
