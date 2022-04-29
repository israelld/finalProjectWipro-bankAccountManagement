package com.bankAccountManagement.finalProjectWipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankAccountManagement.finalProjectWipro.model.SpecialAccount;

@Repository
public interface SpecialAccountRepository extends JpaRepository<SpecialAccount, Long> {

}
