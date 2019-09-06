package com.williansmartins.imagens.repository;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> dev
import org.springframework.data.repository.CrudRepository;

import com.williansmartins.imagens.model.Album;

public interface AlbunsRepository extends CrudRepository<Album, Long> {
<<<<<<< HEAD

=======
	List<Album> findByNome(String nome);
>>>>>>> dev
}
