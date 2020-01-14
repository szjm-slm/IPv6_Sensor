package com.yxj.common.webservice;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;

import com.yxj.common.mybatis.Page;
import com.yxj.common.utils.JsonUtil;
import com.yxj.common.utils.SpringWebContextUtil;
import com.yxj.common.web.JsonResult;
import com.yxj.entity.DataProject;
import com.yxj.system.service.DataProjectService;
public class DataProjectWebServiceUtil {
	
	private static DataProjectService dataProjectService;
	
	public String add(String xmbh, String xmmc, String xmfzr, String jdbh, Double jdwd, Double jdsd,String jdwz) {
		DataProject dataproject = new DataProject();
		dataproject.setXmbh(xmbh);
		dataproject.setXmmc(xmmc);
		dataproject.setXmfzr(xmfzr);
		dataproject.setJdbh(jdbh);
		dataproject.setJdwd(jdwd);
		dataproject.setJdsd(jdsd);
		dataproject.setJdwz(jdwz);
		int count = getProjectService().addProject(dataproject);
		return "成功添加"+count+"条记录!";
	}

	public String delete(String jdbh) {
		List<String> list = new ArrayList<>();
		String[] idArray = jdbh.split(",");
		for(String id:idArray) {
			list.add(id);
		}
		int count = getProjectService().deleteProject(list);
		return "成功删除"+count+"条记录!";
	}
	

	public String update(String xmbh, String xmmc, String xmfzr, String jdbh, Double jdwd, Double jdsd,String jdwz) {
		int count = 0;
		if(StringUtils.isBlank(jdbh)) {
			return "节点编号jdbh不能为空!";
		}
		DataProject dataproject = new DataProject();
		dataproject.setXmbh(xmbh);
		dataproject.setXmmc(xmmc);
		dataproject.setXmfzr(xmfzr);
		dataproject.setJdbh(jdbh);
		dataproject.setJdwd(jdwd);
		dataproject.setJdsd(jdsd);
		dataproject.setJdwz(jdwz);
		if(StringUtils.isBlank(xmmc)&&StringUtils.isBlank(xmbh)&&StringUtils.isBlank(xmfzr)&&
				jdwd==null&&jdsd==null&&StringUtils.isBlank(jdwz)) {
			
		}else {
			count = getProjectService().updateProject(dataproject);
		}
		return "成功修改"+count+"条记录!";
	}
	
	public JsonResult getProject(Integer currentPage,Integer pageSize,String xmbh,String xmmc,String jdbh,String xmfzr) {
		DataProject dataProject = new DataProject();
		dataProject.setXmbh(xmbh);
		dataProject.setXmmc(xmmc);
		dataProject.setJdbh(jdbh);
		dataProject.setXmfzr(xmfzr);
		currentPage = currentPage!=null?currentPage:1;
		pageSize = pageSize!=null?pageSize:10;
		Page<DataProject> page = new Page<>();
		page.setCurrentPage(currentPage);
		page.setPageSize(pageSize);
		return new JsonResult(JsonUtil.toJson(getProjectService().getProjectByPage(page, dataProject)));
	}

	public static DataProjectService getProjectService(){
		if(dataProjectService==null){
			ApplicationContext ac =SpringWebContextUtil.getApplicationContext();
			dataProjectService = (DataProjectService) ac.getBean("dataProjectService");
		}
		return dataProjectService;
	}
}
