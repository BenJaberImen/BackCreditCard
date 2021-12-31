package tn.essat.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.essat.model.Creditcard;
import tn.essat.model.Currencie;

@Repository
public interface ICurencies extends JpaRepository<Currencie, Integer>{
	@Query("select c from Creditcard c where c.currencys.id=:x")
	public List<Creditcard> getAllCreditcardByCurrencie(@Param("x") Integer id);
}
