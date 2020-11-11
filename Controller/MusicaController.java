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

    @GetMapping(path = "/buscarMusica")
    public Musica get(int id, String nome, String autor, String album, int ano)
    {
        Musica musica = new Musica(id, nome, autor, album, ano);

        return musica;
    }

    @PostMapping(path = "/criarMusicaUsuario")
    public void post(@RequestBody String nome, String autor, String album, int ano)
    {   
       if(musicas.getId() == null)
       {
          musicas.setId(1);
       }
       else
       {
          musicas.setId(users.getId()+1)
       }
       
       musicas.setNome(nome);
       musicas.setAlbum(album);
       musicas.setAno(ano);
    }
    
    @PutMapping(path = "/atualizarMusicaUsuario")
    public void put(int id, String nome, String autor, String album, int ano)
    {
        musicas.get(id).setNome(nome);
        musicas.get(id).setAlbum(album);
        musicas.get(id).setAno(ano);
    }

    @DeleteMapping(path = "/excluirMusicaUser")
    public void delete(int id)
    {
       musicas.remove(id);
    }
}
