
/* 		OUTLINE OF OBJECT-ORIENTED PARSER FOR TINY PL */

public class Parser {
	static Program p;
	public static void main(String[] args)  {
		System.out.println("Enter program and terminate with 'end'!\n");
		Lexer.lex();
		p = new Program();
	}
}

class Program {
	public Program() {
		while (Lexer.nextToken == Token.KEY_INT) {
			Lexer.lex();
			SymTab.init();
			Code.init();
			Function f = new Function();
			Code.output(f);
		}
	}
}

// fill in the details of the following classes

class Function {
}

class Pars {
}

class Body {
}

class Decls {
}

class Idlist {
}
		
class Stmts {
}

class Stmt {
} 

class Assign {
}

class Cond {
}

class Loop {
}

class Cmpd {
}

class Return {
}

class Rexpr {
}

class Expr {
}

class Term { 
}

class Factor { 
}

class ExprList {
}

class SymTab {
}

class Code {   
}


    
