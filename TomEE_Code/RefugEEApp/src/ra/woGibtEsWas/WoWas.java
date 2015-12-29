package ra.woGibtEsWas;

import ra.model.*;

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
    private int languag_summe;
    private int language_ID;    // von user gewählte Anzeigesprache
    private int this_Language_ID;   // tatsächlich verwendete Sprach_ID
    private int location_ID;    // vom User ausgewählte Location_ID
    private int sub_cat_summe;  // menge aller in Datenbank hinterlegten Sub_Kategorien(in Abhängigkeit zur kat_ID)
    private int sub_cat_ID;     //ID der vom User ausgewählten SubKategorie
    private int Produkt_Summe;  // menge aller in Datenbank hinterlegten Produkte(in Abhängigkeit zur sub_kat_ID)
    private int Produkt_ID;     // ID der vom User ausgewähltes Produkt
    private int ShopCat_ID;
    private int ShopCat_summe;
    private int Shop_ID;
    private int Shop_summe;     // menge aller in Datenbank hinterlegten Shops zu diesem Produkt
    private List<TblProductCategoryEntity> mainResultList; // Liste der Kategorien(ohne Subs)
    private List<TblProductCategoryEntity> subResultList; // Liste der SubKategorien
    private List<RltnProductCategoryEntity> ProduktList; // Liste der Produkte in SubKategorien
    private List<RltnProductCategoryShopCategoryEntity> ShopCatList;
    private List<TblShopsEntity> ShopList;
    private List<TblLanguageEntity> LanguageList;


    public WoWas() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblProductCategoryEntity> query = builder.createQuery(TblProductCategoryEntity.class);
        Root<TblProductCategoryEntity> from = query.from(TblProductCategoryEntity.class);

        Predicate equal1 = builder.isNull(from.get(TblProductCategoryEntity_.maincategory));

        query.select(from).where(equal1);

        this.mainResultList = em.createQuery(query).getResultList();
        createCatCount(this.mainResultList);
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
    public int inputSubCat_Id()
    {
        int ID=-1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Gib Die SubKat.ID ein: ");
        try {
            String eingabe = br.readLine();
            System.out.println("Du hast " + eingabe + " eingegeben.");
            ID = Integer.valueOf(eingabe);

        }
        catch(Exception e){
        }
        return ID;
    }
    public int inputShopCat_Id()
    {
        int ID=-1;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Gib Die ShopKat.ID ein: ");
        try {
            String eingabe = br.readLine();
            System.out.println("Du hast " + eingabe + " eingegeben.");
            ID = Integer.valueOf(eingabe);

        }
        catch(Exception e){
        }
        return ID;
    }



    public void createLanguageList() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblLanguageEntity> query = builder.createQuery(TblLanguageEntity.class);
        Root<TblLanguageEntity> from = query.from(TblLanguageEntity.class);
       //Predicate equal1 = builder.equal(from.get(TblProductCategoryEntity_.maincategory), cat_ID);

      //  query.select(from).where(equal1);

        this.LanguageList = em.createQuery(query).getResultList();
        createLanguageCount(this.LanguageList);
    }
    public void createSubCatList(int cat_ID) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblProductCategoryEntity> query = builder.createQuery(TblProductCategoryEntity.class);
        Root<TblProductCategoryEntity> from = query.from(TblProductCategoryEntity.class);
        Predicate equal1 = builder.equal(from.get(TblProductCategoryEntity_.maincategory), cat_ID);

        query.select(from).where(equal1);

        this.subResultList = em.createQuery(query).getResultList();
        createCatCount(this.subResultList);
    }

    public void createProdList(int sub_cat_ID) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<RltnProductCategoryEntity> query = builder.createQuery(RltnProductCategoryEntity.class);
        Root<RltnProductCategoryEntity> from = query.from(RltnProductCategoryEntity.class);
        Predicate equal1 = builder.equal(from.get(RltnProductCategoryEntity_.category), sub_cat_ID);

        query.select(from).where(equal1);

        this.ProduktList = em.createQuery(query).getResultList();
        createProdCount(this.ProduktList);
    }
    public void createShopCatList(int Sub_Cat_ID) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<RltnProductCategoryShopCategoryEntity> query = builder.createQuery(RltnProductCategoryShopCategoryEntity.class);
        Root<RltnProductCategoryShopCategoryEntity> from = query.from(RltnProductCategoryShopCategoryEntity.class);
        Predicate equal1 = builder.equal(from.get(RltnProductCategoryShopCategoryEntity_.productCategory), Sub_Cat_ID);

        query.select(from).where(equal1);

        this.ShopCatList = em.createQuery(query).getResultList();
        createShopCatCount(this.ShopCatList);
    }

    public void createShopList(int Shop_Cat_ID) {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory( "RefugEEWelcomeApp" ); EntityManager em		= emf.createEntityManager();

        CriteriaBuilder builder = em.getCriteriaBuilder();

        CriteriaQuery<TblShopsEntity> query = builder.createQuery(TblShopsEntity.class);
        Root<TblShopsEntity> from = query.from(TblShopsEntity.class);
        Predicate equal1 = builder.equal(from.get(TblShopsEntity_.shopCategory), Shop_Cat_ID);

        query.select(from).where(equal1);

        this.ShopList = em.createQuery(query).getResultList();
        createShopCount(this.ShopList);
    }


    public int createCatCount(List<TblProductCategoryEntity> Cats){
        //ermittelt die Menge der Listenobjekte, dient der Visualisierung
        // Für Main-/SubCategorie
        int summe=0;

        for(Object o:Cats)
        {
            TblProductCategoryEntity e=(TblProductCategoryEntity) o;
            summe++;
        }
        return summe;
    }


    public int createProdCount(List<RltnProductCategoryEntity> Prods){
        //ermittelt die Menge der Listenobjekte, dient der Visualisierung
        // Für Alle Doppel INteger Listen
        int summe=0;

        for(Object o:Prods)
        {
            RltnProductCategoryEntity e=(RltnProductCategoryEntity) o;
            summe++;
        }
        return summe;
    }

    public int createLanguageCount(List<TblLanguageEntity> Languages){
        //ermittelt die Menge der Listenobjekte, dient der Visualisierung
        // Für Alle Doppel INteger Listen
        int summe=0;

        for(Object o:Languages)
        {
            TblLanguageEntity e=(TblLanguageEntity) o;
            summe++;
        }
        return summe;
    }

    public int createShopCatCount(List<RltnProductCategoryShopCategoryEntity> ShopCats){
        //ermittelt die Menge der Listenobjekte, dient der Visualisierung
        // Für Alle Doppel INteger Listen
        int summe=0;

        for(Object o:ShopCats)
        {
            RltnProductCategoryShopCategoryEntity e=(RltnProductCategoryShopCategoryEntity) o;
            summe++;
        }
        return summe;
    }

    public int createShopCount(List<TblShopsEntity> Shops){
        //ermittelt die Menge der Listenobjekte, dient der Visualisierung
        int summe=0;

        for(Object o:Shops)
        {
            TblShopsEntity e=(TblShopsEntity) o;
            summe++;
        }
        return summe;
    }



    public void  textoutput_produkt(){
        System.out.println("SubCat_ID:" + this.getSub_cat_ID());
        for (Object o : this.getProduktList()) {
            RltnProductCategoryEntity e = (RltnProductCategoryEntity) o;

            System.out.println("Prod_ID : " + e.getProduct() );
        }
    }
    public void textoutput_MainCat() {
        for (Object o : this.getMainResultList()) {
            TblProductCategoryEntity e = (TblProductCategoryEntity) o;
            System.out.println("MainCat_ID : " + e.getIdtblProductCategory());
            // <td><img src="<%= e.getAttachments() %>" alt="images Here" width="200 px" height="200px"></td>

        }
    }
