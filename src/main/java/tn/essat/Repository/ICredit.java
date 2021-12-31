package tn.essat.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Creditcard;


@Repository
public interface ICredit extends JpaRepository<Creditcard, Integer>{
	
}
