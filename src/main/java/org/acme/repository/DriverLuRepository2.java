package org.acme.repository;

import org.acme.model.DriverLu;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class DriverLuRepository2 implements PanacheRepository<DriverLu> {
	
	public long countDriversLu(long response) {
		response = count();
		return response;
	}
}
