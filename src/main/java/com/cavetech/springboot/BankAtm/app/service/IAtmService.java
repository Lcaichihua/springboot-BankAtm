package com.cavetech.springboot.BankAtm.app.service;



import com.cavetech.springboot.BankAtm.app.domain.Atm;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAtmService {
	public Mono<Atm> buscarPorCodeAtm(Integer codeAtm);
	
	Mono<Atm> save(Atm atm);

	 Mono<Atm> update(Atm atm);

	Flux<Atm> findAll();

	Mono<Atm> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(Atm atm);
}
