package br.unifor.audioAPI.playlist;

import br.unifor.audioAPI.Musica;
import br.unifor.audioAPI.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musica")
public class MusicaController
{
    List<Musica> musicas = new ArrayList<Musica>();

    @GetMapping
    public Musica get(int id, String nome, String autor, String album, int ano)
    {
        Musica musica = new Musica(id, nome, autor, album, ano);

        return musica;
    }

    @PostMapping
    public void post(@RequestBody int id, String nome, String autor, String album, int ano)
    {

    }

    @DeleteMapping
    public void delete(int id)
    {
        musicas.remove(id);
    }
}
