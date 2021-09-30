package streams_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Film {
    private String title;
    private int duration;
    private double imdbRate;
    private String genre;
    private List<String> searchKeywords;

    public Film(String title, int duration, double imdbRate, String genre, List<String> searchKeywords) {
        this.title = title;
        this.duration = duration;
        this.imdbRate = imdbRate;
        this.genre = genre;
        this.searchKeywords = searchKeywords;
    }

    public String getTitle() {
        return title;
    }

    @SuppressWarnings("unused")
    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    @SuppressWarnings("unused")
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    @SuppressWarnings("unused")
    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public String getGenre() {
        return genre;
    }

    @SuppressWarnings("unused")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getSearchKeywords() {
        return searchKeywords;
    }

    @SuppressWarnings("unused")
    public void setSearchKeywords(List<String> searchKeywords) {
        this.searchKeywords = searchKeywords;
    }
}

class FilmProcessing {
    public static void main(String[] args) {
        Film film1 = new Film("Three Amigos!", 104, 6.5, "western", List.of("comedy", "Western", "Family", "Funny"));
        Film film2 = new Film("Alosza Popowicz i waz Tugaryn", 79, 7.2, "animation", List.of("comedy", "hero", "speaking horse", "family"));
        Film film3 = new Film("Limitless", 105, 7.4, "thriller", List.of("intelligence", "drugs", "rapid learning", "experiment"));
        Film film4 = new Film("Free Guy", 115, 7.4, "action", List.of("adventure", "comedy", "gun", "vr"));
        Film film5 = new Film("No Time to Die", 163, 8.0, "action", List.of("adventure", "thriller", "gun", "agent"));
        Film film6 = new Film("Delicious", 112, 7.0, "comedy", List.of("servant", "cooking", "chef", "one word title"));
        Film film7 = new Film("Black Box", 129, 7.4, "thriller", List.of("drama", "mystery", "mission", "airplane"));
        Film film8 = new Film("Dear Mother", 98, 6.3, "comedy", List.of("male nudity", "polaroid", "paranormal", "guru"));
        Film film9 = new Film("The Summit of the Gods", 90, 7.7, "animation", List.of("adventure", "mountains", "drama", "missing"));
        Film film10 = new Film("Tralala", 120, 6.4, "musical", List.of("smth", "idn", "moresmth", "nothing"));
        Film film11 = new Film("Red Rocket", 128, 7.0, "comedy", List.of("comedy", "drama", "texas", "star"));
        Film film12 = new Film("Drive My Car", 179, 7.7, "drama", List.of("asian", "husband", "widower", "japanese"));
        Film film13 = new Film("Titane", 108, 6.7, "drama", List.of("sci-fi", "thriller", "mind", "crime"));
        Film film14 = new Film("Benedetta", 131, 6.6, "drama", List.of("history", "biography", "nun", "love"));
        Film film15 = new Film("Bergman Island", 112, 6.6, "drama", List.of("nudity", "island", "wild", "fiction"));

        List<Film> list = new ArrayList<>(Arrays.asList(film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12, film13, film14, film15));
        List<Film> res = list.stream()
                .filter(f -> f.getDuration() > 120)
                .collect(Collectors.toList());
        System.out.println("\n==========================================\n");
        res.forEach(n -> System.out.println(n.getTitle()));

        System.out.println("\n==========================================\n");
        list.forEach(n -> System.out.println(n.getTitle().toUpperCase()));

        res = list.stream()
                .filter(f -> f.getGenre().equals("comedy") && f.getImdbRate() < 7.0)
                .collect(Collectors.toList());
        System.out.println("\n==========================================\n");
        res.forEach(n -> System.out.println(n.getTitle()));

        System.out.println("\n==========================================\n");

        Film f = list
                .stream()
                .filter(n -> n.getGenre().equals("comedy"))
                .findFirst()
                .orElse(null);
        assert f != null;
        System.out.println(f.getTitle());


        res = list.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate)
                        .reversed())
                .collect(Collectors.toList());
        System.out.println("\n==========================================\n");
        res.forEach(x -> System.out.println(x.getTitle()));


        System.out.println("\n==========================================\n");
        res = list.stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate)
                        .reversed()).limit(3)
                .collect(Collectors.toList());
        res.forEach(x -> System.out.println(x.getTitle()));


        System.out.println("\n==========================================\n");
        System.out.println("total duration: " + list.stream().mapToInt(Film::getDuration).sum());


        System.out.println("\n==========================================\n");
        System.out.println((list.stream()
                .max(Comparator.comparing(Film::getDuration)))
                .get()
                .getTitle());


        System.out.println("\n==========================================\n");
        System.out.println(list
                .stream()
                .anyMatch(x -> x.getSearchKeywords()
                        .contains("comedy")));


        System.out.println("\n==========================================\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String value = sc.next();
        res = list.stream().filter(x -> x.getSearchKeywords().contains(value)).collect(Collectors.toList());
        res.forEach(x -> System.out.println(x.getTitle()));
    }
}
/*
Return list of films with a common search keyword
For your custom film field from 2.f create 3 queries (filter, findAny/First, map, etc…)
* */
