package nyc.c4q.josiel.picassotest.Backend;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Josiel on 1/11/17.
 */

public interface APIService {

    @GET("/cgi-bin/1_11_2017_exam.pl") // end point is after the first slash
    Call<AvailableKeysResponse> getAvailableKeys();
}
