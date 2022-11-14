package dragon.lexer;

public abstract class Lexer {
  public static final char EOF = (char) -1;

  private final String input;
  protected char peek;
  private int pos;

  public Lexer(String input) {
    this.input = input;
    this.pos = 0;
    this.peek = input.charAt(pos);
  }

  public abstract Token nextToken();

  public abstract String getTokenName(int tokenType);

  public void consume() {
    this.pos++;
    if (this.pos >= this.input.length()) {
      this.peek = EOF;
    } else {
      this.peek = input.charAt(this.pos);
    }
  }

  public boolean nextMatch(char expected) {
    consume();
    return peek == expected;
  }
}