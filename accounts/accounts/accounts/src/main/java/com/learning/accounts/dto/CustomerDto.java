package com.learning.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and account information"
)
public class CustomerDto
{
    @Schema(
            description = "name of the Customer",example = "Rajesh"
    )
    @NotEmpty(message = "name cannot be empty or null")
    @Size(min = 3,max = 30,message = "The length of the characters in between 3 to 30")
    private String name;
    @Schema(
            description = "email address of the Customer",example = "rajesh@gmail.com"
    )
    @Email(message = "email should be a valid value")
    @NotEmpty(message = "name cannot be empty or null")
    private String email;

    @Schema(
            description = "Contact number of the Customer",example = "9036480175"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "mobile number must be 10 digits")
    private String mobileNumber;
    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
