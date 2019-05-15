import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\MINHCU~1\\AppData\\Local\\Temp\\Katalon\\20190515_163637\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'http://localhost:3000/\')\n\nWebUI.click(findTestObject(\'Page_Spectrum/button_Log in or sign up\'))\n\nWebUI.click(findTestObject(\'Page_Spectrum/span_Sign in with GitHub\'))\n\nWebUI.setText(findTestObject(\'Page_Sign in to GitHub  GitHub/input_Username or email address_login\'), \'minhcuongit\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Sign in to GitHub  GitHub/input_Forgot password_password\'), \'9e5/e4jZbrkRPxL/am/6uYGu2iBUrIMS\')\n\nWebUI.click(findTestObject(\'Page_Sign in to GitHub  GitHub/input_Forgot password_commit\'))\n\nWebUI.navigateToUrl(\'http://localhost:3000/abc?tab=posts\')\n\nWebUI.click(findTestObject(\'Page_abc community/div_click_de_hien_khung\'))\n\nWebUI.setText(findTestObject(\'Page_abc community/input_tieu_de\'), \'message 1\')\n\nWebUI.setText(findTestObject(\'Page_abc community/textarea_detail\'), \'details\')\n\nWebUI.selectOptionByValue(findTestObject(\'Page_abc community/select_Choose a channelCuong\'), \'068ce218-7686-4244-b506-3285f7d38be9\', \n    true)\n\nWebUI.click(findTestObject(\'Page_abc community/button_Post\'))\n\nWebUI.click(findTestObject(\'Page_message 1  abc/span_view-close_Click_De_Thoat\'))\n\nnot_run: WebUI.click(findTestObject(\'Page_message 1  abc/div_message click ra ngoai\'))\n\nWebUI.setText(findTestObject(\'Page_abc community/input_tieu_de\'), \'message 2\')\n\nWebUI.setText(findTestObject(\'Page_abc community/textarea_detail\'), \'Tieu de 2\')\n\nWebUI.click(findTestObject(\'Page_abc community/button_Post_BaiDang\'))\n\nWebUI.click(findTestObject(\'Page_message 1  abc/span_view-close_Click_De_Thoat\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

