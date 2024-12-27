package FinalPetStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FinalPetStore.entity.NewEntity;

@Repository
public interface NewDAO extends JpaRepository<NewEntity, Integer> {
	
	

}
