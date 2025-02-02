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
 * DAO for table "TRATING".
*/
public class TRatingDao extends AbstractDao<TRating, Long> {

    public static final String TABLENAME = "TRATING";

    /**
     * Properties of entity TRating.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property KdRating = new Property(1, String.class, "KdRating", false, "KD_RATING");
        public final static Property Keterangan = new Property(2, String.class, "Keterangan", false, "KETERANGAN");
        public final static Property Nilai = new Property(3, Integer.class, "Nilai", false, "NILAI");
        public final static Property Type = new Property(4, String.class, "Type", false, "TYPE");
        public final static Property IsActive = new Property(5, Integer.class, "IsActive", false, "IS_ACTIVE");
    }


    public TRatingDao(DaoConfig config) {
        super(config);
    }
    
    public TRatingDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TRATING\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"KD_RATING\" TEXT," + // 1: KdRating
                "\"KETERANGAN\" TEXT," + // 2: Keterangan
                "\"NILAI\" INTEGER," + // 3: Nilai
                "\"TYPE\" TEXT," + // 4: Type
                "\"IS_ACTIVE\" INTEGER);"); // 5: IsActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TRATING\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TRating entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String KdRating = entity.getKdRating();
        if (KdRating != null) {
            stmt.bindString(2, KdRating);
        }
 
        String Keterangan = entity.getKeterangan();
        if (Keterangan != null) {
            stmt.bindString(3, Keterangan);
        }
 
        Integer Nilai = entity.getNilai();
        if (Nilai != null) {
            stmt.bindLong(4, Nilai);
        }
 
        String Type = entity.getType();
        if (Type != null) {
            stmt.bindString(5, Type);
        }
 
        Integer IsActive = entity.getIsActive();
        if (IsActive != null) {
            stmt.bindLong(6, IsActive);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TRating entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String KdRating = entity.getKdRating();
        if (KdRating != null) {
            stmt.bindString(2, KdRating);
        }
 
        String Keterangan = entity.getKeterangan();
        if (Keterangan != null) {
            stmt.bindString(3, Keterangan);
        }
 
        Integer Nilai = entity.getNilai();
        if (Nilai != null) {
            stmt.bindLong(4, Nilai);
        }
 
        String Type = entity.getType();
        if (Type != null) {
            stmt.bindString(5, Type);
        }
 
        Integer IsActive = entity.getIsActive();
        if (IsActive != null) {
            stmt.bindLong(6, IsActive);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TRating readEntity(Cursor cursor, int offset) {
        TRating entity = new TRating( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // KdRating
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Keterangan
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // Nilai
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // Type
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // IsActive
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TRating entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setKdRating(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setKeterangan(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNilai(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setType(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setIsActive(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TRating entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TRating entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TRating entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
