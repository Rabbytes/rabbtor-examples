package com.rabbtor.example.web.models

import com.rabbtor.model.annotation.DisplayName
import com.rabbtor.model.annotation.Model
import org.hibernate.validator.constraints.NotEmpty

import javax.validation.Valid
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


@Model('registerCmd')
class RegisterCommand
{
    @DisplayName("Full Name")
    @NotEmpty
    String name

    @DisplayName("Date of Birth")
    @NotNull
    Date dateOfBirth

    @DisplayName("Country")
    @NotNull
    Long country

    @DisplayName("Height")
    @NotNull
    Double height

    @DisplayName("Weight")
    @NotNull
    Float weight

    @DisplayName("Unique Code")
    @NotNull
    UUID code

    @Valid
    @Size(min=1)
    List<AddressCommand> addresses = [new AddressCommand()]

    String mode = 'save'

}
