import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Modul Checkout/Ringkasan Pesanan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/CompletePage/button_Back Home'), 30)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/CompletePage/button_Generate PDF order'), 30)

WebUI.click(findTestObject('Web_Saucelab/CompletePage/button_Generate PDF order'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/CompletePage/div_Your order has been dispatched, and wil_39390f'), 
    30)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/CompletePage/button_Generate PDF order'), 30)

WebUI.click(findTestObject('Web_Saucelab/CompletePage/button_Back Home'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/inventory/div_Sauce Labs Backpackcarry'), 30)

WebUI.closeBrowser()

