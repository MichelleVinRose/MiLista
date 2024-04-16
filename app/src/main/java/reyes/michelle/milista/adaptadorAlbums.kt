package reyes.michelle.milista

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adaptadorAlbums(val albums_list:List<Album>):RecyclerView.Adapter<adaptadorAlbums.AlbumViewHolder>() {

    class AlbumViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var imagen_album: ImageView= itemView.findViewById(R.id.imagenAlbum)
        var nombre_album: TextView= itemView.findViewById(R.id.nombreAlbum)
        var descripcion_album: TextView= itemView.findViewById(R.id.descripcionAlbum)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.lista_item,parent,false)
        return AlbumViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return albums_list.size
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album:Album= albums_list[position]
        holder.imagen_album.setImageResource(album.imagen)
        holder.nombre_album.text=album.nombre
        holder.descripcion_album.text=album.descripcion
    }
}