package org.acme.repositoryimpl;

import javax.inject.Inject;

import org.acme.repository.DriverLuRepository;

public class DriverLuImpl implements DriverLuRepository{

	@Inject
	private DriverLuRepository driverLuRepository;
	
	@Override
	public long countDriversLu(long response) {
		response = driverLuRepository.count();
//		response = count();
		return response;
	}

}
