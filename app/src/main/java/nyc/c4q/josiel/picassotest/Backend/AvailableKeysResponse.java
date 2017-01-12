package nyc.c4q.josiel.picassotest.Backend;

import java.util.List;

public class AvailableKeysResponse {

    private List<AvailableKeys> availableKeys;

    private String success;

    public List<AvailableKeys> getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(List<AvailableKeys> availableKeys) {
        this.availableKeys = availableKeys;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ClassPojo [available keys = " + availableKeys + ", success = " + success + "]";
    }
}
