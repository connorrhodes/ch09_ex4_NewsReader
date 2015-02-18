package com.murach.newsreader;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by adamvaldez on 2/18/15.
 */
public class ItemFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = (inflater).inflate(R.layout.item_fragment, container, false);


        return view;
    }

}
