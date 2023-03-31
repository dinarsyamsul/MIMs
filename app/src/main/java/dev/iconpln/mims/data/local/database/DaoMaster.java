package dev.iconpln.mims.data.local.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 1): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        TMonitoringDao.createTable(db, ifNotExists);
        TPengujianDao.createTable(db, ifNotExists);
        TPengujianDetailsDao.createTable(db, ifNotExists);
        TLokasiDao.createTable(db, ifNotExists);
        TPosDetailDao.createTable(db, ifNotExists);
        TMaterialDetailDao.createTable(db, ifNotExists);
        TMaterialGroupsDao.createTable(db, ifNotExists);
        TPrivilegeDao.createTable(db, ifNotExists);
        TMaterialDao.createTable(db, ifNotExists);
        TPosDao.createTable(db, ifNotExists);
        TPosPenerimaanDao.createTable(db, ifNotExists);
        TPosDetailPenerimaanDao.createTable(db, ifNotExists);
        TPosSnsDao.createTable(db, ifNotExists);
        TSnPermaterialDao.createTable(db, ifNotExists);
        TPemeriksaanDao.createTable(db, ifNotExists);
        TPemeriksaanDetailDao.createTable(db, ifNotExists);
        TPhotoDao.createTable(db, ifNotExists);
        TRatingDao.createTable(db, ifNotExists);
        TMonitoringPermintaanDao.createTable(db, ifNotExists);
        TMonitoringPermintaanDetailDao.createTable(db, ifNotExists);
        TTransMonitoringPermintaanDao.createTable(db, ifNotExists);
        TTransMonitoringPermintaanDetailDao.createTable(db, ifNotExists);
        TSnMonitoringPermintaanDao.createTable(db, ifNotExists);
        TMonitoringSnMaterialDao.createTable(db, ifNotExists);
        TPenerimaanUlpDao.createTable(db, ifNotExists);
        TPenerimaanDetailUlpDao.createTable(db, ifNotExists);
        TTransPenerimaanUlpDao.createTable(db, ifNotExists);
        TTransPenerimaanDetailUlpDao.createTable(db, ifNotExists);
        TListSnMaterialPenerimaanUlpDao.createTable(db, ifNotExists);
        TPemakaianDao.createTable(db, ifNotExists);
        TPemakaianDetailDao.createTable(db, ifNotExists);
        TTransPemakaianDetailDao.createTable(db, ifNotExists);
        TListSnMaterialPemakaianUlpDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        TMonitoringDao.dropTable(db, ifExists);
        TPengujianDao.dropTable(db, ifExists);
        TPengujianDetailsDao.dropTable(db, ifExists);
        TLokasiDao.dropTable(db, ifExists);
        TPosDetailDao.dropTable(db, ifExists);
        TMaterialDetailDao.dropTable(db, ifExists);
        TMaterialGroupsDao.dropTable(db, ifExists);
        TPrivilegeDao.dropTable(db, ifExists);
        TMaterialDao.dropTable(db, ifExists);
        TPosDao.dropTable(db, ifExists);
        TPosPenerimaanDao.dropTable(db, ifExists);
        TPosDetailPenerimaanDao.dropTable(db, ifExists);
        TPosSnsDao.dropTable(db, ifExists);
        TSnPermaterialDao.dropTable(db, ifExists);
        TPemeriksaanDao.dropTable(db, ifExists);
        TPemeriksaanDetailDao.dropTable(db, ifExists);
        TPhotoDao.dropTable(db, ifExists);
        TRatingDao.dropTable(db, ifExists);
        TMonitoringPermintaanDao.dropTable(db, ifExists);
        TMonitoringPermintaanDetailDao.dropTable(db, ifExists);
        TTransMonitoringPermintaanDao.dropTable(db, ifExists);
        TTransMonitoringPermintaanDetailDao.dropTable(db, ifExists);
        TSnMonitoringPermintaanDao.dropTable(db, ifExists);
        TMonitoringSnMaterialDao.dropTable(db, ifExists);
        TPenerimaanUlpDao.dropTable(db, ifExists);
        TPenerimaanDetailUlpDao.dropTable(db, ifExists);
        TTransPenerimaanUlpDao.dropTable(db, ifExists);
        TTransPenerimaanDetailUlpDao.dropTable(db, ifExists);
        TListSnMaterialPenerimaanUlpDao.dropTable(db, ifExists);
        TPemakaianDao.dropTable(db, ifExists);
        TPemakaianDetailDao.dropTable(db, ifExists);
        TTransPemakaianDetailDao.dropTable(db, ifExists);
        TListSnMaterialPemakaianUlpDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(TMonitoringDao.class);
        registerDaoClass(TPengujianDao.class);
        registerDaoClass(TPengujianDetailsDao.class);
        registerDaoClass(TLokasiDao.class);
        registerDaoClass(TPosDetailDao.class);
        registerDaoClass(TMaterialDetailDao.class);
        registerDaoClass(TMaterialGroupsDao.class);
        registerDaoClass(TPrivilegeDao.class);
        registerDaoClass(TMaterialDao.class);
        registerDaoClass(TPosDao.class);
        registerDaoClass(TPosPenerimaanDao.class);
        registerDaoClass(TPosDetailPenerimaanDao.class);
        registerDaoClass(TPosSnsDao.class);
        registerDaoClass(TSnPermaterialDao.class);
        registerDaoClass(TPemeriksaanDao.class);
        registerDaoClass(TPemeriksaanDetailDao.class);
        registerDaoClass(TPhotoDao.class);
        registerDaoClass(TRatingDao.class);
        registerDaoClass(TMonitoringPermintaanDao.class);
        registerDaoClass(TMonitoringPermintaanDetailDao.class);
        registerDaoClass(TTransMonitoringPermintaanDao.class);
        registerDaoClass(TTransMonitoringPermintaanDetailDao.class);
        registerDaoClass(TSnMonitoringPermintaanDao.class);
        registerDaoClass(TMonitoringSnMaterialDao.class);
        registerDaoClass(TPenerimaanUlpDao.class);
        registerDaoClass(TPenerimaanDetailUlpDao.class);
        registerDaoClass(TTransPenerimaanUlpDao.class);
        registerDaoClass(TTransPenerimaanDetailUlpDao.class);
        registerDaoClass(TListSnMaterialPenerimaanUlpDao.class);
        registerDaoClass(TPemakaianDao.class);
        registerDaoClass(TPemakaianDetailDao.class);
        registerDaoClass(TTransPemakaianDetailDao.class);
        registerDaoClass(TListSnMaterialPemakaianUlpDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
