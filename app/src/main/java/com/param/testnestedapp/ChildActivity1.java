package com.param.testnestedapp;

import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Aritra on 5/6/2016.
 */
public class ChildActivity1 extends BaseActivity {

    private View llChildActivity1;

    @Override
    public void initialize() {
        llChildActivity1 =	inflater.inflate(R.layout.child_layout1,null);
        llBody.addView(llChildActivity1, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    }
}
