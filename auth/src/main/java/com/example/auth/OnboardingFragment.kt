package com.example.auth

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.authh.databinding.FragmentOnboardingBinding
import com.example.base.BaseFragment


class OnboardingFragment :
    BaseFragment<FragmentOnboardingBinding>(FragmentOnboardingBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.startButton.setOnClickListener {
            findNavController().navigate(com.example.authh.R.id.action_onboarding_to_createAcc)
        }
    }
}