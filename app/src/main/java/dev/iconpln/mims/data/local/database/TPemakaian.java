package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TPEMAKAIAN".
 */
@Entity
public class TPemakaian {

    @Id
    private Long id;
    private String NoTransaksi;
    private String NoReservasi;
    private String NoPemesanan;
    private String KodeIntegrasi;
    private String Plant;
    private String StorLoc;
    private String StatusPemakaian;
    private String TanggalReservasi;
    private String TanggalPemakaian;
    private String TanggalPengeluaran;
    private String TanggalDokumen;
    private String JenisPekerjaan;
    private String Sumber;
    private String StatusKirimAgo;
    private String StatusSap;
    private String NoAgenda;
    private String IdPelanggan;
    private String NamaPelanggan;
    private String AlamatPelanggan;
    private String Tarif;
    private String Daya;
    private String TanggalBayar;

    @Generated
    public TPemakaian() {
    }

    public TPemakaian(Long id) {
        this.id = id;
    }

    @Generated
    public TPemakaian(Long id, String NoTransaksi, String NoReservasi, String NoPemesanan, String KodeIntegrasi, String Plant, String StorLoc, String StatusPemakaian, String TanggalReservasi, String TanggalPemakaian, String TanggalPengeluaran, String TanggalDokumen, String JenisPekerjaan, String Sumber, String StatusKirimAgo, String StatusSap, String NoAgenda, String IdPelanggan, String NamaPelanggan, String AlamatPelanggan, String Tarif, String Daya, String TanggalBayar) {
        this.id = id;
        this.NoTransaksi = NoTransaksi;
        this.NoReservasi = NoReservasi;
        this.NoPemesanan = NoPemesanan;
        this.KodeIntegrasi = KodeIntegrasi;
        this.Plant = Plant;
        this.StorLoc = StorLoc;
        this.StatusPemakaian = StatusPemakaian;
        this.TanggalReservasi = TanggalReservasi;
        this.TanggalPemakaian = TanggalPemakaian;
        this.TanggalPengeluaran = TanggalPengeluaran;
        this.TanggalDokumen = TanggalDokumen;
        this.JenisPekerjaan = JenisPekerjaan;
        this.Sumber = Sumber;
        this.StatusKirimAgo = StatusKirimAgo;
        this.StatusSap = StatusSap;
        this.NoAgenda = NoAgenda;
        this.IdPelanggan = IdPelanggan;
        this.NamaPelanggan = NamaPelanggan;
        this.AlamatPelanggan = AlamatPelanggan;
        this.Tarif = Tarif;
        this.Daya = Daya;
        this.TanggalBayar = TanggalBayar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoTransaksi() {
        return NoTransaksi;
    }

    public void setNoTransaksi(String NoTransaksi) {
        this.NoTransaksi = NoTransaksi;
    }

    public String getNoReservasi() {
        return NoReservasi;
    }

    public void setNoReservasi(String NoReservasi) {
        this.NoReservasi = NoReservasi;
    }

    public String getNoPemesanan() {
        return NoPemesanan;
    }

    public void setNoPemesanan(String NoPemesanan) {
        this.NoPemesanan = NoPemesanan;
    }

    public String getKodeIntegrasi() {
        return KodeIntegrasi;
    }

    public void setKodeIntegrasi(String KodeIntegrasi) {
        this.KodeIntegrasi = KodeIntegrasi;
    }

    public String getPlant() {
        return Plant;
    }

    public void setPlant(String Plant) {
        this.Plant = Plant;
    }

    public String getStorLoc() {
        return StorLoc;
    }

    public void setStorLoc(String StorLoc) {
        this.StorLoc = StorLoc;
    }

    public String getStatusPemakaian() {
        return StatusPemakaian;
    }

    public void setStatusPemakaian(String StatusPemakaian) {
        this.StatusPemakaian = StatusPemakaian;
    }

    public String getTanggalReservasi() {
        return TanggalReservasi;
    }

    public void setTanggalReservasi(String TanggalReservasi) {
        this.TanggalReservasi = TanggalReservasi;
    }

    public String getTanggalPemakaian() {
        return TanggalPemakaian;
    }

    public void setTanggalPemakaian(String TanggalPemakaian) {
        this.TanggalPemakaian = TanggalPemakaian;
    }

    public String getTanggalPengeluaran() {
        return TanggalPengeluaran;
    }

    public void setTanggalPengeluaran(String TanggalPengeluaran) {
        this.TanggalPengeluaran = TanggalPengeluaran;
    }

    public String getTanggalDokumen() {
        return TanggalDokumen;
    }

    public void setTanggalDokumen(String TanggalDokumen) {
        this.TanggalDokumen = TanggalDokumen;
    }

    public String getJenisPekerjaan() {
        return JenisPekerjaan;
    }

    public void setJenisPekerjaan(String JenisPekerjaan) {
        this.JenisPekerjaan = JenisPekerjaan;
    }

    public String getSumber() {
        return Sumber;
    }

    public void setSumber(String Sumber) {
        this.Sumber = Sumber;
    }

    public String getStatusKirimAgo() {
        return StatusKirimAgo;
    }

    public void setStatusKirimAgo(String StatusKirimAgo) {
        this.StatusKirimAgo = StatusKirimAgo;
    }

    public String getStatusSap() {
        return StatusSap;
    }

    public void setStatusSap(String StatusSap) {
        this.StatusSap = StatusSap;
    }

    public String getNoAgenda() {
        return NoAgenda;
    }

    public void setNoAgenda(String NoAgenda) {
        this.NoAgenda = NoAgenda;
    }

    public String getIdPelanggan() {
        return IdPelanggan;
    }

    public void setIdPelanggan(String IdPelanggan) {
        this.IdPelanggan = IdPelanggan;
    }

    public String getNamaPelanggan() {
        return NamaPelanggan;
    }

    public void setNamaPelanggan(String NamaPelanggan) {
        this.NamaPelanggan = NamaPelanggan;
    }

    public String getAlamatPelanggan() {
        return AlamatPelanggan;
    }

    public void setAlamatPelanggan(String AlamatPelanggan) {
        this.AlamatPelanggan = AlamatPelanggan;
    }

    public String getTarif() {
        return Tarif;
    }

    public void setTarif(String Tarif) {
        this.Tarif = Tarif;
    }

    public String getDaya() {
        return Daya;
    }

    public void setDaya(String Daya) {
        this.Daya = Daya;
    }

    public String getTanggalBayar() {
        return TanggalBayar;
    }

    public void setTanggalBayar(String TanggalBayar) {
        this.TanggalBayar = TanggalBayar;
    }

}