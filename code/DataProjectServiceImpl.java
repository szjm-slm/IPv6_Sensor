package com.yxj.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxj.common.mybatis.Page;
import com.yxj.entity.DataProject;
import com.yxj.system.dao.DataProjectDao;
import com.yxj.system.service.DataProjectService;

@Service("dataProjectService")
public class DataProjectServiceImpl implements DataProjectService{
	
	@Autowired
	private DataProjectDao projectDao;

	@Override
	public Page<DataProject> getProjectByPage(Page<DataProject> page,DataProject project) {
		List<DataProject> projects = projectDao.getProjectByPage(page, project);
		page.setResults(projects);
		return page;
	}

	@Override
	public List<DataProject> getProjectByXmbh(String xmbh,String jdbh) {
		// TODO Auto-generated method stub
		return projectDao.getProjectByXmbhOrJdbh(xmbh,jdbh);
	}

	@Override
	public int addProject(DataProject project) {
		return projectDao.addProject(project);
		
	}

	@Override
	public int updateProject(DataProject project) {
		return projectDao.updateProject(project);
		
	}

	@Override
	public int deleteProject(List<String> jdbhs) {
		return projectDao.deleteProject(jdbhs);
		
	}

}
