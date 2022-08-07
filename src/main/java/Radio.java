import java.util.concurrent.LinkedTransferQueue;

public class Radio {
    public int numberStation; // номер текущей радиостанции

    public int getNumberStation() { // получение номера радиостанции
        return numberStation;
    }

    public void setNumberStation(int newNumberStation) { // присвоение номера радиостанции
        if (newNumberStation < 0) {
            return;
        }
        if (newNumberStation > 9) {
            return;
        }
        numberStation = newNumberStation;
    }

    public int volumeLevel; // громкость звука

    public int getVolumeLevel() { // получение уровня громкости

        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) { // присвоение уровня громкости
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 10) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public int next() { // переключение радиостанции на уровень выше

        if (numberStation < 9) {
            numberStation = numberStation + 1;
            return numberStation;
        }
        numberStation = 0;
        return numberStation;
    }

    public int prev() { // переключение радиостанции на уровень ниже
        if (numberStation > 0) {
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
