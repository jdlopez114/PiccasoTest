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

import nyc.c4q.josiel.picassotest.Backend.APIService;
import nyc.c4q.josiel.picassotest.Backend.AvailableKeys;
import nyc.c4q.josiel.picassotest.Backend.AvailableKeysResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


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
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsjrobotics.nyc/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);

        Call<AvailableKeysResponse> call = service.getAvailableKeys();
        call.enqueue(new Callback<AvailableKeysResponse>() {
            @Override
            public void onResponse(Call<AvailableKeysResponse> call, Response<AvailableKeysResponse> response) {
                AvailableKeysResponse rr = response.body();
                availableKeysList = rr. getAvailableKeys();

            }

            @Override
            public void onFailure(Call<AvailableKeysResponse> call, Throwable t) {

            }
        });
    }


}
