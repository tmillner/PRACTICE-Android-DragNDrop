package com.trevor.showcase.dragndrop;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDropActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDropFragment.newInstance();
    }
}
