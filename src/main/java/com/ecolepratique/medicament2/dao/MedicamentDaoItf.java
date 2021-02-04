package com.ecolepratique.medicament2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecolepratique.medicament2.entite.Medicament;

public interface MedicamentDaoItf extends JpaRepository<Medicament, Long> {
	
}
