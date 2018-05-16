package movie.mania;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class HomeServlet extends HttpServlet {
     private PostManager findManager() {
        return (PostManager) getServletContext().getAttribute("postManager");
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("moviePosts", findManager().getAllMoviePosts());
        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
    }
    
    
}
