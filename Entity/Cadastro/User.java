package br.unifor.audioAPI.Entity.Cadastro;

import javax.persistence.*;

@Table(name = "UserTable")
@Entity
public class User
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String senha;

    public int getId() { return id; }
    
    public int setId(int Id) { return Id; }

    public String getNome() { return nome; }
    
    public String setNome(String Nome) { return Nome; }

    public String getEmail() { return email; }

    public String setEmail(String Email) { return Email; }

    public String getSenha() { return senha; }

    public String setSenha(String Senha) { return Senha; }

    public User(int Id, String Nome, String Email, String Senha)
    {
      id = Id;
      nome = Nome;
      email = Email;
      senha = Senha;
    }
}
