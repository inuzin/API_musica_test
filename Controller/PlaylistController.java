package br.unifor.audioAPI.Controller;

import br.unifor.audioAPI.Entity.Musica.Musica;
import br.unifor.audioAPI.Entity.Musica.Playlist;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController
{
    List<Playlist> playlists = new ArrayList<Playlist>();

    @GetMapping(path = "/buscarPlaylist")
    public Playlist get(int id, String nome)
    {
        Playlist playlist = new Playlist(id, nome, (List<Musica>) new Musica(0,"null", "null", "null", 0));

        return playlist;
    }

    @PostMapping(path = "/criarPlaylist")
    public void post(@RequestBody String nomePlaylist)
    {
       if(playlists.size() <= 0)
       {
          //playlists.setId(1);
           playlists.add(new Playlist(0, nomePlaylist, null));
       }
       else
       {
          //playlists.setId(users.getId()+1);
          playlists.add(new Playlist(playlists.size(), nomePlaylist, null));
       }
       
       //playlists.setNomePlaylist(nomePlaylist);
       
    }

    @PutMapping(path = "/atualizarNomePlaylist")
    public void put(int id, String nome)
    {
        playlists.get(id).setNomePlaylist(nome);
    }

    @DeleteMapping(path = "/excluirPlaylist")
    public void delete(int id)
    {
        playlists.remove(id);
    }
}
