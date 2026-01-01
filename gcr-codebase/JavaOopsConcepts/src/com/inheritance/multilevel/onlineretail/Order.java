package com.inheritance.multilevel.onlineretail;

public class Order {
	protected String orderId;
    protected String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed "+orderDate;
    }

}
