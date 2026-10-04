import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import testlink.api.java.client.TestLinkAPIResults
import internal.GlobalVariable
import testlink.api.java.client.TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIException
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TestlinkIntegrationListener {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	// Masukkan Detail TestLink Anda
	public static String DEVKEY = "359f314d6701981aa6fb56e905f4e65b"
	public static String URL = "http://localhost/testlink-tauriel/lib/api/xmlrpc/v1/xmlrpc.php"
	String userfullname = "asti"
	String testProject = "saucelab"
	String testPlan    = "saucelab demo testing"
	String build       = "regression test katalon"
	String notes       = "Dieksekusi otomatis via Katalon Studio"
	
	public static void reportResult(String testProject, String testPlan, String testCase, String build, String notes, String result) {
        try {
            TestLinkAPIClient api = new TestLinkAPIClient(DEVKEY, URL)
            api.reportTestCaseResult(testProject, testPlan, testCase, build, notes, result)
            println("=== [TestLink] Berhasil update status untuk: " + testCase)
        } catch (TestLinkAPIException e) {
            println("=== [TestLink] GAGAL update status: " + e.getMessage())
        }
    }

    @AfterTestCase
    def afterTestCase(TestCaseContext testCaseContext) {
        // 1. Ambil Nama Pemilik PC secara otomatis (Windows/Mac Username)
        String PC_User = System.getProperty("user.name")
        
        // 2. Format catatan laporan agar memuat nama operator secara dinamis
        String notes = "Dieksekusi secara otomatis via Katalon Studio lokal. Operator PC: " + PC_User

        // 3. Ambil ID Test Case (Memastikan hanya mengambil nama file, bukan full path folder)
        String fullPath = testCaseContext.getTestCaseId()
        String testCaseName = fullPath.substring(fullPath.lastIndexOf('/') + 1) 
        
        // 4. Tentukan status Pass/Fail
        String result = TestLinkAPIResults.TEST_PASSED
        if (testCaseContext.getTestCaseStatus() == 'FAILED') {
            result = TestLinkAPIResults.TEST_FAILED
        }

        // 5. Kirim data ke TestLink
        reportResult(testProject, testPlan, testCaseName, build, notes, result)
    }
}