package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Projekt_6639 : Adres strony banku</p>
     */
    public static Object url
     
    /**
     * <p>Profile Projekt_6639 : Imie uzytkownika</p>
     */
    public static Object imie
     
    /**
     * <p>Profile Projekt_6639 : Nazwisko uzytkownika</p>
     */
    public static Object nazwisko
     
    /**
     * <p>Profile Projekt_6639 : Kod pocztowy uzytkownika</p>
     */
    public static Object kodpocztowy
     
    /**
     * <p>Profile Projekt_6639 : Miasto uzytkownika</p>
     */
    public static Object miasto
     
    /**
     * <p>Profile Projekt_6639 : Nazwa uzytkownika</p>
     */
    public static Object nazwauzytkownika
     
    /**
     * <p>Profile Projekt_6639 : Haslo uzytkownika</p>
     */
    public static Object haslo
     
    /**
     * <p>Profile Projekt_6639 : Pesel uzytkownika</p>
     */
    public static Object pesel
     
    /**
     * <p>Profile Projekt_6639 : Telefon uzytkownika</p>
     */
    public static Object telefon
     
    /**
     * <p>Profile Projekt_6639 : Wojedodztwo uzytkownika</p>
     */
    public static Object wojewodztwo
     
    /**
     * <p>Profile Projekt_6639 : Ulica uzytkownika</p>
     */
    public static Object ulica
     
    /**
     * <p>Profile Projekt_6639 : Login uzytkownika</p>
     */
    public static Object uzytkowniklogin
     
    /**
     * <p>Profile Projekt_6639 : 10 usd przelew</p>
     */
    public static Object srodki
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            url = selectedVariables['url']
            imie = selectedVariables['imie']
            nazwisko = selectedVariables['nazwisko']
            kodpocztowy = selectedVariables['kodpocztowy']
            miasto = selectedVariables['miasto']
            nazwauzytkownika = selectedVariables['nazwauzytkownika']
            haslo = selectedVariables['haslo']
            pesel = selectedVariables['pesel']
            telefon = selectedVariables['telefon']
            wojewodztwo = selectedVariables['wojewodztwo']
            ulica = selectedVariables['ulica']
            uzytkowniklogin = selectedVariables['uzytkowniklogin']
            srodki = selectedVariables['srodki']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
