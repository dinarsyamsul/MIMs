package dev.iconpln.mims.data.local.database;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import dev.iconpln.mims.data.local.database.TMonitoring;
import dev.iconpln.mims.data.local.database.TPengujian;
import dev.iconpln.mims.data.local.database.TPengujianDetails;
import dev.iconpln.mims.data.local.database.TLokasi;
import dev.iconpln.mims.data.local.database.TPosDetail;
import dev.iconpln.mims.data.local.database.TMaterialDetail;
import dev.iconpln.mims.data.local.database.TMaterialGroups;
import dev.iconpln.mims.data.local.database.TPrivilege;
import dev.iconpln.mims.data.local.database.TMaterial;
import dev.iconpln.mims.data.local.database.TPos;
import dev.iconpln.mims.data.local.database.TPosPenerimaan;
import dev.iconpln.mims.data.local.database.TPosDetailPenerimaan;
import dev.iconpln.mims.data.local.database.TPosSns;
import dev.iconpln.mims.data.local.database.TPemeriksaan;
import dev.iconpln.mims.data.local.database.TPemeriksaanDetail;
import dev.iconpln.mims.data.local.database.TPhoto;
import dev.iconpln.mims.data.local.database.TRating;

import dev.iconpln.mims.data.local.database.TMonitoringDao;
import dev.iconpln.mims.data.local.database.TPengujianDao;
import dev.iconpln.mims.data.local.database.TPengujianDetailsDao;
import dev.iconpln.mims.data.local.database.TLokasiDao;
import dev.iconpln.mims.data.local.database.TPosDetailDao;
import dev.iconpln.mims.data.local.database.TMaterialDetailDao;
import dev.iconpln.mims.data.local.database.TMaterialGroupsDao;
import dev.iconpln.mims.data.local.database.TPrivilegeDao;
import dev.iconpln.mims.data.local.database.TMaterialDao;
import dev.iconpln.mims.data.local.database.TPosDao;
import dev.iconpln.mims.data.local.database.TPosPenerimaanDao;
import dev.iconpln.mims.data.local.database.TPosDetailPenerimaanDao;
import dev.iconpln.mims.data.local.database.TPosSnsDao;
import dev.iconpln.mims.data.local.database.TPemeriksaanDao;
import dev.iconpln.mims.data.local.database.TPemeriksaanDetailDao;
import dev.iconpln.mims.data.local.database.TPhotoDao;
import dev.iconpln.mims.data.local.database.TRatingDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig tMonitoringDaoConfig;
    private final DaoConfig tPengujianDaoConfig;
    private final DaoConfig tPengujianDetailsDaoConfig;
    private final DaoConfig tLokasiDaoConfig;
    private final DaoConfig tPosDetailDaoConfig;
    private final DaoConfig tMaterialDetailDaoConfig;
    private final DaoConfig tMaterialGroupsDaoConfig;
    private final DaoConfig tPrivilegeDaoConfig;
    private final DaoConfig tMaterialDaoConfig;
    private final DaoConfig tPosDaoConfig;
    private final DaoConfig tPosPenerimaanDaoConfig;
    private final DaoConfig tPosDetailPenerimaanDaoConfig;
    private final DaoConfig tPosSnsDaoConfig;
    private final DaoConfig tPemeriksaanDaoConfig;
    private final DaoConfig tPemeriksaanDetailDaoConfig;
    private final DaoConfig tPhotoDaoConfig;
    private final DaoConfig tRatingDaoConfig;

    private final TMonitoringDao tMonitoringDao;
    private final TPengujianDao tPengujianDao;
    private final TPengujianDetailsDao tPengujianDetailsDao;
    private final TLokasiDao tLokasiDao;
    private final TPosDetailDao tPosDetailDao;
    private final TMaterialDetailDao tMaterialDetailDao;
    private final TMaterialGroupsDao tMaterialGroupsDao;
    private final TPrivilegeDao tPrivilegeDao;
    private final TMaterialDao tMaterialDao;
    private final TPosDao tPosDao;
    private final TPosPenerimaanDao tPosPenerimaanDao;
    private final TPosDetailPenerimaanDao tPosDetailPenerimaanDao;
    private final TPosSnsDao tPosSnsDao;
    private final TPemeriksaanDao tPemeriksaanDao;
    private final TPemeriksaanDetailDao tPemeriksaanDetailDao;
    private final TPhotoDao tPhotoDao;
    private final TRatingDao tRatingDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        tMonitoringDaoConfig = daoConfigMap.get(TMonitoringDao.class).clone();
        tMonitoringDaoConfig.initIdentityScope(type);

        tPengujianDaoConfig = daoConfigMap.get(TPengujianDao.class).clone();
        tPengujianDaoConfig.initIdentityScope(type);

        tPengujianDetailsDaoConfig = daoConfigMap.get(TPengujianDetailsDao.class).clone();
        tPengujianDetailsDaoConfig.initIdentityScope(type);

        tLokasiDaoConfig = daoConfigMap.get(TLokasiDao.class).clone();
        tLokasiDaoConfig.initIdentityScope(type);

        tPosDetailDaoConfig = daoConfigMap.get(TPosDetailDao.class).clone();
        tPosDetailDaoConfig.initIdentityScope(type);

        tMaterialDetailDaoConfig = daoConfigMap.get(TMaterialDetailDao.class).clone();
        tMaterialDetailDaoConfig.initIdentityScope(type);

        tMaterialGroupsDaoConfig = daoConfigMap.get(TMaterialGroupsDao.class).clone();
        tMaterialGroupsDaoConfig.initIdentityScope(type);

        tPrivilegeDaoConfig = daoConfigMap.get(TPrivilegeDao.class).clone();
        tPrivilegeDaoConfig.initIdentityScope(type);

        tMaterialDaoConfig = daoConfigMap.get(TMaterialDao.class).clone();
        tMaterialDaoConfig.initIdentityScope(type);

        tPosDaoConfig = daoConfigMap.get(TPosDao.class).clone();
        tPosDaoConfig.initIdentityScope(type);

        tPosPenerimaanDaoConfig = daoConfigMap.get(TPosPenerimaanDao.class).clone();
        tPosPenerimaanDaoConfig.initIdentityScope(type);

        tPosDetailPenerimaanDaoConfig = daoConfigMap.get(TPosDetailPenerimaanDao.class).clone();
        tPosDetailPenerimaanDaoConfig.initIdentityScope(type);

        tPosSnsDaoConfig = daoConfigMap.get(TPosSnsDao.class).clone();
        tPosSnsDaoConfig.initIdentityScope(type);

        tPemeriksaanDaoConfig = daoConfigMap.get(TPemeriksaanDao.class).clone();
        tPemeriksaanDaoConfig.initIdentityScope(type);

        tPemeriksaanDetailDaoConfig = daoConfigMap.get(TPemeriksaanDetailDao.class).clone();
        tPemeriksaanDetailDaoConfig.initIdentityScope(type);

        tPhotoDaoConfig = daoConfigMap.get(TPhotoDao.class).clone();
        tPhotoDaoConfig.initIdentityScope(type);

        tRatingDaoConfig = daoConfigMap.get(TRatingDao.class).clone();
        tRatingDaoConfig.initIdentityScope(type);

        tMonitoringDao = new TMonitoringDao(tMonitoringDaoConfig, this);
        tPengujianDao = new TPengujianDao(tPengujianDaoConfig, this);
        tPengujianDetailsDao = new TPengujianDetailsDao(tPengujianDetailsDaoConfig, this);
        tLokasiDao = new TLokasiDao(tLokasiDaoConfig, this);
        tPosDetailDao = new TPosDetailDao(tPosDetailDaoConfig, this);
        tMaterialDetailDao = new TMaterialDetailDao(tMaterialDetailDaoConfig, this);
        tMaterialGroupsDao = new TMaterialGroupsDao(tMaterialGroupsDaoConfig, this);
        tPrivilegeDao = new TPrivilegeDao(tPrivilegeDaoConfig, this);
        tMaterialDao = new TMaterialDao(tMaterialDaoConfig, this);
        tPosDao = new TPosDao(tPosDaoConfig, this);
        tPosPenerimaanDao = new TPosPenerimaanDao(tPosPenerimaanDaoConfig, this);
        tPosDetailPenerimaanDao = new TPosDetailPenerimaanDao(tPosDetailPenerimaanDaoConfig, this);
        tPosSnsDao = new TPosSnsDao(tPosSnsDaoConfig, this);
        tPemeriksaanDao = new TPemeriksaanDao(tPemeriksaanDaoConfig, this);
        tPemeriksaanDetailDao = new TPemeriksaanDetailDao(tPemeriksaanDetailDaoConfig, this);
        tPhotoDao = new TPhotoDao(tPhotoDaoConfig, this);
        tRatingDao = new TRatingDao(tRatingDaoConfig, this);

        registerDao(TMonitoring.class, tMonitoringDao);
        registerDao(TPengujian.class, tPengujianDao);
        registerDao(TPengujianDetails.class, tPengujianDetailsDao);
        registerDao(TLokasi.class, tLokasiDao);
        registerDao(TPosDetail.class, tPosDetailDao);
        registerDao(TMaterialDetail.class, tMaterialDetailDao);
        registerDao(TMaterialGroups.class, tMaterialGroupsDao);
        registerDao(TPrivilege.class, tPrivilegeDao);
        registerDao(TMaterial.class, tMaterialDao);
        registerDao(TPos.class, tPosDao);
        registerDao(TPosPenerimaan.class, tPosPenerimaanDao);
        registerDao(TPosDetailPenerimaan.class, tPosDetailPenerimaanDao);
        registerDao(TPosSns.class, tPosSnsDao);
        registerDao(TPemeriksaan.class, tPemeriksaanDao);
        registerDao(TPemeriksaanDetail.class, tPemeriksaanDetailDao);
        registerDao(TPhoto.class, tPhotoDao);
        registerDao(TRating.class, tRatingDao);
    }
    
    public void clear() {
        tMonitoringDaoConfig.clearIdentityScope();
        tPengujianDaoConfig.clearIdentityScope();
        tPengujianDetailsDaoConfig.clearIdentityScope();
        tLokasiDaoConfig.clearIdentityScope();
        tPosDetailDaoConfig.clearIdentityScope();
        tMaterialDetailDaoConfig.clearIdentityScope();
        tMaterialGroupsDaoConfig.clearIdentityScope();
        tPrivilegeDaoConfig.clearIdentityScope();
        tMaterialDaoConfig.clearIdentityScope();
        tPosDaoConfig.clearIdentityScope();
        tPosPenerimaanDaoConfig.clearIdentityScope();
        tPosDetailPenerimaanDaoConfig.clearIdentityScope();
        tPosSnsDaoConfig.clearIdentityScope();
        tPemeriksaanDaoConfig.clearIdentityScope();
        tPemeriksaanDetailDaoConfig.clearIdentityScope();
        tPhotoDaoConfig.clearIdentityScope();
        tRatingDaoConfig.clearIdentityScope();
    }

    public TMonitoringDao getTMonitoringDao() {
        return tMonitoringDao;
    }

    public TPengujianDao getTPengujianDao() {
        return tPengujianDao;
    }

    public TPengujianDetailsDao getTPengujianDetailsDao() {
        return tPengujianDetailsDao;
    }

    public TLokasiDao getTLokasiDao() {
        return tLokasiDao;
    }

    public TPosDetailDao getTPosDetailDao() {
        return tPosDetailDao;
    }

    public TMaterialDetailDao getTMaterialDetailDao() {
        return tMaterialDetailDao;
    }

    public TMaterialGroupsDao getTMaterialGroupsDao() {
        return tMaterialGroupsDao;
    }

    public TPrivilegeDao getTPrivilegeDao() {
        return tPrivilegeDao;
    }

    public TMaterialDao getTMaterialDao() {
        return tMaterialDao;
    }

    public TPosDao getTPosDao() {
        return tPosDao;
    }

    public TPosPenerimaanDao getTPosPenerimaanDao() {
        return tPosPenerimaanDao;
    }

    public TPosDetailPenerimaanDao getTPosDetailPenerimaanDao() {
        return tPosDetailPenerimaanDao;
    }

    public TPosSnsDao getTPosSnsDao() {
        return tPosSnsDao;
    }

    public TPemeriksaanDao getTPemeriksaanDao() {
        return tPemeriksaanDao;
    }

    public TPemeriksaanDetailDao getTPemeriksaanDetailDao() {
        return tPemeriksaanDetailDao;
    }

    public TPhotoDao getTPhotoDao() {
        return tPhotoDao;
    }

    public TRatingDao getTRatingDao() {
        return tRatingDao;
    }

}
