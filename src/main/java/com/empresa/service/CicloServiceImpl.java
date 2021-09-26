package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Ciclo;
import com.empresa.repository.CicloRepository;

@Service
public class CicloServiceImpl implements CicloService { 
	
	@Autowired 
	private CicloRepository repo;

	@Override
	public List<Ciclo> listaCiclo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	} 
	
	

}
