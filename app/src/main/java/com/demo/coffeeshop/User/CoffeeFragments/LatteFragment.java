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

public class LatteFragment extends Fragment {

    ImageView imageView;
    ImageView imageView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latte, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.addIcon1);

        imageView.setOnClickListener(v -> {
            if (getActivity() instanceof UserActivity) {
                UserActivity activity = (UserActivity) getActivity();
                CoffeeDetailsFragment coffeeDetailsFragment = CoffeeDetailsFragment.newInstance(
                        R.drawable.caremellattedetailed,
                        "Coffee Latte",
                        "Medium Toast",
                        "Almond Milk",
                        "Indulge in the luscious, smooth taste of our Caramel Latte, a perfect blend of bold espresso, velvety steamed milk, and sweet caramel. Each sip offers a rich, buttery flavor with a hint of warmth, making it the ultimate treat for those who crave a sweet and creamy coffee delight.",
                        "5.99"
                );
                activity.navigateToFragment(coffeeDetailsFragment, R.id.buynow);
            }
        });

        imageView2 = view.findViewById(R.id.addIcon2);
        imageView2.setOnClickListener(v -> {
            if (getActivity() instanceof UserActivity) {
                UserActivity activity = (UserActivity) getActivity();
                CoffeeDetailsFragment coffeeDetailsFragment = CoffeeDetailsFragment.newInstance(
                        R.drawable.cofeelattedetailed,
                        "Coffee Latte",
                        "Medium Toast",
                        "Almond Milk",
                        "Delight in the creamy, smooth taste of our Coffee Latte, a perfect harmony of bold espresso and velvety steamed milk. Each sip offers a rich, balanced flavor with a touch of natural sweetness, making it the ultimate choice for those who love a silky, comforting coffee experience.",
                        "8.99"
                );
                activity.navigateToFragment(coffeeDetailsFragment, R.id.buynow);
            }
        });
    }
}