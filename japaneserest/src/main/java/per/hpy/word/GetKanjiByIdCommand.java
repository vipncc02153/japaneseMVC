package per.hpy.word;

import per.hpy.utils.StringHelper;

public class GetKanjiByIdCommand {
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return StringHelper.toJsonString(this);
    }
}
