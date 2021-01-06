package com.example.springbootawsserverless.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springbootawsserverless.entity.Coupon;
import com.example.springbootawsserverless.service.repository.CouponRepository;
import com.example.springbootawsserverless.utility.Response;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
@Path("api/coupon")
public class CouponServiceImpl {

	@Autowired
	private CouponRepository couponRepository;
	
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response saveCoupon(List<Coupon> coupon) throws Exception {

		Response response = new Response();
		List<Coupon> savedCoupon = couponRepository.saveAll(coupon);
		response.setStatus(200);
		response.setData(savedCoupon);
		return response;
	}
	
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Response getAllCoupons() throws Exception {
		Response response = new Response();
		List<Coupon> dbCoupon = couponRepository.findAll();
		if (dbCoupon != null && !dbCoupon.isEmpty()) {
			response.setStatus(200);
			response.setData(dbCoupon);
		} else {
			response.setStatus(204);
		}
		return response;
	}

	@GET
	@Path(value = "/{userId}")
	@Produces("application/json")
	public Response getCoupon(@PathParam("userId") Long userId) throws Exception {
		Response response = new Response();
		List<Coupon> dbCoupon = couponRepository.findByUserId(userId);
		if (dbCoupon != null && !dbCoupon.isEmpty()) {
			response.setStatus(200);
			response.setData(dbCoupon);
		} else {
			response.setStatus(204);
		}
		return response;
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateCoupon(@PathParam("id") Long id, Coupon coupon) {
		Response response = new Response();
		List<Coupon> updatedCoupon = new ArrayList<>();
		Optional<Coupon> prevCoupon = couponRepository.findById(id);
		if (prevCoupon.isPresent()) {
			prevCoupon.get().setCouponCode(coupon.getCouponCode());
			prevCoupon.get().setUserId(coupon.getUserId());
			updatedCoupon.add(couponRepository.save(prevCoupon.get()));
			response.setStatus(200);
			response.setData(updatedCoupon);
		}

		response.setStatus(204);
		return response;
	}

	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response deleteCoupon(@PathParam("id") Long id) {
		Response response = new Response();
		couponRepository.deleteById(id);
		response.setStatus(200);
		return response;
	}
	

}
