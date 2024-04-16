package reyes.michelle.milista

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Obtén el color que deseas establecer para la barra de notificaciones
        val colorStatusBar = ContextCompat.getColor(this, R.color.colorStatusBar)

// Establece el color de la barra de notificaciones
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = colorStatusBar
        }
        val albums= listOf(
            Album(R.drawable.txtmagic, "The Dream Chapter: MAGIC", "The Dream Chapter: Magic es el primer álbum de estudio de la boy band surcoreana TXT. Fue lanzado el 21 de octubre de 2019 por Big Hit Music"),
            Album(R.drawable.txtstar, "THE DREAM CHAPTER: STAR", "The Dream Chapter: Star es el EP debut del grupo surcoreano TXT. Fue lanzado el 4 de marzo de 2019 por Big Hit Music."),
            Album(R.drawable.txtbluehour, "minisode1 : Blue Hour", "Minisode 1: Blue Hour es el tercer EP del grupo surcoreano TXT. Fue publicado el 26 de octubre de 2020 por Big Hit Music."),
            Album(R.drawable.txttemptation, "The Name Chapter: TEMPTATION", "El The Name Chapter: Temptation es el quinto EP del grupo surcoreano Tomorrow X Together. Fue lanzado el 27 de enero de 2023 mediante Big Hit Music y Republic Records."),
            Album(R.drawable.txtthursdayschild,"minisode 2: Thursday's Child", "Minisode 2: Thursday's Child es el cuarto EP en coreano del grupo TXT. Fue publicado el 9 de mayo de 2022, a través de Big Hit Music y Republic Records."),
            Album(R.drawable.txteternally,"The Dream Chapter: ETERNITY", "The Dream Chapter: Eternity es el segundo EP del grupo surcoreano TXT. Fue publicado el 18 de mayo de 2020 por Big Hit Music y Republic Records."),
            Album(R.drawable.txtfreefall,"The Name Chapter: FREEFALL","The Name Chapter: Freefall es el quinto álbum de estudio de la banda de chicos de Corea del Sur Tomorrow X Together. Fue lanzado a través de Big Hit Music y Republic Records el 13 de octubre de 2023."),
            Album(R.drawable.txttomorrow,"minisode 3: TOMORROW","Minisodio 3: Tomorrow es el sexto EP en coreano de la boy band surcoreana Tomorrow X Together. Fue lanzado el 1 de abril de 2024 a través de Big Hit Music y Republic Records."),
            Album(R.drawable.txtfreeze,"The Chaos Chapter: FREEZE","The Chaos Chapter: Freeze es el tercer álbum de estudio —segundo en coreano— del grupo surcoreano TXT. Se publicó el 31 de mayo de 2021, a través de Big Hit Music y Republic Records.")
        )
        val recycle_albums:RecyclerView= findViewById(R.id.lista_view)
        recycle_albums.layoutManager= LinearLayoutManager(this)
        recycle_albums.adapter= adaptadorAlbums(albums)
    }
}