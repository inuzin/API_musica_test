package br.unifor.audioAPI.Controller;

import br.unifor.audioAPI.Entity.Musica.Musica;
import br.unifor.audioAPI.Repository.MusicaRepository;
import br.unifor.audioAPI.Service.MusicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musica")
public class MusicaController
{
    private MusicaRepository musicaRepository;

    private MusicaService musicaService;

    @GetMapping
    public List<Musica> getAll()
    {
        return musicaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Musica getById(@PathVariable("id") Integer id)
    {
        return musicaRepository.getOne(id);
    }

    @PostMapping
    public ResponseEntity adicionar(@RequestBody Musica musica)
    {
        if(musica.getNome() == null)
        {
            return ResponseEntity.badRequest().build();
        }

        Musica musica_salvo = musicaRepository.save(musica);

        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity alterar(@PathVariable("id") Integer id,
                                  @RequestBody Musica musica)
    {
        try
        {
            musicaService.atualizar(id, musica);
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
        musicaRepository.deleteById(id);
    }
}
