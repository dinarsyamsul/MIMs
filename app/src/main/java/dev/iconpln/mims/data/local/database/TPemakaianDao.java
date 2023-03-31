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
 * DAO for table "TPEMAKAIAN".
*/
public class TPemakaianDao extends AbstractDao<TPemakaian, Long> {

    public static final String TABLENAME = "TPEMAKAIAN";

    /**
     * Properties of entity TPemakaian.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoTransaksi = new Property(1, String.class, "NoTransaksi", false, "NO_TRANSAKSI");
        public final static Property NoReservasi = new Property(2, String.class, "NoReservasi", false, "NO_RESERVASI");
        public final static Property NoPemesanan = new Property(3, String.class, "NoPemesanan", false, "NO_PEMESANAN");
        public final static Property KodeIntegrasi = new Property(4, String.class, "KodeIntegrasi", false, "KODE_INTEGRASI");
        public final static Property Plant = new Property(5, String.class, "Plant", false, "PLANT");
        public final static Property StorLoc = new Property(6, String.class, "StorLoc", false, "STOR_LOC");
        public final static Property StatusPemakaian = new Property(7, String.class, "StatusPemakaian", false, "STATUS_PEMAKAIAN");
        public final static Property TanggalReservasi = new Property(8, String.class, "TanggalReservasi", false, "TANGGAL_RESERVASI");
        public final static Property TanggalPemakaian = new Property(9, String.class, "TanggalPemakaian", false, "TANGGAL_PEMAKAIAN");
        public final static Property TanggalPengeluaran = new Property(10, String.class, "TanggalPengeluaran", false, "TANGGAL_PENGELUARAN");
        public final static Property TanggalDokumen = new Property(11, String.class, "TanggalDokumen", false, "TANGGAL_DOKUMEN");
        public final static Property JenisPekerjaan = new Property(12, String.class, "JenisPekerjaan", false, "JENIS_PEKERJAAN");
        public final static Property Sumber = new Property(13, String.class, "Sumber", false, "SUMBER");
        public final static Property StatusKirimAgo = new Property(14, String.class, "StatusKirimAgo", false, "STATUS_KIRIM_AGO");
        public final static Property StatusSap = new Property(15, String.class, "StatusSap", false, "STATUS_SAP");
        public final static Property NoAgenda = new Property(16, String.class, "NoAgenda", false, "NO_AGENDA");
        public final static Property IdPelanggan = new Property(17, String.class, "IdPelanggan", false, "ID_PELANGGAN");
        public final static Property NamaPelanggan = new Property(18, String.class, "NamaPelanggan", false, "NAMA_PELANGGAN");
        public final static Property AlamatPelanggan = new Property(19, String.class, "AlamatPelanggan", false, "ALAMAT_PELANGGAN");
        public final static Property Tarif = new Property(20, String.class, "Tarif", false, "TARIF");
        public final static Property Daya = new Property(21, String.class, "Daya", false, "DAYA");
        public final static Property TanggalBayar = new Property(22, String.class, "TanggalBayar", false, "TANGGAL_BAYAR");
    }


    public TPemakaianDao(DaoConfig config) {
        super(config);
    }
    
    public TPemakaianDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TPEMAKAIAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_TRANSAKSI\" TEXT," + // 1: NoTransaksi
                "\"NO_RESERVASI\" TEXT," + // 2: NoReservasi
                "\"NO_PEMESANAN\" TEXT," + // 3: NoPemesanan
                "\"KODE_INTEGRASI\" TEXT," + // 4: KodeIntegrasi
                "\"PLANT\" TEXT," + // 5: Plant
                "\"STOR_LOC\" TEXT," + // 6: StorLoc
                "\"STATUS_PEMAKAIAN\" TEXT," + // 7: StatusPemakaian
                "\"TANGGAL_RESERVASI\" TEXT," + // 8: TanggalReservasi
                "\"TANGGAL_PEMAKAIAN\" TEXT," + // 9: TanggalPemakaian
                "\"TANGGAL_PENGELUARAN\" TEXT," + // 10: TanggalPengeluaran
                "\"TANGGAL_DOKUMEN\" TEXT," + // 11: TanggalDokumen
                "\"JENIS_PEKERJAAN\" TEXT," + // 12: JenisPekerjaan
                "\"SUMBER\" TEXT," + // 13: Sumber
                "\"STATUS_KIRIM_AGO\" TEXT," + // 14: StatusKirimAgo
                "\"STATUS_SAP\" TEXT," + // 15: StatusSap
                "\"NO_AGENDA\" TEXT," + // 16: NoAgenda
                "\"ID_PELANGGAN\" TEXT," + // 17: IdPelanggan
                "\"NAMA_PELANGGAN\" TEXT," + // 18: NamaPelanggan
                "\"ALAMAT_PELANGGAN\" TEXT," + // 19: AlamatPelanggan
                "\"TARIF\" TEXT," + // 20: Tarif
                "\"DAYA\" TEXT," + // 21: Daya
                "\"TANGGAL_BAYAR\" TEXT);"); // 22: TanggalBayar
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TPEMAKAIAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TPemakaian entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoTransaksi = entity.getNoTransaksi();
        if (NoTransaksi != null) {
            stmt.bindString(2, NoTransaksi);
        }
 
        String NoReservasi = entity.getNoReservasi();
        if (NoReservasi != null) {
            stmt.bindString(3, NoReservasi);
        }
 
        String NoPemesanan = entity.getNoPemesanan();
        if (NoPemesanan != null) {
            stmt.bindString(4, NoPemesanan);
        }
 
        String KodeIntegrasi = entity.getKodeIntegrasi();
        if (KodeIntegrasi != null) {
            stmt.bindString(5, KodeIntegrasi);
        }
 
        String Plant = entity.getPlant();
        if (Plant != null) {
            stmt.bindString(6, Plant);
        }
 
        String StorLoc = entity.getStorLoc();
        if (StorLoc != null) {
            stmt.bindString(7, StorLoc);
        }
 
        String StatusPemakaian = entity.getStatusPemakaian();
        if (StatusPemakaian != null) {
            stmt.bindString(8, StatusPemakaian);
        }
 
        String TanggalReservasi = entity.getTanggalReservasi();
        if (TanggalReservasi != null) {
            stmt.bindString(9, TanggalReservasi);
        }
 
        String TanggalPemakaian = entity.getTanggalPemakaian();
        if (TanggalPemakaian != null) {
            stmt.bindString(10, TanggalPemakaian);
        }
 
        String TanggalPengeluaran = entity.getTanggalPengeluaran();
        if (TanggalPengeluaran != null) {
            stmt.bindString(11, TanggalPengeluaran);
        }
 
        String TanggalDokumen = entity.getTanggalDokumen();
        if (TanggalDokumen != null) {
            stmt.bindString(12, TanggalDokumen);
        }
 
        String JenisPekerjaan = entity.getJenisPekerjaan();
        if (JenisPekerjaan != null) {
            stmt.bindString(13, JenisPekerjaan);
        }
 
        String Sumber = entity.getSumber();
        if (Sumber != null) {
            stmt.bindString(14, Sumber);
        }
 
        String StatusKirimAgo = entity.getStatusKirimAgo();
        if (StatusKirimAgo != null) {
            stmt.bindString(15, StatusKirimAgo);
        }
 
        String StatusSap = entity.getStatusSap();
        if (StatusSap != null) {
            stmt.bindString(16, StatusSap);
        }
 
        String NoAgenda = entity.getNoAgenda();
        if (NoAgenda != null) {
            stmt.bindString(17, NoAgenda);
        }
 
        String IdPelanggan = entity.getIdPelanggan();
        if (IdPelanggan != null) {
            stmt.bindString(18, IdPelanggan);
        }
 
        String NamaPelanggan = entity.getNamaPelanggan();
        if (NamaPelanggan != null) {
            stmt.bindString(19, NamaPelanggan);
        }
 
        String AlamatPelanggan = entity.getAlamatPelanggan();
        if (AlamatPelanggan != null) {
            stmt.bindString(20, AlamatPelanggan);
        }
 
        String Tarif = entity.getTarif();
        if (Tarif != null) {
            stmt.bindString(21, Tarif);
        }
 
        String Daya = entity.getDaya();
        if (Daya != null) {
            stmt.bindString(22, Daya);
        }
 
        String TanggalBayar = entity.getTanggalBayar();
        if (TanggalBayar != null) {
            stmt.bindString(23, TanggalBayar);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TPemakaian entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoTransaksi = entity.getNoTransaksi();
        if (NoTransaksi != null) {
            stmt.bindString(2, NoTransaksi);
        }
 
        String NoReservasi = entity.getNoReservasi();
        if (NoReservasi != null) {
            stmt.bindString(3, NoReservasi);
        }
 
        String NoPemesanan = entity.getNoPemesanan();
        if (NoPemesanan != null) {
            stmt.bindString(4, NoPemesanan);
        }
 
        String KodeIntegrasi = entity.getKodeIntegrasi();
        if (KodeIntegrasi != null) {
            stmt.bindString(5, KodeIntegrasi);
        }
 
        String Plant = entity.getPlant();
        if (Plant != null) {
            stmt.bindString(6, Plant);
        }
 
        String StorLoc = entity.getStorLoc();
        if (StorLoc != null) {
            stmt.bindString(7, StorLoc);
        }
 
        String StatusPemakaian = entity.getStatusPemakaian();
        if (StatusPemakaian != null) {
            stmt.bindString(8, StatusPemakaian);
        }
 
        String TanggalReservasi = entity.getTanggalReservasi();
        if (TanggalReservasi != null) {
            stmt.bindString(9, TanggalReservasi);
        }
 
        String TanggalPemakaian = entity.getTanggalPemakaian();
        if (TanggalPemakaian != null) {
            stmt.bindString(10, TanggalPemakaian);
        }
 
        String TanggalPengeluaran = entity.getTanggalPengeluaran();
        if (TanggalPengeluaran != null) {
            stmt.bindString(11, TanggalPengeluaran);
        }
 
        String TanggalDokumen = entity.getTanggalDokumen();
        if (TanggalDokumen != null) {
            stmt.bindString(12, TanggalDokumen);
        }
 
        String JenisPekerjaan = entity.getJenisPekerjaan();
        if (JenisPekerjaan != null) {
            stmt.bindString(13, JenisPekerjaan);
        }
 
        String Sumber = entity.getSumber();
        if (Sumber != null) {
            stmt.bindString(14, Sumber);
        }
 
        String StatusKirimAgo = entity.getStatusKirimAgo();
        if (StatusKirimAgo != null) {
            stmt.bindString(15, StatusKirimAgo);
        }
 
        String StatusSap = entity.getStatusSap();
        if (StatusSap != null) {
            stmt.bindString(16, StatusSap);
        }
 
        String NoAgenda = entity.getNoAgenda();
        if (NoAgenda != null) {
            stmt.bindString(17, NoAgenda);
        }
 
        String IdPelanggan = entity.getIdPelanggan();
        if (IdPelanggan != null) {
            stmt.bindString(18, IdPelanggan);
        }
 
        String NamaPelanggan = entity.getNamaPelanggan();
        if (NamaPelanggan != null) {
            stmt.bindString(19, NamaPelanggan);
        }
 
        String AlamatPelanggan = entity.getAlamatPelanggan();
        if (AlamatPelanggan != null) {
            stmt.bindString(20, AlamatPelanggan);
        }
 
        String Tarif = entity.getTarif();
        if (Tarif != null) {
            stmt.bindString(21, Tarif);
        }
 
        String Daya = entity.getDaya();
        if (Daya != null) {
            stmt.bindString(22, Daya);
        }
 
        String TanggalBayar = entity.getTanggalBayar();
        if (TanggalBayar != null) {
            stmt.bindString(23, TanggalBayar);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TPemakaian readEntity(Cursor cursor, int offset) {
        TPemakaian entity = new TPemakaian( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoTransaksi
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // NoReservasi
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // NoPemesanan
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // KodeIntegrasi
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // Plant
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // StorLoc
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // StatusPemakaian
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // TanggalReservasi
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // TanggalPemakaian
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // TanggalPengeluaran
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // TanggalDokumen
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // JenisPekerjaan
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // Sumber
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // StatusKirimAgo
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // StatusSap
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // NoAgenda
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // IdPelanggan
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // NamaPelanggan
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // AlamatPelanggan
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // Tarif
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // Daya
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22) // TanggalBayar
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TPemakaian entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoTransaksi(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNoReservasi(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNoPemesanan(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setKodeIntegrasi(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPlant(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStorLoc(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStatusPemakaian(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTanggalReservasi(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTanggalPemakaian(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setTanggalPengeluaran(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTanggalDokumen(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setJenisPekerjaan(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setSumber(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setStatusKirimAgo(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setStatusSap(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setNoAgenda(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setIdPelanggan(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setNamaPelanggan(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setAlamatPelanggan(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setTarif(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setDaya(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setTanggalBayar(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TPemakaian entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TPemakaian entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TPemakaian entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
