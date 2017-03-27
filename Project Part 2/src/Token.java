/**
 * The Token Class represents the token (lexeme). A token is a string of characters,
 * categorized according to the rules as a symbol.
 *
 * Example: <i> Identifier, Comma, DoubleConstant</i>
 */
public class Token
{
    private TokenType tokType;
    private String lexeme;
    private int rowNum;
    private int colNum;

    public Token(TokenType tokType, String lexeme, int rowNum, int colNum)
    {
        //Check if token type is there
        if (tokType == null)
        {
            throw new IllegalArgumentException("TokenType argument is null");
        }
        //It is there but needs to check the rows and columns are there
        else if (lexeme != null && lexeme.length() != 0)
        {
            if (rowNum <= 0)
            {
                throw new IllegalArgumentException("Row Number is less than 0: Invalid");
            }

            else if (colNum <= 0)
            {
                throw new IllegalArgumentException("Column number is less than 0: Invalid");
            }

            else
            {
                //Good to go, return the values
                this.tokType = tokType;
                this.lexeme = lexeme;
                this.rowNum = rowNum;
                this.colNum = colNum;
            }
        }
        else
        {
            throw new IllegalArgumentException("Lexeme is invalid");
        }
    }
    //
    public TokenType getTokType()
    {
        return this.tokType;
    }
    public String getLexeme()
    {
        return this.lexeme;
    }
    public int getRowNum()
    {
        return this.rowNum;
    }
    public int getColNum()
    {
        return this.colNum;
    }
}
