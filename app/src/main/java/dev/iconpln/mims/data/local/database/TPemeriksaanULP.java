package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TPEMERIKSAAN_ULP".
 */
@Entity
public class TPemeriksaanULP {

    @Id
    private Long id;
    private String NoPengiriman;
    private String NoPermintaan;
    private String StatusPemeriksaan;
    private String DeliveryDate;
    private String StatusPenerimaan;
    private String JumlahKardus;
    private String GudangAsal;
    private String NoRepackaging;
    private String GudangTujuan;
    private String TanggalPemeriksaan;
    private String KepalaGudang;
    private String PejabatPemeriksa;
    private String JabatanPemeriksa;
    private String NamaPetugasPemeriksa;
    private String JabatanPetugasPemeriksa;
    private String IsDone;

    @Generated
    public TPemeriksaanULP() {
    }

    public TPemeriksaanULP(Long id) {
        this.id = id;
    }

    @Generated
    public TPemeriksaanULP(Long id, String NoPengiriman, String NoPermintaan, String StatusPemeriksaan, String DeliveryDate, String StatusPenerimaan, String JumlahKardus, String GudangAsal, String NoRepackaging, String GudangTujuan, String TanggalPemeriksaan, String KepalaGudang, String PejabatPemeriksa, String JabatanPemeriksa, String NamaPetugasPemeriksa, String JabatanPetugasPemeriksa, String IsDone) {
        this.id = id;
        this.NoPengiriman = NoPengiriman;
        this.NoPermintaan = NoPermintaan;
        this.StatusPemeriksaan = StatusPemeriksaan;
        this.DeliveryDate = DeliveryDate;
        this.StatusPenerimaan = StatusPenerimaan;
        this.JumlahKardus = JumlahKardus;
        this.GudangAsal = GudangAsal;
        this.NoRepackaging = NoRepackaging;
        this.GudangTujuan = GudangTujuan;
        this.TanggalPemeriksaan = TanggalPemeriksaan;
        this.KepalaGudang = KepalaGudang;
        this.PejabatPemeriksa = PejabatPemeriksa;
        this.JabatanPemeriksa = JabatanPemeriksa;
        this.NamaPetugasPemeriksa = NamaPetugasPemeriksa;
        this.JabatanPetugasPemeriksa = JabatanPetugasPemeriksa;
        this.IsDone = IsDone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoPengiriman() {
        return NoPengiriman;
    }

    public void setNoPengiriman(String NoPengiriman) {
        this.NoPengiriman = NoPengiriman;
    }

    public String getNoPermintaan() {
        return NoPermintaan;
    }

    public void setNoPermintaan(String NoPermintaan) {
        this.NoPermintaan = NoPermintaan;
    }

    public String getStatusPemeriksaan() {
        return StatusPemeriksaan;
    }

    public void setStatusPemeriksaan(String StatusPemeriksaan) {
        this.StatusPemeriksaan = StatusPemeriksaan;
    }

    public String getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(String DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public String getStatusPenerimaan() {
        return StatusPenerimaan;
    }

    public void setStatusPenerimaan(String StatusPenerimaan) {
        this.StatusPenerimaan = StatusPenerimaan;
    }

    public String getJumlahKardus() {
        return JumlahKardus;
    }

    public void setJumlahKardus(String JumlahKardus) {
        this.JumlahKardus = JumlahKardus;
    }

    public String getGudangAsal() {
        return GudangAsal;
    }

    public void setGudangAsal(String GudangAsal) {
        this.GudangAsal = GudangAsal;
    }

    public String getNoRepackaging() {
        return NoRepackaging;
    }

    public void setNoRepackaging(String NoRepackaging) {
        this.NoRepackaging = NoRepackaging;
    }

    public String getGudangTujuan() {
        return GudangTujuan;
    }

    public void setGudangTujuan(String GudangTujuan) {
        this.GudangTujuan = GudangTujuan;
    }

    public String getTanggalPemeriksaan() {
        return TanggalPemeriksaan;
    }

    public void setTanggalPemeriksaan(String TanggalPemeriksaan) {
        this.TanggalPemeriksaan = TanggalPemeriksaan;
    }

    public String getKepalaGudang() {
        return KepalaGudang;
    }

    public void setKepalaGudang(String KepalaGudang) {
        this.KepalaGudang = KepalaGudang;
    }

    public String getPejabatPemeriksa() {
        return PejabatPemeriksa;
    }

    public void setPejabatPemeriksa(String PejabatPemeriksa) {
        this.PejabatPemeriksa = PejabatPemeriksa;
    }

    public String getJabatanPemeriksa() {
        return JabatanPemeriksa;
    }

    public void setJabatanPemeriksa(String JabatanPemeriksa) {
        this.JabatanPemeriksa = JabatanPemeriksa;
    }

    public String getNamaPetugasPemeriksa() {
        return NamaPetugasPemeriksa;
    }

    public void setNamaPetugasPemeriksa(String NamaPetugasPemeriksa) {
        this.NamaPetugasPemeriksa = NamaPetugasPemeriksa;
    }

    public String getJabatanPetugasPemeriksa() {
        return JabatanPetugasPemeriksa;
    }

    public void setJabatanPetugasPemeriksa(String JabatanPetugasPemeriksa) {
        this.JabatanPetugasPemeriksa = JabatanPetugasPemeriksa;
    }

    public String getIsDone() {
        return IsDone;
    }

    public void setIsDone(String IsDone) {
        this.IsDone = IsDone;
    }

}
