package br.unifor.audioAPI.Controller;

import br.unifor.audioAPI.Entity.Cadastro.User;
import br.unifor.audioAPI.Repository.UserRepository;
import br.unifor.audioAPI.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController
{
    private UserRepository userRepository;

    private UserService userService;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Integer id)
    {

     return userRepository.getOne(id);
    }


    @PostMapping
    public ResponseEntity adicionar(@RequestBody User user)
    {
        if(user.getNome() == null)
        {
            return ResponseEntity.badRequest().build();
        }

        if(user.getEmail() == null)
        {
            return ResponseEntity.badRequest().build();
        }

        if(user.getSenha() == null)
        {
            return ResponseEntity.badRequest().build();
        }

        User user_salvo = userRepository.save(user);

        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity alterar(@PathVariable("id") Integer id,
    @RequestBody User user)
    {
        try
        {
            userService.atualizar(id, user);
            return ResponseEntity.noContent().build();
        }
        catch(RuntimeException exception)
        {
        return ResponseEntity.status(400).build();
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") int id)
    {
        userRepository.deleteById(id);
    }
}
