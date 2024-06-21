package com.dicoding.asclepius

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dicoding.asclepius.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.Bellpepper.setOnClickListener {
            navigateToActivity(BellActivity::class.java)
        }

        binding.Topics.setOnClickListener {
            navigateToActivity(HowActivity::class.java)
        }
        binding.Potato.setOnClickListener {
            navigateToActivity(PotActivity::class.java)
        }

        binding.Tomato.setOnClickListener {
            navigateToActivity(TomActivity::class.java)
        }


    }

    private fun navigateToActivity(activityClass: Class<*>) {
        val intent = Intent(requireContext(), activityClass)
        startActivity(intent)
    }
}