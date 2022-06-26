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

public class Global_Variable {
	public static String randomEmail = CustomKeywords.'randomKeyword.random.randomAlphabet'(5)+"."+CustomKeywords.'randomKeyword.random.randomNumber'(5)+"@"+CustomKeywords.'randomKeyword.random.randomAlphabet'(5)+".com"
	public static String randomPassword = CustomKeywords.'randomKeyword.random.randomNumber'(5)
	}

	WebUI.openBrowser('automationpractice.com')
	WebUI.maximizeWindow()
	register()
	login()
	WebUI.closeBrowser()
	
private register() {
	WebUI.waitForElementPresent(findTestObject('Object Repository/jws/Page_My Store/Home_Sign_In_Button'), 5)
	WebUI.click(findTestObject('Object Repository/jws/Page_My Store/Home_Sign_In_Button'))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/jws/Page_Login - My Store/LoginPage_CreateAnAccount_Button'), 5)
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/LoginPage_NewEmail_TextField'), Global_Variable.randomEmail)
	WebUI.click(findTestObject('Object Repository/jws/Page_Login - My Store/LoginPage_CreateAnAccount_Button'))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Gender'), 5)
	WebUI.click(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Gender'))
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_FirstName'), CustomKeywords.'randomKeyword.random.randomAlphabet'(4))
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_LastName'), CustomKeywords.'randomKeyword.random.randomAlphabet'(4))
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Password'), Global_Variable.randomPassword)
	
	
	int optionListLength = 10
	Random rand = new Random()
	int index = rand.nextInt(optionListLength + 1)
	
	WebUI.selectOptionByIndex(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Day_DropDown'), index)
	WebUI.selectOptionByIndex(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Month_DropDown'), index)
	WebUI.selectOptionByIndex(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Year_DropDown'), index)
	
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Address_Input'), CustomKeywords.'randomKeyword.random.randomSentence'(5))
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_City'), CustomKeywords.'randomKeyword.random.randomAlphabet'(5))
	WebUI.selectOptionByIndex(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_State_DropDown'), index)
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_PostalCode'), CustomKeywords.'randomKeyword.random.randomNumber'(5))
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_PhoneNumber'), "6281"+CustomKeywords.'randomKeyword.random.randomNumber'(8))
	WebUI.takeScreenshot()
	WebUI.click(findTestObject('Object Repository/jws/Page_Login - My Store/RegisterData_Register_Button'))
	WebUI.delay(2)
	WebUI.waitForElementPresent(findTestObject('Object Repository/jws/Page_My account - My Store/Profile_SignOut_Button'), 5)
	WebUI.takeScreenshot()
	
}

private login( ) {
	WebUI.click(findTestObject('Object Repository/jws/Page_My account - My Store/Profile_SignOut_Button'))
	WebUI.waitForElementPresent(findTestObject('Object Repository/jws/Page_Login - My Store/SignIn_Button'), 5)
	
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/SignIn_Email_Field'), Global_Variable.randomEmail)
	WebUI.sendKeys(findTestObject('Object Repository/jws/Page_Login - My Store/SignIn_Password_Field'), Global_Variable.randomPassword)
	
	WebUI.click(findTestObject('Object Repository/jws/Page_Login - My Store/SignIn_Button'))
	
	WebUI.waitForElementPresent(findTestObject('Object Repository/jws/Page_My account - My Store/Profile_SignOut_Button'), 5)
	WebUI.verifyElementPresent(findTestObject('Object Repository/jws/Page_My account - My Store/Profile_WishList'), 0)
	WebUI.takeScreenshot()
}	

