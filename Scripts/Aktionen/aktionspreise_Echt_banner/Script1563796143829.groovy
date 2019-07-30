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

WebUI.openBrowser('https://preview:gastivoPreview@www.gastivo.biz')

//WebUI.authenticate('https://www.gastivo.biz', 'preview', 'gastivoPreview', 12, FailureHandling.OPTIONAL)
WebUI.maximizeWindow()

//WebUI.scrollToPosition(1740, 26)
//WebUI.delay(4)
//WebUI.takeScreenshot('C:\\Users\\pwilken\\Katalon Studio\\Screenshots\\03_Screenshot_of_promo_banner.jpg')
WebUI.click(findTestObject('login/a_Anmelden'))

WebUI.setText(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Anmelden/input_registrieren_form-control ng-touched ng-dirty ng-valid'), 
    'kai.steinmueller@wine-logistix.de')

WebUI.setEncryptedText(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Anmelden/input_registrieren_form-control ng-untouched ng-dirty ng-valid'), 
    'ZqeM4r+vayXN0eHLvQEmZQ==')

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Anmelden/button_Anmelden'))

WebUI.click(findTestObject('GastivoMarktplatz/a_Einkauf'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Anmelden/a_Kai Steinmller'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Ihr zuverlssiger Partner fr Gastronomie und Hotellerie/span_Braugasthaus Doldenmdel GmbH'))

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Ihr zuverlssiger Partner fr Gastronomie und Hotellerie/button_Weiter'))

WebUI.delay(1)

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo  Marktplatz/div_ECHT Gastro Partner'))

WebUI.click(findTestObject('GastivoMarktplatz/div_Bier'))

WebUI.click(findTestObject('GastivoMarktplatz/promo_banner_2'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('GastivoMarktplatz/button_In den Warenkorb'))

WebUI.delay(4)

WebUI.click(findTestObject('GastivoMarktplatz/button_In den Warenkorb'))

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo  Marktplatz/input_AGB und Widerrufsbelehrung_sAGB'))

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo  Marktplatz/button_Zahlungspflichtig bestellen'))

WebUI.closeBrowser()

