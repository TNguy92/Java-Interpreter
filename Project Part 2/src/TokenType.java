/**
 * The Enumeration Represents types of tokens in subset of Java language
 */
public enum TokenType
{
    //is a type of literal for an integer whose value is directly represented in source code. For example,
    // in the assignment statement x = 1,
    // the string 1 is an integer literal indicating the value 1, while in the statement x = 0x10 the string 0x10 is an integer literal indicating the value 16,
    // which is represented by 10 in hexadecimal
    LITERAL_INTEGER_TOK,

    //End of Sentence Token
    EOS_TOK,

    //Assign Token
    ASSIGN_TOK,

    //Divide Token
    DIV_TOK,
    //Multiply Token

    MUL_TOK,
    //Subtract Token
    SUB_TOK,

    //Add Token
    ADD_TOK,

    // <>
    NE_TOK,

    // =
    EQ_TOK,

    // <
    LT_TOK,

    // <=
    LE_TOK,

    UNTIL_TOK,

    REPEAT_TOK,

    // >
    GT_TOK,

    // >=
    GE_TOK,

    PRINT_TOK,

    //pointer to table entry
    ID_TOK,

    DO_TOK,

    WHILE_TOK,

    ELSE_TOK,

    END_TOK,

    THEN_TOK,

    IF_TOK,

    // )
    RIGHT_PAREN_TOK,

    // (
    LEFT_PAREN_TOK,

    FUNCTION_TOK,

}
