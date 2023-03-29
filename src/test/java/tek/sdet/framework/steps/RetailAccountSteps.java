package tek.sdet.framework.steps;



import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.DataGeneratorUtility;
import tek.sdet.framework.utilities.commonUtility;


public class RetailAccountSteps extends commonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}

	
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	@When("User click on  Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on Add address option");
	}
	@When("User fill new address form with below information")
	public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().country,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("user filled the new address form with information provided in data table");
	}
	
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked on Add your Address button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
		

	}
}