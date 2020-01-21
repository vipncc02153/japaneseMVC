package per.hpy.word;


import org.elasticsearch.common.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import per.hpy.utils.ConvertHelper;

@Component
public class WordServiceImpl implements WordService {

    @Autowired
    WordMapper wordMapper;

    @Override
    public String createWord(CreateWordCommand cmd) {
        if(StringUtils.isNotBlank(cmd.getWord())){
            return cmd.getWord();
        }else{
            return "error";
        }
    }

    @Override
    public KanjiDTO getKanjiById(GetKanjiByIdCommand cmd) {
        return ConvertHelper.convert(wordMapper.getKanjiById(cmd.getId()), KanjiDTO.class);
    }
}
