package ra.woGibtEsWas;

import ra.model.*;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

public class Abfragen {

    // DB Connectivity for update check
    @PersistenceUnit(unitName="RefugEEWelcomeApp")
    public EntityManagerFactory emf = null;

    public Abfragen() {
        int var_sprache = 1;
        EntityManager em		= emf.createEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblProductCategoryEntity> q = builder.createQuery(TblProductCategoryEntity.class);

        Root<RltnProductCategoryLanguageEntity> rltnProductCategoryLanguageEntityRoot = q.from(RltnProductCategoryLanguageEntity.class);
        Root<TblProductCategoryEntity> tblProductCategoryEntityRoot = q.from(TblProductCategoryEntity.class);

        Join<RltnProductCategoryLanguageEntity, Integer> rltn_product_category_language = rltnProductCategoryLanguageEntityRoot.join(RltnProductCategoryLanguageEntity_.productCategoryid, JoinType.INNER);

        Predicate equal1 = builder.equal(rltnProductCategoryLanguageEntityRoot.get(RltnProductCategoryLanguageEntity_.languageid), var_sprache);

        q.select(tblProductCategoryEntityRoot).where(equal1);

        List<TblProductCategoryEntity> resultList = em.createQuery(q).getResultList();


        for(Object o:resultList)
        {
            TblProductCategoryEntity e=(TblProductCategoryEntity) o;
            RltnProductCategoryLanguageEntity f = (RltnProductCategoryLanguageEntity) o;
            System.out.println(
                    "ID : "+e.getIdtblProductCategory()
                            +"LangID: "+f.getLanguageid());
        }

    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RefugEEWelcomeApp");
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder builder = em.getCriteriaBuilder();


        CriteriaQuery<TblProductCategoryEntity> query = builder.createQuery(TblProductCategoryEntity.class);

        Root<TblProductCategoryEntity> productCategoryEntityRoot = query.from(TblProductCategoryEntity.class);

        Predicate mainCatNull = builder.isNull(productCategoryEntityRoot.get(TblProductCategoryEntity_.maincategory));

        query.select(productCategoryEntityRoot).where(mainCatNull);

        List<TblProductCategoryEntity> results = em.createQuery(query).getResultList();


        for(Object o:results)
        {
            TblProductCategoryEntity e=(TblProductCategoryEntity) o;
            System.out.println(
                    "ID : "+e.getIdtblProductCategory()
                    +"\tAtt: "+e.getAttachments()
                    +"\tCAT: "+e.getMaincategory());
        }
    }
}
