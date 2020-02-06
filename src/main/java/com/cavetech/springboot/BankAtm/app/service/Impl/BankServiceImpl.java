package com.cavetech.springboot.BankAtm.app.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cavetech.springboot.BankAtm.app.domain.Bank;
import com.cavetech.springboot.BankAtm.app.repository.IBankRepository;
import com.cavetech.springboot.BankAtm.app.service.IBankService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class BankServiceImpl implements IBankService{
	@Autowired
	private IBankRepository bankRepository;
	
	
	@Override
	public Flux<Bank> findAll() {
		return bankRepository.findAll();
	}

	@Override
	public Mono<Bank> findById(String id) {
		return bankRepository.findById(id);
	}

	@Override
	public Mono<Bank> save(Bank t) {
		return bankRepository.save(t);
	}
	
	@Override
	public Mono<Bank> update(Bank t) {
		return bankRepository.save(t);
	}

	
	@Override
	public Mono<Void> delete(Bank t) {
		return bankRepository.delete(t);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return bankRepository.deleteById(id);
	}

	@Override
	public Mono<Bank> buscarPorCodeBank(Integer codeBank) {
		return bankRepository.findByCodeBank(codeBank);
	}
}
