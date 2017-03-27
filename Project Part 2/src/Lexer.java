/**
 * This Scanner class represnets the lexical analyzer for subset of Java language
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexer
{
    //List of tokens as they appear in the input source
    private List<Token> tokenList;

    //Source code to be scanned
    //The lineNumber will be the index from which to start the scanning
    public Lexer(String source) throws FileNotFoundException
    {
        if(source == null)
        {
            throw new IllegalArgumentException("Source is null");
        }
        else
        {
            this.tokenList = new ArrayList();
            Scanner input = new Scanner(new File(source));
            int lineNumber = 0;

            //Read the input line by line
            while(input.hasNext())
            {
                String line = input.nextLine();
                ++lineNumber;
                //Will process line by line to make sure there is a token type and throws an IllegalArgumentException if it isnt there
                this.processLine(line, lineNumber);
            }

            input.close();
            this.tokenList.add(new Token(TokenType.EOS_TOK, "EOS", lineNumber, 1));
        }
    }
    //Does the real processing work to read line by line
    private void processLine(String line, int lineNumber)
    {
        if(line == null)
        {
            throw new IllegalArgumentException("Line is null: Invalid");
        }
        else if(lineNumber <= 0)
        {
            throw new IllegalArgumentException("Line Number is less than 0: Invalid");
        }
        else
        {
            for(int i = this.skipWhiteSpace(line, 0); i < line.length(); i = this.skipWhiteSpace(line, i))
            {
                String lexeme = this.getLexeme(line, i);
                TokenType tokenType = this.getTokenType(lexeme, lineNumber, i + 1);
                this.tokenList.add(new Token(tokenType, lexeme, lineNumber, i + 1));
                i += lexeme.length();
            }
        }
    }

    //Get the index of next non-whitespace
    private int skipWhiteSpace(String line, int i)
    {

        while ( i < line.length() && Character.isWhitespace(line.charAt(i)))
        {
            ++i;
        }
        return i;
    }

    //Get the Lexeme
    private String getLexeme(String line, int i)
    {
        if(line == null)
        {
            throw new IllegalArgumentException("Line is null: Invalid");
        }
        else if(i < 0)
        {
            throw new IllegalArgumentException("Index is less than 0: Invalid");
        }
        else
        {
            int index;
            //Go thr
            for (index = i; index < line.length() && !Character.isWhitespace(line.charAt(i)); ++i )
            {
                ;
            }
            return line.substring(i, index);
        }
    }

    private TokenType getTokenType(String lexeme, int colNum, int rowNum)
        if()

}
