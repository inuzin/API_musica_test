package br.unifor.audioAPI.Repository;

import br.unifor.audioAPI.Entity.Cadastro.User;
import br.unifor.audioAPI.Entity.Musica.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Integer> {
}
