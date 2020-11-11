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

    @GetMapping(path = "/buscarUsuario")
    public User get(int id, String nome, String email, String senha)
    {
        User user = new User(id, nome, email, senha);

        return user;
    }

    @PostMapping(path = "/criarUsuario")
    public void post(@RequestBody String nome, String email, String senha)
    {
       if(users.getId() == null)
       {
          users.setId(1);
       }
       else
       {
          users.setId(users.getId()+1)
       }
       
       users.setEmail(email);
       users.setNome(nome);
       users.setSenha(senha);
       
    }

    @PutMapping(path = "/atualizarUsuario")
    public void put(int id, String email, String senha, String nome)
    {
        users.get(id).setEmail(email);
        users.get(id).setSenha(senha);
        users.get(id).setNome(nome);
    }

    @DeleteMapping(path = "/excluirUsuario")
    public void delete(int id)
    {
        users.remove(id);
    }
}
