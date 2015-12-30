package ra.servlets;

import ra.mediaWiki.HTTPConnect;
import ra.mediaWiki.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getMediaWikiSearch")
public class getMediaWikiSearch extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sSuchtext = request.getParameter("Suchtext");
        if (!sSuchtext.equals(""))
        {
            HTTPConnect con = new HTTPConnect("https://ddc.derpy.ws/media_wiki/api.php?action=query&list=search&srsearch=" + sSuchtext + "&srwhat=text&srprop=snippet&format=json", request.getHeader("user-agent"));
            try {
                JSON json = new JSON(con.getContent(), true);

                request.setAttribute("title", sSuchtext);
                request.setAttribute("text", json.getTextStr());
                System.out.println(json.getTextStr());
            } catch (java.lang.NullPointerException ex) {
                ;
            }
            String[] sLanguage = request.getRequestURI().split("/");
            if (sLanguage.length > 0) request.setAttribute("Sprache", sLanguage[sLanguage.length-1]);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
