package hu.me.iit.carshop.api.service;

import java.util.Collection;
import java.util.Date;

import hu.me.iit.carshop.api.model.Announcement;
import hu.me.iit.carshop.api.model.Car;
import hu.me.iit.carshop.api.model.Price;

public interface AnnouncementManagmentService {

	Collection<Announcement> listAnnouncement();
	Collection<Announcement> listOpenAnnouncement();
	
	void announce(Car car, Date expire, Price price);
}
