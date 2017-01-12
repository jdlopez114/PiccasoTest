package nyc.c4q.josiel.picassotest.Backend;

public class AvailableKeys {
    private String textColor;

    private String name;

    private String url;

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassPojo [textColor = " + textColor + ", name = " + name + ", url = " + url + "]";
    }
}
