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

//WebUI.maximizeWindow()


WebUI.authenticate('https://www.gastivo.biz', 'preview', 'gastivoPreview', 12, FailureHandling.OPTIONAL)

WebUI.waitForElementVisible(findTestObject('GastivoMarktplatz/a_Einkauf'), 2)

//WebUI.click(findTestObject('GastivoMarktplatz/a_Einkauf'))
if (WebUI.verifyElementPresent(findTestObject('GastivoMarktplatz/a_Einkauf'), 2, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('GastivoMarktplatz/a_Einkauf'))
} else {
	
	WebUI.takeScreenshot('C:\\Users\\pwilken\\Katalon Studio\\Screenshots\\01_Screenshot_of_promo.jpg')
	WebUI.closeBrowser()
}

WebUI.verifyElementVisible(findTestObject('GastivoMarktplatz/Supplier_label'))

WebUI.click(findTestObject('GastivoMarktplatz/Supplier_label'))

if (WebUI.verifyElementPresent(findTestObject('GastivoMarktplatz/promotion_banner'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('GastivoMarktplatz/promotion_banner'))
	WebUI.takeScreenshot('C:\\Users\\pwilken\\Katalon Studio\\Screenshots\\02_Screenshot_of_promo_banner.jpg')
} else {
    WebUI.closeBrowser()
}

