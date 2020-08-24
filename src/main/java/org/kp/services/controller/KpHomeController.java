package org.kp.services.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.kp.services.dao.KPClientProxy;
import org.kp.services.model.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KpHomeController {
	private Patient patient;

	@Autowired
	private Environment env;

	@Autowired
	private KPClientProxy proxy;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("I am in the homeKP");
		Patient patient = new Patient();
		model.addAttribute("patient", patient);
		return "index";
	}

	@RequestMapping(value = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("patient") Patient pat) {

		System.out.println(patient);

		Patient patient = postPatient(pat);

		return "detail";

	}

	public Patient postPatient(Patient patient) {
		// RestTemplate restTemplate = new RestTemplate();

		// Patient postForObject =
		// restTemplate.postForObject("http://localhost:8082/jpa/patients", patient,
		// Patient.class);
		Patient postForObject = proxy.addPatient(patient);

		System.out.println("==========================================================\n");
		System.out.println(postForObject.getPort());
		logger.info("{}", postForObject);

		System.out.println("==========================================================\n");

		return postForObject;
	}

	@RequestMapping(value = "/getpatient")
	public String getPatient(@ModelAttribute("patient") Patient pat) {

		System.out.println(pat.getMediacalNumber());
		Integer id = pat.getMediacalNumber();
		Patient info = proxy.getInfo(id);

		logger.info("{}", info);
//		pat = new Patient(, info.getFirstName(), info.getLastName(), info.getappointment(),
//				info.getDoctor(), info.getEmail(), info.getMessage(), info.getPort());
		
		pat.setMediacalNumber(info.getMediacalNumber());
		pat.setFirstName(info.getFirstName());
		pat.setLastName(info.getLastName());
		pat.setEmail(info.getEmail());
		pat.setDoctor(info.getDoctor());
		pat.setappointment(info.getappointment());
		pat.setMessage(info.getMessage());
		pat.setPort(info.getPort());

		return "detail";

	}

}
