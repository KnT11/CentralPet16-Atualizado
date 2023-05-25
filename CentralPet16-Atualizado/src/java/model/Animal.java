package model;

public class Animal {
    private int id;
    private String cnpj;
    private String celular;
    private String nomefantasia;
    private String cidade;
    private String bairro;
    private String rua;
    private int n;
    private String cep;
    private String email;
    private String raça;
    private int sexo;
    private String porte;
    private String pelagem;
    private String peso;
    private String temperamento;
    private String saude;
    private String pme;

    public Animal(int id, String cnpj, String celular, String nomefantasia, String cidade, String bairro, String rua, int n, String cep, String email, String raça, int sexo, String porte, String pelagem, String peso, String temperamento, String saude, String pme) {
        this.id = id;
        this.cnpj = cnpj;
        this.celular = celular;
        this.nomefantasia = nomefantasia;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.n = n;
        this.cep = cep;
        this.email = email;
        this.raça = raça;
        this.sexo = sexo;
        this.porte = porte;
        this.pelagem = pelagem;
        this.peso = peso;
        this.temperamento = temperamento;
        this.saude = saude;
        this.pme = pme;
    }
    
    public Animal(){}

    public Animal(String cnpj, String celular, String nomefantasia, String cidade, String bairro, String rua, int n, String cep, String email, String raça, int sexo, String porte, String pelagem, String peso, String temperamento, String saude, String pme) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefntasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
    
    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }
    
    public String getPme() {
        return pme;
    }

    public void setPme(String pme) {
        this.pme = pme;
    }

    void setNomefantasia(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}