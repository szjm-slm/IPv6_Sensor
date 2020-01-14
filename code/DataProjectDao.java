package com.yxj.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yxj.common.mybatis.Page;
import com.yxj.entity.DataProject;

public interface DataProjectDao {
	
	List<DataProject> getProjectByPage(@Param("page") Page<DataProject> page,@Param("param") DataProject project);
	
	List<DataProject> getProjectByXmbhOrJdbh(@Param("xmbh") String xmbm,@Param("jdbh") String jdbm);
	
	int addProject(@Param("param") DataProject project);
	
	int updateProject(@Param("param") DataProject project);
	
	int deleteProject(@Param("list") List<String> jdbms);

}
