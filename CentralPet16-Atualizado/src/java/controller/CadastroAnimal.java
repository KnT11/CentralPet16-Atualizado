package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import model.Animal;
import model.AnimalDAO;


@WebServlet(name = "CadastroAnimal", urlPatterns = {"/CadastroAnimal"})
public class CadastroAnimal extends HttpServlet {
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
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Verificar se há um ID
        if(request.getParameter("id")!=null){
            this.id = Integer.parseInt(request.getParameter("id"));
        }        
        
        //Recebendo valores do formulário de cadastro
        this.cnpj = request.getParameter("cnpj");
        this.celular = request.getParameter(request.getParameter("celular"));
        this.nomefantasia = request.getParameter("nomefantasia");
        this.cidade = request.getParameter("cidade");
        this.bairro = request.getParameter("bairro");
        this.rua = request.getParameter("rua");
        this.n = Integer.parseInt(request.getParameter("n"));
        this.cep = request.getParameter("cep");
        this.email = request.getParameter("email");
        this.raça = request.getParameter("raça");
        this.sexo = Integer.parseInt(request.getParameter("sexo"));
        this.porte = request.getParameter("porte");
        this.pelagem = request.getParameter("pelagem");
        this.peso = request.getParameter("peso");
        this.temperamento = request.getParameter("temperamento");
        this.saude = request.getParameter("saude");
        this.pme = request.getParameter("pme");
        
        
        //Criando objeto da classe Artista para salvar no BD
        Animal animal = new Animal(
        this.cnpj,
        this.celular,
        this.nomefantasia,
        this.cidade,
        this.bairro,
        this.rua,
        this.n,
        this.cep,
        this.email,
        this.raça,
        this.sexo,
        this.porte,
        this.pelagem,
        this.peso,
        this.temperamento,
        this.saude,
        this.pme        
        );       
        
        //Instanciando a classe DAO para usar o método
        //de inserção enviando o objeto criado acima
        try {
            AnimalDAO andao = new AnimalDAO();
            
            //Se tivermos um ID, atualizaremos o registro
            //senão salvaremos como um novo registro
            if(request.getParameter("id")!=null){
                animal.setId(this.id);
                andao.updateAnimal(animal);
            } else {
                andao.insertAnimal(animal);
            }
                response.sendRedirect("listaSÇ.jsp");
        
        } catch(ClassNotFoundException | SQLException erro) {   
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroAnimal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ocorreu algum erro: " + erro + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
