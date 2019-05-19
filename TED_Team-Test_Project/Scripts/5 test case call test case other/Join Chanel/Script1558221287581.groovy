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

WebUI.callTestCase(findTestCase('5 test case call test case other/View profile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_vumanhxeko  v-v-n-m-nh/div_Create a communityview-forward'))

WebUI.click(findTestObject('Page_Create a community community/button_Settings'))

WebUI.click(findTestObject('Page_Create a community settings/button_Create Channel'))

WebUI.setText(findTestObject('Page_Create a community settings/input_Channel Name_name'), 'new channel')

WebUI.setText(findTestObject('Page_Create a community settings/textarea_H'), 'Hi')

WebUI.click(findTestObject('Object Repository/Page_abc settings/button_Create Channel 7'))

