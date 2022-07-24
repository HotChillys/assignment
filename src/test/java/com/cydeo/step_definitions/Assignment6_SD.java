package com.cydeo.step_definitions;

import com.cydeo.page.Home_Page;
import com.cydeo.page.Login_Page;
import com.cydeo.page.Vehicles_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Assignment6_SD {

    Login_Page loginPage = new Login_Page();
    Home_Page homePage = new Home_Page();
    Vehicles_Page vehiclesPage = new Vehicles_Page();

    @Given("User is on vytrack login page")
    public void user_is_on_vytrack_login_page() {
        String url = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(url);
    }
    @When("User enters username {string}")
    public void user_enters_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }
    @When("User enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }
    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.loginBtn.click();
        Util.waitFor(3);
    }
    @And("User hover over to Fleet module and click on Vehicles")
    public void userHoverOverToFleetModuleAndClickOnVehicles() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.fleet).pause(2000).perform();
        homePage.vehicles.click();
        Util.waitFor(2);
    }
//***********************************************************************
    @Then("User should be able to click Export Grid dropdown")
    public void user_should_be_able_to_click_export_grid_dropdown() {
        Assert.assertTrue(Util.isClickable(vehiclesPage.exportGridBtn));
    }

    @Then("Export Grid dropdown is on the left of the page")
    public void export_grid_dropdown_is_on_the_left_of_the_page() {
        int gridX = vehiclesPage.exportGridBtn.getLocation().getX();
        int pageX = vehiclesPage.page.getLocation().getX();
        Assert.assertTrue(gridX < pageX);
    }

    @Then("User should be able to refresh button")
    public void user_should_be_able_to_refresh_button() {
        Assert.assertTrue(Util.isClickable(vehiclesPage.refreshBtn));
    }

    @Then("User should be able click reset button")
    public void user_should_be_able_click_reset_button() {
        Assert.assertTrue(Util.isClickable(vehiclesPage.resetBtn));
    }

    @Then("User should be able to click Grid Settings button")
    public void user_should_be_able_to_click_grid_settings_button() {
        Assert.assertTrue(Util.isClickable(vehiclesPage.gridSettingBtn));
    }

    @Then("Refresh button should be on the left side of Reset button")
    public void refresh_button_should_be_on_the_left_side_of_reset_button() {
        int refreshX = vehiclesPage.refreshBtn.getLocation().getX();
        int resetX = vehiclesPage.resetBtn.getLocation().getX();
        Assert.assertTrue(refreshX < resetX);
    }

    @Then("Grid Settings should be on the right side of the Reset button")
    public void grid_settings_should_be_on_the_right_side_of_the_reset_button() {
        int gridSettingX = vehiclesPage.gridSettingBtn.getLocation().getX();
        int resetX = vehiclesPage.resetBtn.getLocation().getX();
        Assert.assertTrue(gridSettingX > resetX);
    }

    @Then("Grid Setting button is on the right of the page")
    public void grid_setting_button_is_on_the_right_of_the_page() {
        int gridSettingX = vehiclesPage.gridSettingBtn.getLocation().getX();
        int pageX = vehiclesPage.page.getLocation().getX();
        Assert.assertTrue(gridSettingX > pageX);
    }


}
