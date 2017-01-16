package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.io.IOException;

import java.io.IOException;


/**
 * Created by androiddevelopment on 16.1.17..
 */
public class Zadatak1KreiranjeTabela {

    public static void main(String[] args) {
        ConnectionSource connectionSource = null;

        try {

            connectionSource = new JdbcConnectionSource("jdbc:sqlite:knjigaOblast.db");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connectionSource != null) {
                try {
                    connectionSource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }
    }
