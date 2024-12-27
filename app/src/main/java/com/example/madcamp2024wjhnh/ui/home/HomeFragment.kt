package com.example.madcamp2024wjhnh.ui.home


import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.madcamp2024wjhnh.data.Travel

class HomeFragment : Fragment() {

    private lateinit var travelAdapter: RecyclerView.Adapter<*>
    private val travelList = mutableListOf<Travel>()

    fun addNewTravel(travel: Travel) {
        travelList.add(travel)
        travelAdapter.notifyItemInserted(travelList.size - 1)
    }
}

//
//class HomeFragment : Fragment() {
//
//    private lateinit var viewModel: TravelViewModel
//    private lateinit var travelAdapter: TravelAdapter
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val binding = FragmentHomeBinding.inflate(inflater, container, false)
//
//        // ViewModel 초기화
//        val dao = TravelDatabase.getInstance(requireContext()).travelDao()
//        val repository = TravelRepository(dao)
//        viewModel = ViewModelProvider(this, TravelViewModelFactory(repository))[TravelViewModel::class.java]
//
//        // RecyclerView 설정
//        travelAdapter = TravelAdapter(requireContext(), emptyList())
//        binding.travelRecyclerView.layoutManager = LinearLayoutManager(requireContext())
//        binding.travelRecyclerView.adapter = travelAdapter
//
//        // 데이터 관찰 및 업데이트
//        viewModel.travelList.observe(viewLifecycleOwner) { travels ->
//            travelAdapter.updateData(travels)
//        }
//
//        binding.fabAddItem.setOnClickListener {
//            requireActivity().supportFragmentManager.beginTransaction()
//                .replace(R.id.nav_host_fragment_activity_main, AddTravelHistory())
//                .addToBackStack(null)
//                .commit()
//        }
//
//        // 데이터 로드
//        viewModel.loadTravels()
//
//        return binding.root
//    }
//
//    fun addNewTravel(travel: Travel) {
//        viewModel.addTravel(travel)
//    }
//}
