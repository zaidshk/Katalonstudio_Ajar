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

WebUI.navigateToUrl('https://ajar-landing.web.app/landlord')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Tenants'))

WebUI.takeFullPageScreenshotAsCheckpoint('Tenant page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Pricing'))

WebUI.takeFullPageScreenshotAsCheckpoint('Pricing page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_About Us'))

WebUI.takeFullPageScreenshotAsCheckpoint('About page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Log In'))

WebUI.takeFullPageScreenshotAsCheckpoint('Login page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Continue with phone number'))

WebUI.takeFullPageScreenshotAsCheckpoint('Conitnue with phone number page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Back to other options'))

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Back to homepage'))

WebUI.click(findTestObject('Object Repository/Page_Ajar/a_Schedule a demo'))

WebUI.takeFullPageScreenshotAsCheckpoint('Schedule a demo page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/a_Privacy Policy'))

WebUI.takeFullPageScreenshotAsCheckpoint('Privacy page screenshot')

WebUI.click(findTestObject('Object Repository/Page_Ajar/span_Terms and Conditions'))

WebUI.takeScreenshotAsCheckpoint('T&C page screenshot')

WebUI.closeBrowser()

