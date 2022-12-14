import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerTest {

    @Test
    public void test() {
        FilmsManager manager = new FilmsManager(3);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");

        String[] actual = manager.findLast();
        String[] expected = {"Film8", "Film7", "Film6"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");
        manager.addFilm("Film9");
        manager.addFilm("Film10");
        manager.addFilm("Film11");

        String[] actual = manager.findAll();
        String[] expected = {"Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");

        String[] actual = manager.findAll();
        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        FilmsManager manager = new FilmsManager(15);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");


        String[] actual = manager.findLast();
        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        FilmsManager manager = new FilmsManager(7);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");


        String[] actual = manager.findLast();
        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2",};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        FilmsManager manager = new FilmsManager(8);
        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");
        manager.addFilm("Film7");
        manager.addFilm("Film8");


        String[] actual = manager.findLast();
        String[] expected = {"Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};

        assertArrayEquals(expected, actual);
    }
}
