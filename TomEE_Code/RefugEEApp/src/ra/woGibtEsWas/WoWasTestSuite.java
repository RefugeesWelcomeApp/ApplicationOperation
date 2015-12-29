package ra.woGibtEsWas;

import com.mysql.fabric.Server;
import ra.model.RltnProductCategoryEntity;
import ra.model.TblProductCategoryEntity;

/**
 * Created by the-l_000 on 20.12.2015.
 */
public class WoWasTestSuite {

    public static void main(String[] args) {
        WoWas test = new WoWas();

        test.createLanguageList();
        test.setLanguage_ID(1);
        //ermittelt sie Summe aller Kategorien in der DB
        // wird später zur aufbereitung der Anzeige benötigt
        test.textoutput_MainCat();
        // ausgabe der Cat_IDs via Console wird in Sprach bezichner/ blob für vis. Ausgabe übersetzt
        test.setCat_ID(test.inputCat_Id());      //inputCat_ID ist inputbox eingabe für die entwicklung
        //wird durch optische Schnittstelle, welche die Cat_ID liefert
        //ersetzt

        test.createSubCatList(test.getCat_ID()); //erzeugen der Sub Cat Liste
        test.textoutput_SubCat();
        test.setSub_cat_ID(test.inputSubCat_Id());

        test.createProdList(test.getSub_cat_ID());
        test.createShopCatList(test.getSub_cat_ID());
        test.textoutput_produkt();
        test.textoutput_ShopCats();
        test.setShopCat_ID(test.inputShopCat_Id());

        test.createShopList(test.getShopCat_ID());
        test.textoutput_Shops();




    }
}
