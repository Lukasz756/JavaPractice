import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KarlsLanguages {
    private String[] languages = new String[0];

    public boolean isEmpty() {
        if (languages.length == 0) {
            return true;
        } else {
            return false;

        }
    }

    public void addLanguage(String language) {
        int i = 0;
        String[] tempString = new String[this.languages.length + 1];
        for (String str : languages) {
            tempString[i] = languages[i];
            i++;
        }
        tempString[tempString.length - 1] = language;
        this.languages = tempString;
    }

    public void removeLanguage(String language) {
        int i = 0;
        for (String str : languages) {
            if (str == language) {
                languages[i] = null;
            } else {
                i++;
            }
        }
    }

    public String firstLanguage() {
        int i = 0;
        String firstLang = "";
        for (String str : languages) {
            if (languages[i] != null) {
                firstLang = languages[i];
            } else {
                i++;
            }
            if (i >= languages.length - 1) {
                firstLang = "No languages!";
            }
        }
        return firstLang;
    }

    public int count() {
        int counter = 0;
        for (String str : languages) {
            if (str != null) {
                counter++;
            }
        }
        return counter;
    }

    public boolean containsLanguage(String language) {
        int i = 0;
        boolean isLanguageThere = false;
        for (String str : languages) {
            if (str == language) {
                isLanguageThere = true;
            } else {
                i++;
            }
        }
        return isLanguageThere;
    }

    @Override
    public String toString() {
        return "KarlsLanguages{" +
                "languages=" + Arrays.toString(languages) +
                '}';
    }
}
