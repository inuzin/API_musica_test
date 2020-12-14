package br.unifor.audioAPI.Entity.Musica;

import javax.persistence.*;

@Table(name = "MusicaTable")
@Entity
public class Musica
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String autor;
    private String album;
    private int ano;

    public int getId(int Id) { return id; }
    
    public int setId(int Id) { return Id; }
    
    public String getNome() { return nome; }
    
    public String setNome(String Nome) { return Nome; }

    public String getAutor() { return autor; }

    public String setAutor(String Autor) { return Autor; }

    public String getAlbum() { return album; }
    
    public String setAlbum(String Album) { return Album; }

    public int getAno() { return ano; }
    
    public int setAno(int Ano) { return Ano; }

    public Musica(int Id, String Nome, String Autor, String Album, int Ano)
    {
        id = Id;
        nome = Nome;
        autor = Autor;
        album = Album;
        ano = Ano;
    }


}
