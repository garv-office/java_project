package com.productapp.repo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_table1")
public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		@NotEmpty(message = "{product.name.absent}")
		@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*",
				message = "{product.name.invalid}")
		private String name;

		@NotNull(message = "{product.price.absent}")
		@Range(min = 100, max = 100000, message = "{product.price.invalid}")
		private BigDecimal price;

	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
}