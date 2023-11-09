
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;


public class ClienteDAO {
    
    private Connection con;
    PreparedStatement stmt;
    ResultSet rs;

    public ClienteDAO(Connection con) {
        this.con = new ModuleConexao().conectar();
    }
    
    public ClienteDAO() {
        
    }
    
    //Metodo cadastrarCliente
    public void cadastrarCliente(Cliente obj) {
        con = ModuleConexao.conectar();
        try {

            //1 passo - criar o comando sql
            String sql = "insert into clientes (nome,cnh,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,uf) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //2 passo - conectar o banco de dados e organizar o comando sql
            stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnh());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Metodo AlterarCliente
    public void alterarCliente(Cliente obj) {
        con = ModuleConexao.conectar();
        try {

            //1 passo - criar o comando sql
            String sql = "update clientes set nome=?, cnh=?, cpf=?, email=?, telefone=?, celular=?, cep=?, endereco=?, numero=?,complemento=?,bairro=?,cidade=?,uf=? where id =?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnh());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());

            stmt.setInt(14, obj.getId());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Metodo ExcluirCliente
    public void excluirCliente(Cliente obj) {
        con = ModuleConexao.conectar();
        try {

            //1 passo - criar o comando sql
            String sql = "delete from clientes where id = ?";

            //2 passo - conectar o banco de dados e organizar o comando sql
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());

            //3 passo - executar o comando sql
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    //Metodo Listar Todos Clientes
    public List<Cliente> listarClientes() {
        con = ModuleConexao.conectar();
        try {

            //1 passo criar a lista
            List<Cliente> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from clientes";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
            Cliente obj = new Cliente();

            obj.setId(rs.getInt("id"));
            obj.setNome(rs.getString("nome"));
            obj.setCnh(rs.getString("cnh"));
            obj.setCpf(rs.getString("cpf"));
            obj.setEmail(rs.getString("email"));
            obj.setTelefone(rs.getString("telefone"));
            obj.setCelular(rs.getString("celular"));
            obj.setCep(rs.getString("cep"));
            obj.setEndereco(rs.getString("endereco"));
            obj.setNumero(rs.getInt("numero"));
            obj.setComplemento(rs.getString("complemento"));
            obj.setBairro(rs.getString("bairro"));
            obj.setCidade(rs.getString("cidade"));
            obj.setUf(rs.getString("uf"));

            lista.add(obj);
            }

            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }
    }
    
    //metodo consultaCliente por Nome
    public Cliente consultaPorNome(String nome) {
        con = ModuleConexao.conectar();
        try {
            //1 passo - criar o sql , organizar e executar.
            String sql = "select * from clientes where nome = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            rs = stmt.executeQuery();
            Cliente obj = new Cliente();

            if (rs.next()) {

            obj.setId(rs.getInt("id"));
            obj.setNome(rs.getString("nome"));
            obj.setCnh(rs.getString("cnh"));
            obj.setCpf(rs.getString("cpf"));
            obj.setEmail(rs.getString("email"));
            obj.setTelefone(rs.getString("telefone"));
            obj.setCelular(rs.getString("celular"));
            obj.setCep(rs.getString("cep"));
            obj.setEndereco(rs.getString("endereco"));
            obj.setNumero(rs.getInt("numero"));
            obj.setComplemento(rs.getString("complemento"));
            obj.setBairro(rs.getString("bairro"));
            obj.setCidade(rs.getString("cidade"));
            obj.setUf(rs.getString("uf"));
            }
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return null;
        }
    }
    
    //metodo busca Cliente por Cpf
    public Cliente buscaporcpf(String cpf) {
        con = ModuleConexao.conectar();
        try {
            //1 passo - criar o sql , organizar e executar.
            String sql = "select * from clientes where cpf = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);

            rs = stmt.executeQuery();
            Cliente obj = new Cliente();

            if (rs.next()) {

            obj.setId(rs.getInt("id"));
            obj.setNome(rs.getString("nome"));
            obj.setCnh(rs.getString("cnh"));
            obj.setCpf(rs.getString("cpf"));
            obj.setEmail(rs.getString("email"));
            obj.setTelefone(rs.getString("telefone"));
            obj.setCelular(rs.getString("celular"));
            obj.setCep(rs.getString("cep"));
            obj.setEndereco(rs.getString("endereco"));
            obj.setNumero(rs.getInt("numero"));
            obj.setComplemento(rs.getString("complemento"));
            obj.setBairro(rs.getString("bairro"));
            obj.setCidade(rs.getString("cidade"));
            obj.setUf(rs.getString("uf"));
            }

            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return null;
        }
    }

    //Metodo buscarclientePorNome - retorna uma lista
    public List<Cliente> buscaClientePorNome(String nome) {
        con = ModuleConexao.conectar();
        try {

            //1 passo criar a lista
            List<Cliente> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from clientes where nome like ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            rs = stmt.executeQuery();

            while (rs.next()) {
            Cliente obj = new Cliente();

            obj.setId(rs.getInt("id"));
            obj.setNome(rs.getString("nome"));
            obj.setCnh(rs.getString("cnh"));
            obj.setCpf(rs.getString("cpf"));
            obj.setEmail(rs.getString("email"));
            obj.setTelefone(rs.getString("telefone"));
            obj.setCelular(rs.getString("celular"));
            obj.setCep(rs.getString("cep"));
            obj.setEndereco(rs.getString("endereco"));
            obj.setNumero(rs.getInt("numero"));
            obj.setComplemento(rs.getString("complemento"));
            obj.setBairro(rs.getString("bairro"));
            obj.setCidade(rs.getString("cidade"));
            obj.setUf(rs.getString("uf"));

            lista.add(obj);
            }

            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }
    }
}
