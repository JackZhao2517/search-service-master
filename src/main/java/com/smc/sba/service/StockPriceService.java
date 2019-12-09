package com.smc.sba.service;

import com.smc.sba.entity.StockPriceEntity;
import com.smc.sba.repository.CompanyRepository;
import com.smc.sba.repository.StockPriceRepository;
import com.smc.sba.utils.CommonResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StockPriceService
 * @Description TODO
 * @Author YuChaoZheng
 * @Date 12/3/2019 9:40 AM
 * @Version 1.0
 **/
@Service
public class StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepository;
	@Autowired
	private CompanyRepository companyRepository;

	/**
	 * Used by function UserLogin
	 */
	public CommonResult insert(List<StockPriceEntity> validDatas) {
		stockPriceRepository.saveAll(validDatas);
		String companyName = companyRepository
				.getCompanyNameByCode(validDatas.get(0).getCompanyCode());
		Map<String, String> map = new HashMap();
		map.put("record", String.valueOf(validDatas.size()));
		map.put("companyName", companyName);
		map.put("stockExchange", validDatas.get(0).getStockExchange());
		map.put("fromDate", "");
		map.put("toDate", "");
		return CommonResult.build(200, "upload success!", map);
	}

}
