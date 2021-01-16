import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(rawUrl=GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_NazwaUzytkownika'), GlobalVariable.nazwauzytkownika)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_HasloUzytkownika'), GlobalVariable.haslo)

WebUI.click(findTestObject('Object Repository/PageTransaction/Login_Bttn'))

WebUI.click(findTestObject('Object Repository/PageTransaction/Login_TransferSrodkow'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_IloscSrodkow'), GlobalVariable.srodki)

WebUI.click(findTestObject('Object Repository/PageTransaction/Login_button_transfer'))

WebUI.click(findTestObject('Object Repository/PageTransaction/Login_Aktualizacja_danych'))

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_Imie'), GlobalVariable.imie)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_Nazwisko'), GlobalVariable.nazwisko)

WebUI.setText(findTestObject('PageTransaction/Login_Ulica'), GlobalVariable.ulica)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_Miasto'), GlobalVariable.miasto)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_Wojewodztwo'), GlobalVariable.wojewodztwo)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_KodPocztowy'), GlobalVariable.kodpocztowy)

WebUI.setText(findTestObject('Object Repository/PageTransaction/Login_NumerTelefonu'), GlobalVariable.telefon)

WebUI.click(findTestObject('Object Repository/PageTransaction/Login_Przycisk'))
