import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTests {
    Radio radio = new Radio();

    @Test
    public void zeroCountStation(){
        radio.setCountStation(0);

        int expected = 10;
        int actual = radio.getCountStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNumberStation() {
        radio.setCountStation(100);

        int expected = 99;
        int actual = radio.getCountStation() - 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void defaultMaxNumberStation() {
        int expected = 9;
        int actual = radio.getCountStation() - 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        radio.setNumberStation(10);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMax() {
        radio.setNumberStation(9);

        int expected = 0;
        int actual = radio.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationIncrease() {
        radio.setNumberStation(0);

        int expected = 1;
        int actual = radio.next();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMin() {
        radio.setNumberStation(0);

        int expected = 9;
        int actual = radio.prev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationDecrease() {
        radio.setNumberStation(9);

        int expected = 8;
        int actual = radio.prev();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        radio.setVolumeLevel(101);

        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void shouldNotSetVolumeBelowMin() {
            radio.setVolumeLevel(-1);

            int expected = 0;
            int actual = radio.getVolumeLevel();
            Assertions.assertEquals(expected, actual);
        }

    @Test
    public void nextVolumeLevelMax() {
        radio.setVolumeLevel(10);

        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeLevelIncrease() {
        radio.setVolumeLevel(0);

        int expected = 1;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLevelMin() {
        radio.setNumberStation(0);

        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLevelDecrease() {
        radio.setVolumeLevel(10);

        int expected = 9;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}

