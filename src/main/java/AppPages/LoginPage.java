package AppPages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='logo-w']/a/img")
    public WebElement togglethemeLink;

    @FindBy(className = "auth-header")
    public WebElement pageHeading;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "log-in")
    public WebElement loginBtn;

    @FindBy(xpath = "//div/label/input[@class='form-check-input']")
    public WebElement remembermeChkbox;

    @FindBy(xpath = "//form//a[1]/img")
    public WebElement twitterlinkImg;

    @FindBy(xpath = "//form//a[2]/img")
    public WebElement fblinkImg;

    @FindBy(xpath = "//form//a[3]/img")
    public WebElement linkedinlinkImg;

    @FindBy(xpath = "//form/div[1]/div")
    public WebElement usernameImg;

    @FindBy(xpath = "//form/div[2]/div")
    public WebElement pwdImg;

    @FindBy(xpath = "//label[contains(text(),'Username')]")
    public WebElement usernameLbl;

    @FindBy(xpath = "//label[contains(text(),'Password')]")
    public WebElement pwdLbl;

    @FindBy(xpath = "//label[contains(text(),'Remember Me')]")
    public WebElement remembermeLbl;

    @FindBy(xpath = "//div[@class = 'alert alert-warning']")
    public WebElement errorMsg;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String loginForm(String username, String password) throws NoSuchElementException {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        try {
            if (errorMsg.isDisplayed()) {
                String message = errorMsg.getText();
                return message;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    public boolean verifyPageHeading() {
        try {
            if (pageHeading.getText().equals("Login Form")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyToggleLink() {
        try {
            if (togglethemeLink.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyUsernameInput() {
        try {
            if (usernameInput.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyUsernameImage() {
        try {
            if (usernameImg.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyUsernameLbl() {
        try {
            if (usernameLbl.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyPasswordInput() {
        try {
            if (passwordInput.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyPasswordImg() {
        try {
            if (pwdImg.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyPasswordLbl() {
        try {
            if (pwdLbl.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyLoginBtn() {
        try {
            if (loginBtn.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyRmbrMeCheckbox() {
        try {
            if (remembermeChkbox.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyRmbrMeLbl() {
        try {
            if (remembermeLbl.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyTwitterLinkImg() {
        try {
            if (twitterlinkImg.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyFbLinkImg() {
        try {
            if (fblinkImg.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean verifyLinkedinLinkImg() {
        try {
            if (linkedinlinkImg.isEnabled()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}



