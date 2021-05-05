package com.diploma.demo.core.landplot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "home_number")
    private String homeNumber;

    @Column(name = "apartment_n")
    private Long apartmentN;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (region != null) sb.append(region).append(" ");
        if (city != null) sb.append("г.").append(city).append(" ");
        if (street != null) sb.append("ул.").append(street).append(" ");
        if (homeNumber != null) sb.append("д.").append(homeNumber).append(" ");
        if (apartmentN != null) sb.append("кв").append(apartmentN).append(" ");
        return sb.toString();
    }

}
