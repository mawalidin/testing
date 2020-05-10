package awal.tugas.balsem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
//tanggal pengerjaan: 5//9/2020
//nim: 10117094
//nama: Muhammad Walidin
//kelas: IF-3
public class ListFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //tanggal pengerjaan: 5//9/2020
//nim: 10117094
//nama: Muhammad Walidin
//kelas: IF-3
    public ListFragment() {
        // Required empty public constructor
    }

    //tanggal pengerjaan: 5//9/2020
    //nim: 10117094
    //nama: Muhammad Walidin
    //kelas: IF-3
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //tanggal pengerjaan: 5//9/2020
    //nim: 10117094
    //nama: Muhammad Walidin
    //kelas: IF-3
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    //tanggal pengerjaan: 5//9/2020
    //nim: 10117094
    //nama: Muhammad Walidin
    //kelas: IF-3
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}
