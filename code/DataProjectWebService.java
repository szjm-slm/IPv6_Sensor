package com.yxj.common.webservice;

import com.yxj.common.web.JsonResult;
public class DataProjectWebService {
	
	DataProjectWebServiceUtil projectWebServiceUtil = new DataProjectWebServiceUtil();
	
	public String add(String xmbh, String xmmc, String xmfzr, String jdbh, Double jdwd, Double jdsd,String jdwz) {
		
		return projectWebServiceUtil.add(xmbh, xmmc, xmfzr, jdbh, jdwd, jdsd,jdwz);
	}
	
	
	public String delete(String jdbh) {
		
		return projectWebServiceUtil.delete(jdbh);
	}
	

	public String update(String xmbh, String xmmc, String xmfzr, String jdbh, Double jdwd, Double jdsd,String jdwz) {
		
		return projectWebServiceUtil.update(xmbh, xmmc, xmfzr, jdbh, jdwd, jdsd,jdwz);
	}
	

	public JsonResult getProject(Integer currentPage,Integer pageSize,String xmbh,String xmmc,String jdbh,String xmfzr) {
		
		return projectWebServiceUtil.getProject(currentPage, pageSize, xmbh, xmmc, jdbh, xmfzr);
	}
	

}
