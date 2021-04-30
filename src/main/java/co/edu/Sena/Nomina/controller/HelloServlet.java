package co.edu.Sena.Nomina.controller;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    int subcidiotransporte,salud,pension,arl;

    //variables para mostrar
    int sueldo;
    double totalneto;
    double totaldescuentos;
    int totaldevengos;
    double resultadosalud,resultadopension,resultadoarl;
    double sueldominimo;




    public void init(ServletConfig config) { message = "Hello World!";
        subcidiotransporte = 106454;
        sueldominimo =900000;

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        //recibir campos
        PrintWriter out = response.getWriter();
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String Cedula = request.getParameter("Cedula");
        String diastrabajados =request.getParameter("diastrabajados");
        int sueldo = Integer.parseInt(request.getParameter("sueldo"));

        //calculos:

        resultadosalud = sueldo * 0.04;
        resultadopension = sueldo * 0.04;
        resultadoarl = sueldo * 0.05;

        totaldescuentos =  resultadosalud + resultadopension + resultadoarl;
        if (sueldo<=sueldominimo * 2){
            totalneto = sueldo + subcidiotransporte;
        }else {
            out.println("No recibira subcidio de tranporte porque su sueldo" +
                    "es mayor a dos salarios minimos ");
            totalneto = sueldo;
        }

        totalneto = totalneto - totaldescuentos;


        // Hello

        out.println("<html><body>");
        out.println("<h3>Bienvenido, conozca su nomina "+"<br><br>"+" Nombres:" + nombres +"<br><br>"+"Apellidos:" + apellidos+"<br><br>"+"Dias trabajados:" + diastrabajados+"<br><br>"+"Sueldo: "+ sueldo+"<br><br>"+"Subcidio de transporte:" +subcidiotransporte+ "</h3>");
        out.println("<h3>Salud: "+resultadosalud+"<br><br>"+"Pension: "+resultadosalud+"<br><br> "+"ARL:"+resultadoarl+" <br><br>"+" Descuentos: "+totaldescuentos+"</h3>");
        out.println("<h1>Salario total:<br>"+Math.round(totalneto)+"</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
















