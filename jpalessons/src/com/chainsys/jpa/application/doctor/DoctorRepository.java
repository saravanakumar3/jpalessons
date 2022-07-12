package com.chainsys.jpa.application.doctor;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
	Doctor findById(long id);
	Doctor save(Doctor dr);
	// use for adding a new Doctor 
	void deleteById(long dr_id);
	List <Doctor> findAll();
}
