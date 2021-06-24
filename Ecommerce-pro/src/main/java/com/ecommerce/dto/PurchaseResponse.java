package com.ecommerce.dto;



public class PurchaseResponse {
	 
	private final String orderTrackingNumber;

	
	
	
	
	
	
	// setter
	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	} 

 //to string 
	@Override
	public String toString() {
		return "PurchaseResponse [orderTrackingNumber=" + orderTrackingNumber + "]";
	}



	//hash code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderTrackingNumber == null) ? 0 : orderTrackingNumber.hashCode());
		return result;
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseResponse other = (PurchaseResponse) obj;
		if (orderTrackingNumber == null) {
			if (other.orderTrackingNumber != null)
				return false;
		} else if (!orderTrackingNumber.equals(other.orderTrackingNumber))
			return false;
		return true;
	}

	public PurchaseResponse(String orderTrackingNumber) {
		super();
		this.orderTrackingNumber = orderTrackingNumber;
	}
	
	
	

	   
	   
}
	

