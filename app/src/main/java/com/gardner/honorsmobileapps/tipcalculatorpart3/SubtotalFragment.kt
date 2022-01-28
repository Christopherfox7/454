package com.gardner.honorsmobileapps.tipcalculatorpart3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.gardner.honorsmobileapps.tipcalculatorpart3.databinding.FragmentSubtotalBinding


class SubtotalFragment : Fragment() {
    private var _binding: FragmentSubtotalBinding? = null
    private val binding get() = _binding!!
    var money = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSubtotalBinding.inflate(inflater, container,false)
        val rootView = binding.root
        binding.textView2.text = "$0.00"
        money = 0
        binding.oneKey.setOnClickListener {
            money = money*10+1
            binding.textView2.text = "$"+money + ".00"
        }
        binding.twoKey.setOnClickListener {
            money = money*10+2
            binding.textView2.text = "$"+money + ".00"
        }
        binding.threeKey.setOnClickListener {
            money = money*10+3
            binding.textView2.text = "$"+money + ".00"
        }
        binding.fourKey.setOnClickListener {
            money = money*10+4
            binding.textView2.text = "$"+money + ".00"
        }
        binding.fiveKey.setOnClickListener {
            money = money*10+5
            binding.textView2.text = "$"+money + ".00"
        }
        binding.sixKey.setOnClickListener {
            money = money*10+6
            binding.textView2.text ="$"+money + ".00"
        }
        binding.sevenKey.setOnClickListener {
            money = money*10+7
            binding.textView2.text = "$"+money + ".00"
        }
        binding.eightKey.setOnClickListener {
            money = money*10+8
            binding.textView2.text = "$"+money + ".00"
        }
        binding.nineKey.setOnClickListener {
            money = money*10+9
            binding.textView2.text = "$"+money + ".00"
        }
        binding.zeroKey.setOnClickListener {
            if(money.equals(0)) {
                binding.textView2.text = "$0.00"
            }
            else{
                money = money*10 + 0
                binding.textView2.text = "$"+money + ".00"
            }
        }
        binding.backKey.setOnClickListener {
            if(money>0) {
                money = money / 10
                binding.textView2.text = "$" + money + ".00"
            }
                else{
                    binding.textView2.text = "$0"  + ".00"
                }


        }

            binding.nextKey.setOnClickListener {
                if(money>0) {
                    val value = money
                    val action =
                        SubtotalFragmentDirections.actionSubtotalFragmentToTipFragment(value)
                    rootView.findNavController().navigate(action)
                }
            }





        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}