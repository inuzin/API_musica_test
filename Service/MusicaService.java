package br.unifor.audioAPI.Service;

import br.unifor.audioAPI.Entity.Cadastro.User;
import br.unifor.audioAPI.Entity.Musica.Musica;
import br.unifor.audioAPI.Repository.MusicaRepository;
import br.unifor.audioAPI.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class MusicaService {


    private MusicaRepository musicaRepository;

    public MusicaService(MusicaRepository musicaRepository)
    {
        this.musicaRepository = musicaRepository;
    }

    public ResponseEntity atualizar(@PathVariable("id") Integer id,
                                    @RequestBody Musica musica)
    {
        Optional<Musica> musicaOpt = musicaRepository.findById(id);

        if(musicaOpt.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        Musica musicaBanco = musicaOpt.get();

        musicaBanco.setNome(musica.getNome());
        musicaBanco.setAutor(musica.getAutor());
        musicaBanco.setAlbum(musica.getAlbum());
        musicaBanco.setAno(musica.getAno());

        musicaRepository.save(musicaBanco);

        return ResponseEntity.noContent().build();
    }
}
