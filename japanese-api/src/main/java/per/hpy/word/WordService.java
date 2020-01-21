package per.hpy.word;

public interface WordService {

    String createWord(CreateWordCommand cmd);

    KanjiDTO getKanjiById(GetKanjiByIdCommand cmd);
}
