package com.tutorial;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdjudicationController {

    @RequestMapping(value="/adjudicate", method = RequestMethod.POST)
    public Adjudicate adjudicate(@RequestBody Adjudicate ajdt, HttpServletResponse response) {
    	response.setStatus(202);
    	return ajdt;
    }
    
    @RequestMapping(value="/adjudicate", method = RequestMethod.GET)
    public Adjudicate adjudicate(@RequestParam(value="policyNumber", defaultValue="1234") String policyNumber,
    						 @RequestParam(value="policyHolder", defaultValue="Sheetal") String policyHolder,
    						 @RequestParam(value="claimAmount", defaultValue="500") String claimAmount) {
        			
    	Adjudicate ajdt = new Adjudicate(policyNumber, policyHolder, claimAmount);
    	return ajdt;
       
    }
}
