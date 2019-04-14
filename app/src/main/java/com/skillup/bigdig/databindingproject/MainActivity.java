package com.skillup.bigdig.databindingproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.skillup.bigdig.databindingproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    BankCard bankCard = new BankCard("heuwiq");
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setCard(bankCard);
  }
}
