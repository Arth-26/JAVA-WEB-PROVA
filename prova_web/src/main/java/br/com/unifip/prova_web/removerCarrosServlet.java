package br.com.unifip.prova_web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/removerCarrosServlet")
public class removerCarrosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    	String id = request.getParameter("id");
       

        Consessionaria bd = new Consessionaria();
        bd.removerVeiculo(id);

        List<Veiculos> lista = bd.verLista();
        request.setAttribute("carros", lista);

        request.getRequestDispatcher("listaDeVeiculos.jsp").forward(request, response);
    }
}
