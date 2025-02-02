package dev.iconpln.mims.data.local.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TPEMERIKSAAN_DETAIL".
*/
public class TPemeriksaanDetailDao extends AbstractDao<TPemeriksaanDetail, Long> {

    public static final String TABLENAME = "TPEMERIKSAAN_DETAIL";

    /**
     * Properties of entity TPemeriksaanDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoPemeriksaan = new Property(1, String.class, "NoPemeriksaan", false, "NO_PEMERIKSAAN");
        public final static Property Sn = new Property(2, String.class, "Sn", false, "SN");
        public final static Property NoDoSmar = new Property(3, String.class, "NoDoSmar", false, "NO_DO_SMAR");
        public final static Property NoMaterail = new Property(4, String.class, "NoMaterail", false, "NO_MATERAIL");
        public final static Property NoPackaging = new Property(5, String.class, "NoPackaging", false, "NO_PACKAGING");
        public final static Property Kategori = new Property(6, String.class, "Kategori", false, "KATEGORI");
        public final static Property StatusPenerimaan = new Property(7, String.class, "StatusPenerimaan", false, "STATUS_PENERIMAAN");
        public final static Property StatusPemeriksaan = new Property(8, String.class, "StatusPemeriksaan", false, "STATUS_PEMERIKSAAN");
        public final static Property IsPeriksa = new Property(9, Integer.class, "isPeriksa", false, "IS_PERIKSA");
        public final static Property IsChecked = new Property(10, Integer.class, "IsChecked", false, "IS_CHECKED");
        public final static Property IsComplaint = new Property(11, Integer.class, "IsComplaint", false, "IS_COMPLAINT");
        public final static Property IsDone = new Property(12, Integer.class, "IsDone", false, "IS_DONE");
    }


    public TPemeriksaanDetailDao(DaoConfig config) {
        super(config);
    }
    
    public TPemeriksaanDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TPEMERIKSAAN_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_PEMERIKSAAN\" TEXT," + // 1: NoPemeriksaan
                "\"SN\" TEXT," + // 2: Sn
                "\"NO_DO_SMAR\" TEXT," + // 3: NoDoSmar
                "\"NO_MATERAIL\" TEXT," + // 4: NoMaterail
                "\"NO_PACKAGING\" TEXT," + // 5: NoPackaging
                "\"KATEGORI\" TEXT," + // 6: Kategori
                "\"STATUS_PENERIMAAN\" TEXT," + // 7: StatusPenerimaan
                "\"STATUS_PEMERIKSAAN\" TEXT," + // 8: StatusPemeriksaan
                "\"IS_PERIKSA\" INTEGER," + // 9: isPeriksa
                "\"IS_CHECKED\" INTEGER," + // 10: IsChecked
                "\"IS_COMPLAINT\" INTEGER," + // 11: IsComplaint
                "\"IS_DONE\" INTEGER);"); // 12: IsDone
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TPEMERIKSAAN_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TPemeriksaanDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoPemeriksaan = entity.getNoPemeriksaan();
        if (NoPemeriksaan != null) {
            stmt.bindString(2, NoPemeriksaan);
        }
 
        String Sn = entity.getSn();
        if (Sn != null) {
            stmt.bindString(3, Sn);
        }
 
        String NoDoSmar = entity.getNoDoSmar();
        if (NoDoSmar != null) {
            stmt.bindString(4, NoDoSmar);
        }
 
        String NoMaterail = entity.getNoMaterail();
        if (NoMaterail != null) {
            stmt.bindString(5, NoMaterail);
        }
 
        String NoPackaging = entity.getNoPackaging();
        if (NoPackaging != null) {
            stmt.bindString(6, NoPackaging);
        }
 
        String Kategori = entity.getKategori();
        if (Kategori != null) {
            stmt.bindString(7, Kategori);
        }
 
        String StatusPenerimaan = entity.getStatusPenerimaan();
        if (StatusPenerimaan != null) {
            stmt.bindString(8, StatusPenerimaan);
        }
 
        String StatusPemeriksaan = entity.getStatusPemeriksaan();
        if (StatusPemeriksaan != null) {
            stmt.bindString(9, StatusPemeriksaan);
        }
 
        Integer isPeriksa = entity.getIsPeriksa();
        if (isPeriksa != null) {
            stmt.bindLong(10, isPeriksa);
        }
 
        Integer IsChecked = entity.getIsChecked();
        if (IsChecked != null) {
            stmt.bindLong(11, IsChecked);
        }
 
        Integer IsComplaint = entity.getIsComplaint();
        if (IsComplaint != null) {
            stmt.bindLong(12, IsComplaint);
        }
 
        Integer IsDone = entity.getIsDone();
        if (IsDone != null) {
            stmt.bindLong(13, IsDone);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TPemeriksaanDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoPemeriksaan = entity.getNoPemeriksaan();
        if (NoPemeriksaan != null) {
            stmt.bindString(2, NoPemeriksaan);
        }
 
        String Sn = entity.getSn();
        if (Sn != null) {
            stmt.bindString(3, Sn);
        }
 
        String NoDoSmar = entity.getNoDoSmar();
        if (NoDoSmar != null) {
            stmt.bindString(4, NoDoSmar);
        }
 
        String NoMaterail = entity.getNoMaterail();
        if (NoMaterail != null) {
            stmt.bindString(5, NoMaterail);
        }
 
        String NoPackaging = entity.getNoPackaging();
        if (NoPackaging != null) {
            stmt.bindString(6, NoPackaging);
        }
 
        String Kategori = entity.getKategori();
        if (Kategori != null) {
            stmt.bindString(7, Kategori);
        }
 
        String StatusPenerimaan = entity.getStatusPenerimaan();
        if (StatusPenerimaan != null) {
            stmt.bindString(8, StatusPenerimaan);
        }
 
        String StatusPemeriksaan = entity.getStatusPemeriksaan();
        if (StatusPemeriksaan != null) {
            stmt.bindString(9, StatusPemeriksaan);
        }
 
        Integer isPeriksa = entity.getIsPeriksa();
        if (isPeriksa != null) {
            stmt.bindLong(10, isPeriksa);
        }
 
        Integer IsChecked = entity.getIsChecked();
        if (IsChecked != null) {
            stmt.bindLong(11, IsChecked);
        }
 
        Integer IsComplaint = entity.getIsComplaint();
        if (IsComplaint != null) {
            stmt.bindLong(12, IsComplaint);
        }
 
        Integer IsDone = entity.getIsDone();
        if (IsDone != null) {
            stmt.bindLong(13, IsDone);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TPemeriksaanDetail readEntity(Cursor cursor, int offset) {
        TPemeriksaanDetail entity = new TPemeriksaanDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoPemeriksaan
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Sn
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // NoDoSmar
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // NoMaterail
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // NoPackaging
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // Kategori
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // StatusPenerimaan
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // StatusPemeriksaan
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // isPeriksa
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // IsChecked
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // IsComplaint
            cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12) // IsDone
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TPemeriksaanDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoPemeriksaan(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSn(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNoDoSmar(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNoMaterail(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNoPackaging(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setKategori(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStatusPenerimaan(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStatusPemeriksaan(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIsPeriksa(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setIsChecked(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setIsComplaint(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setIsDone(cursor.isNull(offset + 12) ? null : cursor.getInt(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TPemeriksaanDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TPemeriksaanDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TPemeriksaanDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
