package layout;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.usuario.staticfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentC extends Fragment {


    private WebView webView;


    public FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_fragment_c, container, false);
        webView = (WebView)view.findViewById(R.id.txvTextoFragmentC);
        webView.loadData(getResources().getString(R.string.html), "text/html", Xml.Encoding.UTF_8.toString());
        return view;

    }






}
