package com.bankAccountManagement.finalProjectWipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankAccountManagement.finalProjectWipro.model.CreditCard;

@Repository
public interface CreditCardRepository  extends JpaRepository<CreditCard, Long> {

}
