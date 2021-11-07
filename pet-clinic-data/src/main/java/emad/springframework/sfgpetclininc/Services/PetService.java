package emad.springframework.sfgpetclininc.Services;

import java.util.Set;
import emad.springframework.sfgpetclininc.Model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();	

}
