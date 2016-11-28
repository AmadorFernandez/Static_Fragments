package layout;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Dimension;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usuario.staticfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    private TextView textView;
    private static final String PARAM_1 = "param_1";
    private static final String PARAM_2 = "param_2";


    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putString(PARAM_1, textView.getText().toString());
        outState.putFloat(PARAM_2, textView.getTextSize());
        super.onSaveInstanceState(outState);
    }



    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {

        if(savedInstanceState != null) {
            textView.setText(savedInstanceState.getString(PARAM_1));
            DisplayMetrics metrics = getResources().getDisplayMetrics();
            textView.setTextSize(savedInstanceState.getFloat(PARAM_2)/metrics.density);
        }

        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        if(savedInstanceState != null) {
            textView.setText(savedInstanceState.getString(PARAM_1));
            textView.setTextSize(savedInstanceState.getFloat(PARAM_2));
        }
        super.onActivityCreated(savedInstanceState);
    }

    public FragmentB() {
        // Required empty public constructor
    }


    public void modificar(String args, float size){

        textView.setText(args);
        textView.setTextSize(size);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        if(view != null){

            textView = (TextView)view.findViewById(R.id.txvTextoFragmentB);
        }


        return view;
    }

}
