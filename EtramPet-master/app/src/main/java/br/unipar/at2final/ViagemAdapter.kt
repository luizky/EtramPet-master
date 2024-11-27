package br.unipar.at2final

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViagemAdapter(private val viagens: List<Viagem>) :
    RecyclerView.Adapter<ViagemAdapter.ViagemViewHolder>() {

    inner class ViagemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeViagem: TextView = itemView.findViewById(R.id.tvNomeViagem)
        val btnEscolher: Button = itemView.findViewById(R.id.btnEscolherViagem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViagemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_viagem, parent, false)
        return ViagemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViagemViewHolder, position: Int) {
        val viagem = viagens[position]
        holder.nomeViagem.text = viagem.nome

        holder.btnEscolher.setOnClickListener {

        }
    }

    override fun getItemCount(): Int = viagens.size
}
