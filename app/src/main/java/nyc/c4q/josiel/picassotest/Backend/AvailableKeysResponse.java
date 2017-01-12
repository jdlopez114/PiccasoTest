package nyc.c4q.josiel.picassotest.backend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AvailableKeysResponse {

//    private List<AvailableKey> availableKeys = null;
//    private String success;
//
//    public List<AvailableKey> getAvailableKeys() {
//        return availableKeys;
//    }
//
//    public void setAvailableKeys(List<AvailableKey> availableKeys) {
//        this.availableKeys = availableKeys;
//    }
//
//    public String getSuccess() {
//        return success;
//    }
//
//    public void setSuccess(String success) {
//        this.success = success;
//    }


    @SerializedName("success")
    @Expose
    private boolean success;
    @SerializedName("available keys")
    @Expose
    private List<AvailableKey> availableKeys = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<AvailableKey> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<AvailableKey> availableKeys) {
        this.availableKeys = availableKeys;
    }

}
