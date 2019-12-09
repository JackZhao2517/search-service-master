package com.smc.sba.service;

import com.smc.sba.entity.StockPriceEntity;
import com.smc.sba.repository.CompanyRepository;
import com.smc.sba.repository.StockPriceRepository;
import com.smc.sba.repository.IpoDetlsRepository;
import com.smc.sba.utils.CommonResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smc.sba.entity.*;

/**
 * @ClassName StockPriceService
 * @Description TODO
 * @Author YuChaoZheng
 * @Date 12/3/2019 9:40 AM
 * @Version 1.0
 **/
@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	private IpoDetlsRepository ipoDetlsRepository;

	/**
	 * Used by function UserLogin
	 */
	public CommonResult findAll() {
		//companyRepository.findAll();
		return CommonResult.build(200, "search success!", companyRepository.findAll());
	}
	public CommonResult findByCompanyid(Integer cpId) {
		CompanyEntity result= companyRepository.findByCompanyid(cpId);
		return CommonResult.build(200, "search findByCompanyid success!", result);
	}
	//UpdateController Jack
	public CommonResult insertUpdateCompany(CompanyEntity companyDtl) {
		companyRepository.save(companyDtl);
		return CommonResult.build(200, "search insertUpdateCompany success!", companyDtl);
	}
	public CommonResult getCompanyByCompanyName(String company) {
		CompanyEntity result = companyRepository.findByCompanyName(company);
		return CommonResult.build(200, "search getCompanyByCompanyName success!", result);
	}
	public CommonResult setActiveForCompany(String cpName, String active) {
		companyRepository.setActiveForCompany(cpName,active);
		return CommonResult.build(200, "search setActiveForCompany success!");
	}
}
