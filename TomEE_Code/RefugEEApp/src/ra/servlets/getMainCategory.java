package ra.servlets;

import ra.model.RltnProductCategoryLanguageEntity;
import ra.model.RltnProductCategoryLanguageEntity_;
import ra.model.TblProductCategoryEntity;
import ra.model.TblProductCategoryEntity_;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hinata2712 on 15/12/24.
 */
@WebServlet("/getMainCat")
public class getMainCategory extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int languageID;
        try{
                languageID = Integer.parseInt(request.getParameter("languageID").toString());
        }
        catch(NullPointerException e){
            languageID = 1;
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RefugEEWelcomeApp");
        EntityManager em		= emf.createEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblProductCategoryEntity> query = builder.createQuery(TblProductCategoryEntity.class);

        Root<TblProductCategoryEntity> productCategoryEntityRoot = query.from(TblProductCategoryEntity.class);

        Predicate mainCatNull = builder.isNull(productCategoryEntityRoot.get(TblProductCategoryEntity_.maincategory));

        query.select(productCategoryEntityRoot).where(mainCatNull);

        List<TblProductCategoryEntity> results = em.createQuery(query).getResultList();

        List<String> urls = new ArrayList<>();
        List<Integer> subCat = new ArrayList<>();

        for (Object o: results){
            TblProductCategoryEntity e=(TblProductCategoryEntity) o;
            urls.add(e.getAttachments());
            subCat.add(e.getIdtblProductCategory());
            System.out.println(e.getAttachments());
            System.out.println(e.getIdtblProductCategory());
        }

        CriteriaQuery<RltnProductCategoryLanguageEntity> queryName = builder.createQuery(RltnProductCategoryLanguageEntity.class);

        Root<RltnProductCategoryLanguageEntity> productCategoryEntityLanguageRoot = queryName.from(RltnProductCategoryLanguageEntity.class);

        Predicate languageWithID = builder.equal(productCategoryEntityLanguageRoot.get(RltnProductCategoryLanguageEntity_.languageid), languageID);

        queryName.select(productCategoryEntityLanguageRoot).where(languageWithID);

        List<RltnProductCategoryLanguageEntity> resultsName = em.createQuery(queryName).getResultList();
        List<String> name = new ArrayList<>();

        for (Object o: resultsName){
            RltnProductCategoryLanguageEntity e=(RltnProductCategoryLanguageEntity) o;
            name.add(e.getTranslation());
            System.out.println(e.getTranslation());
        }


        request.setAttribute("img", urls);
        request.setAttribute("id", subCat);
        request.setAttribute("name", name);
        request.setAttribute("language", languageID);

        String[] sLanguage = request.getRequestURI().split("/");
        if (sLanguage.length > 0) request.setAttribute("Sprache", sLanguage[sLanguage.length-1]);
        getServletContext().getRequestDispatcher("/category.jsp").forward(request, response);
    }
}
