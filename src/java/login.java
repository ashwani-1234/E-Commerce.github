/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ashwa
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println(""
                    + "<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"   <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\n" +
"   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
"    <title>Document</title>\n" +
"</head>\n" +
"<body>\n" +
"    \n" +
"    <!--costumer sign up/sign in-->\n" +
"   <div class=\"main\">\n" +
"    <div class=\"container1\" id=\"container1\">\n" +
"        <div class=\"form-container sign-up-container\">\n" +
"           \n" +
"            <form action=\"\">\n" +
"                <h1 class=\"account\">Create Account</h1>\n" +
"                <div class=\"social-container\">\n" +
"                    <a href=\"#\" class=\"social\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                    <a href=\"#\" class=\"social\"><i class=\"fa fa-google\"></i></a>\n" +
"                    <a href=\"#\" class=\"social\"><i class=\"fa fa-linkedin\"></i></a>\n" +
"                </div>\n" +
"                <span>or use your email for registration</span>\n" +
"                <input type=\"text\" name=\"name\" placeholder=\"name\" class=\"inpt\">\n" +
"                <input type=\"text\" name=\"email\" placeholder=\"Email\"class=\"inpt\">\n" +
"                <input type=\"password\" name=\"pass\" placeholder=\"Password\" class=\"inpt\">\n" +
"                <button class=\"btn\">SignUp</button>\n" +
"            </form>\n" +
"       \n" +
"        </div>\n" +
"        <div class=\"form-container sign-in-container\">\n" +
"            <form action=\"#\">\n" +
"                <h2 class=\"h\">Sign In</h2>\n" +
"                <div class=\"social-container\">\n" +
"                    <a href=\"#\" class=\"social\"><i class=\"fa fa-facebook\"></i></a>\n" +
"                    <a href=\"#\" class=\"social\"><i class=\"fa fa-google\"></i></a>\n" +
"                    <a href=\"#\" class=\"social\"><i class=\"fa fa-linkedin\"></i></a>\n" +
"                </div>\n" +
"                <span>or use your account</span>\n" +
"                <input type=\"text\" name=\"email\" placeholder=\"Email\" class=\"inpt\">\n" +
"                <input type=\"password\" name=\"pass\" placeholder=\"password\" class=\"inpt\">\n" +
"                <a href=\"#\">Forgot Your password</a>\n" +
"    \n" +
"                <button class=\"btn\">Sign In</button>\n" +
"            </form>\n" +
"        </div>\n" +
"        <div class=\"overlay-container\">\n" +
"            <div class=\"overlay\">\n" +
"                <div class=\"overlay-panel overlay-left\">\n" +
"                    <h1 style=\"color: white;\">Welcome back!</h1>\n" +
"                    <p class=\"para\">To keep connected with us please login with your personal info</p>\n" +
"                    <button class=\"ghost btn\" id=\"signin\">Sign In</button>\n" +
"                </div>\n" +
"                <div class=\"overlay-panel overlay-right\">\n" +
"                    \n" +
"                        <!--<h1>hello dear!</h1>-->\n" +
"                   \n" +
"                    \n" +
"                    <p class=\"para\">Enter your details and start journey with us</p>\n" +
"                    <button   class=\"ghost\" id=\"signup\">Sign Up</button>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </div>\n" +
"</div>\n" +
"<script type=\"text/javascript\">\n" +
"    const signUpButton = document.getElementById('signup');\n" +
"const signInButton = document.getElementById('signin');\n" +
"const Container1 = document.getElementById('container1');\n" +
"\n" +
"signUpButton.addEventListener('click', () =>{\n" +
"    Container1.classList.add(\"right-panel-active\");\n" +
"});\n" +
"\n" +
"signInButton.addEventListener('click', () => {\n" +
"    Container1.classList.remove(\"right-panel-active\");\n" +
"});\n" +
"</script>\n" +
"</body>\n" +
"</html>");
           
        } finally {
            out.close();
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

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
