package nyc.c4q.josiel.picassotest;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import nyc.c4q.josiel.picassotest.backend.APIService;
import nyc.c4q.josiel.picassotest.backend.AvailableKey;
import nyc.c4q.josiel.picassotest.backend.AvailableKeysResponse;
import nyc.c4q.josiel.picassotest.recyclerview.AvailableKeysAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class KeyPicFragment extends FragmentActivity {

    AvailableKeysAdapter availableKeysAdapter;
    List<AvailableKey> availableKeyList = new ArrayList<>();
    ImageView imageView;
    View keyView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_key);
//        ImageView iv = (ImageView) findViewById(R.id.image_view);

//        fetchAvailableKeys();

//        Picasso.with(getApplicationContext()).load().into(iv);

    }

//    private void fetchAvailableKeys() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://jsjrobotics.nyc/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        APIService service = retrofit.create(APIService.class);
//
//        Call<AvailableKeysResponse> call = service.getAvailableKeys();
//        call.enqueue(new Callback<AvailableKeysResponse>() {
//
//            @Override
//            public void onResponse(Call<AvailableKeysResponse> call, Response<AvailableKeysResponse> response) {
//                AvailableKeysResponse rr = response.body();
//                availableKeyList = rr.getAvailableKeys();
//
//                availableKeysAdapter = new AvailableKeysAdapter(availableKeyList);
////                recyclerView.setAdapter(availableKeysAdapter);
//            }
//
//            @Override
//            public void onFailure(Call<AvailableKeysResponse> call, Throwable t) {
//
//            }
//        });
//    }

}
