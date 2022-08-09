INSERT INTO autores(id, nome, experiencia) VALUES (10, 'Natsuki Takaya', 'Natsuki Takaya (高屋 奈月 Takaya Natsuki) é o codinome de Naka Hatake (Shizuoka, 7 de julho de 1973) é uma autora de mangás muito famosa no Japão. Ela nasceu em Shizuoka, Japão, mas foi criada em Tóquio. Segundo Takaya ela quis ser mangaká desde a 1° série, quando a irmã dela começou a fazer aulas de desenho (a irmã mais velha dela também queria ser mangaká). Ela não gosta de falar sobre ela mesma. Após o lançamento do 6 volume de Fruits Basket Takaya quebrou a mão esquerda e teve que fazer uma cirurgia, ela se recuperou muito bem mas reclamou que a escrita dela tinha ficado estranha por causa da cirurgia. Sua série de mangás Fruits Basket foi um dos mangás shōjo mais vendidos na América do Norte.');
INSERT INTO autores(id, nome, experiencia) VALUES (11, 'Masashi Kishimoto', 'Masashi Kishimoto (岸本 斉史 Kishimoto Masashi?, Katsuta, 8 de novembro de 1974) é um mangaká (quadrinhista) e escritor japonês, entre seus maiores trabalhos está Naruto criado em 1997, e serializado na Weekly Shōnen Jump. Também é criador de Karakuri de 1996, que recebeu o prêmio Hop Step Award, o que fez com que os editores dessem continuidade aos seus trabalhos com mangás. E atualmente escreve seu novo mangá intitulado "Samurai 8" em parceria com ilustrador e mangaká Akira Ookubo que trabalhou como assistente de Kishimoto durante anos enquanto publicava-se Naruto. De maio de 2016 a outubro de 2020, ele supervisionou o mangá Boruto: Naruto Next Generations escrito por Ukyo Kodachi e ilustrado por Mikio Ikemoto. Em novembro de 2020, foi anunciado que ele havia assumido o cargo de escritor da série, substituindo Kodachi.');
INSERT INTO autores(id, nome, experiencia) VALUES (12, 'Hiromu Arakawa', 'Hiromu Arakawa (荒川 弘 Arakawa Hiromu?, 8 de maio de 1973) é uma mangaká japonesa nascida em Hokkaido. Seu mangá de renome, Fullmetal Alchemist, transformou-se num sucesso nacional e internacional, e posteriormente foi adaptado em duas séries de anime. Ela muitas vezes retrata a si mesma como uma vaca de óculos, pois nasceu e foi criada em uma fazenda de gado leiteiro com três irmãs mais velhas e um irmão mais novo. Seu nome de nascimento é Hiromi (弘美). O primeiro caractere de seu nome é escrito de forma idêntica ao nome masculino Hiromu. Arakawa escolheu esse nome como seu pseudônimo.');
INSERT INTO autores(id, nome, experiencia) VALUES (13, 'Naoki Urasawa', 'Naoki Urasawa (浦沢直樹) (Fuchū, Tóquio, 2 de Janeiro de 1960) é um aclamado mangaká e ocasional músico japonês, conhecido por ser o criador de séries como Monster, 20th Century Boys, Pluto e Billy Bat. Ele foi chamado de um dos artistas que mudou a história do mangá e recebeu o Shogakukan Manga Award três vezes, o Prêmio Cultural Osamu Tezuka duas vezes e o Prêmio Kodansha Manga uma vez.');
INSERT INTO autores(id, nome, experiencia) VALUES (14, 'Yuki Urushibara', 'Yuki Urushibara é um artista de mangá japonês. Ela é mais conhecida pela série Mushishi, pela qual recebeu um Prêmio de Excelência por mangá no 2003 Japan Media Arts Festival e o Kodansha Manga Award de 2006 por mangá em geral. Ela também é conhecida pelo pseudônimo Soyogo Shima.');


