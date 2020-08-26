# Tipos Primitivos

É necessário para que variaveis armazenem apenas um tipo de dados, assim otimizando a utilização da memória.

## Tipo Boolean

Armazena apenas dois valores, true or false. 

## Tipos Numéricos Inteiros

Quanto maior o a quantidade de bits maior é o alcance numérico do tipo.
Cresce sempre em um alcance de 2**n

- **byte (8 bits):**
 Possui alcance numérico de -128 a 127, ou seja, 256 ou 2**8 numeros.
 
- **short (16 bits):**
Possui alcance numérico de -32768 a 32767, ou seja, 65536 ou 2**16 numeros.

- **int (32 bits):**
Possui alcance numérico de -8589934592 a 8589934591, ou seja, 4294967296 ou 2**32 numeros.

- **long (64 bits):**
Possui alcance numérico de -9223372036854775808 a 9223372036854775807, ou seja, 1.8446744e+19 ou 2**64 numeros.

## Tipos Numéricos de Ponto Flutuante

- **float (ou 32 bits):**
Possui alcance numérico de 1.40129846432481707e-45 à 3.40282346638528860e+38.

- **double (ou 64 bits):**
Possui alcance numérico de -4.94065645841246544e-324d à 1.79769313486231570e+308d.

## Tipos Textuais
- **char (2 bytes):**
Armazena um caractere, como 'a', 'b', ..., 'z', você pode usar o tipo char.

- **String:**
Não é um tipo primitivo (é um OBJETO), mas pode ser usado como se fosse um tipo primitivo e armazena textos entre aspas duplas ("").
