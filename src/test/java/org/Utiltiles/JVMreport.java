package org.Utiltiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

public static void genJVM(String jsonpath) {
	//set file path to store JVM report
	File f = new File(System.getProperty("user.dir")+"\\target\\JVMReport");
	//Config details
	Configuration con = new Configuration(f, "Wallsgreen  Application");
	con.addClassifications("Sprint", "23");
	con.addClassifications("Feature", "to validate login functionality");
	List<String> li = new ArrayList<String>();
	li.add(jsonpath);
	ReportBuilder r = new ReportBuilder(li, con);
	r.generateReports();
	}



}
