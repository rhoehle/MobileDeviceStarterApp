package com.robertleehoehle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robertleehoehle.beans.Cellphone;

@Repository
public interface CellphoneRepository extends JpaRepository<Cellphone, Long> { }
	



