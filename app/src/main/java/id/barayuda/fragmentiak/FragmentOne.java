package id.barayuda.fragmentiak;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by barayuda on 8/5/2017.
 */

public class FragmentOne extends Fragment {

    private RecyclerView recyclerView;
    private SimpleAdapter simpleAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_one, container, false);

        recyclerView = rootview.findViewById(R.id.rv);

        setupRecycleView();

        return rootview;
    }

    private void setupRecycleView() {
        simpleAdapter = new SimpleAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(simpleAdapter);
        simpleAdapter.setData(getData());
    }

    private List<String> getData() {
        List<String> result = new ArrayList<>();
        result.add("Android O");
        result.add("Nougat");
        result.add("Marshmallow");
        result.add("Lolipop");
        return result;
    }
}
