package randomKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.apache.commons.lang.RandomStringUtils


public class random {

	@Keyword
	def randomNumber(int digit) {
		//digit adalah jumlah digit yg akan dibuat. contoh digit = 3 -> 892, digit = 5 -> 89210
		String num = RandomStringUtils.random(digit, '1234567890')
		return num
	}

	@Keyword
	def randomAlphabet(int digit) {
		//digit adalah jumlah digit yg akan dibuat. contoh digit = 3 -> jks, digit = 5 -> alkds
		String alp = RandomStringUtils.random(digit, 'abcdefghijklmnopqrstuvwxyz')
		return alp
	}

	@Keyword
	def randomSentence(int sentence) {
		//sentence adalah jumlah kalimat yg ingin dibuat. sentence = 3 -> zxxc klsz klwq
		String kalimat = ''
		for (def kal : (1..sentence)) {
			kalimat = RandomStringUtils.random(4, 'abcdefghijklmnopqrstuvwxyz') +' '+ kalimat
		}
		return kalimat
	}

}


