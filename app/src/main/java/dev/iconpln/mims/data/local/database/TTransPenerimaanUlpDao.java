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
 * DAO for table "TTRANS_PENERIMAAN_ULP".
*/
public class TTransPenerimaanUlpDao extends AbstractDao<TTransPenerimaanUlp, Long> {

    public static final String TABLENAME = "TTRANS_PENERIMAAN_ULP";

    /**
     * Properties of entity TTransPenerimaanUlp.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NoPengiriman = new Property(1, String.class, "NoPengiriman", false, "NO_PENGIRIMAN");
        public final static Property NoPermintaan = new Property(2, String.class, "NoPermintaan", false, "NO_PERMINTAAN");
        public final static Property StatusPemeriksaan = new Property(3, String.class, "StatusPemeriksaan", false, "STATUS_PEMERIKSAAN");
        public final static Property TempStatusPemeriksaan = new Property(4, String.class, "TempStatusPemeriksaan", false, "TEMP_STATUS_PEMERIKSAAN");
        public final static Property DeliveryDate = new Property(5, String.class, "DeliveryDate", false, "DELIVERY_DATE");
        public final static Property StatusPenerimaan = new Property(6, String.class, "StatusPenerimaan", false, "STATUS_PENERIMAAN");
        public final static Property TempStatusPenerimaan = new Property(7, String.class, "TempStatusPenerimaan", false, "TEMP_STATUS_PENERIMAAN");
        public final static Property JumlahKardus = new Property(8, Integer.class, "JumlahKardus", false, "JUMLAH_KARDUS");
        public final static Property GudangAsal = new Property(9, String.class, "GudangAsal", false, "GUDANG_ASAL");
        public final static Property NoRepackaging = new Property(10, String.class, "NoRepackaging", false, "NO_REPACKAGING");
        public final static Property GudangTujuan = new Property(11, String.class, "GudangTujuan", false, "GUDANG_TUJUAN");
        public final static Property TanggalPemeriksaan = new Property(12, String.class, "TanggalPemeriksaan", false, "TANGGAL_PEMERIKSAAN");
        public final static Property TanggalPenerimaan = new Property(13, String.class, "TanggalPenerimaan", false, "TANGGAL_PENERIMAAN");
        public final static Property KepalaGudangPemeriksa = new Property(14, String.class, "KepalaGudangPemeriksa", false, "KEPALA_GUDANG_PEMERIKSA");
        public final static Property PejabatPemeriksa = new Property(15, String.class, "PejabatPemeriksa", false, "PEJABAT_PEMERIKSA");
        public final static Property JabatanPemeriksa = new Property(16, String.class, "JabatanPemeriksa", false, "JABATAN_PEMERIKSA");
        public final static Property NamaPetugasPemeriksa = new Property(17, String.class, "NamaPetugasPemeriksa", false, "NAMA_PETUGAS_PEMERIKSA");
        public final static Property JabatanPetugasPemeriksa = new Property(18, String.class, "JabatanPetugasPemeriksa", false, "JABATAN_PETUGAS_PEMERIKSA");
        public final static Property KepalaGudangPenerima = new Property(19, String.class, "KepalaGudangPenerima", false, "KEPALA_GUDANG_PENERIMA");
        public final static Property NoPk = new Property(20, String.class, "NoPk", false, "NO_PK");
        public final static Property TanggalDokumen = new Property(21, String.class, "TanggalDokumen", false, "TANGGAL_DOKUMEN");
        public final static Property PejabatPenerima = new Property(22, String.class, "PejabatPenerima", false, "PEJABAT_PENERIMA");
        public final static Property Kurir = new Property(23, String.class, "Kurir", false, "KURIR");
        public final static Property NoNota = new Property(24, String.class, "NoNota", false, "NO_NOTA");
        public final static Property NoMaterial = new Property(25, String.class, "NoMaterial", false, "NO_MATERIAL");
        public final static Property Spesifikasi = new Property(26, String.class, "Spesifikasi", false, "SPESIFIKASI");
        public final static Property KuantitasPeriksa = new Property(27, Integer.class, "KuantitasPeriksa", false, "KUANTITAS_PERIKSA");
        public final static Property Kuantitas = new Property(28, Integer.class, "Kuantitas", false, "KUANTITAS");
        public final static Property IsDonePemeriksaan = new Property(29, Integer.class, "IsDonePemeriksaan", false, "IS_DONE_PEMERIKSAAN");
        public final static Property IsDone = new Property(30, Integer.class, "IsDone", false, "IS_DONE");
    }


    public TTransPenerimaanUlpDao(DaoConfig config) {
        super(config);
    }
    
    public TTransPenerimaanUlpDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TTRANS_PENERIMAAN_ULP\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NO_PENGIRIMAN\" TEXT," + // 1: NoPengiriman
                "\"NO_PERMINTAAN\" TEXT," + // 2: NoPermintaan
                "\"STATUS_PEMERIKSAAN\" TEXT," + // 3: StatusPemeriksaan
                "\"TEMP_STATUS_PEMERIKSAAN\" TEXT," + // 4: TempStatusPemeriksaan
                "\"DELIVERY_DATE\" TEXT," + // 5: DeliveryDate
                "\"STATUS_PENERIMAAN\" TEXT," + // 6: StatusPenerimaan
                "\"TEMP_STATUS_PENERIMAAN\" TEXT," + // 7: TempStatusPenerimaan
                "\"JUMLAH_KARDUS\" INTEGER," + // 8: JumlahKardus
                "\"GUDANG_ASAL\" TEXT," + // 9: GudangAsal
                "\"NO_REPACKAGING\" TEXT," + // 10: NoRepackaging
                "\"GUDANG_TUJUAN\" TEXT," + // 11: GudangTujuan
                "\"TANGGAL_PEMERIKSAAN\" TEXT," + // 12: TanggalPemeriksaan
                "\"TANGGAL_PENERIMAAN\" TEXT," + // 13: TanggalPenerimaan
                "\"KEPALA_GUDANG_PEMERIKSA\" TEXT," + // 14: KepalaGudangPemeriksa
                "\"PEJABAT_PEMERIKSA\" TEXT," + // 15: PejabatPemeriksa
                "\"JABATAN_PEMERIKSA\" TEXT," + // 16: JabatanPemeriksa
                "\"NAMA_PETUGAS_PEMERIKSA\" TEXT," + // 17: NamaPetugasPemeriksa
                "\"JABATAN_PETUGAS_PEMERIKSA\" TEXT," + // 18: JabatanPetugasPemeriksa
                "\"KEPALA_GUDANG_PENERIMA\" TEXT," + // 19: KepalaGudangPenerima
                "\"NO_PK\" TEXT," + // 20: NoPk
                "\"TANGGAL_DOKUMEN\" TEXT," + // 21: TanggalDokumen
                "\"PEJABAT_PENERIMA\" TEXT," + // 22: PejabatPenerima
                "\"KURIR\" TEXT," + // 23: Kurir
                "\"NO_NOTA\" TEXT," + // 24: NoNota
                "\"NO_MATERIAL\" TEXT," + // 25: NoMaterial
                "\"SPESIFIKASI\" TEXT," + // 26: Spesifikasi
                "\"KUANTITAS_PERIKSA\" INTEGER," + // 27: KuantitasPeriksa
                "\"KUANTITAS\" INTEGER," + // 28: Kuantitas
                "\"IS_DONE_PEMERIKSAAN\" INTEGER," + // 29: IsDonePemeriksaan
                "\"IS_DONE\" INTEGER);"); // 30: IsDone
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TTRANS_PENERIMAAN_ULP\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TTransPenerimaanUlp entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoPengiriman = entity.getNoPengiriman();
        if (NoPengiriman != null) {
            stmt.bindString(2, NoPengiriman);
        }
 
        String NoPermintaan = entity.getNoPermintaan();
        if (NoPermintaan != null) {
            stmt.bindString(3, NoPermintaan);
        }
 
        String StatusPemeriksaan = entity.getStatusPemeriksaan();
        if (StatusPemeriksaan != null) {
            stmt.bindString(4, StatusPemeriksaan);
        }
 
        String TempStatusPemeriksaan = entity.getTempStatusPemeriksaan();
        if (TempStatusPemeriksaan != null) {
            stmt.bindString(5, TempStatusPemeriksaan);
        }
 
        String DeliveryDate = entity.getDeliveryDate();
        if (DeliveryDate != null) {
            stmt.bindString(6, DeliveryDate);
        }
 
        String StatusPenerimaan = entity.getStatusPenerimaan();
        if (StatusPenerimaan != null) {
            stmt.bindString(7, StatusPenerimaan);
        }
 
        String TempStatusPenerimaan = entity.getTempStatusPenerimaan();
        if (TempStatusPenerimaan != null) {
            stmt.bindString(8, TempStatusPenerimaan);
        }
 
        Integer JumlahKardus = entity.getJumlahKardus();
        if (JumlahKardus != null) {
            stmt.bindLong(9, JumlahKardus);
        }
 
        String GudangAsal = entity.getGudangAsal();
        if (GudangAsal != null) {
            stmt.bindString(10, GudangAsal);
        }
 
        String NoRepackaging = entity.getNoRepackaging();
        if (NoRepackaging != null) {
            stmt.bindString(11, NoRepackaging);
        }
 
        String GudangTujuan = entity.getGudangTujuan();
        if (GudangTujuan != null) {
            stmt.bindString(12, GudangTujuan);
        }
 
        String TanggalPemeriksaan = entity.getTanggalPemeriksaan();
        if (TanggalPemeriksaan != null) {
            stmt.bindString(13, TanggalPemeriksaan);
        }
 
        String TanggalPenerimaan = entity.getTanggalPenerimaan();
        if (TanggalPenerimaan != null) {
            stmt.bindString(14, TanggalPenerimaan);
        }
 
        String KepalaGudangPemeriksa = entity.getKepalaGudangPemeriksa();
        if (KepalaGudangPemeriksa != null) {
            stmt.bindString(15, KepalaGudangPemeriksa);
        }
 
        String PejabatPemeriksa = entity.getPejabatPemeriksa();
        if (PejabatPemeriksa != null) {
            stmt.bindString(16, PejabatPemeriksa);
        }
 
        String JabatanPemeriksa = entity.getJabatanPemeriksa();
        if (JabatanPemeriksa != null) {
            stmt.bindString(17, JabatanPemeriksa);
        }
 
        String NamaPetugasPemeriksa = entity.getNamaPetugasPemeriksa();
        if (NamaPetugasPemeriksa != null) {
            stmt.bindString(18, NamaPetugasPemeriksa);
        }
 
        String JabatanPetugasPemeriksa = entity.getJabatanPetugasPemeriksa();
        if (JabatanPetugasPemeriksa != null) {
            stmt.bindString(19, JabatanPetugasPemeriksa);
        }
 
        String KepalaGudangPenerima = entity.getKepalaGudangPenerima();
        if (KepalaGudangPenerima != null) {
            stmt.bindString(20, KepalaGudangPenerima);
        }
 
        String NoPk = entity.getNoPk();
        if (NoPk != null) {
            stmt.bindString(21, NoPk);
        }
 
        String TanggalDokumen = entity.getTanggalDokumen();
        if (TanggalDokumen != null) {
            stmt.bindString(22, TanggalDokumen);
        }
 
        String PejabatPenerima = entity.getPejabatPenerima();
        if (PejabatPenerima != null) {
            stmt.bindString(23, PejabatPenerima);
        }
 
        String Kurir = entity.getKurir();
        if (Kurir != null) {
            stmt.bindString(24, Kurir);
        }
 
        String NoNota = entity.getNoNota();
        if (NoNota != null) {
            stmt.bindString(25, NoNota);
        }
 
        String NoMaterial = entity.getNoMaterial();
        if (NoMaterial != null) {
            stmt.bindString(26, NoMaterial);
        }
 
        String Spesifikasi = entity.getSpesifikasi();
        if (Spesifikasi != null) {
            stmt.bindString(27, Spesifikasi);
        }
 
        Integer KuantitasPeriksa = entity.getKuantitasPeriksa();
        if (KuantitasPeriksa != null) {
            stmt.bindLong(28, KuantitasPeriksa);
        }
 
        Integer Kuantitas = entity.getKuantitas();
        if (Kuantitas != null) {
            stmt.bindLong(29, Kuantitas);
        }
 
        Integer IsDonePemeriksaan = entity.getIsDonePemeriksaan();
        if (IsDonePemeriksaan != null) {
            stmt.bindLong(30, IsDonePemeriksaan);
        }
 
        Integer IsDone = entity.getIsDone();
        if (IsDone != null) {
            stmt.bindLong(31, IsDone);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TTransPenerimaanUlp entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String NoPengiriman = entity.getNoPengiriman();
        if (NoPengiriman != null) {
            stmt.bindString(2, NoPengiriman);
        }
 
        String NoPermintaan = entity.getNoPermintaan();
        if (NoPermintaan != null) {
            stmt.bindString(3, NoPermintaan);
        }
 
        String StatusPemeriksaan = entity.getStatusPemeriksaan();
        if (StatusPemeriksaan != null) {
            stmt.bindString(4, StatusPemeriksaan);
        }
 
        String TempStatusPemeriksaan = entity.getTempStatusPemeriksaan();
        if (TempStatusPemeriksaan != null) {
            stmt.bindString(5, TempStatusPemeriksaan);
        }
 
        String DeliveryDate = entity.getDeliveryDate();
        if (DeliveryDate != null) {
            stmt.bindString(6, DeliveryDate);
        }
 
        String StatusPenerimaan = entity.getStatusPenerimaan();
        if (StatusPenerimaan != null) {
            stmt.bindString(7, StatusPenerimaan);
        }
 
        String TempStatusPenerimaan = entity.getTempStatusPenerimaan();
        if (TempStatusPenerimaan != null) {
            stmt.bindString(8, TempStatusPenerimaan);
        }
 
        Integer JumlahKardus = entity.getJumlahKardus();
        if (JumlahKardus != null) {
            stmt.bindLong(9, JumlahKardus);
        }
 
        String GudangAsal = entity.getGudangAsal();
        if (GudangAsal != null) {
            stmt.bindString(10, GudangAsal);
        }
 
        String NoRepackaging = entity.getNoRepackaging();
        if (NoRepackaging != null) {
            stmt.bindString(11, NoRepackaging);
        }
 
        String GudangTujuan = entity.getGudangTujuan();
        if (GudangTujuan != null) {
            stmt.bindString(12, GudangTujuan);
        }
 
        String TanggalPemeriksaan = entity.getTanggalPemeriksaan();
        if (TanggalPemeriksaan != null) {
            stmt.bindString(13, TanggalPemeriksaan);
        }
 
        String TanggalPenerimaan = entity.getTanggalPenerimaan();
        if (TanggalPenerimaan != null) {
            stmt.bindString(14, TanggalPenerimaan);
        }
 
        String KepalaGudangPemeriksa = entity.getKepalaGudangPemeriksa();
        if (KepalaGudangPemeriksa != null) {
            stmt.bindString(15, KepalaGudangPemeriksa);
        }
 
        String PejabatPemeriksa = entity.getPejabatPemeriksa();
        if (PejabatPemeriksa != null) {
            stmt.bindString(16, PejabatPemeriksa);
        }
 
        String JabatanPemeriksa = entity.getJabatanPemeriksa();
        if (JabatanPemeriksa != null) {
            stmt.bindString(17, JabatanPemeriksa);
        }
 
        String NamaPetugasPemeriksa = entity.getNamaPetugasPemeriksa();
        if (NamaPetugasPemeriksa != null) {
            stmt.bindString(18, NamaPetugasPemeriksa);
        }
 
        String JabatanPetugasPemeriksa = entity.getJabatanPetugasPemeriksa();
        if (JabatanPetugasPemeriksa != null) {
            stmt.bindString(19, JabatanPetugasPemeriksa);
        }
 
        String KepalaGudangPenerima = entity.getKepalaGudangPenerima();
        if (KepalaGudangPenerima != null) {
            stmt.bindString(20, KepalaGudangPenerima);
        }
 
        String NoPk = entity.getNoPk();
        if (NoPk != null) {
            stmt.bindString(21, NoPk);
        }
 
        String TanggalDokumen = entity.getTanggalDokumen();
        if (TanggalDokumen != null) {
            stmt.bindString(22, TanggalDokumen);
        }
 
        String PejabatPenerima = entity.getPejabatPenerima();
        if (PejabatPenerima != null) {
            stmt.bindString(23, PejabatPenerima);
        }
 
        String Kurir = entity.getKurir();
        if (Kurir != null) {
            stmt.bindString(24, Kurir);
        }
 
        String NoNota = entity.getNoNota();
        if (NoNota != null) {
            stmt.bindString(25, NoNota);
        }
 
        String NoMaterial = entity.getNoMaterial();
        if (NoMaterial != null) {
            stmt.bindString(26, NoMaterial);
        }
 
        String Spesifikasi = entity.getSpesifikasi();
        if (Spesifikasi != null) {
            stmt.bindString(27, Spesifikasi);
        }
 
        Integer KuantitasPeriksa = entity.getKuantitasPeriksa();
        if (KuantitasPeriksa != null) {
            stmt.bindLong(28, KuantitasPeriksa);
        }
 
        Integer Kuantitas = entity.getKuantitas();
        if (Kuantitas != null) {
            stmt.bindLong(29, Kuantitas);
        }
 
        Integer IsDonePemeriksaan = entity.getIsDonePemeriksaan();
        if (IsDonePemeriksaan != null) {
            stmt.bindLong(30, IsDonePemeriksaan);
        }
 
        Integer IsDone = entity.getIsDone();
        if (IsDone != null) {
            stmt.bindLong(31, IsDone);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TTransPenerimaanUlp readEntity(Cursor cursor, int offset) {
        TTransPenerimaanUlp entity = new TTransPenerimaanUlp( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // NoPengiriman
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // NoPermintaan
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // StatusPemeriksaan
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // TempStatusPemeriksaan
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // DeliveryDate
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // StatusPenerimaan
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // TempStatusPenerimaan
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // JumlahKardus
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // GudangAsal
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // NoRepackaging
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // GudangTujuan
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // TanggalPemeriksaan
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // TanggalPenerimaan
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // KepalaGudangPemeriksa
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // PejabatPemeriksa
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // JabatanPemeriksa
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // NamaPetugasPemeriksa
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // JabatanPetugasPemeriksa
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // KepalaGudangPenerima
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // NoPk
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // TanggalDokumen
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // PejabatPenerima
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // Kurir
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // NoNota
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // NoMaterial
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // Spesifikasi
            cursor.isNull(offset + 27) ? null : cursor.getInt(offset + 27), // KuantitasPeriksa
            cursor.isNull(offset + 28) ? null : cursor.getInt(offset + 28), // Kuantitas
            cursor.isNull(offset + 29) ? null : cursor.getInt(offset + 29), // IsDonePemeriksaan
            cursor.isNull(offset + 30) ? null : cursor.getInt(offset + 30) // IsDone
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TTransPenerimaanUlp entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNoPengiriman(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNoPermintaan(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStatusPemeriksaan(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTempStatusPemeriksaan(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDeliveryDate(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setStatusPenerimaan(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTempStatusPenerimaan(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setJumlahKardus(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setGudangAsal(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setNoRepackaging(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setGudangTujuan(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setTanggalPemeriksaan(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setTanggalPenerimaan(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setKepalaGudangPemeriksa(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setPejabatPemeriksa(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setJabatanPemeriksa(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setNamaPetugasPemeriksa(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setJabatanPetugasPemeriksa(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setKepalaGudangPenerima(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setNoPk(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setTanggalDokumen(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setPejabatPenerima(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setKurir(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setNoNota(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setNoMaterial(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setSpesifikasi(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setKuantitasPeriksa(cursor.isNull(offset + 27) ? null : cursor.getInt(offset + 27));
        entity.setKuantitas(cursor.isNull(offset + 28) ? null : cursor.getInt(offset + 28));
        entity.setIsDonePemeriksaan(cursor.isNull(offset + 29) ? null : cursor.getInt(offset + 29));
        entity.setIsDone(cursor.isNull(offset + 30) ? null : cursor.getInt(offset + 30));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TTransPenerimaanUlp entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TTransPenerimaanUlp entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TTransPenerimaanUlp entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
