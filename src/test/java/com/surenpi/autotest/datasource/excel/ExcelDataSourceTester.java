package com.surenpi.autotest.datasource.excel;


import java.io.File;

import org.junit.Test;

import com.surenpi.autotest.datasource.FileResource;

/**
 * excel测试类
 * @author suren
 * @date 2016年9月6日 下午9:27:07
 */
public class ExcelDataSourceTester {

	@Test
	public void excelDataSource() {
		ExcelDataSource excelDataSource = new ExcelDataSource();
		
		excelDataSource.loadData(new FileResource(new File("D:/b.xlsx")), null);
	}
}
