package com.ge.aviation.cube.engine.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ge.aviation.cube.engine.service.ifc.IServiceCreditCustomerRatingService;

@RestController
public class ServiceCreditCustomerRatingController {

	private static final Logger LOGGER = Logger.getLogger(ServiceCreditCustomerRatingController.class);

	@Autowired
	private IServiceCreditCustomerRatingService serviceCreditCustomerRatingService;

	public IServiceCreditCustomerRatingService getServiceCreditCustomerRatingService() {
		return serviceCreditCustomerRatingService;
	}

	@GET
	@RequestMapping(value = "/customerRating", method = RequestMethod.GET)
	@Consumes({ MediaType.APPLICATION_JSON })
	public String getStatus(@RequestParam Integer value) {
		
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("DUNS Number >> " + value);
		}
		String status = getServiceCreditCustomerRatingService().getStatus(value);
		return status;
	}
}
