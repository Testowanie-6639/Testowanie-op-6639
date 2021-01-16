import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(rawUrl=GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/PageLogin/Register_bttn'))

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Imie'), GlobalVariable.imie)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Nazwisko'), GlobalVariable.nazwisko)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Adres'), GlobalVariable.ulica)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Miasto'), GlobalVariable.miasto)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Wojewodztwo'), GlobalVariable.wojewodztwo)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Telefon'), GlobalVariable.telefon)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Pesel'), GlobalVariable.pesel)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_NazwaUzytkownika'), GlobalVariable.nazwauzytkownika)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_Haslo'), GlobalVariable.haslo)

WebUI.setText(findTestObject('Object Repository/PageLogin/Register_PotwierdzenieHasla'), GlobalVariable.haslo)

WebUI.click(findTestObject('Object Repository/PageLogin/Register_PrzyciskZatwierdzajacy'))