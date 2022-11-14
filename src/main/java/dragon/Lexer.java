package dragon;

public abstract class Lexer {
  public static final char EOF = (char) -1;

  private final String input;
  char peek;
  int pos;

  public Lexer(String input) {
    this.input = input;
    this.pos = 0;
    this.peek = input.charAt(pos);
  }

  public abstract Token nextToken();

  public void reset(int pos) {
    this.pos = pos;
    this.peek = input.charAt(pos);
  }

  public void consume() {
    this.pos++;
    if (this.pos >= this.input.length()) {
      this.peek = EOF;
    } else {
      this.peek = input.charAt(this.pos);
    }
  }
}