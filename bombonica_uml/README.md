# EcommerceBombonica

Projeto para a disciplina de Tópicos 1

Ramo: Bomboniere;
Nome: Bombonica;
Tipo de Negócio: B2C;
Referência de interface: https://www.brasilcacau.com.br/;

CRUDs QUE SERÃO IMPLEMENTADOS
- CRUD de Produto;
- CRUD de BarraChocolate; 
- CRUD de Usuario; 
- CRUD de Compra;
- CRUD de CupomDesconto;
- CRUD de TipoPromocao;
- CRUD de Endereco;
- CRUD de Estado;
- CRUD de Municipio.

DEFININDO O FLUXO DAS ATIVIDADES
- Acessa o site
- Exibe as opções de produto
- Pesquisa por produto
- Exibe os resultados
- Seleciona o produto
- Exibe informações detalhadas
- Adiciona o produto no carrinho
- Exibe mensagem de confirmação
- Acessa o carrinho de compras
- Exibe produtos no carrinho
- Confirma a compra
- Exibe mensagem de confirmação

DESCRIÇÃO RESUMIDA DO DIAGRAMA
O diagrama UML representa um modelo de classes para um e-commerce de bomboniere com o nome de Bombonica. 
- O sistema permite o cadastro de usuários que podem adicionar produtos a uma lista de desejos, assim como cadastrar múltiplos endereços e telefones de contato. Os produtos são organizados por tipo de chocolate, sendo que cada produto possui um ID, nome, descrição, preço e estoque. 
- As compras são realizadas pelos usuários e associadas a um ou mais endereços de entrega, podendo conter múltiplos itens de compra, cada um relacionado a um produto e a um preço específico. Além disso, as compras podem ser associadas a promoções e cupons de desconto. 
- O pagamento é feito online e requer a associação de um cartão de crédito ou débito cadastrado pelo usuário. As promoções são definidas a partir de um tipo de promoção, que pode ser do tipo desconto, brinde ou frete grátis. Os cupons de desconto, por sua vez, são associados a uma promoção específica e possuem um código único que pode ser utilizado pelos usuários durante o processo de checkout para aplicar o desconto correspondente.