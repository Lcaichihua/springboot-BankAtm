package com.cavetech.springboot.BankAtm.app.service;





import com.cavetech.springboot.BankAtm.app.domain.Bank;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBankService {
	public Mono<Bank> buscarPorCodeBank(Integer codeBank);
	
	
	Mono<Bank> save(Bank bank);

	 Mono<Bank> update(Bank bank);

	Flux<Bank> findAll();

	Mono<Bank> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(Bank bank);
}
