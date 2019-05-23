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

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'minhcuongit')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), '9e5/e4jZbrkRPxL/am/6uYGu2iBUrIMS')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Page_Spectrum community/img_Explore_style__Img-u3znqr-3 kJsvJN'))

WebUI.navigateToUrl('http://localhost:3000/explore')
//Kiem tra su ton tai cua comunity abc
if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Explore/button_abc'),25,FailureHandling.OPTIONAL) == true){
	//Neu chua ton tai
	
	WebUI.navigateToUrl('http://localhost:3000/new/community')
	
	//Tạo một commnunity
	WebUI.setText(findTestObject('Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy'),
		'abc')
	
	WebUI.setText(findTestObject('Page_New community/textarea_dd'), 'abc')
	
	WebUI.setText(findTestObject('Page_New community/input_Optional Add your communitys website_style__StyledInput-sc-17zryot-2 jHXlSy'),
		'abc')
	
	WebUI.click(findTestObject('Page_New community/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community'))
	
	WebUI.click(findTestObject('Page_New community/button_Create Community  Continue'))
	
	WebUI.click(findTestObject('Page_New community/button_Skip this step'))
	
	WebUI.click(findTestObject('Page_New community/button_Go to my community'))
	
	WebUI.click(findTestObject('Page_abc community/button_Settings'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Page_abc settings/button_Create Channel'))
	
	WebUI.setText(findTestObject('Page_abc settings/input_Channel Name_name'), channel_name)
	
	WebUI.setText(findTestObject('Page_abc settings/textarea_ht'), channel_detail)
	
	WebUI.click(findTestObject('Page_abc settings/button_Create Channel 7'))
	
}
else{
	//Neu ton tai roi
	WebUI.navigateToUrl('http://localhost:3000/abc?tab=posts')
	
	WebUI.click(findTestObject('Page_abc community/button_Settings'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Page_abc settings/button_Create Channel'))
	
	WebUI.setText(findTestObject('Page_abc settings/input_Channel Name_name'), channel_name)
	
	WebUI.setText(findTestObject('Page_abc settings/textarea_ht'), channel_detail)
	
	WebUI.click(findTestObject('Page_abc settings/button_Create Channel 7'))
}

//Test done!