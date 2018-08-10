package com.myproject.bride.lib.data;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.myproject.bride.lib.entity.Project;
import com.myproject.bride.lib.entity.Vendor;

public class VendorVO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Vendor vendor;
	private List<Project> listProject;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public List<Project> getListProject() {
		return listProject;
	}

	public void setListProject(List<Project> listProject) {
		this.listProject = listProject;
	}

	
}
