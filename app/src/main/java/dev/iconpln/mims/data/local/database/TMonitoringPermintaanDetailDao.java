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
 * DAO for table "TMONITORING_PERMINTAAN_DETAIL".
*/
public class TMonitoringPermintaanDetailDao extends AbstractDao<TMonitoringPermintaanDetail, Long> {

    public static final String TABLENAME = "TMONITORING_PERMINTAAN_DETAIL";

    /**
     * Properties of entity TMonitoringPermintaanDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoPermintaan = new Property(1, String.class, "NoPermintaan", false, "NO_PERMINTAAN");
        public final static Property NoTransaksi = new Property(2, String.class, "NoTransaksi", false, "NO_TRANSAKSI");
        public final static Property NoRepackaging = new Property(3, String.class, "NoRepackaging", false, "NO_REPACKAGING");
        public final static Property NomorMaterial = new Property(4, String.class, "NomorMaterial", false, "NOMOR_MATERIAL");
        public final static Property Unit = new Property(5, String.class, "Unit", false, "UNIT");
        public final static Property QtyPermintaan = new Property(6, Double.class, "QtyPermintaan", false, "QTY_PERMINTAAN");
        public final static Property MaterialDesc = new Property(7, String.class, "MaterialDesc", false, "MATERIAL_DESC");
        public final static Property QtyScan = new Property(8, Double.class, "QtyScan", false, "QTY_SCAN");
        public final static Property Kategori = new Property(9, String.class, "Kategori", false, "KATEGORI");
        public final static Property QtyPengeluaran = new Property(10, Double.class, "QtyPengeluaran", false, "QTY_PENGELUARAN");
        public final static Property IsActive = new Property(11, Boolean.class, "IsActive", false, "IS_ACTIVE");
    }


    public TMonitoringPermintaanDetailDao(DaoConfig config) {
        super(config);
    }
    
    public TMonitoringPermintaanDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TMONITORING_PERMINTAAN_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_PERMINTAAN\" TEXT," + // 1: NoPermintaan
                "\"NO_TRANSAKSI\" TEXT," + // 2: NoTransaksi
                "\"NO_REPACKAGING\" TEXT," + // 3: NoRepackaging
                "\"NOMOR_MATERIAL\" TEXT," + // 4: NomorMaterial
                "\"UNIT\" TEXT," + // 5: Unit
                "\"QTY_PERMINTAAN\" REAL," + // 6: QtyPermintaan
                "\"MATERIAL_DESC\" TEXT," + // 7: MaterialDesc
                "\"QTY_SCAN\" REAL," + // 8: QtyScan
                "\"KATEGORI\" TEXT," + // 9: Kategori
                "\"QTY_PENGELUARAN\" REAL," + // 10: QtyPengeluaran
                "\"IS_ACTIVE\" INTEGER);"); // 11: IsActive
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TMONITORING_PERMINTAAN_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TMonitoringPermintaanDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoPermintaan = entity.getNoPermintaan();
        if (NoPermintaan != null) {
            stmt.bindString(2, NoPermintaan);
        }
 
        String NoTransaksi = entity.getNoTransaksi();
        if (NoTransaksi != null) {
            stmt.bindString(3, NoTransaksi);
        }
 
        String NoRepackaging = entity.getNoRepackaging();
        if (NoRepackaging != null) {
            stmt.bindString(4, NoRepackaging);
        }
 
        String NomorMaterial = entity.getNomorMaterial();
        if (NomorMaterial != null) {
            stmt.bindString(5, NomorMaterial);
        }
 
        String Unit = entity.getUnit();
        if (Unit != null) {
            stmt.bindString(6, Unit);
        }
 
        Double QtyPermintaan = entity.getQtyPermintaan();
        if (QtyPermintaan != null) {
            stmt.bindDouble(7, QtyPermintaan);
        }
 
        String MaterialDesc = entity.getMaterialDesc();
        if (MaterialDesc != null) {
            stmt.bindString(8, MaterialDesc);
        }
 
        Double QtyScan = entity.getQtyScan();
        if (QtyScan != null) {
            stmt.bindDouble(9, QtyScan);
        }
 
        String Kategori = entity.getKategori();
        if (Kategori != null) {
            stmt.bindString(10, Kategori);
        }
 
        Double QtyPengeluaran = entity.getQtyPengeluaran();
        if (QtyPengeluaran != null) {
            stmt.bindDouble(11, QtyPengeluaran);
        }
 
        Boolean IsActive = entity.getIsActive();
        if (IsActive != null) {
            stmt.bindLong(12, IsActive ? 1L: 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TMonitoringPermintaanDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoPermintaan = entity.getNoPermintaan();
        if (NoPermintaan != null) {
            stmt.bindString(2, NoPermintaan);
        }
 
        String NoTransaksi = entity.getNoTransaksi();
        if (NoTransaksi != null) {
            stmt.bindString(3, NoTransaksi);
        }
 
        String NoRepackaging = entity.getNoRepackaging();
        if (NoRepackaging != null) {
            stmt.bindString(4, NoRepackaging);
        }
 
        String NomorMaterial = entity.getNomorMaterial();
        if (NomorMaterial != null) {
            stmt.bindString(5, NomorMaterial);
        }
 
        String Unit = entity.getUnit();
        if (Unit != null) {
            stmt.bindString(6, Unit);
        }
 
        Double QtyPermintaan = entity.getQtyPermintaan();
        if (QtyPermintaan != null) {
            stmt.bindDouble(7, QtyPermintaan);
        }
 
        String MaterialDesc = entity.getMaterialDesc();
        if (MaterialDesc != null) {
            stmt.bindString(8, MaterialDesc);
        }
 
        Double QtyScan = entity.getQtyScan();
        if (QtyScan != null) {
            stmt.bindDouble(9, QtyScan);
        }
 
        String Kategori = entity.getKategori();
        if (Kategori != null) {
            stmt.bindString(10, Kategori);
        }
 
        Double QtyPengeluaran = entity.getQtyPengeluaran();
        if (QtyPengeluaran != null) {
            stmt.bindDouble(11, QtyPengeluaran);
        }
 
        Boolean IsActive = entity.getIsActive();
        if (IsActive != null) {
            stmt.bindLong(12, IsActive ? 1L: 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TMonitoringPermintaanDetail readEntity(Cursor cursor, int offset) {
        TMonitoringPermintaanDetail entity = new TMonitoringPermintaanDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoPermintaan
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // NoTransaksi
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // NoRepackaging
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // NomorMaterial
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Unit
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // QtyPermintaan
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // MaterialDesc
            cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8), // QtyScan
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // Kategori
            cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10), // QtyPengeluaran
            cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0 // IsActive
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TMonitoringPermintaanDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoPermintaan(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNoTransaksi(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNoRepackaging(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setNomorMaterial(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUnit(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setQtyPermintaan(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setMaterialDesc(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setQtyScan(cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8));
        entity.setKategori(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setQtyPengeluaran(cursor.isNull(offset + 10) ? null : cursor.getDouble(offset + 10));
        entity.setIsActive(cursor.isNull(offset + 11) ? null : cursor.getShort(offset + 11) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TMonitoringPermintaanDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TMonitoringPermintaanDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TMonitoringPermintaanDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
