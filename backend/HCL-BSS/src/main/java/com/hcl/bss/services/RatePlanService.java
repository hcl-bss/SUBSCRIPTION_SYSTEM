package com.hcl.bss.services;

import java.io.Serializable;
import java.util.List;

import com.hcl.bss.dto.ProductDto;
import com.hcl.bss.dto.RatePlanDto;

public interface RatePlanService {

	Serializable addRatePlan(ProductDto product);

	List<RatePlanDto> getAllPlans();
}