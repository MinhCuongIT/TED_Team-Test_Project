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

switch (false) {
    case true:
        WebUI.click(findTestObject('Object Repository/Page_Spectrum community/a_person 5 members'))

        WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Message'))

        WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_Nikolas Terry_style__Input-yy8ipz-4__input'), 
            'H')

        WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_H'), 'Hi')

        WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Send'))

        WebUI.click(findTestObject('Object Repository/Page_Spectrum community/span_view-close'))

        break
    default:
        WebUI.click(findTestObject('Page_Messages/a_message-simpleMessages'))

        WebUI.click(findTestObject('Object Repository/Page_Messages/a_Julio Kub6 minutes agogll'))

        WebUI.setText(findTestObject('Object Repository/Page_Conversation with Julio Kub/textarea_v-v-n-m-nh_style__Input-yy8ipz-4__input'), 
            'h')

        WebUI.setText(findTestObject('Object Repository/Page_Conversation with Julio Kub/textarea_h'), 'he')

        WebUI.click(findTestObject('Object Repository/Page_Conversation with Julio Kub/button_Send'))

        break
}

