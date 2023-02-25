package com.example.mybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mybooks.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        LandMark selectedLandMark =(LandMark) intent.getSerializableExtra("landmark");

        binding.nametext.setText(selectedLandMark.name);
        binding.explaintext.setText(selectedLandMark.explain);
        binding.imageView.setImageResource(selectedLandMark.image);
    }
}