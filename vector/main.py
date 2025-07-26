from parser import parser
import lexer

entrada = '''Vector[int] vec(3,3,4) = [
  [ [ 1,  2,  3,  4.5],   [ 5,  6,  7,  8],   [ 9, 10, 11, 12] ],
  [ [13, 14, 15, 16],   [17, 18, 19, 20]],
  [   [29, 30, 31, 32],   [33, 34, 35, 36] ]
];




'''

resultado = parser.parse(entrada)
print("Resultado :")
print(resultado[0][0][3])
