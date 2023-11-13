package Lab_10.exercise3;

public class Thermometer {
    private int CurrentTemperature;
    private int MaximumTemperature;
    private int MinimumTemperature;

    public Thermometer(){
        setCurrentTemperature(0);
        setMaximumTemperature(Integer.MAX_VALUE);
        setMinimumTemperature(Integer.MIN_VALUE);
    }

    public Thermometer(int CurrentTemperature){

        setMinimumTemperature(CurrentTemperature);
        setMaximumTemperature(CurrentTemperature);
        setMinimumTemperature(CurrentTemperature);
    }

    public int getCurrentTemperature() {
        return CurrentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        CurrentTemperature = currentTemperature;
    }

    public int getMaximumTemperature() {
        return MaximumTemperature;
    }

    public void setMaximumTemperature(int maximumTemperature) {
        MaximumTemperature = maximumTemperature;
    }

    public int getMinimumTemperature() {
        return MinimumTemperature;
    }

    public void setMinimumTemperature(int minimumTemperature) {
        MinimumTemperature = minimumTemperature;
    }

    private void updateMaxMinTemp(){
        if (CurrentTemperature > MaximumTemperature)
            setMaximumTemperature(CurrentTemperature);

        if (CurrentTemperature < MinimumTemperature)
            setMinimumTemperature(CurrentTemperature);

    }

    @Override
    public String toString() {
        return  "Current temperature " + getCurrentTemperature() +
                "Maximum Temperature " + getMaximumTemperature() +
                "Minimum Temperature " + getMinimumTemperature();
    }
}
