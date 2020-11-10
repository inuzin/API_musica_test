package br.unifor.audioAPI.cadastro;

import br.unifor.audioAPI.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    List<User> users = new ArrayList<User>();

    @GetMapping
    public User get(int id, String nome, String email, String senha)
    {
        User user = new User(id, nome, email, senha);

        return user;
    }

    @PostMapping
    public void post(@RequestBody int id, String nome, String email, String senha)
    {

    }

    @PutMapping
    public void put(int id, String email, String senha)
    {
        users.get(id).setEmail(email);
        users.get(id).setSenha(senha);
    }

    @DeleteMapping
    public void delete(int id)
    {
        users.remove(id);
    }
}
