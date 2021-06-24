package com.ecommerce.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Service.CheckoutService;
import com.ecommerce.dto.Purchase;
import com.ecommerce.dto.PurchaseResponse;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/checkout")
public class CheckoutController {

	private CheckoutService checkoutService;
	
	public CheckoutController(CheckoutService checkoutService) {
		this.checkoutService=checkoutService;
	}
	
	@PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse =  checkoutService.placeOrder(purchase);

        return purchaseResponse;
    } 

	@GetMapping("/get")
	public String getFunction() {
		return "hi";
	}
} 