INSERT INTO autores(id, nome, experiencia) VALUES (15, 'Tsugumi Ohba', 'Tsugumi Ohba é um roteirista de mangá. Até agora, suas únicas obras conhecidas são Death Note, Bakuman e Platinum End, o que faz muitos acreditarem que "Tsugumi Ohba" seja apenas um pseudônimo de um escritor mais famoso. Alguns acreditam que Tsugumi Ohba seja Hiroshi Gamō, autor da série de mangá Tottemo!');
INSERT INTO autores(id, nome, experiencia) VALUES (16, 'Hiroshi Ōnogi', 'Hiroshi Ōnogi é um roteirista e romancista japonês focado em produções de anime. Ōnogi freqüentou a Universidade Keio nos mesmos anos que o designer de personagens da Macross Haruhiko Mikimoto e o criador Shōji Kawamori, ambos com quem ele colaboraria pela primeira vez em The Super Dimension Fortress Macross.');
INSERT INTO autores(id, nome, experiencia) VALUES (17, 'Koyoharu Gotōge', 'Koyoharu Gotouge é um artista de mangá japonês, conhecido pela série de mangá Demon Slayer: Kimetsu no Yaiba. Em fevereiro de 2021, o mangá tinha mais de 150 milhões de cópias em circulação, tornando-se a nona série de mangá mais vendida de todos os tempos.');


INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (100, 'Fruits Basket', 3, '2019-04-06', 10);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (101, 'Naruto', 9, '2002-10-03', 11);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (102, 'Fullmetal Achemist', 4, '2003-10-04', 12);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (103, 'Monster', 5, '2004-04-06', 13);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (104, 'Mushishi', 2, '2005-10-23', 14);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (105, 'Death Note', 6, '2006-10-04', 15);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (106, 'Naruto Shippuden', 20, '2007-02-15', 11);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (107, 'Fullmetal Alchemist: Brotherhood', 1, '2009-04-05', 16);
INSERT INTO animes(id, nome, qtd_temporadas, dt_criacao, id_autor) VALUES (108, 'Demon Slayer', 1, '2019-04-06', 17);


