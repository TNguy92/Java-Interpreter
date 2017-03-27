/**
 * This Scanner class represemts the lexical analyzer for subset of Java language
 *
 * CS4380 W01
 Concepts of Programming Languages
 Professor: Jose M Garrido
 Students: Juan E. Tenorio Arzola, Thomas Nguyen, Andrew Shatz
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexer {
    //List of tokens as they appear in the input source
    private List<Token> tokenList;

    //Source code to be scanned
    //The lineNumber will be the index from which to start the scanning
    public Lexer(String source) throws FileNotFoundException {
        this.tokenList = new ArrayList();
        Scanner input = new Scanner(new File(source));
        int lineNumber = 0;

        //Read the input line by line
        while (input.hasNext()) {
            String line = input.nextLine();
            ++lineNumber;
            //Will process line by line to make sure there is a token type and throws an IllegalArgumentException if it isnt there
            this.processLine(line, lineNumber);
        }

        input.close();
        this.tokenList.add(new Token(TokenType.EOS_TOKEN, "EOS", lineNumber, 1));
    }

    //Does the real processing work to read line by line
    private void processLine(String line, int lineNumber) {
        if (line == null || lineNumber <= 0) {
            throw new IllegalArgumentException("Line is null or Line Number is less than 0: Invalid");
        } else {
            for (int i = this.skipSpace(line, 0); i < line.length(); i = this.skipSpace(line, i)) {
                String lexeme = this.getLexeme(line, i);
                TokenType tokenType = this.getTokenType(lexeme);
                this.tokenList.add(new Token(tokenType, lexeme, lineNumber, i + 1));
                i += lexeme.length();
            }
        }
    }

    //Get the index of next non-whitespace
    private int skipSpace(String line, int i) {

        while (i < line.length() && Character.isWhitespace(line.charAt(i))) {
            ++i;
        }
        return i;
    }

    //Get the Lexeme
    private String getLexeme(String line, int i) {
        if (line == null || i < 0) {
            throw new IllegalArgumentException("Line is null or Index is less than 0: Invalid");
        } else {
            int index;
            //Go through each index of the length of the line and make sure it is a char then increment
            for (index = i; index < line.length() && !Character.isWhitespace(line.charAt(i)); ++i) {
                ;
            }
            return line.substring(i, index);
        }
    }

    private TokenType getTokenType(String lexeme)
    {
        int state = 1;
        TokenType tokType = TokenType.EOS_TOKEN;
        if (lexeme != null && lexeme.length() != 0)
        {

            switch(state)
            {
                case 1:
                        if(Character.isDigit(lexeme.charAt(0)))
                        {
                            tokType = TokenType.LITERAL_INTEGER_TOKEN;
                            state = 2;
                        }
                case 2:
                        if (Character.isLetter(lexeme.charAt(0)))
                        {
                            for (int i = 0; i < lexeme.length(); )
                            {
                                char currentCharacter = lexeme.charAt(i);
                                //Looking for single tokens
                                switch (currentCharacter)
                                {
                                    case '/':
                                        tokType = TokenType.DIV_TOKEN;
                                        i++;
                                        break;
                                    case '*':
                                        tokType = TokenType.MUL_TOKEN;
                                        i++;
                                        break;
                                    case '+':
                                        tokType = TokenType.ADD_TOKEN;
                                        i++;
                                        break;
                                    case '-':
                                        tokType = TokenType.SUB_TOKEN;
                                        i++;
                                        break;
                                    case '=':
                                        tokType = TokenType.EQ_TOKEN;
                                        i++;
                                        break;
                                    case '(':
                                        tokType = TokenType.LEFT_PAREN_TOKEN;
                                        i++;
                                        break;
                                    case ')':
                                        tokType = TokenType.RIGHT_PAREN_TOKEN;
                                        i++;
                                        break;
                                    case '<':
                                        tokType = TokenType.LT_TOKEN;
                                        i++;
                                        break;
                                    case '>':
                                        tokType = TokenType.GT_TOKEN;
                                        i++;
                                        break;
                                    case '{':
                                        tokType = TokenType.LB_TOKEN;
                                        i++;
                                        break;
                                    case '}':
                                        tokType = TokenType.RB_TOKEN;
                                        i++;
                                        break;
                                    case ';':
                                        tokType = TokenType.SC_TOKEN;
                                        i++;
                                        break;
                                    default:
                                        state = 3;
                                        continue;
                                }
                            }
                        }
                case 3:
                        for (int i = 0; i < lexeme.length();)
                        {
                            if (lexeme.length() == 1)
                            {
                                tokType = TokenType.ID_TOKEN;
                                state = 4;
                                continue;
                            }
                        }
                case 4:
                        if(lexeme.equals("if"))
                        {
                            tokType = TokenType.IF_TOKEN;
                        }
                        else if(lexeme.equals("function"))
                        {
                            tokType = TokenType.FUNCTION_TOKEN;
                        }
                        else if(lexeme.equals("then")) {
                            tokType = TokenType.THEN_TOKEN;
                        }
                        else if(lexeme.equals("end"))
                        {
                            tokType = TokenType.END_TOKEN;
                        }
                        else if(lexeme.equals("else"))
                        {
                            tokType = TokenType.ELSE_TOKEN;
                        }
                        else if(lexeme.equals("while"))
                        {
                            tokType = TokenType.WHILE_TOKEN;
                        }
                        else if(lexeme.equals("do"))
                        {
                            tokType = TokenType.DO_TOKEN;
                        }
                        else if(lexeme.equals("print"))
                        {
                            tokType = TokenType.PRINT_TOKEN;
                        }
                        else if(lexeme.equals("repeat"))
                        {
                            tokType = TokenType.REPEAT_TOKEN;
                        }
                        else
                        {
                            tokType = TokenType.UNTIL_TOKEN;
                        }

            }
        }
        return tokType;
    }

}
