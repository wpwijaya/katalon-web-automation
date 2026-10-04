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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_user-name'), GlobalVariable.username)

WebUI.setText(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_password'), GlobalVariable.password)

WebUI.click(findTestObject('Web_Saucelab/LoginPage/input_Swag Labs_login-button'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/inventory/div_Sauce Labs Backpackcarry'), 30)

WebUI.click(findTestObject('Web_Saucelab/inventory/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/inventory/button_Remove_inventory'), 30)

WebUI.click(findTestObject('Object Repository/cart/shopping_cart_link'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/inventory/div_Sauce Labs Backpackcarry'), 30)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/CheckoutPage/button_Continue Shopping'), 30)

WebUI.click(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/button_Continue Shopping'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/inventory/div_Sauce Labs Bike Light'), 30)

WebUI.click(findTestObject('Web_Saucelab/inventory/div_Sauce Labs Bike Light'))

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/detail-product/button_Addtocart'), 30)

WebUI.verifyElementPresent(findTestObject('Web_Saucelab/detail-product/button_Backtoproducts'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web_Saucelab/detail-product/button_Addtocart'))

WebUI.click(findTestObject('Object Repository/cart/shopping_cart_link'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/div_QTY'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/div_product_title'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/div_product_description'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/CheckoutPage/div_product_price'), 30)

