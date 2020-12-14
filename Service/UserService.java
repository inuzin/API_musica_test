package br.unifor.audioAPI.Service;

import br.unifor.audioAPI.Entity.Cadastro.User;
import br.unifor.audioAPI.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public ResponseEntity atualizar(@PathVariable("id") Integer id,
                                    @RequestBody User user)
    {
        Optional<User> userOpt = userRepository.findById(id);
        if(userOpt.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        User userBanco = userOpt.get();

        userBanco.setNome(user.getNome());
        userBanco.setEmail(user.getEmail());
        userBanco.setSenha(user.getSenha());

        userRepository.save(userBanco);

        return ResponseEntity.noContent().build();
    }

}
