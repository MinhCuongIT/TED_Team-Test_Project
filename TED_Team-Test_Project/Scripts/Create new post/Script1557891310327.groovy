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

WebUI.click(findTestObject('Object Repository/Page_Spectrum/span_Sign in with Google'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_Spectrum_identifier'), 'vumanhxeko')

WebUI.click(findTestObject('Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 
    'sXPt0CtOIo1bS57otx43Pw==')

WebUI.click(findTestObject('Object Repository/Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.click(findTestObject('Object Repository/Page_Tn gi community/div_Info_sc-bxivhb beCRxj'))

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/input_Info_sc-gzVnrw lbskuL'), 'Create new post')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea'), 'S')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_S'), 'Se')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Se'), 'Sen')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Sen'), 'Send')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send'), 'Send ')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send_1'), 'Send m')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send m'), 'Send me')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me'), 'Send me ')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me_1'), 'Send me y')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me y'), 'Send me yo')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me yo'), 'Send me you')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me you'), 'Send me your')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your'), 'Send me your ')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your_1'), 'Send me your p')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p'), 'Send me your ps')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your ps'), 'Send me your pso')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your pso'), 'Send me your ps')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your ps'), 'Send me your p')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p'), 'Send me your po')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your po'), 'Send me your p')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p'), 'Send me your pó')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p_1'), 'Send me your pót')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your pt'), 'Send me your pó')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p_2'), 'Send me your p')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p'), 'Send me your po')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your po'), 'Send me your pot')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your pot'), 'Send me your pots')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your pots'), 'Send me your pot')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your pot'), 'Send me your po')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your po'), 'Send me your p')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p'), 'Send me your pó')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p_3'), 'Send me your p')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your p'), 'Send me your po')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your po'), 'Send me your pos')

WebUI.setText(findTestObject('Object Repository/Page_Tn gi community/textarea_Send me your pos'), 'Send me your post')

WebUI.click(findTestObject('Object Repository/Page_Tn gi community/button_Post'))

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_No messages yet_style__Input-yy8ipz-4__input'), 
    'P')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_P'), 'Po')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Po'), 'P')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_P'), 'Pó')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_P_1'), 'P')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_P'), 'Po')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Po'), 'Pos')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Pos'), 'Poss')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Poss'), 'Pos')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Pos'), 'Post')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post'), 'Post ')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post_1'), 'Post f')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post f'), 'Post fi')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post fi'), 'Post fin')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post fin'), 'Post fins')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post fins'), 'Post fin')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post fin'), 'Post fini')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post fini'), 'Post finis')

WebUI.setText(findTestObject('Object Repository/Page_Create new post  Tn gi/textarea_Post finis'), 'Post finish')

WebUI.click(findTestObject('Object Repository/Page_Create new post  Tn gi/div_Info_sc-bxivhb beCRxj'))

WebUI.click(findTestObject('Object Repository/Page_Create new post  Tn gi/span_view-close'))

WebUI.closeBrowser()

