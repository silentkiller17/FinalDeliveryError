package com.example.FinalProjectSpringBoot.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "delivery_personnel")
public class DeliveryPersonnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personnelId;

    private String name;

    private String contactDetails;

    private boolean availability;

    @OneToMany(mappedBy = "deliveryPersonnel")
    private List<Order> assignedOrders;

	public DeliveryPersonnel(Long personnelId, String name, String contactDetails, boolean availability,
			List<Order> assignedOrders) {
		super();
		this.personnelId = personnelId;
		this.name = name;
		this.contactDetails = contactDetails;
		this.availability = availability;
		this.assignedOrders = assignedOrders;
	}

	public DeliveryPersonnel() {
		// TODO Auto-generated constructor stub
	}

	public Long getPersonnelId() {
		return personnelId;
	}

	public void setPersonnelId(Long personnelId) {
		this.personnelId = personnelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public List<Order> getAssignedOrders() {
		return assignedOrders;
	}

	public void setAssignedOrders(List<Order> assignedOrders) {
		this.assignedOrders = assignedOrders;
	}

	@Override
	public String toString() {
		return "DeliveryPersonnel [personnelId=" + personnelId + ", name=" + name + ", contactDetails=" + contactDetails
				+ ", availability=" + availability + ", assignedOrders=" + assignedOrders + "]";
	}

    // Constructors, getters, and setters
    
    
}
