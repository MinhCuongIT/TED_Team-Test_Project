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

WebUI.navigateToUrl('http://127.0.0.1:3000/')

WebUI.click(findTestObject('Object Repository/Page_Spectrum/button_Log in or sign up'))

//Đăng nhập bằng Github
WebUI.click(findTestObject('Object Repository/Page_Spectrum/span_Sign in with GitHub'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'minhcuongit')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 
    '9e5/e4jZbrkRPxL/am/6uYGu2iBUrIMS')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/Page_Spectrum community/img_Explore_style__Img-u3znqr-3 kJsvJN'))

WebUI.click(findTestObject('Object Repository/Page_TRN MINH CNG  tranminhcuong/button_Settings'))

WebUI.click(findTestObject('Object Repository/Page_My settings/button_Log out'))

//Lặp đăng nhập và đăng xuất 10 lần
for(int i = 1; i <= 5; i++){
	WebUI.click(findTestObject('Object Repository/Page_Spectrum/button_Log in or sign up'))
	
	WebUI.click(findTestObject('Object Repository/Page_Spectrum/span_Sign in with GitHub'))
	
	WebUI.click(findTestObject('Object Repository/Page_Spectrum community/img_Explore_style__Img-u3znqr-3 kJsvJN'))
	
	WebUI.click(findTestObject('Object Repository/Page_TRN MINH CNG  tranminhcuong/button_Settings'))
	
	WebUI.click(findTestObject('Object Repository/Page_My settings/button_Log out'))
}

WebUI.closeBrowser()

//Ok Done!
