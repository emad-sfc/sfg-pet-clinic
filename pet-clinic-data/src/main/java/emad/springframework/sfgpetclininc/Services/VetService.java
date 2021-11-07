package emad.springframework.sfgpetclininc.Services;

import java.util.Set;

import emad.springframework.sfgpetclininc.Model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();	

}
