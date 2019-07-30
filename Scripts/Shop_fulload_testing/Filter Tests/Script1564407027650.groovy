import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



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

WebUI.click(findTestObject('Filter_repo/filter_labels/label_Hersteller'))

//count Checkbox Options
	def 
	List<WebElement> optionCount = driver.findElements(By.xpath("//form[@id='filter']/div/div/div/label"))
	//System.out.println(optionCount.size())
	log.logInfo(optionCount)


WebUI.closeBrowser()

