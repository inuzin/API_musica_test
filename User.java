package br.unifor.audioAPI;

public class User
{

    private int id;
    private String nome;
    private String email;
    private String senha;

    public int getId(int Id)
    {
        return id;
    }

    public String getNome(String Nome)
    {
        return nome;
    }

    public String getEmail(String Email)
    {
        return email;
    }

    public String setEmail(String Email) { return Email; }

    public String getSenha(String Senha)
    {
        return senha;
    }

    public String setSenha(String Senha) { return Senha; }

    public User(int Id, String Nome, String Email, String Senha)
    {
      id = Id;
      nome = Nome;
      email = Email;
      senha = Senha;
    }
}
