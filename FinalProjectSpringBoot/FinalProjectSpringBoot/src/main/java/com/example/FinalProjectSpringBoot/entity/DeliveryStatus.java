package com.example.FinalProjectSpringBoot.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "delivery_status")
public class DeliveryStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;

    private String statusName;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private LocalDateTime timestamp;
    
    // Constructors, getters, and setters

	public DeliveryStatus(Long statusId, String statusName, Order order, LocalDateTime timestamp) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
		this.order = order;
		this.timestamp = timestamp;
	}

	public DeliveryStatus() {
		
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

   
    
}
