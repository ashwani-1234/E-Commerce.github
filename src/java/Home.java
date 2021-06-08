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
public class Home extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Home</title>"
                    + "<link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\">");            
            out.println("</head>");
            out.println("<body>");
            out.println(
                    "<header >\n" +
"        <!--Logo for website -->\n" +
"        <div class=\"logo\">\n" +
"            <img src=\"images/logo a.jpg\" alt=\"\">\n" +
"        </div>\n" +
"        <!--menu bar-->\n" +
"        <div class=\"topnav \">\n" +
"            <a  href=\"#home\">Notification</a>\n" +
"            \n" +
"            <div class=\"topnav-right\">\n" +
"                <a href=\"#news\">Cart</a>\n" +
"                <a class=\"active\" href=\"login.html\">Log in/Sign Up</a>\n" +
"            </div>\n" +
"          </div>\n" +
"        \n" +
"        <button class=\"nav-toggle\" aria-label=\"toggle navigation\">\n" +
"            <span class=\"hamburger\"></span>\n" +
"        </button>\n" +
"        \n" +
"        <nav class=\"nav\">\n" +
"            <ul class=\"nav-list\">\n" +
"                 <li class=\"nav-item\">\n" +
"                   <a href=\"#\" class=\"nav-link\">All Categories</a>  \n" +
"                 </li>\n" +
"                 <li class=\"nav-item\">\n" +
"                    <a href=\"#services\" class=\"nav-link\">My Orders</a>  \n" +
"                  </li>\n" +
"                  <li class=\"nav-item\">\n" +
"                    <a href=\"#about\" class=\"nav-link\">My Cart</a>  \n" +
"                  </li>\n" +
"                  <li class=\"nav-item\">\n" +
"                    <a href=\"#work\" class=\"nav-link\">My Account</a>  \n" +
"                  </li>\n" +
"                  <li class=\"nav-item\">\n" +
"                    <a href=\"#work\" class=\"nav-link\">Notification</a>  \n" +
"                  </li>\n" +
"                  <li class=\"nav-item\">\n" +
"                    <a href=\"#work\" class=\"nav-link\">Help?</a>  \n" +
"                  </li>\n" +
"            </ul>\n" +
"        </nav>\n" +
"    </header>\n" +
"\n" +
"    <div class=\"second-menu-bar\">\n" +
"        <div class=\"dropdown\">\n" +
"           \n" +
"            <button class=\"dropbtn\">All Categories \n" +
"              <i class=\"fa fa-caret-down\"></i>\n" +
"            </button>\n" +
"            <div class=\"dropdown-content\">\n" +
"                \n" +
"              <a href=\"#\">Fashion</a>\n" +
"              <a href=\"#\">Electronics</a>\n" +
"              <a href=\"#\">Mobiels</a>\n" +
"              <a href=\"#\">Grocery</a>\n" +
"              <a href=\"#\">Toys</a>\n" +
"              <a href=\"#\">Beauty</a>\n" +
"              <a href=\"#\">Washing Machines</a>\n" +
"              <a href=\"#\">Laptop</a>\n" +
"              <a href=\"#\">Desktop</a>\n" +
"             \n" +
"           \n" +
"            </div>\n" +
"          </div> " +
"        <a href=\"#news\">Fashion</a>\n" +
"        <a href=\"#contact\">Electronics</a>\n" +
"        <a href=\"#news\">Home Appliances</a>\n" +
"        <a href=\"#contact\">Mobiels</a>\n" +
"    </div>\n" +
"\n"
                 + " \n" + //<!--poster slider-->  
"   \n" +
"    \n" +
"    <center>\n" +
"       <div class=\"slider\">\n" +
"           <div class=\"slides\">\n" +
"               <input type=\"radio\" name=\"radio-btn\" id=\"radio1\">\n" +
"               <input type=\"radio\" name=\"radio-btn\" id=\"radio2\">\n" +
"               <input type=\"radio\" name=\"radio-btn\" id=\"radio3\">\n" +
"               <input type=\"radio\" name=\"radio-btn\" id=\"radio4\">\n" +
"               <div class=\"slide first\">\n" +
"                   <img src=\"images/1.jpg\" alt=\"\">\n" +
"               </div>\n" +
"               <div class=\"slide\">\n" +
"                <img src=\"images/2.jpg\" alt=\"\">\n" +
"            </div>\n" +
"            <div class=\"slide\">\n" +
"                <img src=\"images/3.jpg\" alt=\"\">\n" +
"            </div>\n" +
"            <div class=\"slide\">\n" +
"                <img src=\"images/4.jpg\" alt=\"\">\n" +
"            </div>\n" +
"            <div class=\"navigation-auto\">\n" +
"                <div class=\"auto-btn1\"></div>\n" +
"                <div class=\"auto-btn2\"></div>\n" +
"                <div class=\"auto-btn3\"></div>\n" +
"                <div class=\"auto-btn4\"></div>\n" +
"            </div>\n" +
"           </div>\n" +
"           <div class=\"navigation-manual\">\n" +
"               <label for=\"radio1\" class=\"manual-btn\"></label>\n" +
"               <label for=\"radio2\" class=\"manual-btn\"></label>\n" +
"               <label for=\"radio3\" class=\"manual-btn\"></label>\n" +
"               <label for=\"radio4\" class=\"manual-btn\"></label>\n" +
"           </div>\n" +
"       </div> \n" +
"      \n" +
"    </center>" +
"\n" +
"<!--products -->\n" +
 
"\n" +
"<section class=\"products\" id=\"product\">\n" +
"    <h3 class=\"section-title section-title-product\">Electronics</h3>\n" +
"    \n" +
"     <!--Products item 01-->\n" +
"    <div class=\"electronic\">\n" +
"        <a href=\"#\" class=\"electronic-item\">\n" +
"            <img src=\"images/4k-resolution-led-backlit-lcd-ultra-high-definition-television-samsung-smart-tv-smart-tv-2c489af2bcea44e2f8893ce721b40938.png\" alt=\"\" class=\"product-img\">\n" +
"        </a>\n" +
"        <p class=\"details\">4k-resolution-led-backlit-lcd-ultra-high-definition-television-samsung-smart-tv-smart-tv\n" +
"            <br> Rs.20000.00\n" +
"            <br>\n" +
"            <br>\n" +
"            <button class=\"buy\">Buy Now</button>  <br><br>  <button class=\"buy\">Addcart</button>\n" +
"        </p>\n" +
"        \n" +
"        \n" +
"\n" +
"        <a href=\"#\" class=\"electronic-item\">\n" +
"            <img src=\"images/4k-resolution-ultra-high-definition-television-samsung-smart-tv-tv-backdrop-eb0c559285ee56ae335618d0d76cbadc.png\" alt=\"\" class=\"product-img\">\n" +
"        </a>\n" +
"        \n" +
"        <p class=\"details\">4k-resolution-led-backlit-lcd-ultra-high-definition-television-samsung-smart-tv-smart-tv\n" +
"            <br> Rs.20000.00\n" +
"            <br>\n" +
"            <br>\n" +
"            <button class=\"buy\">Buy Now</button>  <br><br>  <button class=\"buy\">Addcart</button>\n" +
"        </p>\n" +
"        <a href=\"#\" class=\"electronic-item\">\n" +
"            <img src=\"images/lg-uh605v-4k-resolution-led-backlit-lcd-smart-tv-lg-tv-a04d4fab74a1ba36f4835b25541457aa.png\" alt=\"\" class=\"product-img\">\n" +
"        </a>\n" +
"\n" +
"        <p class=\"details\">4k Resolution LED <br> backlit-lcd-ultra-high-definition-television-samsung-smart-tv-smart-tv\n" +
"            <br> Rs.20000.00\n" +
"            <br>\n" +
"            <br>\n" +
"            <button class=\"buy\">Buy Now</button>   <br><br> <button class=\"buy\">Addcart</button>\n" +
"        </p>\n" +
"        <a href=\"#\" class=\"electronic-item\">\n" +
"            <img src=\"images/smart-tv-led-backlit-lcd-high-definition-television-lg-electronics-4k-resolution-lg-f09cc86f27deef2a5f22cce675638d49.png\" alt=\"\" class=\"product-img\">\n" +
"        </a>\n" +
"        <p class=\"details\">4k-resolution-led-backlit-lcd-ultra-high-definition-television-samsung-smart-tv-smart-tv\n" +
"            <br> Rs.20000.00\n" +
"            <br>\n" +
"            <br>\n" +
"            <button class=\"buy\">Buy Now</button> <br><br>   <button class=\"buy\">Addcart</button>\n" +
"        </p>\n" +
"    </div>\n" +
"    <br>\n" +
"    <a href=\"#viewmore\" class=\"btn\">View more</a>\n" +
"</section>"
                            + "  \n" +
"<script >\n"
                    + "const navToggle= document.querySelector('.nav-toggle');\n" +
"const navLinks = document.querySelectorAll('.nav-link')\n" +
"navToggle.addEventListener('click',()=>{\n" +
"    document.body.classList.toggle('nav-open');\n" +
"});\n" +
"navLinks.forEach(link => {\n" +
"    link.addEventListener('click',()=>{\n" +
"        document.body.classList.remove('nav-open');\n" +
"\n" +
"    })\n" +
"    \n" +
"})" +
"\n"
 + //automatic navigation\n
"var counter = 1;\n" +
"setInterval(function(){\n" +
"    document.getElementById('radio'+ counter).checked=true;\n" +
"    counter++;\n" +
"    if(counter >4){\n" +
"        counter=1;\n" +
"    }\n" +
"},4000);" +
"\n" +
"</script>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    
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
