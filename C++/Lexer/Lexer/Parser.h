#pragma once
#include "Token.h"
#include "Lexer.h"
#include "Node.h"
#include <list>
#include "Token.h"
#include <vector>
#include <deque>

class Parser {

public:

	std::vector<std::deque<Token> > list;

	std::string filename;
	std::deque<Token> tokens;


	void newLine();

	Parser(std::string filename);

	void grabLineCode(Token tok);


	void foudnEND();

	void foundWHILE();

	void foundDO();

	void foundTHEN();

	void foundCOMMA();

	void foundEQ();

	bool ScanQUEUE(Token var, std::deque<Token> deq);

	void foundIF();
	
	void foundSM();
	
	void foundDIV();
	
	void foundSUB();
	
	void foundMUL();
	void printT(std::vector<Token> h);

};
