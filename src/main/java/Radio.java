import java.util.concurrent.LinkedTransferQueue;

public class Radio {
    public int numberStation; // номер текущей радиостанции
    public int countStation = 10;
    public int minNumberStation = 0;
    public int maxNumberStation = minNumberStation + countStation - 1;

    public int getCountStation () {
        return countStation;
    }

    public void setCountStation(int countStation) {
        if (countStation > 0) {
            this.countStation = countStation;
        }
    }
    public int getNumberStation() { // получение номера радиостанции
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) { // присвоение номера радиостанции
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > maxNumberStation) {
            return;
        }
        numberStation = newNumberStation;
    }

    public int volumeLevel; // громкость звука
    public int minVolumeLevel = 0; // минимальная громкость
    public int maxVolumeLevel = 100; // максимальная громкость

    public int getVolumeLevel() { // получение уровня громкости

        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) { // присвоение уровня громкости
        if (newVolumeLevel < minVolumeLevel) {
            return;
        }
        if (newVolumeLevel > maxVolumeLevel) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public int next() { // переключение радиостанции на уровень выше

        if (numberStation < maxNumberStation) {
            numberStation = numberStation + 1;
            return numberStation;
        }
        numberStation = 0;
        return numberStation;
    }

    public int prev() { // переключение радиостанции на уровень ниже
        if (numberStation > minNumberStation) {
            numberStation = numberStation - 1;
            return numberStation;
        }
        numberStation = 9;
        return numberStation;
    }


    public int increaseVolume() { // увеличение уровня громкости
        if (volumeLevel < 10) {
            volumeLevel = volumeLevel + 1;
        }
        return volumeLevel;
    }

    public int decreaseVolume() { // понижение уровня громкости
        if (volumeLevel > 0) {
            volumeLevel = volumeLevel - 1;
        }
        return volumeLevel;
    }
}
