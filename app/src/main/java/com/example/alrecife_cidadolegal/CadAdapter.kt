package com.example.alrecife_cidadolegal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CadAdapter (private val empList: ArrayList<Cadlog>) :
    RecyclerView.Adapter<CadAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CadAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista1, parent, false)
        return ViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: CadAdapter.ViewHolder, position: Int) {
        val currentEmp = empList[position]
        holder.tvEmpName.text = currentEmp.enome
        }

        override fun getItemCount(): Int {
        return empList.size
        }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvEmpName: TextView = itemView.findViewById(R.id.tvEmpName)
    }

}

