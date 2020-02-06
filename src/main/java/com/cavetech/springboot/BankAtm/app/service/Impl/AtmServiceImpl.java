package com.cavetech.springboot.BankAtm.app.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cavetech.springboot.BankAtm.app.domain.Atm;
import com.cavetech.springboot.BankAtm.app.repository.IAtmRepository;
import com.cavetech.springboot.BankAtm.app.repository.IBankRepository;
import com.cavetech.springboot.BankAtm.app.service.IAtmService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AtmServiceImpl implements IAtmService{
	@Autowired
	private IAtmRepository atmRepo;

	@Autowired
	private IBankRepository bankRepo;
	@Override
	public Flux<Atm> findAll() {
		return atmRepo.findAll();
	}	

	@Override
	public Mono<Atm> findById(String id) {
		return atmRepo.findById(id);
	}

	@Override
	public Mono<Atm> save(Atm t) {
		return bankRepo.findById(t.getBank().getIdBank()).flatMap(bank -> {
			t.setBank(bank);
			return atmRepo.save(t);
		});
	}

	@Override
	public Mono<Atm> update(Atm t) {
		return bankRepo.findById(t.getBank().getIdBank()).flatMap(bank -> {
			t.setBank(bank);
			return atmRepo.save(t);
		});
	}

	@Override
	public Mono<Void> delete(Atm t) {
		return atmRepo.delete(t);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return atmRepo.deleteById(id);
	}

	@Override
	public Mono<Atm> buscarPorCodeAtm(Integer codeAtm) {
		return atmRepo.findByCodeAtm(codeAtm);
	}

}
