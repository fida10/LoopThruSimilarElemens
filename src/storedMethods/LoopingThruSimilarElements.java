package storedMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LoopingThruSimilarElements {
	public static void loopSimilarElements(WebDriver dr, String commonXpath){
		List<WebElement> elements = dr.findElements(By.xpath(commonXpath));

		for(int i = 0; i < elements.size(); i++){
			elements.get(i); // we can manipulate this in any way we want, i.e. we make a string and store it, we could get text, we could click on it, etc.
			if((i+1) == elements.size()){
				System.out.println("Loop complete");//replace with whatever text you want the loop to output once its done.
				break;
			}
		}
	}
}
