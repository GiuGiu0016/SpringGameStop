package it.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.spring.model.VideoGioco;
import it.spring.repository.VideogiochiRepository;

@Service
@Transactional
public class VideogiocoService {

	@Autowired  VideogiochiRepository repo;
	
	public void save(VideoGioco videogioco) {
		repo.save(videogioco);
	}
	
	public List<VideoGioco> listAll() {
		return (List<VideoGioco>) repo.findAll();
	}
	
	public VideoGioco get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
//	public List<VideoGioco> search(String keyword) {
//		return repo.search(keyword);
//	}
	
}
