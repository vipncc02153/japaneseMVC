package per.hpy.japaneserest.word;

import com.google.gson.Gson;

public class CreateWordCommand {

    String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
