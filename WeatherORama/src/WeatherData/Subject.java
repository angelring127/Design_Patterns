package WeatherData;

public interface Subject {
	abstract void registerObserver();
	abstract void removeObserver();
	abstract void notifyObserver();
}
