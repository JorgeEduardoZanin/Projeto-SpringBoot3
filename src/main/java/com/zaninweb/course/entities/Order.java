package com.zaninweb.course.entities;

import java.io.Serializable;
import java.time.Instant;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

import com.zaninweb.course.entities.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
=======
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
<<<<<<< HEAD
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
=======
public class Order implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
<<<<<<< HEAD

	private Instant moment;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private User client;

	@OneToMany(mappedBy = "id.order")
	private Set<OrderItem> items = new HashSet<>();
	
	
	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
		super();
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
=======
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z", timezone = "GMT")
	private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User client;
	
	public Order(){
		
	}

	public Order(Long id, Instant moment, User client) {
		super();
		this.id = id;
		this.moment = moment;
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
		this.client = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
<<<<<<< HEAD
	

	 public OrderStatus getOrderStatus() { 
	        return orderStatus;
	    }

	    public void setOrderStatus(OrderStatus orderStatus) { 
	        this.orderStatus = orderStatus;
	    }
=======
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

<<<<<<< HEAD
	
	
	public Set<OrderItem> getItems() {
		return items;
	}
	
	public Double getTotal() {
		double sum = 0.0;
		for (OrderItem x : items) {
			sum += x.getSubTotal();
		}
		return sum;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
=======
	@Override
	public int hashCode() {
		return Objects.hash(id);
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
<<<<<<< HEAD
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
=======
		return Objects.equals(id, other.id);
	}
	
	
	
}
>>>>>>> 0e476dc0fb346a255d03dbc2d9f06d1f58f7b235
