package com.trevor.showcase.dragndrop;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class DragAndDropFragment extends Fragment {


    public static Fragment newInstance() {
        return new DragAndDropFragment();
    }

    public DragAndDropFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drag_and_drop, container, false);
        return v;
    }

}
