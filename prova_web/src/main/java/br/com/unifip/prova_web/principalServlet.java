package br.com.unifip.prova_web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class principalServlet
 */
@WebServlet(urlPatterns = "/principalServlet")
public class principalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public principalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nomeVeiculo = request.getParameter("veiculo");
		String id = request.getParameter("id");
		String marca = request.getParameter("marca");
		Veiculos veiculo = new Veiculos();
		veiculo.setId(id);
		veiculo.setNome(nomeVeiculo);
		veiculo.setMarca(marca);
		Consessionaria bd = new Consessionaria();
		bd.adicionarVeiculo(veiculo);
		
		List<Veiculos> lista = bd.verLista();
		
		//CONEXÃO AO JSP
		RequestDispatcher disp = request.getRequestDispatcher("/listaDeVeiculos.jsp");
		request.setAttribute("lista", lista);
		request.setAttribute("veiculo", veiculo.getNome());
		request.setAttribute("id", veiculo.getId());
		request.setAttribute("marca", veiculo.getMarca());
		disp.forward(request, response);
		
		System.out.println("Veiculo registrado com sucesso!");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
