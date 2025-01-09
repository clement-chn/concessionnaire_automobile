package com.example.concessionnaire_automobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class CarListFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var carAdapter: CarAdapter
    private val viewModel: CarViewModel by viewModelStore()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_car_list, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        carAdapter = CarAdapter { car -> showCarDetail(car)}
        recyclerView.adapter = carAdapter

        viewModel.refreshCars()

        viewModel.carList.observe(viewLifecycleOwner) { cars ->
            updateCars(cars)
        }

        return view
    }
}