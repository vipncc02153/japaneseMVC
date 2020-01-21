package per.hpy.word;

import org.springframework.stereotype.Repository;

@Repository
public interface WordMapper {

    Kanji createKanji(Kanji kanji);

    Kanji getKanjiById(Long id);

}
