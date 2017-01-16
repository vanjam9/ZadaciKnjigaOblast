package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by androiddevelopment on 16.1.17..
 */

@DatabaseTable(tableName="Knjiga")
public class Knjiga {

    /* private int id;
      private String naslov;
      private int brojStrana;
      private java.util.Date datumIzdanja;
      */private boolean prisutna;

    public static final String POLJE_NASLOV = "naslov";
    public static final String POLJE_BROJ_STRANA = "broj_strana";
    public static final String POLJE_DATUM_IZDAVANJA = "datum_izdavanja";


    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NASLOV, canBeNull = false)
    private String naslov;
    @DatabaseField(columnName = POLJE_BROJ_STRANA, canBeNull = false)
    private int brojStrana;
    @DatabaseField(columnName = POLJE_DATUM_IZDAVANJA, canBeNull = false)
    private Date datumIzdanja;
    @ForeignCollectionField(foreignFieldName = "Knjiga", eager = false, maxEagerLevel = 1)
    private ForeignCollection<Oblast> oblasti;

    public Knjiga() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public boolean isPrisutna() {
        return prisutna;
    }

    public void setPrisutna(boolean prisutna) {
        this.prisutna = prisutna;
    }

    public Knjiga(String naslov, int brojStrana, Date datumIzdanja) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.datumIzdanja = datumIzdanja;


    }
@Override
    public String toString() {
        return "Knjiga{" +

                "naslov='" + naslov + '\'' +
                ",id=" + id +
                ", brojStrana=" + brojStrana +
                ",datumIzdavanja=" + datumIzdanja+
                '}';
    }
}