grammar Alguma;

// Algoritmo
ALGORITMO: 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';

// Struct 
REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';

// Booleanos
FALSO: 'falso';
VERDADEIRO: 'verdadeiro';
NAO: 'nao';

// Manipulação de funções
FACA: 'faca';
FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
RETORNE: 'retorne';

// Entrada e saída
LEIA: 'leia';
ESCREVA: 'escreva';

// Tipos de variáveis
DECLARE: 'declare';
TIPO: 'tipo';
LITERAL: 'literal';
VAR: 'var';
LOGICO: 'logico';
INTEIRO: 'inteiro';
CONSTANTE: 'constante';
REAL: 'real';

// Condições
SE: 'se';
SENAO: 'senao';
FIM_SE: 'fim_se';
ENTAO: 'entao';
CASO: 'caso';
FIM_CASO: 'fim_caso';

// Laços de repetição
PARA: 'para';
FIM_PARA: 'fim_para';
ATE: 'ate';
SEJA: 'seja';
ENQUANTO: 'enquanto';
FIM_ENQUANTO: 'fim_enquanto';

// Operadores lógicos
E: 'e';
OU: 'ou';
IGUAL: '=';
DIFERENTE: '<>';
ATRIBUICAO: '<-';
MENOR: '<';
MAIOR: '>';
MENOR_IGUAL: '<=';
MAIOR_IGUAL: '>=';

// Operadores aritméticos
SOMA: '+';
MOD: '%';
SUBTRACAO: '-';
DIVISAO: '/';
MULTIPLICACAO: '*';
ENDERECO:'&';
PONT: '^';

// Números
// NUM_INT: ('0'..'9')+;
// NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

// Identificadores
IDENT: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// Cadeias
CADEIA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '"';
CADEIA_NAO_FECHADA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '\n';

// Simbolos
PONTO: '.';
INTERVALO: '..';
DOIS_PONTOS: ':';
ABREPAR: '(';
FECHAPAR: ')';
VIRGULA: ',';
ABRECOL: '[';
FECHACOL: ']';

// Comentários
COMENTARIO: '{' ~('\n' | '\r' | '}')* '}' -> skip;
COMENTARIO_NAO_FECHADO: '{' ~('}')* '\n';

// White-spaces
WS: (' ' | '\t' | '\r' | '\n') -> skip;


// CONTEÚDO DO SEGUNDO TRABALHO

TIPO_VAR 
	:	'INTEIRO' | 'REAL';

NUMINT
	:	('0'..'9')+
	;

NUMREAL
	:	('0'..'9')+ ('.' ('0'..'9')+)?
	;
	
VARIAVEL
	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	;

//CADEIA
//	:	'\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
//	;

//CADEIA_NAO_FECHADA: '"' ('\\"' | ~('"' | '\\' | '\n'))* '\n';
	
OP_ARIT1
	:	'+' | '-'
	;

OP_ARIT2
	:	'*' | '/'
	;

OP_REL
	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;

OP_BOOL	
	:	'E' | 'OU'
	;
	

ESC_SEQ
	:	'\\\'';

//COMENTARIO
//      :	'%' ~('\n'|'\r')* '\r'? '\n' {skip();}
//	;

//COMENTARIO_NAO_FECHADO: '{' ~('}')* '\n';

//WS 	:	( ' ' |'\t' | '\r' | '\n') {skip();}
//	;
	
programa
	:	 DECLARE listaDeclaracoes ':' 'ALGORITMO' listaComandos EOF
	;
	
listaDeclaracoes
	:	declaracao listaDeclaracoes | declaracao
	;
	
declaracao
	:	VARIAVEL ':' TIPO_VAR
	;
	
expressaoAritmetica
	:	expressaoAritmetica OP_ARIT1 termoAritmetico
	|	termoAritmetico
	;
	
termoAritmetico
	:	termoAritmetico OP_ARIT2 fatorAritmetico
	|	fatorAritmetico
	;
	
fatorAritmetico
	:	NUMINT
	|	NUMREAL
	|	VARIAVEL
	|	'(' expressaoAritmetica ')'
	;
	
expressaoRelacional
	:	expressaoRelacional OP_BOOL termoRelacional
	|	termoRelacional
	;
	
termoRelacional
	:	expressaoAritmetica OP_REL expressaoAritmetica
	|	'(' expressaoRelacional ')'
	;
	

listaComandos
	:	comando listaComandos
	|	comando
	;
	
comando
	:	comandoAtribuicao
	|	comandoEntrada
	|	comandoSaida
	|	comandoCondicao
	|	comandoRepeticao
	|	subAlgoritmo
	;
	
comandoAtribuicao
	:	'ATRIBUIR' expressaoAritmetica 'A' VARIAVEL
	;
	
comandoEntrada
	:	'LER' VARIAVEL
	;
comandoSaida
	:	'IMPRIMIR' (VARIAVEL | CADEIA)
	;
	
comandoCondicao
	:	'SE' expressaoRelacional 'ENTAO' comando
	|	'SE' expressaoRelacional 'ENTAO' comando 'SENAO' comando
	;
	
comandoRepeticao
	:	'ENQUANTO' expressaoRelacional comando
	;
subAlgoritmo
	: 'INICIO' listaComandos 'FIM'
	;

// Cadeia que não caiu em nenhuma classificação ("Coringa")
ERRO: .;


/*
programa : ':' 'DECLARACOES' listaDeclaracoes ':' 'ALGORITMO' listaComandos;
listaDeclaracoes : declaracao listaDeclaracoes | declaracao;
declaracao : VAR ':' tipoVar;
tipoVar : 'INTEIRO' | 'REAL';
expressaoAritmetica : expressaoAritmetica '+' termoAritmetico | expressaoAritmetica '-' termoAritmetico | termoAritmetico;
termoAritmetico : termoAritmetico '*' fatorAritmetico | termoAritmetico '/' fatorAritmetico | fatorAritmetico;
fatorAritmetico : NUM_INT | NUM_REAL | VAR | '(' expressaoAritmetica ')';
expressaoRelacional : expressaoRelacional operadorBooleano termoRelacional | termoRelacional;
termoRelacional : expressaoAritmetica (E | OU) expressaoAritmetica | '(' expressaoRelacional ')';
operadorBooleano : 'E' | 'OU';
listaComandos : comando listaComandos | comando;
comando : comandoAtribuicao | comandoEntrada | comandoSaida | comandoCondicao | comandoRepeticao | subAlgoritmo;
comandoAtribuicao : 'ATRIBUIR' expressaoAritmetica 'A' VAR;
comandoEntrada : 'LER' VAR;
comandoSaida : 'IMPRIMIR'  (VAR | CADEIA);
comandoCondicao : 'SE' expressaoRelacional 'ENTAO' comando | 'SE' expressaoRelacional 'ENTAO' comando 'SENAO' comando;
comandoRepeticao : 'ENQUANTO' expressaoRelacional comando;
subAlgoritmo : 'INICIO' listaComandos 'FIM';
*/
