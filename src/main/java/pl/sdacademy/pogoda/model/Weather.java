package pl.sdacademy.pogoda.model;

public class Weather {

    private String city;
    private String iocnUrl;
    private double temperature;
    private double feelsLikeC;
    private String conditionText;

    public Weather() {


    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIocnUrl() {
        return iocnUrl;
    }

    public void setIocnUrl(String iocnUrl) {
        this.iocnUrl = iocnUrl;
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
                + " temperature is "
                + temperature
                + " degrees, it is "
                + conditionText.toLowerCase()
                + " and feels like "
                + feelsLikeC
                + " today.";
    }
}
