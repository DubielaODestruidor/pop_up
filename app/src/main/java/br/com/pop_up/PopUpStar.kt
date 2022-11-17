package br.com.pop_up
import android.view.View
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
@Suppress("UnnecessaryVariable")

class PopUpStar: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.pop_star_layout, container, false)

        return rootView
    }
}
