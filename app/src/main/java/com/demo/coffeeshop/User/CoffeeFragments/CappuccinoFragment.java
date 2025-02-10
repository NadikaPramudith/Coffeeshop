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
                        R.drawable.wetcappuccinodetailed,
                        "Wet Cappuccino",
                        "Arabica Beans",
                        "Steamed Milk",
                        "Enjoy the rich, smooth taste of our Wet Cappuccino, a perfect blend of bold espresso and silky steamed milk. Each sip offers a creamy, well-balanced flavor with a light, velvety texture, making it the ultimate choice for those who love a softer, indulgent coffee experience.",
                        "3.99"
                );
                activity.navigateToFragment(coffeeDetailsFragment, R.id.buynow);
            }
        });

        imageView2 = view.findViewById(R.id.addIcon2);
        imageView2.setOnClickListener(v -> {
            if (getActivity() instanceof UserActivity) {
                UserActivity activity = (UserActivity) getActivity();
                CoffeeDetailsFragment coffeeDetailsFragment = CoffeeDetailsFragment.newInstance(
                        R.drawable.vanilacappuccinodetailed,
                        "Vanila Cappuccino",
                        "Arabica Beans",
                        "Steamed Milk",
                        "Savor the smooth, creamy taste of our Vanilla Cappuccino, a perfect blend of bold espresso, velvety steamed milk, and sweet vanilla. Each sip offers a rich, aromatic flavor with a hint of warmth, making it the ultimate treat for those who love a subtly sweet and indulgent coffee experience.",
                        "6.99"
                );
                activity.navigateToFragment(coffeeDetailsFragment, R.id.buynow);
            }
        });
    }
}