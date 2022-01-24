package com.gardner.honorsmobileapps.tipcalculatorpart3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gardner.honorsmobileapps.tipcalculatorpart3.databinding.FragmentFinalTotalBinding


class FinalTotalFragment : Fragment() {
    private var _binding: FragmentFinalTotalBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFinalTotalBinding.inflate(inflater, container,false)
        val rootView = binding.root
        return rootView

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}