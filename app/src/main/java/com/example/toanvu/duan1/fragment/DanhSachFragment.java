package com.example.toanvu.duan1.fragment;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import com.example.toanvu.duan1.R;
import com.example.toanvu.duan1.add.ThemDanhSach;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public class DanhSachFragment extends Fragment {
    private ViewFlipper viewFlipper;
    private FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.danh_sach_fragment, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewFlipper = view.findViewById(R.id.viewFlipper_Home);
        fab = view.findViewById(R.id.fab_danhSach);
        ActionViewFlipper();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent themDS = new Intent(getContext(),ThemDanhSach.class);
                startActivity(themDS);
            }
        });
    }


    private void ActionViewFlipper() {
        ArrayList<Integer> mangquangcaoCT = new ArrayList<>();
        mangquangcaoCT.add(R.drawable.gioithieu);
        mangquangcaoCT.add(R.drawable.cauthu10);
        mangquangcaoCT.add(R.drawable.cauthu11);
        mangquangcaoCT.add(R.drawable.cauthu1);
        mangquangcaoCT.add(R.drawable.cauthu2);
        mangquangcaoCT.add(R.drawable.cauthu4);



        for (int i = 0; i < mangquangcaoCT.size(); i++) {
            ImageView imageView = new ImageView(getContext());
            Picasso.with(getContext()).load(mangquangcaoCT.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);


        Animation animation_silde_in = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_silde_in);
        viewFlipper.setOutAnimation(animation_slide_out);


    }
}
