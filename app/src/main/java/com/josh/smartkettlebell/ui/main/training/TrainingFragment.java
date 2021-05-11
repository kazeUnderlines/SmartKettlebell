package com.josh.smartkettlebell.ui.main.training;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.josh.smartkettlebell.R;
import com.josh.smartkettlebell.ui.main.training.trainingplan.TrainingPlanActivity;
import com.josh.smartkettlebell.ui.main.training.trainingplan.training.TrainingActivity;

public class TrainingFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab_add_excercise);
        view.findViewById(R.id.btn_test).setOnClickListener(e ->
                startActivity(new Intent(getContext(), TrainingActivity.class)));


        fab.setOnClickListener(e -> {

            Intent intent = new Intent(getActivity(), TrainingPlanActivity.class);
            startActivity(intent);
        });


        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}