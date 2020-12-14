package br.unifor.audioAPI.Service;

import br.unifor.audioAPI.Entity.Musica.Musica;
import br.unifor.audioAPI.Entity.Musica.Playlist;
import br.unifor.audioAPI.Repository.MusicaRepository;
import br.unifor.audioAPI.Repository.PlaylistRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class PlaylistService {

    private PlaylistRepository playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository)
    {
        this.playlistRepository = playlistRepository;
    }

    public ResponseEntity atualizar(@PathVariable("id") Integer id,
                                    @RequestBody Playlist playlist)
    {
        Optional<Playlist> playlistOpt = playlistRepository.findById(id);

        if(playlistOpt.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        Playlist playlistBanco = playlistOpt.get();

        playlistBanco.setNomePlaylist(playlist.getNomePlaylist());

        playlistRepository.save(playlistBanco);

        return ResponseEntity.noContent().build();
    }
}
