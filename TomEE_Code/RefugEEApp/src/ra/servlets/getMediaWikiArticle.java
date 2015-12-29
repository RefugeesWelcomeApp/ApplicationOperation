package ra.servlets;

import ra.mediaWiki.HTTPConnect;
import ra.mediaWiki.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getMediaWikiArticle")
public class getMediaWikiArticle extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getRequestURI().toLowerCase().endsWith(".png") && !request.getRequestURI().contains(":"))
        {
            getServletContext().getRequestDispatcher(request.getRequestURI().replaceFirst("/w/","/media_wiki/")).include(request, response);
        }
        else {
            String WikiURL = request.getRequestURI().replaceFirst("w/", "");
            if (WikiURL.contentEquals("/"))
                WikiURL = "/Startseite";
            HTTPConnect con = new HTTPConnect("https://ddc.derpy.ws/media_wiki" + WikiURL, request.getHeader("user-agent"));

            try {
                JSON json = new JSON(con.getContent());

                request.setAttribute("title", json.getTitleStr());
                request.setAttribute("text", json.getTextStr());
                System.out.println(json.getTextStr());
            } catch (java.lang.NullPointerException ex) {
                ;
            }
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}