package com.example.bnm.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.bnm.Dp_Activity;
import com.example.bnm.Mp_Activity;
import com.example.bnm.R;
import com.example.bnm.Wp_Activity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView iv_move_mp = (ImageView)root.findViewById(R.id.imageView2);
        ImageView iv_move_wp = (ImageView)root.findViewById(R.id.imageView3);
        ImageView iv_move_dp = (ImageView)root.findViewById(R.id.imageView4);

        iv_move_mp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Mp_Activity.class);
                startActivity(intent);
            }
        });

        iv_move_wp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Wp_Activity.class);
                startActivity(intent);
            }
        });

        iv_move_dp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Dp_Activity.class);
                startActivity(intent);
            }
        });

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}