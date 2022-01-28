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
    var people = 0
    var cost: Float = 0.0f


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFinalTotalBinding.inflate(inflater, container,false)
        val rootView = binding.root
        val args = FinalTotalFragmentArgs.fromBundle(requireArguments())
        people = args.personArgument
        cost = args.totalArgument
        val textOwed = "$%.2f".format(cost)
        binding.owesAmountText.text = "$%.2f".format(cost/people.toFloat())

        binding.subTipAmountText.text = "" + textOwed
        binding.roundDownButton.setOnClickListener {
            binding.owesAmountText.text = ""+"$%.2f".format(Math.floor(cost.toDouble()/people.toDouble()))

        }
        binding.roundUpButton.setOnClickListener {
            binding.owesAmountText.text = ""+"$%.2f".format(Math.ceil(cost.toDouble()/people.toDouble()))

        }
        return rootView

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}