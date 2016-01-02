package ra.servlets;

import ra.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
 * Created by DerJungeWolf on 15/12/30.
 */
@WebServlet("/getProd")
public class getProduct extends HttpServlet{
    private static final long serialVersionUID = 1L;

    @javax.persistence.PersistenceContext(unitName="RefugEEWelcomeApp")
    private EntityManager em;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int subCatID = Integer.parseInt(request.getParameter("subCatID").toString());
        int languageID;
        try{
            languageID = Integer.parseInt(request.getParameter("languageID").toString());
        }
        catch(NullPointerException e){
            languageID = 1;
        }

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<ViewProduktZuKategorieEntity> query = builder.createQuery(ViewProduktZuKategorieEntity.class);

        Root<ViewProduktZuKategorieEntity> ProdzuCatRoot = query.from(ViewProduktZuKategorieEntity.class);

        Predicate subCatWithID = builder.equal(ProdzuCatRoot.get(ViewProduktZuKategorieEntity_.category), subCatID);
        Predicate LangWithID = builder.equal(ProdzuCatRoot.get(ViewProduktZuKategorieEntity_.idtblLanguage), languageID);

        query.select(ProdzuCatRoot).where(subCatWithID,LangWithID);

        List<ViewProduktZuKategorieEntity> results = em.createQuery(query).getResultList();

        List<Integer> prodID = new ArrayList<>();
        List<String> productName = new ArrayList<>();
        for (Object o: results) {
            ViewProduktZuKategorieEntity e = (ViewProduktZuKategorieEntity) o;
            productName.add(e.getTranslation());
            prodID.add(e.getIdProdukt());
            System.out.println(e.getIdProdukt());
            System.out.println(e.getTranslation());
        }


        CriteriaQuery<RltnProductCategoryShopCategoryEntity> queryShopCats = builder.createQuery(RltnProductCategoryShopCategoryEntity.class);

        Root<RltnProductCategoryShopCategoryEntity> productCatShopCatEntityRoot = queryShopCats.from(RltnProductCategoryShopCategoryEntity.class);

        Predicate SubCatWithID = builder.equal(productCatShopCatEntityRoot.get(RltnProductCategoryShopCategoryEntity_.productCategory), subCatID);

        queryShopCats.select(productCatShopCatEntityRoot).where(SubCatWithID);

        List<RltnProductCategoryShopCategoryEntity> resultsShopCats = em.createQuery(queryShopCats).getResultList();
        List<Integer> shopCatID = new ArrayList<>();

        for (Object o: resultsShopCats) {
            RltnProductCategoryShopCategoryEntity e = (RltnProductCategoryShopCategoryEntity) o;
            shopCatID.add(e.getShopCategory());
            System.out.println(e.getShopCategory());
        }


        CriteriaQuery<RltnShopCategoryLanguageEntity> queryShopCatName = builder.createQuery(RltnShopCategoryLanguageEntity.class);

        Root<RltnShopCategoryLanguageEntity> shopCatEntityLanguageRoot = queryShopCatName.from(RltnShopCategoryLanguageEntity.class);

        Predicate languageShopCatWithID = builder.equal(shopCatEntityLanguageRoot.get(RltnShopCategoryLanguageEntity_.languageid), languageID);

        queryShopCatName.select(shopCatEntityLanguageRoot).where(languageShopCatWithID);

        List<RltnShopCategoryLanguageEntity> resultsShopCatName = em.createQuery(queryShopCatName).getResultList();
        List<String> shopCatName = new ArrayList<>();
        List<String> OSM = new ArrayList<>();

        for (Object o: resultsShopCatName){
            RltnShopCategoryLanguageEntity e=(RltnShopCategoryLanguageEntity) o;
            shopCatName.add(e.getTranslation());
            OSM.add(getOSM(e.getShopCategory()));
            System.out.println(e.getTranslation());
        }

        request.setAttribute("productID", prodID);
        request.setAttribute("productName", productName);
        request.setAttribute("shopCatID", shopCatID);
        request.setAttribute("shopCatName", shopCatName);
        request.setAttribute("languageID",languageID);
        request.setAttribute("subCatName", getSubCategoryNameFromID(subCatID, languageID));

        String[] sLanguage = request.getRequestURI().split("/");
        if (sLanguage.length > 0) request.setAttribute("Sprache", sLanguage[sLanguage.length-1]);
        getServletContext().getRequestDispatcher("/product.jsp").forward(request, response);
    }

    private String getSubCategoryNameFromID(Integer SubCatID, Integer LanguageID){
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<RltnProductCategoryLanguageEntity> queryName = builder.createQuery(RltnProductCategoryLanguageEntity.class);
        Root<RltnProductCategoryLanguageEntity> productCategoryEntityLanguageRoot = queryName.from(RltnProductCategoryLanguageEntity.class);
        Predicate languageWithID = builder.equal(productCategoryEntityLanguageRoot.get(RltnProductCategoryLanguageEntity_.languageid), LanguageID);
        queryName.select(productCategoryEntityLanguageRoot).where(languageWithID);
        List<RltnProductCategoryLanguageEntity> resultsName = em.createQuery(queryName).getResultList();
        List<String> name = new ArrayList<>();
        for (Object o: resultsName){
            RltnProductCategoryLanguageEntity e=(RltnProductCategoryLanguageEntity) o;
            name.add(e.getTranslation());
            System.out.println(e.getTranslation());
        }
        return name.get(SubCatID-1);

    }
    private String getOSM(Integer ShopCatID) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<TblShopCategoryEntity> queryName = builder.createQuery(TblShopCategoryEntity.class);
        Root<TblShopCategoryEntity> ShopCatOSMRoot = queryName.from(TblShopCategoryEntity.class);
        Predicate ShopCatWithID = builder.equal(ShopCatOSMRoot.get(TblShopCategoryEntity_.idtblShopCategory), ShopCatID);
        queryName.select(ShopCatOSMRoot).where(ShopCatWithID);
        List<TblShopCategoryEntity> resultsName = em.createQuery(queryName).getResultList();
        List<String> name = new ArrayList<>();
        for (Object o : resultsName) {
            RltnProductCategoryLanguageEntity e = (RltnProductCategoryLanguageEntity) o;
            name.add(e.getTranslation());
            System.out.println(e.getTranslation());
        }
        return name.get(0);
    }

}
