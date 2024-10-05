## ResponseEntity:

ResponseEntity é um objeto do Spring Framework que representa uma resposta HTTP completa. Ele oferece um nível de controle muito granular sobre a resposta que uma aplicação web envia ao cliente, permitindo definir:

Status HTTP: Código numérico que indica o resultado da requisição (por exemplo, 200 para sucesso, 404 para não encontrado, 500 para erro interno do servidor).
Cabeçalhos HTTP: Informações adicionais sobre a resposta, como tipo de conteúdo, codificação, localização, etc.
Corpo da resposta: Os dados que serão enviados ao cliente, que podem ser objetos, strings, arquivos, etc.