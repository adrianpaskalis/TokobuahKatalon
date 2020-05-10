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

Mobile.startApplication('D:\\PROJECTProgmob-master\\app\\build\\outputs\\apk\\debug\\app-debug.apk', true)

Mobile.tap(findTestObject('Mobile_Progmob/android.widget.EditText0 - Email'), 0)

Mobile.clearText(findTestObject('Mobile_Progmob/android.widget.EditText0 - Email (1)'), 0)

Mobile.setText(findTestObject('Mobile_Progmob/android.widget.EditText0'), 'adrian.paskalis@si.ukdw.ac.id', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile_Progmob/android.widget.EditText0 - Password'), 0)

Mobile.clearText(findTestObject('Mobile_Progmob/android.widget.EditText0 - Password (1)'), 0)

Mobile.setEncryptedText(findTestObject('Mobile_Progmob/android.widget.EditText0 (1)'), 'RAIVpflpDOg=', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile_Progmob/android.widget.Button0 - SIGN IN'), 0)

Mobile.closeApplication()

