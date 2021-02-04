package com.ecolepratique.medicament2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecolepratique.medicament2.entite.Medicament;

public interface MedicamentRepositoryItf extends JpaRepository<Medicament, Long> {
	Medicament findByNomCommercial(String nomCommercial);
	List<Medicament> findByNomCommercialLike(String mc);
	List<Medicament> findAllByOrderByNomCommercial();
	List<Medicament> findByNomCommercialLikeOrderByNomCommercial(String mc);
}
