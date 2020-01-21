package per.hpy.word;

import com.google.gson.Gson;
import per.hpy.utils.StringHelper;

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
        return StringHelper.toJsonString(this);
    }
}
