package br.unifor.audioAPI.Controller;

import br.unifor.audioAPI.Entity.Cadastro.User;
import br.unifor.audioAPI.Entity.Musica.Musica;
import br.unifor.audioAPI.Entity.Musica.Playlist;
import br.unifor.audioAPI.Repository.PlaylistRepository;
import br.unifor.audioAPI.Repository.UserRepository;
import br.unifor.audioAPI.Service.PlaylistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/playlist")
public class PlaylistController
{

    private PlaylistRepository playlistRepository;

    private PlaylistService playlistService;

    public PlaylistController(PlaylistRepository playlistRepository)
    {
        this.playlistRepository = playlistRepository;
    }

    @GetMapping
    public List<Playlist> getAll()
    {
        return playlistRepository.findAll();
    }

    @GetMapping("/{id}")
    public Playlist getById(@PathVariable("id") Integer id)
    {
        return playlistRepository.getOne(id);
    }

    @PostMapping
    public ResponseEntity adicionar(@RequestBody Playlist playlist)
    {
        if(playlist.getNomePlaylist() == null)
        {
            return ResponseEntity.badRequest().build();
        }

        Playlist playlist_salvo = playlistRepository.save(playlist);

        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity alterar(@PathVariable("id") Integer id,
                                  @RequestBody Playlist playlist)
    {
        try
        {
            playlistService.atualizar(id, playlist);
            return ResponseEntity.noContent().build();
        }
        catch(RuntimeException exception)
        {
            return ResponseEntity.status(400).build();
        }

    }

    @DeleteMapping(path = "/excluirPlaylist")
    public void delete(int id)
    {
        playlistRepository.deleteById(id);
    }
}
