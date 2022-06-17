package testing;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends BaseTest{


        @Test (priority = 1)
        public void verifyThatCardsAreVisibleOnHomePage(){
            Assert.assertTrue(getHomePage().isCardsVisibleOnHomePage());
        }

        @Test(priority = 2)
        public void verifyThatAllElementsInElementsSectionAreVisible(){
            getHomeElements().selectElementsCard();
            getHomeElements().clickOnElementsCard();
            Assert.assertTrue(getHomeElements().allElementsDisplayed());
        }

        @Test (priority = 3)
        public void verifyThatUserFormAreVisibleInTextBoxSection(){
            getTextBox().elementsUrl();
            getTextBox().chooseTextBoxElement();
            Assert.assertTrue(getTextBox().isUserFormVisible());
        }

        @Test (priority = 4)
        public void verifyThatUserFormInTextBoxElementCanBeFilled(){
            getTextBox().elementsUrl();
            getTextBox().chooseTextBoxElement();
            getTextBox().waiterForElementToBeClickable(getTextBox().getSubmitButton());
            getTextBox().addInformation("Petar Petrovic", "petarpetrovic@gmail.com", "Bulevar Oslobodjenja bb", "Bulevar Oslobodjenja bb");
            getTextBox().jsExecutorScroll();
            getTextBox().clickSubmit();
            Assert.assertTrue(getTextBox().boxWithAllInformationDisplayed());
        }

        @Test (priority = 5)
        public void verifyThatMainCheckBoxCanBeSelectedAndCheckIsAllBoxesAreSelected(){
            getCheckBox().waiterForElementToBeClickable(getCheckBox().getChooseCheckBoxField());
            getCheckBox().clickOnTheCheckBox();
            getCheckBox().clickHomeCheckBox();
            getCheckBox().clickExpandButton();
            Assert.assertTrue(getCheckBox().resultMessage());
        }

        @Test (priority = 6)
        public void verifyThatClickOnYesButtonIsPossible(){
            getRadioButton().clickRadioButtonField();
            getRadioButton().selectYesRadio();
            Assert.assertEquals(getRadioButton().radioButtonMessage(), "You have selected Yes");
            Assert.assertFalse(getRadioButton().isImpressiveButtonSelected());
        }

        @Test (priority = 7)
        public void verifyThatClickOnImpressiveButtonIsPossible(){
            getRadioButton().selectImpressiveRadio();
            Assert.assertEquals(getRadioButton().radioButtonMessage(), "You have selected Impressive");
            Assert.assertFalse(getRadioButton().isYesButtonSelected());
        }

        @Test(priority = 8)
        public void verifyThatClickOnNoButtonIsNotPossible(){
            Assert.assertFalse(getRadioButton().radioButtonNoIsEnabled());
        }

        @Test (priority = 9)
        public void verifyAddingNewRecord(){
            getWebTables().javascriptScroll250();
            getWebTables().clickOnWebTables();
            Assert.assertTrue(getWebTables().isWebTablesDisplayed());
            getWebTables().waiterForElementToBeClickable(getWebTables().getAddNewRecord());
            getWebTables().clickOnAddNewRecord();
            Assert.assertTrue(getWebTables().isRegistrationFormVisible());
            getWebTables().fillRegistrationForm("Petar", "Petrovic", "petarpetrovic@gmail.com", "32", "100000", "QA");
            Assert.assertTrue(getWebTables().areAddedInformationVisible());
        }


        @Test(priority = 10)
        public void verifySearchFieldInWebTables(){
            getWebTables().clickSearch();
            getWebTables().parseInformation("Petar");
            Assert.assertEquals(getWebTables().searchResult(), "QA");

        }


        @Test(priority = 11)
        public void verifyDeleteRecordInWebTables(){
            getWebTables().waiterForElementToBeClickable(getWebTables().getDeleteRecord());
            getWebTables().deleteNewRecord();
            Assert.assertTrue(getWebTables().isRecordDeleted());
        }

        @Test (priority = 12)
        public void verifyDoubleClickButton(){
            getButtons().waiterForElementToBeClickable(getButtons().getChooseButtonsField());
            //getDriver().navigate().refresh();
            getButtons().jsExecutorScroll();
            getButtons().clickButtonsField();
            getDriverWait().until(ExpectedConditions.elementToBeClickable(getButtons().getDoubleClickButton()));
            //getDriver().navigate().refresh();
            getButtons().performDoubleClick();
            Assert.assertEquals(getButtons().confirmDoubleClick(),"You have done a double click");
        }

        @Test(priority = 13)
        public void verifyRightClickButton() {
            getButtons().waiterForElementToBeClickable(getButtons().getChooseButtonsField());
            getDriver().navigate().refresh();
            getButtons().clickButtonsField();
            getButtons().waiterForElementToBeClickable(getButtons().getRightClickButton());
            getButtons().jsExecutorScroll();
            getButtons().performRightClick();
            Assert.assertEquals(getButtons().confirmRightClick(), "You have done a right click");
        }

        @Test(priority = 14)
        public void verifyDynamicClickButton() {
            getButtons().waiterForElementToBeClickable(getButtons().getChooseButtonsField());
            getDriver().navigate().refresh();
            getButtons().clickButtonsField();
            getButtons().waiterForElementToBeClickable(getButtons().getDynamicClickButton());
            getButtons().jsExecutorScroll();
            getButtons().performDynamicClick();
            Assert.assertEquals(getButtons().confirmDynamicClick(), "You have done a dynamic click");
        }


}
