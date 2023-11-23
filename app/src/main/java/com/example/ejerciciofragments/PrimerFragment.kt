package com.example.ejerciciofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class PrimerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_primer, container, false)

        val btnFr1 = view.findViewById<Button>(R.id.btnFr1)
        val edtFr1 = view.findViewById<EditText>(R.id.edtFr1)

        val segundoFragment = SegundoFragment()

        btnFr1.setOnClickListener {

            val bundle = Bundle()

            bundle.putString("text",edtFr1.text.toString())

            segundoFragment.arguments = bundle


            parentFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, segundoFragment)
                    .commit()
            }

        }
        return view
    }
}