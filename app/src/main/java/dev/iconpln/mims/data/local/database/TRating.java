package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TRATING".
 */
@Entity
public class TRating {

    @Id
    private Long id;
    private String KdRating;
    private String Keterangan;
    private Integer Nilai;
    private String Type;
    private Integer IsActive;

    @Generated
    public TRating() {
    }

    public TRating(Long id) {
        this.id = id;
    }

    @Generated
    public TRating(Long id, String KdRating, String Keterangan, Integer Nilai, String Type, Integer IsActive) {
        this.id = id;
        this.KdRating = KdRating;
        this.Keterangan = Keterangan;
        this.Nilai = Nilai;
        this.Type = Type;
        this.IsActive = IsActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKdRating() {
        return KdRating;
    }

    public void setKdRating(String KdRating) {
        this.KdRating = KdRating;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public Integer getNilai() {
        return Nilai;
    }

    public void setNilai(Integer Nilai) {
        this.Nilai = Nilai;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Integer getIsActive() {
        return IsActive;
    }

    public void setIsActive(Integer IsActive) {
        this.IsActive = IsActive;
    }

}