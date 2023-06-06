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
 * DAO for table "TTRANS_PEMAKAIAN_DETAIL".
*/
public class TTransPemakaianDetailDao extends AbstractDao<TTransPemakaianDetail, Long> {

    public static final String TABLENAME = "TTRANS_PEMAKAIAN_DETAIL";

    /**
     * Properties of entity TTransPemakaianDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoTransaksi = new Property(1, String.class, "NoTransaksi", false, "NO_TRANSAKSI");
        public final static Property NomorMaterial = new Property(2, String.class, "NomorMaterial", false, "NOMOR_MATERIAL");
        public final static Property NamaMaterial = new Property(3, String.class, "NamaMaterial", false, "NAMA_MATERIAL");
        public final static Property QtyReservasi = new Property(4, Double.class, "QtyReservasi", false, "QTY_RESERVASI");
        public final static Property QtyPemakaian = new Property(5, Double.class, "QtyPemakaian", false, "QTY_PEMAKAIAN");
        public final static Property QtyPengeluaran = new Property(6, Double.class, "QtyPengeluaran", false, "QTY_PENGELUARAN");
        public final static Property Unit = new Property(7, String.class, "Unit", false, "UNIT");
        public final static Property NoMeter = new Property(8, String.class, "NoMeter", false, "NO_METER");
        public final static Property ValuationType = new Property(9, String.class, "ValuationType", false, "VALUATION_TYPE");
        public final static Property Keterangan = new Property(10, String.class, "Keterangan", false, "KETERANGAN");
        public final static Property IsActive = new Property(11, Integer.class, "IsActive", false, "IS_ACTIVE");
        public final static Property SnScanned = new Property(12, String.class, "SnScanned", false, "SN_SCANNED");
        public final static Property IsDone = new Property(13, Integer.class, "IsDone", false, "IS_DONE");
    }


    public TTransPemakaianDetailDao(DaoConfig config) {
        super(config);
    }
    
    public TTransPemakaianDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TTRANS_PEMAKAIAN_DETAIL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_TRANSAKSI\" TEXT," + // 1: NoTransaksi
                "\"NOMOR_MATERIAL\" TEXT," + // 2: NomorMaterial
                "\"NAMA_MATERIAL\" TEXT," + // 3: NamaMaterial
                "\"QTY_RESERVASI\" REAL," + // 4: QtyReservasi
                "\"QTY_PEMAKAIAN\" REAL," + // 5: QtyPemakaian
                "\"QTY_PENGELUARAN\" REAL," + // 6: QtyPengeluaran
                "\"UNIT\" TEXT," + // 7: Unit
                "\"NO_METER\" TEXT," + // 8: NoMeter
                "\"VALUATION_TYPE\" TEXT," + // 9: ValuationType
                "\"KETERANGAN\" TEXT," + // 10: Keterangan
                "\"IS_ACTIVE\" INTEGER," + // 11: IsActive
                "\"SN_SCANNED\" TEXT," + // 12: SnScanned
                "\"IS_DONE\" INTEGER);"); // 13: IsDone
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TTRANS_PEMAKAIAN_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TTransPemakaianDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoTransaksi = entity.getNoTransaksi();
        if (NoTransaksi != null) {
            stmt.bindString(2, NoTransaksi);
        }
 
        String NomorMaterial = entity.getNomorMaterial();
        if (NomorMaterial != null) {
            stmt.bindString(3, NomorMaterial);
        }
 
        String NamaMaterial = entity.getNamaMaterial();
        if (NamaMaterial != null) {
            stmt.bindString(4, NamaMaterial);
        }
 
        Double QtyReservasi = entity.getQtyReservasi();
        if (QtyReservasi != null) {
            stmt.bindDouble(5, QtyReservasi);
        }
 
        Double QtyPemakaian = entity.getQtyPemakaian();
        if (QtyPemakaian != null) {
            stmt.bindDouble(6, QtyPemakaian);
        }
 
        Double QtyPengeluaran = entity.getQtyPengeluaran();
        if (QtyPengeluaran != null) {
            stmt.bindDouble(7, QtyPengeluaran);
        }
 
        String Unit = entity.getUnit();
        if (Unit != null) {
            stmt.bindString(8, Unit);
        }
 
        String NoMeter = entity.getNoMeter();
        if (NoMeter != null) {
            stmt.bindString(9, NoMeter);
        }
 
        String ValuationType = entity.getValuationType();
        if (ValuationType != null) {
            stmt.bindString(10, ValuationType);
        }
 
        String Keterangan = entity.getKeterangan();
        if (Keterangan != null) {
            stmt.bindString(11, Keterangan);
        }
 
        Integer IsActive = entity.getIsActive();
        if (IsActive != null) {
            stmt.bindLong(12, IsActive);
        }
 
        String SnScanned = entity.getSnScanned();
        if (SnScanned != null) {
            stmt.bindString(13, SnScanned);
        }
 
        Integer IsDone = entity.getIsDone();
        if (IsDone != null) {
            stmt.bindLong(14, IsDone);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TTransPemakaianDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoTransaksi = entity.getNoTransaksi();
        if (NoTransaksi != null) {
            stmt.bindString(2, NoTransaksi);
        }
 
        String NomorMaterial = entity.getNomorMaterial();
        if (NomorMaterial != null) {
            stmt.bindString(3, NomorMaterial);
        }
 
        String NamaMaterial = entity.getNamaMaterial();
        if (NamaMaterial != null) {
            stmt.bindString(4, NamaMaterial);
        }
 
        Double QtyReservasi = entity.getQtyReservasi();
        if (QtyReservasi != null) {
            stmt.bindDouble(5, QtyReservasi);
        }
 
        Double QtyPemakaian = entity.getQtyPemakaian();
        if (QtyPemakaian != null) {
            stmt.bindDouble(6, QtyPemakaian);
        }
 
        Double QtyPengeluaran = entity.getQtyPengeluaran();
        if (QtyPengeluaran != null) {
            stmt.bindDouble(7, QtyPengeluaran);
        }
 
        String Unit = entity.getUnit();
        if (Unit != null) {
            stmt.bindString(8, Unit);
        }
 
        String NoMeter = entity.getNoMeter();
        if (NoMeter != null) {
            stmt.bindString(9, NoMeter);
        }
 
        String ValuationType = entity.getValuationType();
        if (ValuationType != null) {
            stmt.bindString(10, ValuationType);
        }
 
        String Keterangan = entity.getKeterangan();
        if (Keterangan != null) {
            stmt.bindString(11, Keterangan);
        }
 
        Integer IsActive = entity.getIsActive();
        if (IsActive != null) {
            stmt.bindLong(12, IsActive);
        }
 
        String SnScanned = entity.getSnScanned();
        if (SnScanned != null) {
            stmt.bindString(13, SnScanned);
        }
 
        Integer IsDone = entity.getIsDone();
        if (IsDone != null) {
            stmt.bindLong(14, IsDone);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TTransPemakaianDetail readEntity(Cursor cursor, int offset) {
        TTransPemakaianDetail entity = new TTransPemakaianDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoTransaksi
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // NomorMaterial
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // NamaMaterial
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // QtyReservasi
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // QtyPemakaian
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // QtyPengeluaran
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // Unit
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // NoMeter
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ValuationType
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // Keterangan
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // IsActive
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // SnScanned
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13) // IsDone
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TTransPemakaianDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoTransaksi(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNomorMaterial(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNamaMaterial(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setQtyReservasi(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setQtyPemakaian(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setQtyPengeluaran(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setUnit(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNoMeter(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setValuationType(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setKeterangan(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setIsActive(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setSnScanned(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setIsDone(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TTransPemakaianDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TTransPemakaianDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TTransPemakaianDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
