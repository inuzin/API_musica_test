package br.unifor.audioAPI.Repository;

import br.unifor.audioAPI.Entity.Cadastro.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByNome(String nome);
    User findByEmail(String email);
}
