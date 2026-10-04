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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Modul Katalog Produk/Tambah Ke Keranjang dari Daftar Produk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/cart/shopping_cart_link'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/div_QTY'), 30)

WebUI.click(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/button_Checkout'))

WebUI.click(findTestObject('Web_Saucelab/DataShippingPage/input_Checkout Your Information_first-name'))

WebUI.setText(findTestObject('Object Repository/Web_Saucelab/DataShippingPage/input_Checkout Your Information_first-name'), 
    'Asti')

WebUI.click(findTestObject('Web_Saucelab/DataShippingPage/input_Checkout Your Information_last-name'))

WebUI.setText(findTestObject('Object Repository/Web_Saucelab/DataShippingPage/input_Checkout Your Information_last-name'), 
    'Wijaya')

WebUI.click(findTestObject('Web_Saucelab/DataShippingPage/input_Checkout Your Information_postal-code'))

WebUI.setText(findTestObject('Object Repository/Web_Saucelab/DataShippingPage/input_Checkout Your Information_postal-code'), 
    '50771')

WebUI.click(findTestObject('Object Repository/Web_Saucelab/DataShippingPage/input_Cancel_continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/ConfirmationPage/div_checkoutsummary'), 30)

