package emad.springframework.sfgpetclininc.Services;

import java.util.Set;

import emad.springframework.sfgpetclininc.Model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	

}
