package nyc.c4q.josiel.picassotest.backend;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("/cgi-bin/1_11_2017_exam.pl") // end point is after the first slash
    Call<AvailableKeysResponse> getAvailableKeys();
}
