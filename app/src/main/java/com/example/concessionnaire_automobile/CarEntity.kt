import androidx.room.Entityimport androidx.room.PrimaryKey@Entity(tableName = "car_table")

data class CarEntity(
    @PrimaryKey val id: String,
    val make: String,
    val model: String,
    val year: Int,
    val picture: String,
    val equipments: List<String> = emptyList())