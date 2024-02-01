
package com.eva.vtiger.inventorytestscripts;

import org.testng.annotations.Test;

import com.eva.vtiger.base.BaseTest;
import com.eva.vtiger.pages.inventry.invoice.InventoryInvoiceNewCreateInvoice;
import com.eva.vtiger.utils.WebUtil;

public class InventryInvoiceTestScripts extends BaseTest{
	
	///  requirement   Testing Logic  TestCase TestScript
	///  TDD -  Test Driven Development
	 BaseTest bsTst =new BaseTest();
	 WebUtil webUtil=bsTst.getWebUtil();


	@Test(groups = {"Smoke"})
	public void verifyVT006AccountAndContactAddOnInvoiceForm() {
		webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
		getReuseCode().goToInventoryInvoiceLink();
		getReuseCode().creatNewPluseButton();
		InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(webUtil);
		creatInvoice.fillUpInvoiceInformation("Test Account Name And Contact Name Addition");
		webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");

	}
   ///  cadric beust 
	
	    /////   TestNG  JUnit
	
	   ////  Cucumber   -   BDD 
	
	
	
	
	
	
	
}
