/**
 * 
 */
package com.ge.aviation.cube.engine.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.ge.aviation.cube.engine.service.ifc.IServiceCreditCustomerRatingService;

/**
 * @author TCS
 *
 */
@Service
public class ServiceCreditCustomerRatingServiceImpl implements IServiceCreditCustomerRatingService {
	
	private static final Logger LOGGER = Logger.getLogger(ServiceCreditCustomerRatingServiceImpl.class.getName());

	/*@Autowired
	private Environment env;*/

	@Override
	public String getStatus(Integer value) {
		if(value.equals(123)){
			return "true";
		} else {
			return "false";
		}
	}

	
}
