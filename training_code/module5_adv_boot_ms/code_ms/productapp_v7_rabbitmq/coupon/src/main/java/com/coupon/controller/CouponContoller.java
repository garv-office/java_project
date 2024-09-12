package com.coupon.controller;

import com.coupon.dto.ConfigDto;
import com.coupon.dto.CouponDto;
import com.coupon.entities.Coupon;
import com.coupon.service.CouponService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
public class CouponContoller {
	
	@Autowired
	private CouponService couponService;
	@Autowired
	private ConfigDto configDto;

	@GetMapping(path = "info")
	public ConfigDto getConfigDto(){
		return configDto;
	}

	@GetMapping(path="coupons")
	public List<CouponDto> getAll(){
		return couponService.getAll();
	}
	
	@GetMapping(path="couponbyid/{id}")
	public CouponDto getAnCouponById(@PathVariable(name="id") int id){
		return couponService.getCouponById(id);
	}
	
	@GetMapping(path="couponbycode/{couponCode}")
	public CouponDto getAnCouponByCode(@PathVariable(name="couponCode") String couponCode){
		log.info("coupon is loaded with code {}", couponCode);
		return couponService.getCouponByCouponCode(couponCode);
	}
}