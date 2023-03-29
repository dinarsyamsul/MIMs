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
 * DAO for table "TSN_MONITORING_PERMINTAAN".
*/
public class TSnMonitoringPermintaanDao extends AbstractDao<TSnMonitoringPermintaan, Long> {

    public static final String TABLENAME = "TSN_MONITORING_PERMINTAAN";

    /**
     * Properties of entity TSnMonitoringPermintaan.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoRepackaging = new Property(1, String.class, "NoRepackaging", false, "NO_REPACKAGING");
        public final static Property NomorMaterial = new Property(2, String.class, "NomorMaterial", false, "NOMOR_MATERIAL");
        public final static Property SerialNumber = new Property(3, String.class, "SerialNumber", false, "SERIAL_NUMBER");
        public final static Property Status = new Property(4, String.class, "Status", false, "STATUS");
    }


    public TSnMonitoringPermintaanDao(DaoConfig config) {
        super(config);
    }
    
    public TSnMonitoringPermintaanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TSN_MONITORING_PERMINTAAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_REPACKAGING\" TEXT," + // 1: NoRepackaging
                "\"NOMOR_MATERIAL\" TEXT," + // 2: NomorMaterial
                "\"SERIAL_NUMBER\" TEXT," + // 3: SerialNumber
                "\"STATUS\" TEXT);"); // 4: Status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TSN_MONITORING_PERMINTAAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TSnMonitoringPermintaan entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoRepackaging = entity.getNoRepackaging();
        if (NoRepackaging != null) {
            stmt.bindString(2, NoRepackaging);
        }
 
        String NomorMaterial = entity.getNomorMaterial();
        if (NomorMaterial != null) {
            stmt.bindString(3, NomorMaterial);
        }
 
        String SerialNumber = entity.getSerialNumber();
        if (SerialNumber != null) {
            stmt.bindString(4, SerialNumber);
        }
 
        String Status = entity.getStatus();
        if (Status != null) {
            stmt.bindString(5, Status);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TSnMonitoringPermintaan entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoRepackaging = entity.getNoRepackaging();
        if (NoRepackaging != null) {
            stmt.bindString(2, NoRepackaging);
        }
 
        String NomorMaterial = entity.getNomorMaterial();
        if (NomorMaterial != null) {
            stmt.bindString(3, NomorMaterial);
        }
 
        String SerialNumber = entity.getSerialNumber();
        if (SerialNumber != null) {
            stmt.bindString(4, SerialNumber);
        }
 
        String Status = entity.getStatus();
        if (Status != null) {
            stmt.bindString(5, Status);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TSnMonitoringPermintaan readEntity(Cursor cursor, int offset) {
        TSnMonitoringPermintaan entity = new TSnMonitoringPermintaan( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoRepackaging
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // NomorMaterial
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // SerialNumber
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // Status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TSnMonitoringPermintaan entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoRepackaging(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNomorMaterial(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSerialNumber(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStatus(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TSnMonitoringPermintaan entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TSnMonitoringPermintaan entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TSnMonitoringPermintaan entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}