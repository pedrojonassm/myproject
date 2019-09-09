package br.ufrn.ceres.bsi.pweb.pedrojonassm;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/pedrojonassm")
public class pedrojonassm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public pedrojonassm() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter saida = response.getWriter();

        saida.append("<br>Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Definir o Tipo do Conteúdo response para HTML
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        int number = Integer.parseInt(request.getParameter("numero"));
        String nome = request.getParameter("txtnome");
        response.getWriter().append("Esse foi o número digitado: " + number);
        response.getWriter().append("<br>");
        int perfeito = 0;
        int primo = 1;
        int soma = 1;
        ArrayList divisores = new ArrayList<Integer>();
        for (int x = 1; x <= number; x++){
            if (number%x == 0){
                divisores.add(x);
                if (number != x && x != 1){
                    primo = 0;
                }
            }
        }
        response.getWriter().append("Esse foi o nome digitado: " + nome);
        response.getWriter().append("<br>");
        if (number%2 == 0){
            response.getWriter().append("O Número é par");
        }
        else{
            response.getWriter().append("O Número é ímpar");
        }
        response.getWriter().append("<br>");
        response.getWriter().append("Divisores: ");
        for(int x = 0; x <= divisores.size(); x++){
            int divisor = (int) divisores.get(x);
            soma += divisor;
            response.getWriter().append("  "+Integer.toString(divisor));
        }
        response.getWriter().append("<br>");
        if(primo == 1){
            response.getWriter().append("O número é primo");
        }
        else{
            response.getWriter().append("O número não é primo");
        }
        response.getWriter().append("<br>");
        response.getWriter().append("Soma: "+Integer.toString(soma/2));
        response.getWriter().append("<br>");
        if(soma/2 == number){
            response.getWriter().append("O Número é perfeito");
        }
        else{
            response.getWriter().append("O número não é perfeito");
        }
        doGet(request, response);
    }
}
