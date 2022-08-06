INSERT INTO autores(id, nome, experiencia) VALUES (11,'Akira Toriyama','Akira iniciou sua carreira em 1978 com a história Wonder Island publicada na Weekly Shonen Jump,[2] depois fez outros mangás: Highlight Island, seguido por Tomato Girl Detective.[3] Ele conquistou sua fama com Dr. Slump, publicada semanalmente na Shonen Jump de 1980 a 1984, gerando 18 volumes encadernados, que veio a ser o primeiro anime baseado em uma obra de Toriyama.');
INSERT INTO autores(id, nome, experiencia) VALUES (21,'Masami Kurumada','Masami Kurumada é um mangaká japonês e autor de vários mangás, dentre eles: Os Cavaleiros do Zodíaco, Bt X, Fūma no Kojirō e Ring ni Kakero. Masami Kurumada sempre mostrou vocação para desenhar mangás. Mesmo assim, começou a ter trabalhos publicados no início da década de 70, quando ainda era adolescente.');

INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (42,'Dragon Ball',10,'1993-01-01', 11);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (43,'Cavaleiros do Zodiaco',7,'1996-03-07', 21);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (44,'Ring ni Kakero',4,'1977-01-01', 21);

INSERT INTO generos(id, nome, descricao) VALUES (101,'Mangá de esporte','Um mangá de esporte (スポーツ漫画?) é um gênero de mangá e anime japonês que se concentra em histórias envolvendo esportes e outras atividades atléticas e competitivas.');
INSERT INTO generos(id, nome, descricao) VALUES (102,'Ação','Um gênero que geralmente envolve uma história de protagonistas do bem contra antagonistas do mal, que resolvem suas disputas com o uso de força física, neles o bem sempre prevalece sobre o mal.');
INSERT INTO generos(id, nome, descricao) VALUES (103,'Aventura','Aventura (Adventure Strip, literalmente tira de aventura) é um gênero de histórias em quadrinhos caracterizado pela existência de heróis e vilões, o gênero teria surgido com a publicação de tiras na década de 1920. Geralmente associados a um estilo realista, eles pretendem entreter o leitor através da identificação com um herói geralmente positivo, com histórias em ritmo acelerado e com a apresentação de universos ficcionais atraentes, se eles representam fielmente o mundo ou os lugares presentes. imaginários espetaculares e exóticos.');
INSERT INTO generos(id, nome, descricao) VALUES (104,'Fantasia','Fantasia é um gênero da ficção em que se usa geralmente fenômenos sobrenaturais, mágicos e outros como um elemento primário do enredo, tema ou configuração. Muitas obras dentro do gênero ocorrem em mundos imaginários onde há criaturas mágicas e itens mágicos. Geralmente a fantasia distingue-se dos gêneros ficção científica e horror pela expectativa de que ele dirige claramente de temas científicos e macabros, respectivamente, embora haja uma grande sobreposição entre os três, todos os quais são subgêneros da ficção especulativa.[1]');
INSERT INTO generos(id, nome, descricao) VALUES (105,'Comédia dramática','Comédia dramática (também conhecido como dramédia) é a junção dos gêneros comédia e drama.[1][2] Estas obras geralmente apresentam uma história séria, porém abordada de forma engraçada.[3]');

INSERT INTO animes__generos(id_animes, generos_id) VALUES (42, 102);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (42, 103);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (42, 104);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (43, 102);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (43, 103);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (43, 104);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (44, 101);