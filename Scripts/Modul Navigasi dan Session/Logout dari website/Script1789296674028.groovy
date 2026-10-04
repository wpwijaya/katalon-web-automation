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

WebUI.click(findTestObject('Object Repository/Web_Saucelab/humberger/button_Open Menu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/humberger/a_About'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/humberger/a_All Items'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/humberger/a_Dynamic Catalog'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/humberger/a_Logout'), 30)

WebUI.click(findTestObject('Object Repository/Web_Saucelab/humberger/a_Logout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/LoginPage/input_Swag Labs_user-name'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web_Saucelab/LoginPage/input_Swag Labs_password'), 30)

WebUI.back()

WebUI.verifyTextPresent('You can only access \'/inventory.html\' when you are logged in.', false)

