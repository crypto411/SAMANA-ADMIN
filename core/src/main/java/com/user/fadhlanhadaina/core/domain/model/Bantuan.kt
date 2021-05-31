package com.user.fadhlanhadaina.core.domain.model

import com.google.gson.annotations.SerializedName

data class Bantuan (
    var nik: String?,
    var nama: String?,
    @SerializedName("tgl_lahir")
    var tglLahir: String?,
    var tanggungan: String?,
    var pendidikan: String?,
    var profesi: String?,
    var status: String?,
    var gaji: String?,
    var kota: String?,
    var kecamatan: String?,
    var kelurahan: String?,
    var rt: String?,
    var rw: String?,
    var alamat: String?,
    var kesehatan: String?,
    var atap: String?,
    var dinding: String?,
    var lantai: String?,
    var penerangan: String?,
    var air: String?,
    @SerializedName("luas_rumah")
    var luasRumah: String?,
    var validasi: String?
)