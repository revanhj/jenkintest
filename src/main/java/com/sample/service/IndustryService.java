package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.Industry;
import com.sample.repository.IndustryRepository;

@Service
public class IndustryService {

	@Autowired
	private IndustryRepository industryRepository;

	 

	public List<Industry> getIndustryList(List<String> sicCode) {
		List<Industry> finalresult = industryRepository.findBySicCodeIn(sicCode);
		System.out.println("DISPLAY iNDUSTRY lIST ON CONSOLE :" + finalresult);
		return finalresult;

	}
}
