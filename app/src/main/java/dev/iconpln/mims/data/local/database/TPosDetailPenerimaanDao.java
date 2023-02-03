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
 * DAO for table "TPOS_DETAIL_PENERIMAAN".
*/
public class TPosDetailPenerimaanDao extends AbstractDao<TPosDetailPenerimaan, Long> {

    public static final String TABLENAME = "TPOS_DETAIL_PENERIMAAN";

    /**
     * Properties of entity TPosDetailPenerimaan.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoMatSap = new Property(1, String.class, "NoMatSap", false, "NO_MAT_SAP");
        public final static Property NoDoSmar = new Property(2, String.class, "NoDoSmar", false, "NO_DO_SMAR");
        public final static Property Qty = new Property(3, String.class, "Qty", false, "QTY");
        public final static Property KdPabrikan = new Property(4, String.class, "KdPabrikan", false, "KD_PABRIKAN");
        public final static Property DoStatus = new Property(5, String.class, "DoStatus", false, "DO_STATUS");
        public final static Property PoSapNo = new Property(6, String.class, "PoSapNo", false, "PO_SAP_NO");
        public final static Property PoMpNo = new Property(7, String.class, "PoMpNo", false, "PO_MP_NO");
        public final static Property NoDoMims = new Property(8, String.class, "NoDoMims", false, "NO_DO_MIMS");
        public final static Property NoPackaging = new Property(9, String.class, "NoPackaging", false, "NO_PACKAGING");
        public final static Property PlantCodeNo = new Property(10, String.class, "PlantCodeNo", false, "PLANT_CODE_NO");
        public final static Property PlantName = new Property(11, String.class, "PlantName", false, "PLANT_NAME");
        public final static Property StorLoc = new Property(12, String.class, "StorLoc", false, "STOR_LOC");
        public final static Property LeadTime = new Property(13, String.class, "LeadTime", false, "LEAD_TIME");
        public final static Property CreatedDate = new Property(14, String.class, "CreatedDate", false, "CREATED_DATE");
        public final static Property Uom = new Property(15, String.class, "Uom", false, "UOM");
        public final static Property NoPemeriksaan = new Property(16, String.class, "NoPemeriksaan", false, "NO_PEMERIKSAAN");
        public final static Property Barcode = new Property(17, String.class, "Barcode", false, "BARCODE");
        public final static Property IsChecked = new Property(18, Integer.class, "isChecked", false, "IS_CHECKED");
    }


    public TPosDetailPenerimaanDao(DaoConfig config) {
        super(config);
    }
    
    public TPosDetailPenerimaanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TPOS_DETAIL_PENERIMAAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_MAT_SAP\" TEXT," + // 1: NoMatSap
                "\"NO_DO_SMAR\" TEXT," + // 2: NoDoSmar
                "\"QTY\" TEXT," + // 3: Qty
                "\"KD_PABRIKAN\" TEXT," + // 4: KdPabrikan
                "\"DO_STATUS\" TEXT," + // 5: DoStatus
                "\"PO_SAP_NO\" TEXT," + // 6: PoSapNo
                "\"PO_MP_NO\" TEXT," + // 7: PoMpNo
                "\"NO_DO_MIMS\" TEXT," + // 8: NoDoMims
                "\"NO_PACKAGING\" TEXT," + // 9: NoPackaging
                "\"PLANT_CODE_NO\" TEXT," + // 10: PlantCodeNo
                "\"PLANT_NAME\" TEXT," + // 11: PlantName
                "\"STOR_LOC\" TEXT," + // 12: StorLoc
                "\"LEAD_TIME\" TEXT," + // 13: LeadTime
                "\"CREATED_DATE\" TEXT," + // 14: CreatedDate
                "\"UOM\" TEXT," + // 15: Uom
                "\"NO_PEMERIKSAAN\" TEXT NOT NULL ," + // 16: NoPemeriksaan
                "\"BARCODE\" TEXT NOT NULL ," + // 17: Barcode
                "\"IS_CHECKED\" INTEGER);"); // 18: isChecked
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TPOS_DETAIL_PENERIMAAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TPosDetailPenerimaan entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoMatSap = entity.getNoMatSap();
        if (NoMatSap != null) {
            stmt.bindString(2, NoMatSap);
        }
 
        String NoDoSmar = entity.getNoDoSmar();
        if (NoDoSmar != null) {
            stmt.bindString(3, NoDoSmar);
        }
 
        String Qty = entity.getQty();
        if (Qty != null) {
            stmt.bindString(4, Qty);
        }
 
        String KdPabrikan = entity.getKdPabrikan();
        if (KdPabrikan != null) {
            stmt.bindString(5, KdPabrikan);
        }
 
        String DoStatus = entity.getDoStatus();
        if (DoStatus != null) {
            stmt.bindString(6, DoStatus);
        }
 
        String PoSapNo = entity.getPoSapNo();
        if (PoSapNo != null) {
            stmt.bindString(7, PoSapNo);
        }
 
        String PoMpNo = entity.getPoMpNo();
        if (PoMpNo != null) {
            stmt.bindString(8, PoMpNo);
        }
 
        String NoDoMims = entity.getNoDoMims();
        if (NoDoMims != null) {
            stmt.bindString(9, NoDoMims);
        }
 
        String NoPackaging = entity.getNoPackaging();
        if (NoPackaging != null) {
            stmt.bindString(10, NoPackaging);
        }
 
        String PlantCodeNo = entity.getPlantCodeNo();
        if (PlantCodeNo != null) {
            stmt.bindString(11, PlantCodeNo);
        }
 
        String PlantName = entity.getPlantName();
        if (PlantName != null) {
            stmt.bindString(12, PlantName);
        }
 
        String StorLoc = entity.getStorLoc();
        if (StorLoc != null) {
            stmt.bindString(13, StorLoc);
        }
 
        String LeadTime = entity.getLeadTime();
        if (LeadTime != null) {
            stmt.bindString(14, LeadTime);
        }
 
        String CreatedDate = entity.getCreatedDate();
        if (CreatedDate != null) {
            stmt.bindString(15, CreatedDate);
        }
 
        String Uom = entity.getUom();
        if (Uom != null) {
            stmt.bindString(16, Uom);
        }
        stmt.bindString(17, entity.getNoPemeriksaan());
        stmt.bindString(18, entity.getBarcode());
 
        Integer isChecked = entity.getIsChecked();
        if (isChecked != null) {
            stmt.bindLong(19, isChecked);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TPosDetailPenerimaan entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoMatSap = entity.getNoMatSap();
        if (NoMatSap != null) {
            stmt.bindString(2, NoMatSap);
        }
 
        String NoDoSmar = entity.getNoDoSmar();
        if (NoDoSmar != null) {
            stmt.bindString(3, NoDoSmar);
        }
 
        String Qty = entity.getQty();
        if (Qty != null) {
            stmt.bindString(4, Qty);
        }
 
        String KdPabrikan = entity.getKdPabrikan();
        if (KdPabrikan != null) {
            stmt.bindString(5, KdPabrikan);
        }
 
        String DoStatus = entity.getDoStatus();
        if (DoStatus != null) {
            stmt.bindString(6, DoStatus);
        }
 
        String PoSapNo = entity.getPoSapNo();
        if (PoSapNo != null) {
            stmt.bindString(7, PoSapNo);
        }
 
        String PoMpNo = entity.getPoMpNo();
        if (PoMpNo != null) {
            stmt.bindString(8, PoMpNo);
        }
 
        String NoDoMims = entity.getNoDoMims();
        if (NoDoMims != null) {
            stmt.bindString(9, NoDoMims);
        }
 
        String NoPackaging = entity.getNoPackaging();
        if (NoPackaging != null) {
            stmt.bindString(10, NoPackaging);
        }
 
        String PlantCodeNo = entity.getPlantCodeNo();
        if (PlantCodeNo != null) {
            stmt.bindString(11, PlantCodeNo);
        }
 
        String PlantName = entity.getPlantName();
        if (PlantName != null) {
            stmt.bindString(12, PlantName);
        }
 
        String StorLoc = entity.getStorLoc();
        if (StorLoc != null) {
            stmt.bindString(13, StorLoc);
        }
 
        String LeadTime = entity.getLeadTime();
        if (LeadTime != null) {
            stmt.bindString(14, LeadTime);
        }
 
        String CreatedDate = entity.getCreatedDate();
        if (CreatedDate != null) {
            stmt.bindString(15, CreatedDate);
        }
 
        String Uom = entity.getUom();
        if (Uom != null) {
            stmt.bindString(16, Uom);
        }
        stmt.bindString(17, entity.getNoPemeriksaan());
        stmt.bindString(18, entity.getBarcode());
 
        Integer isChecked = entity.getIsChecked();
        if (isChecked != null) {
            stmt.bindLong(19, isChecked);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TPosDetailPenerimaan readEntity(Cursor cursor, int offset) {
        TPosDetailPenerimaan entity = new TPosDetailPenerimaan( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoMatSap
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // NoDoSmar
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // Qty
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // KdPabrikan
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // DoStatus
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // PoSapNo
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // PoMpNo
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // NoDoMims
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // NoPackaging
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // PlantCodeNo
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // PlantName
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // StorLoc
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // LeadTime
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // CreatedDate
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // Uom
            cursor.getString(offset + 16), // NoPemeriksaan
            cursor.getString(offset + 17), // Barcode
            cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18) // isChecked
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TPosDetailPenerimaan entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoMatSap(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNoDoSmar(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setQty(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setKdPabrikan(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDoStatus(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPoSapNo(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPoMpNo(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNoDoMims(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setNoPackaging(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPlantCodeNo(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPlantName(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setStorLoc(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setLeadTime(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setCreatedDate(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setUom(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setNoPemeriksaan(cursor.getString(offset + 16));
        entity.setBarcode(cursor.getString(offset + 17));
        entity.setIsChecked(cursor.isNull(offset + 18) ? null : cursor.getInt(offset + 18));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TPosDetailPenerimaan entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TPosDetailPenerimaan entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TPosDetailPenerimaan entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
