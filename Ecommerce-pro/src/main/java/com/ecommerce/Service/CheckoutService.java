package com.ecommerce.Service;

import com.ecommerce.dto.Purchase;
import com.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
	PurchaseResponse placeOrder(Purchase purchase);
	
	
	
}
