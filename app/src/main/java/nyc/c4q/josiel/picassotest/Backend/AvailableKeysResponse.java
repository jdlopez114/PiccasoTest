package nyc.c4q.josiel.picassotest.Backend;

public class AvailableKeysResponse {

    private AvailableKeys[] availableKeys;

    private String success;

    public AvailableKeys[] getAvailableKeys() {
        return availableKeys;
    }

    public void setAvailableKeys(AvailableKeys[] availableKeys) {
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
