package it.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.spring.model.VideoGioco;


public interface VideogiochiRepository extends CrudRepository<VideoGioco, Long> {
		
		@Query(value = "SELECT videogioco FROM VideoGioco videogioco WHERE videogioco.titolo LIKE '%' || :keyword || '%'"
				+ " OR videogioco.pegi LIKE '%' || :keyword || '%'"
				+ " OR videogioco.categoria LIKE '%' || :keyword || '%'")
		public List<VideoGioco> search(@Param("keyword") String keyword);
		
		public List<VideoGioco> findByTitolo(String titolo);
	
		public List<VideoGioco> findByPegi(String pegi);

		public List<VideoGioco> findByCategoria(String categoria);

}
