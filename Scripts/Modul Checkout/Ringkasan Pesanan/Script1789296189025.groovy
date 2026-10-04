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

WebUI.callTestCase(findTestCase('Modul Checkout/Input Data Pengiriman'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_checkoutsummary'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_PaymentInformation'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_Shipping Information'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_Price Total'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_Item total'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_Tax'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/div_Total'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/button_Cancel'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/ConfirmationPage/button_Finish'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web_Saucelab/ConfirmationPage/button_Finish'))

