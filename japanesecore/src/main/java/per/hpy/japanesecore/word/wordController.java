package per.hpy.japanesecore.word;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.hpy.japaneseapi.word.WordService;
import per.hpy.japaneserest.word.CreateWordCommand;
import per.hpy.rest.ErrorCodes;
import per.hpy.rest.RestResponse;

import javax.validation.Valid;

@RestController
@RequestMapping("/word")
public class wordController {
    private static final Logger LOGGER = LoggerFactory.getLogger(wordController.class);

    @Autowired
    WordService wordService;


    /**
     * <b>URL: /word/createWord</b>
     * <p>创建新单词</p>
     */
    @RequestMapping("createWord")
    public RestResponse createWord(@Valid CreateWordCommand cmd) {
        String word = wordService.createWord(cmd);
        RestResponse response = new RestResponse(word);
        response.setErrorCode(ErrorCodes.SUCCESS);
        response.setErrorDescription("OK");
        return response;
    }

}
