package br.com.pop_up
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
@Suppress("UnnecessaryVariable")

class PopUp: DialogFragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.pop_layout, container, false)


//        rootView.avaliacao_consulta_button.setOnClickListener {
//            val selectedID = avaliacao_consulta_button  .checkedRadioButtonId
//        }

        return rootView
    }
}