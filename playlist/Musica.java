package br.unifor.audioAPI;

public class Musica
{
    private int id;
    private String nome;
    private String autor;
    private String album;
    private int ano;

    public int GetId(int Id)
    {
        return id;
    }

    public String getNome(String Nome)
    {
        return nome;
    }

    public String getAutor(String Autor)
    {
        return autor;
    }

    public String getAlbum(String Album)
    {
        return album;
    }

    public int getAno(int Ano)
    {
        return ano;
    }

    public Musica(int Id, String Nome, String Autor, String Album, int Ano)
    {
        id = Id;
        nome = Nome;
        autor = Autor;
        album = Album;
        ano = Ano;
    }
}
