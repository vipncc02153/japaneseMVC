package per.hpy.japaneseapi.word;

import per.hpy.japaneserest.word.CreateWordCommand;

public interface WordService {
    String createWord(CreateWordCommand cmd);
}
