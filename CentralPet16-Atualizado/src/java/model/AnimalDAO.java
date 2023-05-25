package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalDAO {
    private static Connection conn;
    
    public AnimalDAO() throws ClassNotFoundException, SQLException {
        conn = MyDatabase.getDatabase();
    }
    
    //****Métodos do CRUD****
    //INSERT (Create)
    public void insertAnimal(Animal a) throws SQLException{
        //Criando a query para inserir o registro
        String query = "INSERT INTO animal(id, cnpj, celular, nomefantasia, cidade, bairro, rua , n, cep,"
                + "email, raça, sexo, porte, pelagem, peso, temperamento, saude, pme)"
                + "VALUES(?,?,?,?)";
        
        //Preparar a query para ser executada no BD
        PreparedStatement prep = conn.prepareStatement(query);
        
        prep.setInt(1, a.getId());
        prep.setString(2, a.getCnpj());
        prep.setString(3, a.getCelular());
        prep.setString(4, a.getNomefantasia());
        prep.setString(5, a.getCidade());
        prep.setString(6, a.getBairro());
        prep.setString(7, a.getRua());
        prep.setInt(8, a.getN());
        prep.setString(9, a.getCep());
        prep.setString(10, a.getEmail());
        prep.setString(11, a.getRaça());
        prep.setInt(12, a.getSexo());
        prep.setString(13, a.getPorte());
        prep.setString(14, a.getPelagem());
        prep.setString(15, a.getPeso());
        prep.setString(16, a.getTemperamento());
        prep.setString(17, a.getSaude());
        prep.setString(18, a.getPme());
        
        //Executando a query pronta
        prep.execute();
        prep.close();
    }
    
    
    //SELECT
    public AnimalList<Animal> listAll() throws SQLException {
        //Criar lista vazia
        AnimalList<Animal> list = new AnimalList<>();
        
        //Criar query para pesquisa no BD
        String query = "SELECT * FROM animal";
        
        //Preparar query para executar no BD
        PreparedStatement prep = conn.prepareStatement(query);
        
        //Pegar o resultado da pesquina no BD
        ResultSet res = prep.executeQuery();
        
        //Varrer "res" mapeando os registros do BD
        //Para objetos da classe "Artista"
        while(res.next()) {
            //Criar objeto Artista vazio
            Animal an = new Animal();
            
            //Inserir os valores nos atributos com
            //os dados vindos das colunas do BD
            an.setId(res.getInt("id"));
            an.setCnpj(res.getString("cnpj"));
            an.setCelular(res.getString("celular"));
            an.setNomefantasia(res.getString("nomefantasia"));
            an.setCidade(res.getString("cidade"));
            an.setBairro(res.getString("bairro"));
            an.setRua(res.getString("rua"));
            an.setN(res.getInt("n"));
            an.setCep(res.getString("cep"));
            an.setEmail(res.getString("email"));
            an.setRaça(res.getString("raça"));
            an.setSexo(res.getInt("sexo"));
            an.setPorte(res.getString("porte"));
            an.setPelagem(res.getString("pelagem"));
            an.setPeso(res.getString("peso"));
            an.setTemperamento(res.getString("temperamento"));
            an.setSaude(res.getString("saude"));
            an.setPme(res.getString("pme"));
            
            
            //Inserir o objeto completo na lista
            list.add(an);
        }
        
        //Retornar lista cheia
        return list;
    }
    
    
    //SELECT
    public Animal listById(int i) throws SQLException {
        String query = "SELECT * FROM animal "
                + "WHERE id = " + i;
        
        PreparedStatement prep = conn.prepareStatement(query);
        ResultSet res = prep.executeQuery();
        
        Animal an = new Animal();
        
        if(res.next()) {
            an.setId(res.getInt("id"));
            an.setCnpj(res.getString("cnpj"));
            an.setCelular(res.getString("cod_genero"));
            an.setNomefantasia(res.getString("nacionalidade"));
            an.setCidade(res.getString("solo"));
            an.setBairro(res.getString("solo"));
            an.setRua(res.getString("solo"));
            an.setN(res.getInt("solo"));
            an.setCep(res.getString("solo"));
            an.setEmail(res.getString("solo"));
            an.setRaça(res.getString("solo"));
            an.setSexo(res.getInt("solo"));
            an.setPorte(res.getString("solo"));
            an.setPelagem(res.getString("solo"));
            an.setPeso(res.getString("solo"));
            an.setTemperamento(res.getString("solo"));
            an.setSaude(res.getString("solo"));
            an.setPme(res.getString("solo"));
        }
        
        return an;
    }
    
    
    //UPDATE
    public void updateArtista(Animal an) throws SQLException {
        String query = "UPDATE animal SET nomefantasia = ?,"
                + "cnpj = ?, celular = ?,"
                + "cidade = ? bairro = ?"
                + "rua = ? n = ? cep = ? email = ? raça = ? "
                + " sexo = ? porte = ? pelagem = ? peso = ?"
                + "temperamento = ? saude = ? pme = ? WHERE id = ?";
        
        PreparedStatement prep = conn.prepareStatement(query);
        prep.setInt(1, an.getId());
        prep.setString(2, an.getCnpj());
        prep.setString(3, an.getCelular());
        prep.setString(4, an.getNomefantasia());
        prep.setString(5, an.getCidade());
        prep.setString(6, an.getBairro());
        prep.setString(7, an.getRua());
        prep.setInt(8, an.getN());
        prep.setString(9, an.getCep());
        prep.setString(10, an.getEmail());
        prep.setString(11, an.getRaça());
        prep.setInt(12, an.getSexo());
        prep.setString(13, an.getPorte());
        prep.setString(14, an.getPelagem());
        prep.setString(15, an.getPeso());
        prep.setString(16, an.getTemperamento());
        prep.setString(17, an.getSaude());
        prep.setString(18, an.getPme());
        
        prep.execute();
        prep.close();
    }
    
    
    public void deleteAnimal(int id) throws SQLException {
        String query = "DELETE FROM animal "
                + "WHERE id = " + id;
        
        PreparedStatement prep = conn.prepareStatement(query);
        prep.execute();
        prep.close();
    }

    public void updateAnimal(Animal animal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class AnimalList<T> {

        public AnimalList() {
        }

        private void add(Animal an) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}//Fim da classe
