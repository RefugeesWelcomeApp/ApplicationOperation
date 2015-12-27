package ra.woGibtEsWas;

import com.mysql.fabric.Server;
import ra.model.TblProductCategoryEntity;

/**
 * Created by the-l_000 on 20.12.2015.
 */
public class WoWasTestSuite {

    public static void main(String[] args) {
        WoWas test = new WoWas();

          

        test.setCat_Summe( test.createCatCount(test.getMainResultList()));
        //ermittelt sie Summe aller Kategorien in der DB
        // wird später zur aufbereitung der Anzeige benötigt

        System.out.println(test.getCat_Summe()); // nur für entwicklungszwecke


        //  System.out.println(test.getMainResultList());
        for (Object o : test.getMainResultList()) {
            TblProductCategoryEntity e = (TblProductCategoryEntity) o;
            System.out.println("MainCat_ID : " + e.getIdtblProductCategory());
           // <td><img src="<%= e.getAttachments() %>" alt="images Here" width="200 px" height="200px"></td>
        }
        // ausgabe der Cat_IDs via Console wird in Sprach bezichner/ blob für vis. Ausgabe übersetzt




        test.setCat_ID(test.inputCat_Id());      //inputCat_ID ist inputbox eingabe für die entwicklung
                                                //wird durch optische Schnittstelle, welche die Cat_ID liefert
                                                //ersetzt

        test.createSubCatList(test.getCat_ID()); //erzeugen der Sub Cat Liste

        System.out.println("MainCat_ID:" + test.getCat_ID());
        for (Object o : test.getSubResultList()) {
            TblProductCategoryEntity e = (TblProductCategoryEntity) o;
            System.out.println("SubCat_ID : " +e.getMaincategory());
        }
        // ausgabe der Cat_IDs via Console wird in Sprach bezichner/ blob für vis. Ausgabe übersetzt


        test.setSub_cat_summe( test.createCatCount(test.getSubResultList()));



    }
}
