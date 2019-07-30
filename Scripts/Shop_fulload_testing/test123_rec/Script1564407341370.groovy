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

//standard Login process
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

WebUI.verifyElementPresent(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Anmelden/a_Kai Steinmller'), 0)

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Ihr zuverlssiger Partner fr Gastronomie und Hotellerie/span_Braugasthaus Doldenmdel GmbH'))

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo - Ihr zuverlssiger Partner fr Gastronomie und Hotellerie/button_Weiter'))

WebUI.click(findTestObject('Test1/Transgourmet_Aktionen/Page_Gastivo  Marktplatz/div_ECHT Gastro Partner'))

WebUI.click(findTestObject('Filter_repo/categories/div_Alkoholfreie Getrnke'))

//WebUI.scrollToElement(findTestObject('Filter_repo/filter_labels/label_Hersteller'), 0)
WebUI.click(findTestObject('Filter_repo/filter_labels/label_Hersteller'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Anton Riemerschmid Weinbrennerei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Anton Riemerschmid Weinbrennerei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Apollinaris'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Apollinaris'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bauer Fruchtsfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bauer Fruchtsfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Beam Spirituosen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Beam Spirituosen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bernard Massard Sektkellerei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bernard Massard Sektkellerei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bionade'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bionade'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Borco Spirituosen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Borco Spirituosen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Coca-Cola European Partners'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Coca-Cola European Partners'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Danone Waters'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Danone Waters'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Eckes Granini'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Eckes Granini'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Elmenhorster Sfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Elmenhorster Sfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Fachingen  (BA)'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Fachingen  (BA)'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Gerolsteiner Brunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Gerolsteiner Brunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ginger Green UG'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ginger Green UG'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Glashger Mineralbrunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Glashger Mineralbrunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Glockengold Sfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Glockengold Sfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Gstrower Schlossquell'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Gstrower Schlossquell'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Hampel und Wiegert'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Hampel und Wiegert'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Klindworth-Fruchtsfte Sittensen (B'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Klindworth-Fruchtsfte Sittensen (B'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Leithoff Kelterei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Leithoff Kelterei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Loscher Brauerei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Loscher Brauerei'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ltvogt Mineralbrunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ltvogt Mineralbrunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_MBG Internationale Marken'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_MBG Internationale Marken'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Niehoffs Vaihinger Sfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Niehoffs Vaihinger Sfte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Perrier Vittel'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Perrier Vittel'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Proviant Berlin'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Proviant Berlin'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Red Bull'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Red Bull'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_San Pellegrino Mineralwasser'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_San Pellegrino Mineralwasser'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Schweppes'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Schweppes'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Spreequell Mineralbrunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Spreequell Mineralbrunnen'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Streuobstwiesen Manufaktur GmbH'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Streuobstwiesen Manufaktur GmbH'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Strtebeker Braumanufaktur GmbH'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Strtebeker Braumanufaktur GmbH'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Teamspirit'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Teamspirit'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Thomas Henry Getrnke'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Thomas Henry Getrnke'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Wonderbar Cocktails'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Wonderbar Cocktails'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Sorte'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ananassaft'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ananassaft'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Apfelsaft'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Apfelsaft'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Apfelschorle'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Apfelschorle'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Gebinde'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_07l'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_07l'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_10 x 033l'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_10 x 033l'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Gebinde'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_12 x 05l'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_12 x 05l'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Bio'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ja'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ja'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Nein'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ja'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Nein'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Ja'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Lagerstatus'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Lagerartikel'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Lagerartikel'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Marke'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Acqua Panna'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Acqua Panna'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Afri'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Afri'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_ALOSA'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_ALOSA'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Warengruppe'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Erfrischungsgetrnke'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Erfrischungsgetrnke'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Saft  Nektar'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Saft  Nektar'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Wasser'))

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Wasser'))

WebUI.closeBrowser()

