package io.kodlama.adapters.Inmemory.Abstracts;

import io.kodlama.Entites.Concretes.EmailValidationEntity;
import io.kodlama.Entites.Concretes.UserEntity;

public interface EmailValidation {

    boolean EmailDogrula(EmailValidationEntity email,UserEntity user);
    EmailValidationEntity EmailDogrula();
    void sendMail();


}
