INSERT INTO autores(id, nome, experiencia) VALUES (11,'Akira Toriyama','Akira iniciou sua carreira em 1978 com a história Wonder Island publicada na Weekly Shonen Jump,[2] depois fez outros mangás: Highlight Island, seguido por Tomato Girl Detective.[3] Ele conquistou sua fama com Dr. Slump, publicada semanalmente na Shonen Jump de 1980 a 1984, gerando 18 volumes encadernados, que veio a ser o primeiro anime baseado em uma obra de Toriyama.');
INSERT INTO autores(id, nome, experiencia) VALUES (21,'Masami Kurumada','Masami Kurumada é um mangaká japonês e autor de vários mangás, dentre eles: Os Cavaleiros do Zodíaco, Bt X, Fūma no Kojirō e Ring ni Kakero. Masami Kurumada sempre mostrou vocação para desenhar mangás. Mesmo assim, começou a ter trabalhos publicados no início da década de 70, quando ainda era adolescente.');

INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (42,'Dragon Ball',10,'1993-01-01', 11);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (43,'Cavaleiros do Zodiaco',7,'1996-03-07', 21);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (44,'Ring ni Kakero',4,'1977-01-01', 21);

//////////////

INSERT INTO autores(id, nome, experiencia) VALUES (10, 'Natsuki Takaya', 'Natsuki Takaya (高屋 奈月 Takaya Natsuki) é o codinome de Naka Hatake (Shizuoka, 7 de julho de 1973) é uma autora de mangás muito famosa no Japão. Ela nasceu em Shizuoka, Japão, mas foi criada em Tóquio. Segundo Takaya ela quis ser mangaká desde a 1° série, quando a irmã dela começou a fazer aulas de desenho (a irmã mais velha dela também queria ser mangaká). Ela não gosta de falar sobre ela mesma. Após o lançamento do 6 volume de Fruits Basket Takaya quebrou a mão esquerda e teve que fazer uma cirurgia, ela se recuperou muito bem mas reclamou que a escrita dela tinha ficado estranha por causa da cirurgia. Sua série de mangás Fruits Basket foi um dos mangás shōjo mais vendidos na América do Norte.');
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (100, 'Fruits Basket', 3, '2019-04-06', 10);
INSERT INTO generos(id, nome, descricao) VALUES (200,'Drama','');
INSERT INTO generos(id, nome, descricao) VALUES (201,'Romance','');
INSERT INTO generos(id, nome, descricao) VALUES (202,'Comédia','');
INSERT INTO animes__generos(id_animes, generos_id) VALUES (100, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (100, 201);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (100, 202);


INSERT INTO autores(id, nome, experiencia) VALUES (11, 'Masashi Kishimoto', 'Masashi Kishimoto (岸本 斉史 Kishimoto Masashi?, Katsuta, 8 de novembro de 1974) é um mangaká (quadrinhista) e escritor japonês, entre seus maiores trabalhos está Naruto criado em 1997, e serializado na Weekly Shōnen Jump. Também é criador de Karakuri de 1996, que recebeu o prêmio Hop Step Award, o que fez com que os editores dessem continuidade aos seus trabalhos com mangás. E atualmente escreve seu novo mangá intitulado "Samurai 8" em parceria com ilustrador e mangaká Akira Ookubo que trabalhou como assistente de Kishimoto durante anos enquanto publicava-se Naruto. De maio de 2016 a outubro de 2020, ele supervisionou o mangá Boruto: Naruto Next Generations escrito por Ukyo Kodachi e ilustrado por Mikio Ikemoto. Em novembro de 2020, foi anunciado que ele havia assumido o cargo de escritor da série, substituindo Kodachi.');
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (101, 'Naruto', 9, '2002-10-03', 11);
INSERT INTO generos(id, nome, descricao) VALUES (203,'Aventura','');
INSERT INTO generos(id, nome, descricao) VALUES (204,'Fantasia','');
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 204);


INSERT INTO autores(id, nome, experiencia) VALUES (12, 'Hiromu Arakawa', 'Hiromu Arakawa (荒川 弘 Arakawa Hiromu?, 8 de maio de 1973) é uma mangaká japonesa nascida em Hokkaido. Seu mangá de renome, Fullmetal Alchemist, transformou-se num sucesso nacional e internacional, e posteriormente foi adaptado em duas séries de anime. Ela muitas vezes retrata a si mesma como uma vaca de óculos, pois nasceu e foi criada em uma fazenda de gado leiteiro com três irmãs mais velhas e um irmão mais novo. Seu nome de nascimento é Hiromi (弘美). O primeiro caractere de seu nome é escrito de forma idêntica ao nome masculino Hiromu. Arakawa escolheu esse nome como seu pseudônimo.');
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (102, 'Fullmetal Achemist', 4, '2003-10-04', 12);
INSERT INTO generos(id, nome, descricao) VALUES (205,'Ação','');
INSERT INTO generos(id, nome, descricao) VALUES (206,'Steampunk','');
INSERT INTO generos(id, nome, descricao) VALUES (207,'Ficção científica','');
INSERT INTO generos(id, nome, descricao) VALUES (208,'Tragédia','');
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 205);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 206);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 207);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 208);


INSERT INTO autores(id, nome, experiencia) VALUES (13, 'Naoki Urasawa', 'Naoki Urasawa (浦沢直樹) (Fuchū, Tóquio, 2 de Janeiro de 1960) é um aclamado mangaká e ocasional músico japonês, conhecido por ser o criador de séries como Monster, 20th Century Boys, Pluto e Billy Bat. Ele foi chamado de um dos artistas que mudou a história do mangá e recebeu o Shogakukan Manga Award três vezes, o Prêmio Cultural Osamu Tezuka duas vezes e o Prêmio Kodansha Manga uma vez.');
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (103, 'Monster', 5, '2004-04-06', 13);
INSERT INTO generos(id, nome, descricao) VALUES (209,'Mistério','');
INSERT INTO generos(id, nome, descricao) VALUES (210,'Suspense','');
INSERT INTO generos(id, nome, descricao) VALUES (211,'Policial','');
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 209);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 210);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 211);




Mushishi
Death Note
Naruto Shippuden
CLANNAD: After Story
Fullmetal Alchemist: Brotherhood
The Tatami Galaxy
Hunter x Hunter
Psycho-Pass
Attack on Titan
Noragami
One Punch Man
My Hero Academia
The Ancient Magus’ Bride
A Place Further Than The Universe
Demon Slayer
Keep Your Hands Off Eizouken!

///////////////////



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