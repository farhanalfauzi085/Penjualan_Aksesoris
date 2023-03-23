package id.ac.unpas.functionalcompose.persistences


import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.penjualanaksesoris

@Dao
interface penjualanaksesorisDao {


    @Query("SELECT * FROM penjualanaksesoris")
    fun loadAll(): LiveData<List<penjualanaksesoris>>
    @Query("SELECT * FROM penjualanaksesoris WHERE id = :id")
    fun find(id: String): penjualanaksesoris?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: penjualanaksesoris)
    @Delete
    fun delete(item: penjualanaksesoris)





}
