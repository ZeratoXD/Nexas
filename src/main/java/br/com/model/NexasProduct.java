package br.com.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

public class NexasProduct {
	
	@Entity
	@Table(name = "tb_products")
	public class Product {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    private BigDecimal price;

	    private BigDecimal retailPrice;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public BigDecimal getRetailPrice() {
			return retailPrice;
		}

		public void setRetailPrice(BigDecimal retailPrice) {
			this.retailPrice = retailPrice;
		}

	    
	}


}
