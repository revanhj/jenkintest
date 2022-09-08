package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.Industry;
import com.sample.service.IndustryService;

@RestController
public class IndustryController {

	@Autowired
	private IndustryService industryService;

	@GetMapping("hi")
	public String sayHi() {
		return "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPRRRRRRRRRRRRRRRRRRRRRRRRRR";

	}

	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<Industry> addIndustry(@RequestBody Industry industry) {
		return ResponseEntity.ok(industryService.addIndustry(industry));
	}

	@GetMapping("get/{sicCode}")
	@ResponseBody
	public ResponseEntity<List<Industry>> getListOfIndustry(@PathVariable List<String> sicCode) {
		return ResponseEntity.ok(industryService.getIndustryList(sicCode));
	}
}
