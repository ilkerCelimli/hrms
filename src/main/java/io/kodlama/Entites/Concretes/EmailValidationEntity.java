package io.kodlama.Entites.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "email_validations")


public class EmailValidationEntity{

    @JoinColumn(name = "email_validations_id")
    @Id
    @Column(name = "email_validations_id")

    private long emailValidationsId;

    @Column
    @NotNull
    @NotBlank
    @Email
    private String email;

    @Column(name ="email_validation_code")
    private String emailValidationCode;

    @Column private boolean validation = false;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    private UserEntity user;

}
