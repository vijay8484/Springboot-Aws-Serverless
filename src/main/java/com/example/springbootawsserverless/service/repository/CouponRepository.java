package com.example.springbootawsserverless.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootawsserverless.entity.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long>{
	
	List<Coupon> findByUserId(Long id);
	
}
