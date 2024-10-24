package br.com.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import br.com.model.NexasClient.Client;
import br.com.model.NexasProduct.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

public class NexasOrder {
	
	@Entity
	@Table(name = "tb_orders")
	public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	
	    private LocalDate orderDate;

	    @ManyToOne
	    @JoinColumn(name = "tb_client_id_client")
	    private Client cliente;

	    @ManyToOne
	    @JoinColumn(name = "tb_products_id_product")
	    private Product produto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDate getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}

		public Client getCliente() {
			return cliente;
		}

		public void setCliente(Client cliente) {
			this.cliente = cliente;
		}

		public Product getProduto() {
			return produto;
		}

		public void setProduto(Product produto) {
			this.produto = produto;
		}

	    
	}

	
	

}
