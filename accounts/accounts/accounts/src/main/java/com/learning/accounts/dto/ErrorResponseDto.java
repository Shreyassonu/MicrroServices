package com.learning.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {
    @Schema(
            description = "API Invoked by Client"
        )
    private String apiPath;
    @Schema(
            description = "Error code representing error happened"
    )
    private HttpStatus errorCode;
    @Schema(
            description = "Error message representing error happened"
    )
    private String errorMessage;
    @Schema(
            description = "Error time representing error happened"
    )
    private LocalDateTime errorTime;
}
