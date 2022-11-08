package com.example.parcial2;

public class VpAdaptador {

    companion object{

        private const val  ARG_OBJECT = "object"
    }
    override fun getItemCount(): Int  = 3

    override fun createFragment(position: Int): Fragment {

        val  fragmento = vista_fragmento()
        fragmento.arguments = Bundle().apply {

            putInt(ARG_OBJECT,position+1)
        }

        return  fragmento
    }


}
