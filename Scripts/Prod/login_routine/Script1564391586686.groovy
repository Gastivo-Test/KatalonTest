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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.gastivo.de/abmelden')

WebUI.navigateToUrl('https://www.gastivo.de/360')

WebUI.click(findTestObject('Prod/Page_Gastivo - Dein zuverlssiger Pa/a_Anmelden'))

WebUI.click(findTestObject('Prod/Page_Gastivo - Anmelden/input_registrieren_form-control ng-touched ng-dirty ng-invalid'))

WebUI.setText(findTestObject('Prod/Page_Gastivo - Anmelden/input_registrieren_form-control ng-touched ng-dirty ng-invalid'), 
    user1)

WebUI.click(findTestObject('Prod/Page_Gastivo - Anmelden/input_registrieren_form-control ng-pristine ng-invalid ng-touched'))

WebUI.setText(findTestObject('Prod/Page_Gastivo - Anmelden/input_registrieren_form-control ng-pristine ng-invalid ng-touched'), 
    password)

WebUI.click(findTestObject('Prod/Page_Gastivo - Anmelden/button_Anmelden'))

if (WebUI.verifyElementPresent(findTestObject('Prod/Page_Gastivo - Dein zuverlssiger Pa/Page_Gastivo - Anmelden/a_Meine Daten'), 
    0)) {
    WebUI.navigateToUrl('shop.gastivo.de')
}

