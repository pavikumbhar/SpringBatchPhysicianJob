package com.rollingstone.physician.ranker.spring.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.rollingstone.physician.ranker.spring.service.IPhysicianService;

public class PhysicianBaseItemWriter {

	IPhysicianService physicianService;

	public IPhysicianService getPhysicianService() {
		return physicianService;
	}

	@Autowired
	@Required
	public void setPhysicianService(IPhysicianService physicianService) {
		this.physicianService = physicianService;
	}

}
