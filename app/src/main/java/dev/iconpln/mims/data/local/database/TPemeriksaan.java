package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TPEMERIKSAAN".
 */
@Entity
public class TPemeriksaan {

    @Id
    private Long id;
    private String NoPemeriksaan;
    private String StorLoc;
    private String Total;
    private String TlskNo;
    private String PoSapNo;
    private String PoMpNo;
    private String NoDoSmar;
    private Integer LeadTime;
    private String CreatedDate;
    private String PlanCodeNo;
    private String PlantName;
    private String NoDoMims;
    private String DoStatus;
    private String StatusPemeriksaan;
    private String Expeditions;
    private String CourierPersonName;
    private String KdPabrikan;
    private String MaterialGroup;
    private String NamaKategoriMaterial;
    private String TanggalDiterima;
    private String PetugasPenerima;
    private String NamaKurir;
    private String NamaEkspedisi;
    private String DoLineItem;
    private String NamaManager;
    private String NamaKetua;
    private String NamaSekretaris;
    private String NamaAnggota;
    private String NamaAnggotaBaru;
    private Integer isDone;

    @Generated
    public TPemeriksaan() {
    }

    public TPemeriksaan(Long id) {
        this.id = id;
    }

    @Generated
    public TPemeriksaan(Long id, String NoPemeriksaan, String StorLoc, String Total, String TlskNo, String PoSapNo, String PoMpNo, String NoDoSmar, Integer LeadTime, String CreatedDate, String PlanCodeNo, String PlantName, String NoDoMims, String DoStatus, String StatusPemeriksaan, String Expeditions, String CourierPersonName, String KdPabrikan, String MaterialGroup, String NamaKategoriMaterial, String TanggalDiterima, String PetugasPenerima, String NamaKurir, String NamaEkspedisi, String DoLineItem, String NamaManager, String NamaKetua, String NamaSekretaris, String NamaAnggota, String NamaAnggotaBaru, Integer isDone) {
        this.id = id;
        this.NoPemeriksaan = NoPemeriksaan;
        this.StorLoc = StorLoc;
        this.Total = Total;
        this.TlskNo = TlskNo;
        this.PoSapNo = PoSapNo;
        this.PoMpNo = PoMpNo;
        this.NoDoSmar = NoDoSmar;
        this.LeadTime = LeadTime;
        this.CreatedDate = CreatedDate;
        this.PlanCodeNo = PlanCodeNo;
        this.PlantName = PlantName;
        this.NoDoMims = NoDoMims;
        this.DoStatus = DoStatus;
        this.StatusPemeriksaan = StatusPemeriksaan;
        this.Expeditions = Expeditions;
        this.CourierPersonName = CourierPersonName;
        this.KdPabrikan = KdPabrikan;
        this.MaterialGroup = MaterialGroup;
        this.NamaKategoriMaterial = NamaKategoriMaterial;
        this.TanggalDiterima = TanggalDiterima;
        this.PetugasPenerima = PetugasPenerima;
        this.NamaKurir = NamaKurir;
        this.NamaEkspedisi = NamaEkspedisi;
        this.DoLineItem = DoLineItem;
        this.NamaManager = NamaManager;
        this.NamaKetua = NamaKetua;
        this.NamaSekretaris = NamaSekretaris;
        this.NamaAnggota = NamaAnggota;
        this.NamaAnggotaBaru = NamaAnggotaBaru;
        this.isDone = isDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoPemeriksaan() {
        return NoPemeriksaan;
    }

    public void setNoPemeriksaan(String NoPemeriksaan) {
        this.NoPemeriksaan = NoPemeriksaan;
    }

    public String getStorLoc() {
        return StorLoc;
    }

    public void setStorLoc(String StorLoc) {
        this.StorLoc = StorLoc;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getTlskNo() {
        return TlskNo;
    }

    public void setTlskNo(String TlskNo) {
        this.TlskNo = TlskNo;
    }

    public String getPoSapNo() {
        return PoSapNo;
    }

    public void setPoSapNo(String PoSapNo) {
        this.PoSapNo = PoSapNo;
    }

    public String getPoMpNo() {
        return PoMpNo;
    }

    public void setPoMpNo(String PoMpNo) {
        this.PoMpNo = PoMpNo;
    }

    public String getNoDoSmar() {
        return NoDoSmar;
    }

    public void setNoDoSmar(String NoDoSmar) {
        this.NoDoSmar = NoDoSmar;
    }

    public Integer getLeadTime() {
        return LeadTime;
    }

    public void setLeadTime(Integer LeadTime) {
        this.LeadTime = LeadTime;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getPlanCodeNo() {
        return PlanCodeNo;
    }

    public void setPlanCodeNo(String PlanCodeNo) {
        this.PlanCodeNo = PlanCodeNo;
    }

    public String getPlantName() {
        return PlantName;
    }

    public void setPlantName(String PlantName) {
        this.PlantName = PlantName;
    }

    public String getNoDoMims() {
        return NoDoMims;
    }

    public void setNoDoMims(String NoDoMims) {
        this.NoDoMims = NoDoMims;
    }

    public String getDoStatus() {
        return DoStatus;
    }

    public void setDoStatus(String DoStatus) {
        this.DoStatus = DoStatus;
    }

    public String getStatusPemeriksaan() {
        return StatusPemeriksaan;
    }

    public void setStatusPemeriksaan(String StatusPemeriksaan) {
        this.StatusPemeriksaan = StatusPemeriksaan;
    }

    public String getExpeditions() {
        return Expeditions;
    }

    public void setExpeditions(String Expeditions) {
        this.Expeditions = Expeditions;
    }

    public String getCourierPersonName() {
        return CourierPersonName;
    }

    public void setCourierPersonName(String CourierPersonName) {
        this.CourierPersonName = CourierPersonName;
    }

    public String getKdPabrikan() {
        return KdPabrikan;
    }

    public void setKdPabrikan(String KdPabrikan) {
        this.KdPabrikan = KdPabrikan;
    }

    public String getMaterialGroup() {
        return MaterialGroup;
    }

    public void setMaterialGroup(String MaterialGroup) {
        this.MaterialGroup = MaterialGroup;
    }

    public String getNamaKategoriMaterial() {
        return NamaKategoriMaterial;
    }

    public void setNamaKategoriMaterial(String NamaKategoriMaterial) {
        this.NamaKategoriMaterial = NamaKategoriMaterial;
    }

    public String getTanggalDiterima() {
        return TanggalDiterima;
    }

    public void setTanggalDiterima(String TanggalDiterima) {
        this.TanggalDiterima = TanggalDiterima;
    }

    public String getPetugasPenerima() {
        return PetugasPenerima;
    }

    public void setPetugasPenerima(String PetugasPenerima) {
        this.PetugasPenerima = PetugasPenerima;
    }

    public String getNamaKurir() {
        return NamaKurir;
    }

    public void setNamaKurir(String NamaKurir) {
        this.NamaKurir = NamaKurir;
    }

    public String getNamaEkspedisi() {
        return NamaEkspedisi;
    }

    public void setNamaEkspedisi(String NamaEkspedisi) {
        this.NamaEkspedisi = NamaEkspedisi;
    }

    public String getDoLineItem() {
        return DoLineItem;
    }

    public void setDoLineItem(String DoLineItem) {
        this.DoLineItem = DoLineItem;
    }

    public String getNamaManager() {
        return NamaManager;
    }

    public void setNamaManager(String NamaManager) {
        this.NamaManager = NamaManager;
    }

    public String getNamaKetua() {
        return NamaKetua;
    }

    public void setNamaKetua(String NamaKetua) {
        this.NamaKetua = NamaKetua;
    }

    public String getNamaSekretaris() {
        return NamaSekretaris;
    }

    public void setNamaSekretaris(String NamaSekretaris) {
        this.NamaSekretaris = NamaSekretaris;
    }

    public String getNamaAnggota() {
        return NamaAnggota;
    }

    public void setNamaAnggota(String NamaAnggota) {
        this.NamaAnggota = NamaAnggota;
    }

    public String getNamaAnggotaBaru() {
        return NamaAnggotaBaru;
    }

    public void setNamaAnggotaBaru(String NamaAnggotaBaru) {
        this.NamaAnggotaBaru = NamaAnggotaBaru;
    }

    public Integer getIsDone() {
        return isDone;
    }

    public void setIsDone(Integer isDone) {
        this.isDone = isDone;
    }

}
