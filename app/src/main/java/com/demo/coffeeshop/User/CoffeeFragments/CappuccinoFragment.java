package com.demo.coffeeshop.User.CoffeeFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.demo.coffeeshop.R;
import com.demo.coffeeshop.User.MainFragments.CoffeeDetailsFragment;
import com.demo.coffeeshop.User.UserActivity;


public class CappuccinoFragment extends Fragment {

    ImageView imageView;
    ImageView imageView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cappucino, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.addIcon1);

        imageView.setOnClickListener(v -> {
            if (getActivity() instanceof UserActivity) {
                UserActivity activity = (UserActivity) getActivity();
                CoffeeDetailsFragment coffeeDetailsFragment = CoffeeDetailsFragment.newInstance(
                        R.drawable.boba1,
                        "Coffee Cappu",
                        "Toast Text",
                        "Milk Name",
                        "Description"
                );
                activity.navigateToFragment(coffeeDetailsFragment, R.id.buynow);
            }
        });

        imageView2 = view.findViewById(R.id.addIcon2);
        imageView2.setOnClickListener(v -> {
            if (getActivity() instanceof UserActivity) {
                UserActivity activity = (UserActivity) getActivity();
                CoffeeDetailsFragment coffeeDetailsFragment = CoffeeDetailsFragment.newInstance(
                        R.drawable.mangoboba_1__1_,
                        "Coffee Cappu2",
                        "Toast Text",
                        "Milk Name",
                        "Description"
                );
                activity.navigateToFragment(coffeeDetailsFragment, R.id.buynow);
            }
        });
    }
}