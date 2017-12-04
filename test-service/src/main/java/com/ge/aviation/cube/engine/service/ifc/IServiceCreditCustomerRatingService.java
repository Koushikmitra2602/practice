/**
 * 
 */
package com.ge.aviation.cube.engine.service.ifc;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author TCS
 *
 */
@Qualifier("ServiceCreditCustomerRatingServiceImpl")
public interface IServiceCreditCustomerRatingService {

	public String getStatus(Integer value);


}
