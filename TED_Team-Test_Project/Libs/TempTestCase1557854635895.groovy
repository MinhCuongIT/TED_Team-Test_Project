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


RunConfiguration.setExecutionSettingFile('C:\\Users\\MINHCU~1\\AppData\\Local\\Temp\\Katalon\\20190515_002355\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.navigateToUrl(\'http://localhost:3000/new/community\')\n\n//T\u1EA1o m\u1ED9t commnunity\nWebUI.setText(findTestObject(\'Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy\'), \n    \'abc\')\n\nWebUI.setText(findTestObject(\'Page_New community/textarea_dd\'), \'abc\')\n\nWebUI.setText(findTestObject(\'Page_New community/input_Optional Add your communitys website_style__StyledInput-sc-17zryot-2 jHXlSy\'), \n    \'abc\')\n\nWebUI.click(findTestObject(\'Page_New community/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community\'))\n\nWebUI.click(findTestObject(\'Page_New community/button_Create Community  Continue\'))\n\nWebUI.click(findTestObject(\'Page_New community/button_Skip this step\'))\n\nWebUI.click(findTestObject(\'Page_New community/button_Go to my community\'))\n\nWebUI.click(findTestObject(\'Page_abc community/button_Settings\'))\n\n//T\u1EA1o m\u1ED9t s\u1ED1 chanel \u0111\u1EC3 test\ndef chanel_names = (([\'C\u01B0\u1EDDng\', \'Duy\', \'M\u1EA1nh\', \'Qu\u1ED1c\', \'Phong\', \'S\u01A1n\', \'Th\u1EAFm\', \'Ph\u01B0\u1EE3ng\', \'H\u1EA3i\', \'Xu\u00E2n\', \'Lan\', \'Mai\', \'Thu\'\n        , \'C\u00FAc\']) as String[])\n\nfor (def chanel : chanel_names) {\n    WebUI.click(findTestObject(\'Page_abc settings/button_Create Channel Main\'))\n\n    WebUI.setText(findTestObject(\'Page_abc settings/input_Channel Name_name\'), \'chanel \' + chanel)\n\n    WebUI.setText(findTestObject(\'Page_abc settings/textarea_ht\'), \'detail \' + chanel)\n\n    WebUI.click(findTestObject(\'Page_abc settings/button_Create Channel 7\'))\n}\n\n', FailureHandling.STOP_ON_FAILURE, true)

