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

WebUI.click(findTestObject('Page_Spectrum/button_Log in or sign up'))

WebUI.click(findTestObject('Page_Spectrum/span_Sign in with GitHub'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'minhcuongit')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), '9e5/e4jZbrkRPxL/am/6uYGu2iBUrIMS')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.navigateToUrl('http://localhost:3000/spectrum?tab=posts')

WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Message'))

def names = ((['Cường', 'Duy', 'Mạnh', 'Quốc', 'Phong', 'Sơn', 'Thắm', 'Phượng', 'Hải', 'Xuân', 'Lan', 'Mai', 'Thu', 'Cúc']) as String[])

//Nhắn tin với nội dung Hello + name trong mảng names đến hết mảng
for (def name : names) {
    WebUI.setText(findTestObject('Object Repository/Page_Spectrum community/textarea_hell'), 'hello ' + name)

    WebUI.click(findTestObject('Object Repository/Page_Spectrum community/button_Send'))
}

//Test Done!