package layout;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import com.example.usuario.staticfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {


    private EditText edtTexto;
    private SeekBar seekBar;
    private Button btn;
    private FragmentsIterationListener callBack;


    public interface FragmentsIterationListener{

       void onFramentInteradionListener(String args, float size);
    }


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        try {

            callBack = (FragmentsIterationListener)context;

        }catch (ClassCastException e){

            throw new ClassCastException(context.toString()+" tienes que implementar la interfaz pringaooo");
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        if(view != null){

            edtTexto = (EditText)view.findViewById(R.id.edtTexto);
            seekBar = (SeekBar)view.findViewById(R.id.seek);
            btn = (Button)view.findViewById(R.id.btn);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    callBack.onFramentInteradionListener(edtTexto.getText().toString(), seekBar.getProgress());
                }
            });
        }



        return view;
    }

}