INSERT INTO generos(id, nome, descricao) VALUES (200,'Drama','No campo da arte, a palavra drama contém múltiplos significados. Segundo os dicionários Houaiss e Aulete, "drama" pode significar: "forma narrativa em que se figura ou imita a ação direta dos indivíduos", "texto em verso ou prosa, escrito para ser encenado" ou mesmo a "encenação desse texto". Por analogia, pode ser, ainda, "qualquer narrativa no âmbito da prosa literária em que haja conflito ou atrito", podendo ser conto, novela, romance etc., ou mesmo toda a arte dramática.');
INSERT INTO generos(id, nome, descricao) VALUES (201,'Romance','O termo romance (do latim romanice: "em língua românica", através do provençal romans) pode referir-se a dois gêneros literários. O primeiro deles é uma composição poética popular, histórica ou lírica, transmitida pela tradição oral, sendo geralmente de autor anônimo; corresponde aproximadamente à balada medieval. Como forma literária moderna, o termo designa uma composição em prosa.');
INSERT INTO generos(id, nome, descricao) VALUES (202,'Comédia','A comédia é o uso de humor nas artes cênicas. Também pode estar presente em um espetáculo, história, ou até mesmo em um filme, que recorre intensivamente ao humor. De forma geral, "comédia" é o que é engraçado, que faz rir. Independentemente se está relacionado com pessoas e pode ter um sentido "agressivo" não deixa de ser comédia.');
INSERT INTO generos(id, nome, descricao) VALUES (203,'Aventura','Aventura, do latim "ad venture", significa literalmente o que vem pela frente. Participar de uma atividade de aventura significa estar preparado para o que vier. A atividade de aventura, portanto não pode ser confundida com atividade radical, pelo simples fato de na Aventura se realizar todo o controle dos riscos existentes, enquanto na atividade radical os riscos não são controláveis. Por exemplo, realizar um rapel em uma cachoeira exige todo o aparato de segurança e o controle do riscos envolvidos, já realizar manobras em um skate não possibilita o mesmo controle (é radical).');
INSERT INTO generos(id, nome, descricao) VALUES (204,'Fantasia','Fantasia é um gênero da ficção em que se usa geralmente fenômenos sobrenaturais, mágicos e outros como um elemento primário do enredo, tema ou configuração. Muitas obras dentro do gênero ocorrem em mundos imaginários onde há criaturas mágicas e itens mágicos. Geralmente a fantasia distingue-se dos gêneros ficção científica e horror pela expectativa de que ele dirige claramente de temas científicos e macabros, respectivamente, embora haja uma grande sobreposição entre os três, todos os quais são subgêneros da ficção especulativa.[1]');
INSERT INTO generos(id, nome, descricao) VALUES (205,'Ação','É um gênero que geralmente envolve uma história de protagonistas do bem contra antagonistas do mal, que resolvem suas disputas com o uso de força física, neles o bem sempre prevalece sobre o mal. Os filmes de ação são comuns de se misturarem com os gêneros policiais e crimes, westerns e guerra, entre outros.');
INSERT INTO generos(id, nome, descricao) VALUES (206,'Steampunk','Steampunk também conhecido como Vapor Punk ou Tecnavapor (abreviação de Tecnologia a Vapor) é um subgênero da ficção científica, ou ficção especulativa, que ganhou fama no final dos anos 1980 e início dos anos 1990. Trata-se de obras ambientadas no passado, no qual os paradigmas tecnológicos modernos ocorreram mais cedo do que na História real (ou em um universo com características similares), mas foram obtidos por meio da ciência já disponível naquela época - como, por exemplo, computadores de madeira e aviões movidos a vapor. É um estilo normalmente associado ao futurista cyberpunk e, assim como este, tem uma base de fãs semelhante, mas distinta.');
INSERT INTO generos(id, nome, descricao) VALUES (207,'Ficção científica','Ficção científica (normalmente abreviado para SF, FC, sci-fi ou scifi) é um gênero da ficção especulativa, que normalmente lida com conceitos ficcionais e imaginativos, relacionados ao futuro, ciência e tecnologia, e seus impactos e/ou consequências em uma determinada sociedade ou em seus indivíduos, desenvolvido no século XIX. Conhecida também como a "literatura das ideias", evita utilizar-se do sobrenatural, tema mais recorrente na Fantasia, baseando-se em fatos científicos e reais para compor enredos ficcionais.');
INSERT INTO generos(id, nome, descricao) VALUES (208,'Tragédia','Tragédia (do grego antigo τραγῳδία, composto de τράγος, "cabra" e ᾠδή, "música") é uma forma de drama que se caracteriza pela sua seriedade e dignidade, pondo frequentemente em causa os deuses, o destino ou a sociedade.');
INSERT INTO generos(id, nome, descricao) VALUES (209,'Mistério','A ficção de mistério é um gênero de ficção que geralmente envolve uma misteriosa morte ou um crime a ser resolvido. Muitas vezes, com um círculo fechado de suspeitos, cada suspeito geralmente recebe um motivo confiável e uma oportunidade razoável para cometer o crime');
INSERT INTO generos(id, nome, descricao) VALUES (210,'Suspense','Suspense é um sentimento de incerteza ou ansiedade mediante as consequências de determinado fato, mais frequentemente referente à perceptividade da audiência em um trabalho dramático');
INSERT INTO generos(id, nome, descricao) VALUES (211,'Policial','Romance policial é um gênero literário que se caracteriza, em termos de sua estrutura narrativa, pela presença do crime, da investigação e da revelação do malfeitor.');
INSERT INTO generos(id, nome, descricao) VALUES (212,'Sobrenatural','O termo sobrenatural em geral designa o contrário do que é considerado natural; o que não admite - ou é suposto não admitir - explicação científica. Designa aquilo que, em princípio, é ou ocorre fora da ordem natural, à parte das leis naturais que regem os fenômenos ordinários; aquilo que é superior à natureza.');


INSERT INTO animes__generos(id_animes, generos_id) VALUES (100, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (100, 201);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (100, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (101, 204);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 205);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 206);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 207);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (102, 208);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 209);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 210);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (103, 211);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (104, 212);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (104, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (105, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (105, 210);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (106, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (106, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (106, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (106, 204);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 205);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 202);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 200);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 206);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 207);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (107, 208);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (108, 205);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (108, 203);
INSERT INTO animes__generos(id_animes, generos_id) VALUES (108, 204);