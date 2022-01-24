package com.gardner.honorsmobileapps.tipcalculatorpart3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gardner.honorsmobileapps.tipcalculatorpart3.databinding.FragmentSubtotalBinding


class SubtotalFragment : Fragment() {
    private var _binding: FragmentSubtotalBinding? = null
    private val binding get() = _binding!!
    var money = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSubtotalBinding.inflate(inflater, container,false)
        val rootView = binding.root
        binding.oneKey.setOnClickListener {
            money = money+1
            binding.textView2.text = money + ".00"
        }
        binding.twoKey.setOnClickListener {
            money = money+2
            binding.textView2.text = money + ".00"
        }
        binding.threeKey.setOnClickListener {
            money = money+3
            binding.textView2.text = money + ".00"
        }
        binding.fourKey.setOnClickListener {
            money = money+4
            binding.textView2.text = money + ".00"
        }
        binding.fiveKey.setOnClickListener {
            money = money+5
            binding.textView2.text = money + ".00"
        }
        binding.sixKey.setOnClickListener {
            money = money+6
            binding.textView2.text = money + ".00"
        }
        binding.sevenKey.setOnClickListener {
            money = money+7
            binding.textView2.text = money + ".00"
        }
        binding.eightKey.setOnClickListener {
            money = money+8
            binding.textView2.text = money + ".00"
        }
        binding.nineKey.setOnClickListener {
            money = money+9
            binding.textView2.text = money + ".00"
        }
        binding.zeroKey.setOnClickListener {
            money = money+0
            binding.textView2.text = money + ".00"
        }
        binding.backKey.setOnClickListener {
            money = money.substring()
            binding.textView2.text = money + ".00"
        }




        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}