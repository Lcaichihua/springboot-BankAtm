package com.cavetech.springboot.BankAtm.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.cavetech.springboot.BankAtm.app.domain.Bank;

import reactor.core.publisher.Mono;
@Repository
public interface IBankRepository extends ReactiveMongoRepository<Bank, String>{
	Mono<Bank> findByCodeBank(Integer codeBank);
}
