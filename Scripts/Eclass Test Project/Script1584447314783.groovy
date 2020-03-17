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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ssat.ukdw.ac.id/')

WebUI.click(findTestObject('Object Repository/Page_SSaT/form_SUBMITSIGNUP MAHASISWA 2019'))

WebUI.setText(findTestObject('Object Repository/Page_SSaT/input_LOGIN_uname'), '72170125')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SSaT/input_LOGIN_pword'), '/0lkEwNbM9TbJIg+c48wFw==')

WebUI.click(findTestObject('Object Repository/Page_SSaT/button_SUBMIT'))

WebUI.click(findTestObject('Object Repository/Page_SSaT/a_DATA AKADEMIK'))

WebUI.click(findTestObject('Object Repository/Page_SSaT/a_KRS  RENCANA STUDI'))

WebUI.click(findTestObject('Object Repository/Page_SSaT/a_72170125'))

WebUI.waitForElementClickable(findTestObject('Page_SSaT/b_LOGOUT'), 5)

WebUI.click(findTestObject('Object Repository/Page_SSaT/b_LOGOUT'))

WebUI.closeBrowser()

