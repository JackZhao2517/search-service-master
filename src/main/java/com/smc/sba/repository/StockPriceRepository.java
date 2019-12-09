package com.smc.sba.repository;

import com.smc.sba.entity.StockPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {

}

