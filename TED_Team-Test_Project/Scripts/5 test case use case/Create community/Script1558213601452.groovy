import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

switch (true) {
    case true:
        WebUI.click(findTestObject('Page_Spectrum/button_Join Spectrum'))

        WebUI.click(findTestObject('Page_Spectrum/div_githubSign in with GitHub'))

        WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'vumanhxeko')

        WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 'sXPt0CtOIo1bS57otx43Pw==')

        WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

        WebUI.click(findTestObject('Object Repository/Page_Spectrum community/a_plusCreate a community'))

        break
    default:
        WebUI.click(findTestObject('Page_Spectrum/button_Create your community'))

        WebUI.click(findTestObject('Page_Spectrum/div_githubSign in with GitHub'))

        WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'vumanhxeko')

        WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 'sXPt0CtOIo1bS57otx43Pw==')

        WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

        break
}

WebUI.click(findTestObject('Object Repository/Page_New community/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community'))

WebUI.setText(findTestObject('Object Repository/Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy'), 
    'Create a community')

WebUI.setText(findTestObject('Object Repository/Page_New community/input_Optional Add your communitys website_style__StyledInput-sc-17zryot-2 jHXlSy'), 
    'add')

WebUI.click(findTestObject('Object Repository/Page_New community/button_Create Community  Continue'))

WebUI.click(findTestObject('Object Repository/Page_New community/button_Skip this step'))

WebUI.click(findTestObject('Object Repository/Page_New community/button_Go to my community'))

