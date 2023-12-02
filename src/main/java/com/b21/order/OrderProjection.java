package com.b21.order;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noLinks", types = { Order.class })
public interface OrderProjection {
	String getId();
	 String getDateofpurchase();
	    String getTotal();
	    String getCustomerid();
	    String getPaymentmode();
	    String getShopid();
	    
}