package nyc.c4q.josiel.picassotest;

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

import nyc.c4q.josiel.picassotest.Backend.AvailableKeys;


public class AvailableKeysFragment extends Fragment {

    RecyclerView recyclerView;
    AvailableKeysAdapter availableKeysAdapter;
    List<AvailableKeys> availableKeysList = new ArrayList<>();

    public AvailableKeysFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_avalablekeys, container, false);
        recyclerView = (RecyclerView) root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        fetchAvialableKeys();
        return root;
    }

    private void fetchAvialableKeys() {

    }


}
