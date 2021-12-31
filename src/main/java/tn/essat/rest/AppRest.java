package tn.essat.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.Repository.ICredit;
import tn.essat.Repository.ICurencies;
import tn.essat.model.Creditcard;
import tn.essat.model.Currencie;







@RestController
@CrossOrigin("*")
public class AppRest {


@Autowired
	private ICredit dao_c;
@Autowired
private ICurencies dao_cu;
	public void setDao_m(ICredit dao_c) {
		this.dao_c = dao_c;
	}

	public void setDao_m(ICurencies dao_cu) {
		this.dao_cu = dao_cu;
	}

	@GetMapping("/user/{id}")
	public Optional<Creditcard> f4(@PathVariable("id") int id) {
		return dao_c.findById(id);
	}

	@PostMapping("/sendCreditFroms")
	public Creditcard f4(@RequestBody Creditcard card) {
		return dao_c.save(card);
	}

	@GetMapping("/cards")
	public List<Creditcard> f1() {
		return dao_c.findAll();
	}
	@GetMapping("/currencies")
	public List<Currencie> f9() {
		return dao_cu.findAll();
	}

}
