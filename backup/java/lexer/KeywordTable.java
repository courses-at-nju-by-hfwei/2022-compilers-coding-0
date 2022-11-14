package dragon.lexer;

import java.util.HashMap;
import java.util.Map;

public final class KeywordTable {
    private final Map<String, Word> keywords = new HashMap<>();

    public KeywordTable() {
        this.reserve(Word.IF);
        this.reserve(Word.ELSE);
        this.reserve(Word.WHILE);
        this.reserve(Word.DO);
        this.reserve(Word.BREAK);
        this.reserve(Word.TRUE);
        this.reserve(Word.FALSE);
        this.reserve(Word.BOOL);
        this.reserve(Word.INT);
        this.reserve(Word.FLOAT);
        this.reserve(Word.CHAR);
    }

    private void reserve(Word word) {
        keywords.put(word.getText(), word);
    }

    public Word getKeyword(String str) {
        return keywords.get(str);
    }
}