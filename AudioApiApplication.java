package br.unifor.audioAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AudioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AudioApiApplication.class, args);
	}

	private void CriarConta(int id, String nome, String email, String senha)
	{
		User user = new User(id, nome, email, senha);
	}

	private void CriarMusica(int id, String nome, String autor, String album, int ano)
	{
		Musica musica = new Musica(id, nome, autor, album, ano);
	}

	private void CriarPlaylist(int id)
	{
    Playlist playlist = new Playlist(id, (List<Musica>) new Musica(0,"null", "null", "null", 0));
	}

}
