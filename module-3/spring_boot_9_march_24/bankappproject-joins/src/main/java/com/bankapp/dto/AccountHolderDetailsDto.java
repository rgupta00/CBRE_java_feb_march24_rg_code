package com.bankapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountHolderDetailsDto {
    @Email(message = "{account.email.invalid}")
    @NotNull(message = "{account.email.absent}")
    private String email;

    @NotNull(message = "{account.phone.absent}")
    @Pattern(regexp = "[789][0-9]{9}", message = "{account.phone.invalid}")
    private String phone;
}
