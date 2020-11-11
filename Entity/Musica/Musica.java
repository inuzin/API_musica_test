package br.unifor.audioAPI;

public class Musica
{
    private int id;
    private String nome;
    private String autor;
    private String album;
    private int ano;

    public int getId(int Id) { return id; }
    
    public int setId(int Id) { return Id; }
    
    public String getNome(String Nome) { return nome; }
    
    public String setNome(String Nome) { return Nome; }

    public String getAutor(String Autor) { return autor; }

    public String setAutor(String Autor) { return Autor; }

    public String getAlbum(String Album) { return album; }
    
    public String setAlbum(String Album) { return Album; }

    public int getAno(int Ano) { return ano; }
    
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
