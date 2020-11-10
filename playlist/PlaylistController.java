package br.unifor.audioAPI.playlist;

import br.unifor.audioAPI.Musica;
import br.unifor.audioAPI.Playlist;
import br.unifor.audioAPI.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController
{
    List<Playlist> playlists = new ArrayList<Playlist>();

    @GetMapping
    public Playlist get(int id, String nome)
    {
        Playlist playlist = new Playlist(id, nome, (List<Musica>) new Musica(0,"null", "null", "null", 0));

        return playlist;
    }

    @PostMapping
    public void post(@RequestBody int id, String nome)
    {

    }

    @PutMapping
    public void put(int id, String nome)
    {
        playlists.get(id).setNomePlaylist(nome);
    }

    @DeleteMapping
    public void delete(int id)
    {
        playlists.remove(id);
    }
}
