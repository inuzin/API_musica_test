package br.unifor.audioAPI.Entity.Musica;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "PlaylistTable")
@Entity
public class Playlist
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomePlaylist;
    private List<Musica> musicas = new ArrayList();

    public String getNomePlaylist() { return nomePlaylist; }
    
    public String setNomePlaylist(String NomePlaylist) { return nomePlaylist; }

    public Playlist(int Id, String NomePlaylist, List<Musica> Musicas)
    {
        id = Id;
        nomePlaylist = NomePlaylist;
        musicas = Musicas;
    }

}
