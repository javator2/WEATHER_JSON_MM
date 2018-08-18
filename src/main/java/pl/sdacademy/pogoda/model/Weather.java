package pl.sdacademy.pogoda.model;

public class Weather {

    private String city;
    private String iconUrl;
    private double temperature;
    private double feelsLikeC;
    private String conditionText;
    private double latitude;
    private double longitude;

    public Weather() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public String getConditionText() {
        return conditionText;
    }

    public void setConditionText(String conditionText) {
        this.conditionText = conditionText;
    }

    @Override
    public String toString() {
        return "In "
                + city
                + "(longitude: "
                + longitude
                + ", latitude: "
                + latitude
                + ") \ntemperature is "
                + temperature
                + " degrees, it is "
                + conditionText.toLowerCase()
                + " and feels like "
                + feelsLikeC
                + " today.";
    }
}
