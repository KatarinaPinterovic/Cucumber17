package Pages;


import Steps.StepDefinition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends StepDefinition {
    public ProfilePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".button.secondary.radius")
    public WebElement logoutButton;

    public void clickOnLogOutButton(){
        logoutButton.click();
    }





    }


