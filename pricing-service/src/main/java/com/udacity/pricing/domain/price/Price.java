package com.udacity.pricing.domain.price;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
public class Price {

    private String currency;
    private BigDecimal price;
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Price() {
    }

    public Price(String currency, BigDecimal price, Long id) {
        this.currency = currency;
        this.price = price;
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
