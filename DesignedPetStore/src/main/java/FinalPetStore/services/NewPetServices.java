package FinalPetStore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FinalPetStore.dao.NewDAO;
import FinalPetStore.entity.NewEntity;

@Service
public class NewPetServices {
	
	@Autowired
	private NewDAO repo;

	public List<NewEntity> getAllPets() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public NewEntity getById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

//	public void addPet(NewEntity pet) {
//		// TODO Auto-generated method stub
//		repo.save(pet);
//	}
//
//	public void updatePet(int id, NewEntity pet) {
//		// TODO Auto-generated method stub
//		NewEntity pe = repo.findById(id).orElseThrow(()->new RuntimeException("Pet not found with this id: "+id));
//		
//		pe.setName(pet.getName());
//        pe.setAge(pet.getAge());
//        pe.setBreed(pet.getBreed());
//        pe.setSpecies(pet.getSpecies());
//        pe.setColor(pet.getColor());
//        pe.setDescription(pet.getDescription());
//        pe.setPrice(pet.getPrice());
//        pe.setStatus(pet.getStatus());
//        pe.setImageUrl(pet.getImageUrl());
//        
//        repo.save(pe);
//	}

	public void deletePet(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	public NewEntity savePet(NewEntity pet) {
		// TODO Auto-generated method stub
		return repo.save(pet);
	}

	
	
	
}
