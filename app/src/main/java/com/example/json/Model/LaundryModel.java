package com.example.json.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaundryModel {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("kode_toko")
    @Expose
    private String kodeToko;
    @SerializedName("nama_toko")
    @Expose
    private String namaToko;
    @SerializedName("phone_toko")
    @Expose
    private String phoneToko;
    @SerializedName("alamat_toko")
    @Expose
    private String alamatToko;
    @SerializedName("banner_toko")
    @Expose
    private String bannerToko;
    @SerializedName("logo_toko")
    @Expose
    private String logoToko;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("registered")
    @Expose
    private String registered;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getKodeToko() {
        return kodeToko;
    }

    public void setKodeToko(String kodeToko) {
        this.kodeToko = kodeToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getPhoneToko() {
        return phoneToko;
    }

    public void setPhoneToko(String phoneToko) {
        this.phoneToko = phoneToko;
    }

    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }

    public String getBannerToko() {
        return bannerToko;
    }

    public void setBannerToko(String bannerToko) {
        this.bannerToko = bannerToko;
    }

    public String getLogoToko() {
        return logoToko;
    }

    public void setLogoToko(String logoToko) {
        this.logoToko = logoToko;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }
}
