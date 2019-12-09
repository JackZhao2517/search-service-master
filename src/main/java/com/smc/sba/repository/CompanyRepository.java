package com.smc.sba.repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import com.smc.sba.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.transaction.annotation.Transactional;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {

	@Query(name = "getCompanyNameByCode", nativeQuery = true, value = "SELECT companyname from company where companycode = :companyCode")
	String getCompanyNameByCode(String companyCode);
	
//	@Query(name = "findByCompanyid", nativeQuery = true, value = "SELECT * from company where companyid = :id")
	CompanyEntity findByCompanyid(Integer id);
	
	//UpdateController Jack
	CompanyEntity findByCompanyName(String cpName);
	
	@Transactional
	@Modifying()
	@Query(name = "setActiveForCompany", nativeQuery = true, value = "update company set companystatus = :active where companyname = :companyName")
	void setActiveForCompany(String companyName, String active);
}

