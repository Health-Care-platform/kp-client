package org.kp.services.dao;


import javax.validation.Valid;

import org.kp.services.model.Patient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@FeignClient(name = "kaiser-service", url = "localhost:8082")
//@FeignClient(name = "kaiser-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "kaiser-service")
public interface KPClientProxy {
	
	@RequestMapping(method = RequestMethod.POST, value = "/kaiser-service/jpa/patients", consumes = "application/json", produces = "application/json")
	public Patient addPatient(@Valid @RequestBody Patient patient);
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/kaiser-service/jpa/patients/{medicalId}", consumes = "application/json", produces = "application/json")
	public Patient getInfo(@PathVariable int medicalId);

	
}
