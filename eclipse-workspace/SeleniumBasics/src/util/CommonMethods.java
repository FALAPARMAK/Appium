package util;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
public static void selectValueFromDropDown(WebElement element,String text) {
	Select select=new Select(element);
	List<WebElement>obtions=select.getOptions();
	
	for(WebElement op:obtions) {
		String optionText=op.getText();
		if (optionText.equals(text)) {
            select.selectByVisibleText(text);
            break;
        }else {
            System.out.println("Option with text" +text+" is not available");
        }
    }
}

public static void selectValueFromDD(WebElement element, int index) {
    Select select = new Select(element);
    List<WebElement> options = select.getOptions();
    if (options.size() > index) {
        select.selectByIndex(index);
    }else {
        System.out.println("Invalid index has been passed");
	}
}
	
}
