package lexer;

/** <pre>
 *  The Token class records the information for a token:
 *  1. The Symbol that describes the characters in the token
 *  2. The starting column in the source file of the token and
 *  3. The ending column in the source file of the token
 *  </pre>
*/
public class Token {
  private int leftPosition,rightPosition,linenum;
  private Symbol symbol;

/**
 *  Create a new Token based on the given Symbol
 *  @param leftPosition is the source file column where the Token begins
 *  @param rightPosition is the source file column where the Token ends
 *  @param lineNumber is the line number where the Token can be found in the source
*/
  public Token(int leftPosition, int rightPosition, int lineNumber, Symbol sym) {
   this.leftPosition = leftPosition;
   this.rightPosition = rightPosition;
   this.linenum = lineNumber;
   this.symbol = sym;
  }

  public Symbol getSymbol() {
    return symbol;
  }

  public void print() {
    System.out.println("       " + symbol.toString() + 
                       "             left: " + leftPosition +
                       " right: " + rightPosition +
                        "line no.: " + linenum);
    return;
  }

  public String toString() {
    return symbol.toString();
  }

  public int getLeftPosition() {
    return leftPosition;
  }

  public int getRightPosition() {
    return rightPosition;
  }
  
  public int getLineNumber() {
      return linenum;
  }

/**
 *  @return the integer that represents the kind of symbol we have which
 *  is actually the type of token associated with the symbol
*/
  public Tokens getKind() {
    return symbol.getKind();
  }
}

