import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTests {

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();

        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expected = 0;
        int actual = radio.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationIncrease() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 1;
        int actual = radio.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 9;
        int actual = radio.prev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationDecrease() {
        Radio radio = new Radio();

        radio.setNumberStation(9);

        int expected = 8;
        int actual = radio.prev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolumeLevel(11);

        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void shouldNotSetVolumeBelowMin() {
            Radio radio = new Radio();

            radio.setVolumeLevel(-1);

            int expected = 0;
            int actual = radio.getVolumeLevel();
            Assertions.assertEquals(expected, actual);
        }

    @Test
    public void nextVolumeLevelMax() {
        Radio radio = new Radio();

        radio.setVolumeLevel(10);

        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeLevelIncrease() {
        Radio radio = new Radio();

        radio.setVolumeLevel(0);

        int expected = 1;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLevelMin() {
        Radio radio = new Radio();

        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLevelDecrease() {
        Radio radio = new Radio();

        radio.setVolumeLevel(10);

        int expected = 9;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}

