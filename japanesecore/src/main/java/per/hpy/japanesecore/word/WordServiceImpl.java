package per.hpy.japanesecore.word;


import org.elasticsearch.common.lang3.StringUtils;
import org.springframework.stereotype.Component;
import per.hpy.japaneseapi.word.WordService;
import per.hpy.japaneserest.word.CreateWordCommand;

@Component
public class WordServiceImpl implements WordService {
    @Override
    public String createWord(CreateWordCommand cmd) {
        if(StringUtils.isNotBlank(cmd.getWord())){
            return cmd.getWord();
        }else{
            return "error";
        }

    }
}
