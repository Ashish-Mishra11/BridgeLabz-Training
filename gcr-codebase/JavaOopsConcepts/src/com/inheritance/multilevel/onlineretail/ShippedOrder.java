package com.inheritance.multilevel.onlineretail;

public class ShippedOrder extends Order {
	protected String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped "+ orderDate;
    }

}
