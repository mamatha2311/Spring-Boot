package com.example.myweb.alien;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.myweb.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{

	List<Alien> findByLang(String string);
	List<Alien> findByAidGreaterThan(Integer string);
	@Query("from Alien where lang=?1 order by aName")
	List<Alien> findByLangSorted(String lang);

}
