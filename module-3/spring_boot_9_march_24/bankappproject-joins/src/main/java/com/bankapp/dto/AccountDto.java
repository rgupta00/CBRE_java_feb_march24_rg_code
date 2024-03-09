package com.bankapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
//validation ke annotation
public class AccountDto {
    private int id;
    @NotNull(message = "{account.name.absent}")
    @Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{account.name.invalid}")
    private String name;

    @NotNull(message = "{account.balance.absent}")
    @Range(min = 100, max = 100000, message = "{account.balance.invalid}")
    private BigDecimal balance;

    @Email(message = "{account.email.invalid}")
    @NotNull(message = "{account.email.absent}")
    private String email;

    @NotNull(message = "{account.phone.absent}")
    @Pattern(regexp = "[789][0-9]{9}", message = "{account.phone.invalid}")
    private String phone;

    public AccountDto(String name, BigDecimal balance, String email, String phone) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phone = phone;
    }
}







