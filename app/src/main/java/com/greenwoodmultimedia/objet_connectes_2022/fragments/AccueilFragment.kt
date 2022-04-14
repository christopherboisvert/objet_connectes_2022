package com.greenwoodmultimedia.objet_connectes_2022.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.greenwoodmultimedia.objet_connectes_2022.R

class AccueilFragment : Fragment() {

    private var boitierOuvert:Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_accueil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val alerteOuvertureBoitier:TextView = view.findViewById(R.id.alerte_ouverture_boitier)

        if(!boitierOuvert)
        {
            alerteOuvertureBoitier.text = getString(R.string.objet_connecte_ferme)
            alerteOuvertureBoitier.setBackgroundColor(resources.getColor(R.color.objet_connecte_ferme, null))
        }

        super.onViewCreated(view, savedInstanceState)
    }
}