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

//Tạo mảng dữ liệu
def comunities = ((['Community 01', 'Community 02', 'Community 03', 'Community 04', 'Community 05']) as String[])
def descriptions = ((['Describe Community 01', 'Describe Community 02', 'Describe Community 03', 'Describe Community 04', 'Describe Community 05']) as String[])
def websites = ((['www.community01.com', 'www.community02.com', 'www.community03.com', 'www.community04.com', 'www.community05.com']) as String[])

//Tạo 5 community ảo
for(int i = 0; i < 5; i++){
	WebUI.navigateToUrl('http://localhost:3000/new/community')
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy'),
		"""${comunities[i]}""")
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/textarea_dd'), """${descriptions[i]}""")
	
	WebUI.setText(findTestObject('Object Repository/Page_New community/input_Optional Add your communitys website_style__StyledInput-sc-17zryot-2 jHXlSy'),
		"""${websites[i]}""")
	
	WebUI.click(findTestObject('Object Repository/Page_New community/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community'))
	
	WebUI.click(findTestObject('Object Repository/Page_New community/button_Create Community  Continue'))
	
	WebUI.click(findTestObject('Object Repository/Page_New community/button_Skip this step'))
	
	WebUI.click(findTestObject('Object Repository/Page_New community/button_Go to my community'))
}

//Test Done!

