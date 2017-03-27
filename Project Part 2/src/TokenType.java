/**
 * The Enumeration Represents types of tokens in subset of Java language
 */
public enum TokenType
{
    //is a type of literal for an integer whose value is directly represented in source code. For example,
    // in the assignment statement x = 1,
    // the string 1 is an integer literal indicating the value 1, while in the statement x = 0x10 the string 0x10 is an integer literal indicating the value 16,
    // which is represented by 10 in hexadecimal
    LITERAL_INTEGER_TOKEN,

    //{
    LB_TOKEN,
    //}
    RB_TOKEN,

    // ;
    SC_TOKEN,

    //End of Sentence Token
    EOS_TOKEN,

    //Assign Token
    ASSIGN_TOKEN,

    //Divide Token
    DIV_TOKEN,
    //Multiply Token

    MUL_TOKEN,
    //Subtract Token
    SUB_TOKEN,

    //Add Token
    ADD_TOKEN,

    // ~=
    NE_TOKEN,

    // =
    EQ_TOKEN,

    // <
    LT_TOKEN,

    // <=
    LE_TOKEN,

    UNTIL_TOKEN,

    REPEAT_TOKEN,

    // >
    GT_TOKEN,

    // >=
    GE_TOKEN,

    PRINT_TOKEN,

    //pointer to table entry
    ID_TOKEN,

    DO_TOKEN,

    WHILE_TOKEN,

    ELSE_TOKEN,

    END_TOKEN,

    THEN_TOKEN,

    IF_TOKEN,

    // )
    RIGHT_PAREN_TOKEN,

    // (
    LEFT_PAREN_TOKEN,

    FUNCTION_TOKEN,

}
