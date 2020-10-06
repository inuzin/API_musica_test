package br.unifor.audioAPI;

import java.util.ArrayList;
import java.util.List;

public class Playlist
{
    private int id;
    private List<Musica> musicas = new ArrayList();

    public Playlist(int Id, List<Musica> Musicas)
    {
        id = Id;
        musicas = Musicas;
    }

}
