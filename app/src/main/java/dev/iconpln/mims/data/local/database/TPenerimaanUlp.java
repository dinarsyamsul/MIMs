package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TPENERIMAAN_ULP".
 */
@Entity
public class TPenerimaanUlp {

    @Id
    private Long id;
    private String NoPengiriman;
    private String NoPermintaan;
    private String StatusPemeriksaan;
    private String DeliveryDate;
    private String StatusPenerimaan;
    private Integer JumlahKardus;
    private String GudangAsal;
    private String NoRepackaging;
    private String GudangTujuan;
    private String TanggalPemeriksaan;
    private String TanggalPenerimaan;
    private String KepalaGudangPemeriksa;
    private String PejabatPemeriksa;
    private String JabatanPemeriksa;
    private String NamaPetugasPemeriksa;
    private String JabatanPetugasPemeriksa;
    private String KepalaGudangPenerima;
    private String NoPk;
    private String TanggalDokumen;
    private String PejabatPenerima;
    private String Kurir;
    private String NoNota;
    private String NoMaterial;
    private String Spesifikasi;
    private Integer KuantitasPeriksa;
    private Integer Kuantitas;

    @Generated
    public TPenerimaanUlp() {
    }

    public TPenerimaanUlp(Long id) {
        this.id = id;
    }

    @Generated
    public TPenerimaanUlp(Long id, String NoPengiriman, String NoPermintaan, String StatusPemeriksaan, String DeliveryDate, String StatusPenerimaan, Integer JumlahKardus, String GudangAsal, String NoRepackaging, String GudangTujuan, String TanggalPemeriksaan, String TanggalPenerimaan, String KepalaGudangPemeriksa, String PejabatPemeriksa, String JabatanPemeriksa, String NamaPetugasPemeriksa, String JabatanPetugasPemeriksa, String KepalaGudangPenerima, String NoPk, String TanggalDokumen, String PejabatPenerima, String Kurir, String NoNota, String NoMaterial, String Spesifikasi, Integer KuantitasPeriksa, Integer Kuantitas) {
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
        this.TanggalPenerimaan = TanggalPenerimaan;
        this.KepalaGudangPemeriksa = KepalaGudangPemeriksa;
        this.PejabatPemeriksa = PejabatPemeriksa;
        this.JabatanPemeriksa = JabatanPemeriksa;
        this.NamaPetugasPemeriksa = NamaPetugasPemeriksa;
        this.JabatanPetugasPemeriksa = JabatanPetugasPemeriksa;
        this.KepalaGudangPenerima = KepalaGudangPenerima;
        this.NoPk = NoPk;
        this.TanggalDokumen = TanggalDokumen;
        this.PejabatPenerima = PejabatPenerima;
        this.Kurir = Kurir;
        this.NoNota = NoNota;
        this.NoMaterial = NoMaterial;
        this.Spesifikasi = Spesifikasi;
        this.KuantitasPeriksa = KuantitasPeriksa;
        this.Kuantitas = Kuantitas;
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

    public Integer getJumlahKardus() {
        return JumlahKardus;
    }

    public void setJumlahKardus(Integer JumlahKardus) {
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

    public String getTanggalPenerimaan() {
        return TanggalPenerimaan;
    }

    public void setTanggalPenerimaan(String TanggalPenerimaan) {
        this.TanggalPenerimaan = TanggalPenerimaan;
    }

    public String getKepalaGudangPemeriksa() {
        return KepalaGudangPemeriksa;
    }

    public void setKepalaGudangPemeriksa(String KepalaGudangPemeriksa) {
        this.KepalaGudangPemeriksa = KepalaGudangPemeriksa;
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

    public String getKepalaGudangPenerima() {
        return KepalaGudangPenerima;
    }

    public void setKepalaGudangPenerima(String KepalaGudangPenerima) {
        this.KepalaGudangPenerima = KepalaGudangPenerima;
    }

    public String getNoPk() {
        return NoPk;
    }

    public void setNoPk(String NoPk) {
        this.NoPk = NoPk;
    }

    public String getTanggalDokumen() {
        return TanggalDokumen;
    }

    public void setTanggalDokumen(String TanggalDokumen) {
        this.TanggalDokumen = TanggalDokumen;
    }

    public String getPejabatPenerima() {
        return PejabatPenerima;
    }

    public void setPejabatPenerima(String PejabatPenerima) {
        this.PejabatPenerima = PejabatPenerima;
    }

    public String getKurir() {
        return Kurir;
    }

    public void setKurir(String Kurir) {
        this.Kurir = Kurir;
    }

    public String getNoNota() {
        return NoNota;
    }

    public void setNoNota(String NoNota) {
        this.NoNota = NoNota;
    }

    public String getNoMaterial() {
        return NoMaterial;
    }

    public void setNoMaterial(String NoMaterial) {
        this.NoMaterial = NoMaterial;
    }

    public String getSpesifikasi() {
        return Spesifikasi;
    }

    public void setSpesifikasi(String Spesifikasi) {
        this.Spesifikasi = Spesifikasi;
    }

    public Integer getKuantitasPeriksa() {
        return KuantitasPeriksa;
    }

    public void setKuantitasPeriksa(Integer KuantitasPeriksa) {
        this.KuantitasPeriksa = KuantitasPeriksa;
    }

    public Integer getKuantitas() {
        return Kuantitas;
    }

    public void setKuantitas(Integer Kuantitas) {
        this.Kuantitas = Kuantitas;
    }

}
