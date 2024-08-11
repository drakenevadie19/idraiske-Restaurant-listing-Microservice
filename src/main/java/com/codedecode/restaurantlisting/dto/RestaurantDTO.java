package com.codedecode.restaurantlisting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {

    // Characteristics show case a restaurant
    private int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;

}
