package com.smc.sba.controller;

import org.springframework.web.bind.annotation.*;

import com.smc.sba.entity.CompanyEntity;
import com.smc.sba.service.CompanyService;
import com.smc.sba.service.StockPriceService;
import com.smc.sba.utils.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import com.smc.sba.utils.*;

@CrossOrigin
@RestController
@RequestMapping("/company")
public class UpdateController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CompanyService companyService;
	
	
	@PostMapping("/newCompany")
	public CommonResult newCompany(@RequestBody CompanyEntity companyDtl) {
		return companyService.insertUpdateCompany(companyDtl);
	}
	
//	@PostMapping("/updateCompany")
	@PutMapping("/updateCompany")
	public CommonResult updateCompanyByCompanyName(//@PathVariable("companyName") String companyName,
			@RequestBody CompanyEntity companyDtl) {
		//CompanyEntity companyDtl = companyService.getCompanyByCompanyName(companyName);
		return companyService.insertUpdateCompany(companyDtl);
	}
	
	@PostMapping("/activeCompany")
	public CommonResult activeCompany(@RequestParam("companyName") String companyName) {
		return companyService.setActiveForCompany(companyName, "1");
	}
	
	@PostMapping("/inactiveCompany")
	public CommonResult inactiveCompany(@RequestParam("companyName") String companyName) {
		return companyService.setActiveForCompany(companyName, "0");
	}
	

}
