package com.rabbtor.example.web.models;

import com.rabbtor.model.annotation.DisplayName;
import com.rabbtor.model.annotation.Model;
import org.hibernate.validator.constraints.NotEmpty;

@Model("addressCmd")
public class AddressCommand
{
    @DisplayName("Street Address")
    @NotEmpty
    String streetAddress

    // This display name is overriden with a custom message in messages.properties
    @DisplayName("Zipcode")
    String zipCode
}
