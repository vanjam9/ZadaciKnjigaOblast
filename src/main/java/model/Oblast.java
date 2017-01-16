package model;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
/**
 * Created by androiddevelopment on 16.1.17..
 */
@DatabaseTable(tableName="Oblast")
public class Oblast {

   /* private  int id;*/
    private String naziv;
    private int pocetnaStrana;


    public static final String POLJE_NAZIV = "naziv";
    public static final String POLJE_POCETNA_STRANA = "pocetna_strana";


    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NAZIV, canBeNull = false)
    private String naziv;
    @DatabaseField(columnName = POLJE_POCETNA_STRANA, canBeNull = false)
    private int pocetna_strana;




    public Oblast() {

    }

    public Oblast(String naziv, int pocetnaStrana) {
        this.naziv = naziv;
        this.pocetnaStrana = pocetnaStrana;
    }

    @Override
    public String toString() {
        return "Oblast{" +

                "naziv ='" + naziv + '\'' +
                ",id=" + id +
                ", pocetna_strana =" + pocetnaStrana +

                '}';
    }
}
