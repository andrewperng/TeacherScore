package com.yocto.android.teacherscore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import com.yocto.android.teacherscore.R;

/**
 * Created by Andrew on 4/25/2018.
 */

public class TabStudent extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_student, container, false);
    }
}