public void textoutput_SubCat(){
    System.out.println("MainCat_ID:" + this.getCat_ID());
    for (Object o : this.getSubResultList()) {
        TblProductCategoryEntity e = (TblProductCategoryEntity) o;
        System.out.println("SubCat_ID : " + e.getIdtblProductCategory());
    }
    // ausgabe der Cat_IDs via Console wird in Sprach bezichner/ blob für vis. Ausgabe übersetzt
}
    public void textoutput_ShopCats(){

        for (Object o : this.getShopCatList()) {
            RltnProductCategoryShopCategoryEntity e = (RltnProductCategoryShopCategoryEntity) o;
            System.out.println("ShopCat_ID : " + e.getShopCategory());
        }
    }

    public void textoutput_Shops(){
        System.out.println("ShopCat_ID:" + this.getShopCat_ID());
        for (Object o : this.getShopList()) {
            TblShopsEntity e = (TblShopsEntity) o;
            System.out.println("Shop_ID : " + e.getIdShops());
            System.out.println("Shop : " + e.getShopName());
        }
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
        return Shop_summe;
    }

    public void setShop_summe(int shop_summe) {
        this.Shop_summe = shop_summe;
    }

    public List<RltnProductCategoryEntity> getProduktList() {
        return ProduktList;
    }

    public void setProduktList(List<RltnProductCategoryEntity> produktList) {
        ProduktList = produktList;
    }
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

    public int getShopCat_ID() {
        return ShopCat_ID;
    }

    public void setShopCat_ID(int shopCat_ID) {
        ShopCat_ID = shopCat_ID;
    }

    public int getShopCat_summe() {
        return ShopCat_summe;
    }

    public void setShopCat_summe(int shopCat_summe) {
        ShopCat_summe = shopCat_summe;
    }

    public List<RltnProductCategoryShopCategoryEntity> getShopCatList() {
        return ShopCatList;
    }

    public void setShopCatList(List<RltnProductCategoryShopCategoryEntity> shopCatList) {
        ShopCatList = shopCatList;
    }

    public List<TblShopsEntity> getShopList() {
        return ShopList;
    }

    public void setShopList(List<TblShopsEntity> shopList) {
        ShopList = shopList;
    }

    public int getShop_ID() {
        return Shop_ID;
    }

    public void setShop_ID(int shop_ID) {
        Shop_ID = shop_ID;
    }

    public int getLanguag_summe() {
        return languag_summe;
    }

    public void setLanguag_summe(int languag_summe) {
        this.languag_summe = languag_summe;
    }

    public List<TblLanguageEntity> getLanguageList() {
        return LanguageList;
    }

    public void setLanguageList(List<TblLanguageEntity> languageList) {
        LanguageList = languageList;
    }
}
