package hu.me.iit.carshop.api.service;

import java.util.Collection;

import hu.me.iit.carshop.api.model.Car;

public interface CarManagementService {

	Collection<Car> listCars();
	void acquireCar(Car car);
}
