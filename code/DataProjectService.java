package com.yxj.system.service;

import java.util.List;

import com.yxj.common.mybatis.Page;
import com.yxj.entity.DataProject;

public interface DataProjectService {
	
	Page<DataProject> getProjectByPage(Page<DataProject> page,DataProject dataproject);
	
	List<DataProject> getProjectByXmbh(String xmbh,String jdbh);
	
	int addProject(DataProject project);
	
	int updateProject(DataProject project);
	
	int deleteProject(List<String> xmbms);

}
