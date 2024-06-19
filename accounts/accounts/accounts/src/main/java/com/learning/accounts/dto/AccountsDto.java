package com.learning.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold account information"
)
public class AccountsDto {
    @Schema(
            description = "Account number of MyBank account",example = "4545454545"
    )
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;
    @Schema(
            description = "Account type of MyBank account",example = "SAVINGS"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;
    @Schema(
            description = "Branch Address of MyBank account",example = "123,Dubai"
    )
    @NotEmpty(message = "branch address cannot be null or empty")
    private String branchAddress;

}
