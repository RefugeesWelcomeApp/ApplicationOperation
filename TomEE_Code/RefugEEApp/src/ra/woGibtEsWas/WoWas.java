package ra.woGibtEsWas;

import ra.model.TblProductCategoryEntity;
import ra.model.TblProductCategoryEntity_;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Nico on 20.12.2015.
 */
public class WoWas {

    private int cat_Summe;      //menge aller in Datenbank hinterlegten Kategorien
    private int cat_ID;         // ID der vom User ausgewählten Kategorie
    private int language_ID;    // von user gewählte Anzeigesprache
    private int this_Language_ID;   // tatsächlich verwendete Sprach_ID
    private int location_ID;    // vom User ausgewählte Location_ID
    private int sub_cat_summe;  // menge aller in Datenbank hinterlegten Sub_Kategorien(in Abhängigkeit zur kat_ID)
    private int sub_cat_ID;     //ID der vom User ausgewählten SubKategorie
    private int Produkt_Summe;  // menge aller in Datenbank hinterlegten Produkte(in Abhängigkeit zur sub_kat_ID)
    private int Produkt_ID;     // ID der vom User ausgewähltes Produkt
    private int shop_summe;     // menge aller in Datenbank hinterlegten Shops zu diesem Produkt
    private List<TblProductCategoryEntity> mainResultList; // Liste der Kategorien(ohne Subs)
    private List<TblProductCategoryEntity> subResultList; // Liste der SubKategorien

    public List<TblProductCategoryEntity> getSubResultList() {
        return subResultList;
    }

    public void setSubResultList(List<TblProductCategoryEntity> subResultList) {
        this.subResultList = subResultList;
    }

    public List<TblProductCategoryEntity> getMainResultList() {
        return mainResultList;
    }

    public void setMainResultList(List<TblProductCategoryEntity> mainResultList) {
        this.mainResultList = mainResultList;
    }

    public WoWas() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblProductCategoryEntity> query = builder.createQuery(TblProductCategoryEntity.class);
        Root<TblProductCategoryEntity> from = query.from(TblProductCategoryEntity.class);

        Predicate equal1 = builder.isNull(from.get(TblProductCategoryEntity_.maincategory));

        query.select(from).where(equal1);

        this.mainResultList = em.createQuery(query).getResultList();
    }


    public int inputCat_Id()
    {
        int ID=-1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Gib Die Kat.ID ein: ");
        try {
            String eingabe = br.readLine();
            System.out.println("Du hast " + eingabe + " eingegeben.");
            ID = Integer.valueOf(eingabe);

        }
        catch(Exception e){
        }
        return ID;
    }


    public void createSubCatList(int cat_ID) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblProductCategoryEntity> query = builder.createQuery(TblProductCategoryEntity.class);
        Root<TblProductCategoryEntity> from = query.from(TblProductCategoryEntity.class);
        Predicate equal1 = builder.equal(from.get(TblProductCategoryEntity_.maincategory), cat_ID);

        query.select(from).where(equal1);

        this.subResultList = em.createQuery(query).getResultList();;
    }

    public int createCatCount(List<TblProductCategoryEntity> Cats){
        int summe=0;

        for(Object o:Cats)
        {
            TblProductCategoryEntity e=(TblProductCategoryEntity) o;
            summe++;
        }
        return summe;
    }

    public int getCat_Summe() {
        return cat_Summe;
    }

    public void setCat_Summe(int cat_Summe) {
        this.cat_Summe = cat_Summe;
    }

    public int getCat_ID() {
        return cat_ID;
    }

    public void setCat_ID(int cat_ID) {
        this.cat_ID = cat_ID;
    }

    public int getLanguage_ID() {
        return language_ID;
    }

    public void setLanguage_ID(int language_ID) {
        this.language_ID = language_ID;
    }

    public int getThis_Language_ID() {
        return this_Language_ID;
    }

    public void setThis_Language_ID(int this_Language_ID) {
        this.this_Language_ID = this_Language_ID;
    }

    public int getLocation_ID() {
        return location_ID;
    }

    public void setLocation_ID(int location_ID) {
        this.location_ID = location_ID;
    }

    public int getSub_cat_summe() {
        return sub_cat_summe;
    }

    public void setSub_cat_summe(int sub_cat_summe) {
        this.sub_cat_summe = sub_cat_summe;
    }

    public int getSub_cat_ID() {
        return sub_cat_ID;
    }

    public void setSub_cat_ID(int sub_cat_ID) {
        this.sub_cat_ID = sub_cat_ID;
    }

    public int getProdukt_Summe() {
        return Produkt_Summe;
    }

    public void setProdukt_Summe(int produkt_Summe) {
        Produkt_Summe = produkt_Summe;
    }

    public int getProdukt_ID() {
        return Produkt_ID;
    }

    public void setProdukt_ID(int produkt_ID) {
        Produkt_ID = produkt_ID;
    }

    public int getShop_summe() {
        return shop_summe;
    }

    public void setShop_summe(int shop_summe) {
        this.shop_summe = shop_summe;
    }
}