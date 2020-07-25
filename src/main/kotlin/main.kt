import com.google.gson.GsonBuilder
import entity.DataSource
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {

    val json = GsonBuilder()
        .setPrettyPrinting()
        .serializeNulls()
        .create()

    File("./post.json").writeText(json.toJson(DataSource.createDataSet()))

}