package util;

public class AuthorNameNormalizer {
    private String[] parts;

    public String normalize(String name) {
        parts = name.split(" ");
        if (isMononym())
            return formatMononym();
        return formatDuonym();
    }

    private String formatMononym() {
        return first();
    }

    private String formatDuonym() {
        return last() + ", "+ first();
    }

    private String last() {
        return parts[1];
    }

    private String first() {
        return parts[0];
    }

    private boolean isMononym() {
        return parts.length == 1;
    }

    // this might be useful...
//    long count(String string, char c) {
//        return string.chars().filter(ch -> ch == c).count();
//    }
}

