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

WebUI.click(findTestObject('Page_Spectrum/button_Join Spectrum'))

WebUI.click(findTestObject('Page_Spectrum/div_githubSign in with GitHub'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'vumanhxeko')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 'sXPt0CtOIo1bS57otx43Pw==')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Page_Spectrum community/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_vumanhxeko  v-v-n-m-nh/div_Create a community'))

WebUI.click(findTestObject('Page_Create a community community/button_Settings'))

switch (true) {
    case true:
        break
        
        WebUI.setText(findTestObject('Object Repository/Page_Create a community settings/textarea_Case'), 'Trường hợp đầu')
    default:
        break
        
        WebUI.setText(findTestObject('Object Repository/Page_Create a community settings/textarea_Case'), 'Mặc định')}

WebUI.click(findTestObject('Object Repository/Page_Create a community settings/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Create a community settings/h3_Return to Create a community'))

