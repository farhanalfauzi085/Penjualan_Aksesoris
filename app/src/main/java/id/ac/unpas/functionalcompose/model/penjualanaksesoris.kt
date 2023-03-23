package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class penjualanaksesoris(
    @PrimaryKey val id: String,
    val tanggal: String,
    val jenis: String,
    val harga: String,
    val jumlah: String
)
