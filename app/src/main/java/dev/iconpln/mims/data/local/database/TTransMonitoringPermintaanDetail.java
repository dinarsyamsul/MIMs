package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TTRANS_MONITORING_PERMINTAAN_DETAIL".
 */
@Entity
public class TTransMonitoringPermintaanDetail {

    @Id
    private Long id;
    private String NoPermintaan;
    private String NoTransaksi;
    private String NoRepackaging;
    private String NomorMaterial;
    private String Unit;
    private Integer QtyPermintaan;
    private String MaterialDesc;
    private String QtyScan;
    private String Kategori;
    private String QtyPengeluaran;
    private Integer IsScannedSn;
    private Integer IsDone;

    @Generated
    public TTransMonitoringPermintaanDetail() {
    }

    public TTransMonitoringPermintaanDetail(Long id) {
        this.id = id;
    }

    @Generated
    public TTransMonitoringPermintaanDetail(Long id, String NoPermintaan, String NoTransaksi, String NoRepackaging, String NomorMaterial, String Unit, Integer QtyPermintaan, String MaterialDesc, String QtyScan, String Kategori, String QtyPengeluaran, Integer IsScannedSn, Integer IsDone) {
        this.id = id;
        this.NoPermintaan = NoPermintaan;
        this.NoTransaksi = NoTransaksi;
        this.NoRepackaging = NoRepackaging;
        this.NomorMaterial = NomorMaterial;
        this.Unit = Unit;
        this.QtyPermintaan = QtyPermintaan;
        this.MaterialDesc = MaterialDesc;
        this.QtyScan = QtyScan;
        this.Kategori = Kategori;
        this.QtyPengeluaran = QtyPengeluaran;
        this.IsScannedSn = IsScannedSn;
        this.IsDone = IsDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoPermintaan() {
        return NoPermintaan;
    }

    public void setNoPermintaan(String NoPermintaan) {
        this.NoPermintaan = NoPermintaan;
    }

    public String getNoTransaksi() {
        return NoTransaksi;
    }

    public void setNoTransaksi(String NoTransaksi) {
        this.NoTransaksi = NoTransaksi;
    }

    public String getNoRepackaging() {
        return NoRepackaging;
    }

    public void setNoRepackaging(String NoRepackaging) {
        this.NoRepackaging = NoRepackaging;
    }

    public String getNomorMaterial() {
        return NomorMaterial;
    }

    public void setNomorMaterial(String NomorMaterial) {
        this.NomorMaterial = NomorMaterial;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public Integer getQtyPermintaan() {
        return QtyPermintaan;
    }

    public void setQtyPermintaan(Integer QtyPermintaan) {
        this.QtyPermintaan = QtyPermintaan;
    }

    public String getMaterialDesc() {
        return MaterialDesc;
    }

    public void setMaterialDesc(String MaterialDesc) {
        this.MaterialDesc = MaterialDesc;
    }

    public String getQtyScan() {
        return QtyScan;
    }

    public void setQtyScan(String QtyScan) {
        this.QtyScan = QtyScan;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public String getQtyPengeluaran() {
        return QtyPengeluaran;
    }

    public void setQtyPengeluaran(String QtyPengeluaran) {
        this.QtyPengeluaran = QtyPengeluaran;
    }

    public Integer getIsScannedSn() {
        return IsScannedSn;
    }

    public void setIsScannedSn(Integer IsScannedSn) {
        this.IsScannedSn = IsScannedSn;
    }

    public Integer getIsDone() {
        return IsDone;
    }

    public void setIsDone(Integer IsDone) {
        this.IsDone = IsDone;
    }

}
