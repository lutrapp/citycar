package org.acme.repository;

import org.acme.model.DriverLu;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface DriverLuRepository extends PanacheRepository<DriverLu> {
	long countDriversLu(long response);
}
