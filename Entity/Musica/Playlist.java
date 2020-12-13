package br.unifor.audioAPI.Entity.Musica;

import java.util.ArrayList;
import java.util.List;

public class Playlist
{
    private int id;
    private String nomePlaylist;
    private List<Musica> musicas = new ArrayList();

    public String getNomePlaylist(String NomePlaylist) { return nomePlaylist; }
    
    public String setNomePlaylist(String NomePlaylist) { return nomePlaylist; }

    public Playlist(int Id, String NomePlaylist, List<Musica> Musicas)
    {
        id = Id;
        nomePlaylist = NomePlaylist;
        musicas = Musicas;
    }

}
