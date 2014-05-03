-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le : Sam 03 Mai 2014 à 16:51
-- Version du serveur: 5.5.20
-- Version de PHP: 5.3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `sitelasauce`
--

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE IF NOT EXISTS `equipe` (
  `idEquipe` int(11) NOT NULL AUTO_INCREMENT,
  `anneeMandat` varchar(20) NOT NULL,
  `descriptionEquipe` varchar(200) NOT NULL,
  `imgEquipe` varchar(200) NOT NULL,
  PRIMARY KEY (`idEquipe`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Contenu de la table `equipe`
--

INSERT INTO `equipe` (`idEquipe`, `anneeMandat`, `descriptionEquipe`, `imgEquipe`) VALUES
(5, '2013/2014', 'L''équipe 2013/2014 est constituée de : Juliette la présidente, Marine la responsable Evenementiel, Dimitri le trésorier, et de William le vice-président.			', 'https://scontent-a.xx.fbcdn.net/hphotos-frc3/v/t1.0-9/1476407_474685659307307_1266671629_n.jpg?oh=aa1659bc940ace21f22c9057b2c7ad8b&oe=53C9F1D3'),
(6, '2012/2013', '				', 'http://imblog.aufeminin.com/blog/D20140502/609790_209469079_2012-2013_H111853_L.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `evenement`
--

CREATE TABLE IF NOT EXISTS `evenement` (
  `idEvenement` int(11) NOT NULL AUTO_INCREMENT,
  `titreEvenement` varchar(50) NOT NULL,
  `dateEvenement` date NOT NULL,
  `detailEvenement` text NOT NULL,
  `lieuEvenement` varchar(50) NOT NULL,
  PRIMARY KEY (`idEvenement`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `evenement`
--

INSERT INTO `evenement` (`idEvenement`, `titreEvenement`, `dateEvenement`, `detailEvenement`, `lieuEvenement`) VALUES
(2, 'Repas Salsa', '2014-05-04', 'Repas mexicain prévu épicé ! 				', 'Résidence St-Joseph'),
(3, 'Repas Asiatique', '2014-05-14', 'Le prochain repas sera sur le thème de l''Asie, pensez à ramenez un bol !				', 'Résidence St-Joseph'),
(4, 'Repas Italien', '2014-05-21', 'Retrouvez-nous pour un nouveau délicieux repas sur le thème de l''Italie !				', 'Résidence St-Joseph');

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE IF NOT EXISTS `membre` (
  `idMembre` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `motdePasse` varchar(50) NOT NULL,
  `mailHEI` varchar(100) NOT NULL,
  `telephone` varchar(50) NOT NULL,
  PRIMARY KEY (`idMembre`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `membre`
--

INSERT INTO `membre` (`idMembre`, `nom`, `prenom`, `motdePasse`, `mailHEI`, `telephone`) VALUES
(1, 'Grosleron', 'Juliette', 'julietteG', 'juliette.grosleron@hei.fr', '0621635998'),
(3, 'Laquet', 'Dimitri', 'dimitriL', 'dimitri.laquet@hei.fr', '0621635998'),
(4, 'Serre', 'William', 'williamS', 'william.serre@hei.fr', '0621635998'),
(5, 'Barbieux', 'Marine', 'marineB', 'marine.barbieux@hei.fr', '0621635998');

-- --------------------------------------------------------

--
-- Structure de la table `recette`
--

CREATE TABLE IF NOT EXISTS `recette` (
  `idRecette` int(11) NOT NULL AUTO_INCREMENT,
  `titrePlat` varchar(30) NOT NULL,
  `imgRecette` text NOT NULL,
  `difficulte` varchar(30) NOT NULL,
  `typePlat` varchar(30) NOT NULL,
  `ingredients` text NOT NULL,
  `texteRecette` text NOT NULL,
  PRIMARY KEY (`idRecette`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `recette`
--

INSERT INTO `recette` (`idRecette`, `titrePlat`, `imgRecette`, `difficulte`, `typePlat`, `ingredients`, `texteRecette`) VALUES
(2, 'Tarte tatin', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPHM1gv_tlfTRmTfUDpFbCY1vmpATYGoMLSToaz9BzPbH8Pi-I', 'Très facile', 'Dessert', '- 1 pâte feuilletée\r\n- 5 pommes\r\n- 80 g de sucre\r\n- 30 g de beurre\r\n- 150 g de sucre\r\n- 2 cuillères à soupe d''eau ou du caramel tout prêt					', 'Préchauffer le four à 180°C (thermostat 6).\r\n\r\nVerser le caramel dans un moule en porcelaine et mettre au frigo. \r\n\r\nÉplucher et couper les pommes en quartiers assez épais. \r\n\r\nDans une poêle, faire fondre le beurre, ajouter les pommes et saupoudrer avec le sucre, laisser dorer. \r\n\r\nMettre les quartiers au fond du moule, recouvrer avec la pâte feuilletée en la rabattant à l''intérieur du moule. \r\n\r\nMettre au four à 180°C (thermostat 6) pendant 25 min. \r\n\r\nRetourner ensuite la tarte sur un plat.					'),
(3, 'Bricks au thon', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTngXJFeIro4s7nRDvwe9bq8fukMMQYkdgcKp4vvXOIvzwLoHUG', 'Facile', 'Entrée - Snack', '4 feuilles de brick\r\n1 boîte de thon\r\nquelques brindilles de persil\r\n4 oeufs\r\nun peu de fromage\r\nhuile pour la friture\r\n1 pincée de sel\r\n1 tour de moulin de poivre					', '1)Cassez les oeufs et mettez-les un à un dans un grand saladier.\r\n2)Ajoutez le thon émietté, le persil haché, le sel, le poivre et le fromage.\r\n3)Sur une assiette plate assez large, déposez une feuille de brick et avec une cuillére à soupe, prenez un peu de mélange, mettez-le au milieu de la brick et pliez celle-ci sur elle même et en 3 de façon à former un triangle.\r\n4)D''autre part, mettez de l''huile dans une poêle assez large et faites chauffer.\r\n5)Dés que l''huile est assez chaude, placez une à une les bricks et faites-les cuire des deux côtés jusqu''à une belle couleur dorée. \r\n6)Égouttez et dressez sur un plat qu''on peut décorer de salade verte et de tranches de citron par exemple.\r\n7)Ces bricks se dégustent chaudes ou froides.					'),
(5, 'Velouté de courgettes', 'http://1.media.atelierdeschefs.com/recette-d13584-veloute-de-courgettes.jpg', 'Facile', 'Entrée', 'Courgette(s) : 7 pièce(s)\r\nAromate(s) ail, thym, laurier : 1 pièce(s)\r\nHuile d''olive : 3 cl\r\nSel fin : 3 pincée(s)\r\nMoulin à poivre : 3 tour(s)\r\nBouillon de volaille : 1 l\r\nCrème liquide entière : 7 cl					', '1)Laver les courgettes, les fendre en 2 et enlever le coeur. Les couper ensuite en mirepoix (cubes de 1 cm environ).\r\nDans une cocotte ou un fait-tout, bien faire chauffer l''huile puis faire sauter les dés de courgettes jusqu''à ce qu''ils soient légèrement dorés. Mouiller alors avec le bouillon de volaille, rajouter le bouquet garni (thym, laurier et ail écrasé en chemise) et laisser mijoter jusqu''à ce que les courgettes soient cuites. Vérifier la cuisson en plantant la lame d''un couteau dans les cubes : elle doit les transpercer facilement.\r\n\r\n2)Extraire le bouquet garni du bouillon. Mixer l''intégralité du potage à l''aide d''un mixeur plongeant, puis crémer le mélange. Rectifier l''assaisonnement en ajoutant sel et poivre si nécessaire.\r\nServir chaud.					'),
(6, 'Lasagnes epinards', 'http://images.marmitoncdn.org/recipephotos/multiphoto/a4/a4f100fd-cce6-40d3-b4e6-75c5aa028fe4_normal.jpg', 'Très facile', 'Plat', '- 1 kg d''épinards surgelés\r\n- 400 g de fromage de chèvre (en bûche)\r\n- 200 g de gruyère râpé\r\n- 1 paquet de feuilles de lasagne\r\n- 2/3 l de sauce béchamel\r\n- sel et poivre					', 'Préchauffez le four à 200°C (Th 6-7).\r\n\r\nDécongelez les épinards, à feu doux, dans une casserole, puis enlevez l''eau résiduelle (n''hésitez pas à appuyer pour la faire sortir!). \r\n\r\nHachez-les grossièrement (je le fais au ciseau).\r\n\r\nEmiettez la bûchette de chèvre.\r\n\r\nDans un grand plat à four beurré, posez une couche de lasagnes, puis une couche d''épinards, puis une couche de miettes de chèvre, puis un peu de béchamel, puis un peu de sel et de poivre, puis à nouveau une couche de pâtes... \r\n\r\nFaites ainsi 2 ou 3 couches, en terminant par la béchamel et en recouvrant de gruyère râpé.\r\n\r\nLaissez cuire environ 30 min et servez chaud, avec une salade aux noix.\r\n\r\nRemarques :\r\nVous pouvez réduire les quantités de moitié pour un plat pour 3 ou 4 personnes.\r\nConseil vin :\r\nvin rouge				'),
(7, 'Gâteau au chocolat', 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQ6PMx-6E0JLne2PlRFb5iQhB3fqUZSz-O5C7L30C4-x33M25vC', 'Facile', 'Dessert', 'Pour 8 à 10 personnes:\r\n200 g de chocolat noir à 52% de cacao\r\n125 g de beurre doux (ou demi-sel pour les gourmands)\r\n100 g de farine de blé T65\r\n1 sachet de levure chimique (10 g)\r\n4 gros oeufs bio\r\n200 g de sucre en poudre (ou plutôt 150 g d''après les commentaires)\r\n1 pincée de sel\r\n					', 'Et voilà les étapes pour préparer un délicieux gâteau au chocolat :\r\n1. Coupez le chocolat et le beurre en petits morceaux. Faites-les fondre en bain-marie jusqu’à avoir un mélange homogène. Retirez du feu.\r\n2. Ajoutez la farine et la levure tamisées.\r\n3. Dans un saladier, fouettez les jaunes avec le sucre. Puis ajoutez la préparation au chocolat.\r\n4. Dans un autre saladier, battez les blancs en neige avec une pincée de sel. Incorporez-les délicatement dans la préparation au chocolat.\r\n5. Versez ce mélange dans un moulé à manqué recouvert de papier sulfurisé (24 à 26 cm de diamètre).\r\n6. Faites cuire environ 20 à 25 min dans le four préchauffé à 180°C. Surveillez la fin de la cuisson en piquant le gâteau avec la lame d’un couteau : elle doit ressortir sèche. Laissez bien refroidir le gâteau au chocolat avant de démouler.\r\n					'),
(8, 'Cookies maison', 'http://geekandfood.fr/wp-content/uploads/2013/02/Cookies_scoop_me_a_cookie.jpg', 'Très facile', 'Dessert', '- 85 g beurre\r\n- 1 oeuf \r\n- 85 g sucre\r\n- Essence de vanille ou 1 sachet de sucre vanillé\r\n- 150 g de farine\r\n- 100 g de chocolat noir\r\n- 1 cuillère à café de sel\r\n- 1 cuillère à café de levure chimique					', 'Faire ramollir le beurre à température ambiante. Dans un saladier, mettre 75 g de beurre, incorporer le sucre, l''oeuf entier, la vanille et mélanger le tout.\r\n\r\nAjouter petit à petit la farine mélangée à la levure, le sel et le chocolat coupé en petits morceaux.\r\n\r\nBeurrer une plaque allant au four et former les cookies sur la plaque.\r\n\r\nPour former les cookies, utiliser 2 cuillères à soupe et faire des petits tas espacés les uns des autres; ils grandiront à la cuisson.					'),
(9, 'Tiramisu', 'http://images.marmitoncdn.org/recipephotos/multiphoto/a8/a860ca6e-8fbf-468e-abfa-2c1432a9bac2_normal.jpg', 'Très facile', 'Dessert', '- 3 gros œufs\r\n- 100 g de sucre roux\r\n- 1 sachet de sucre vanillé\r\n- 250 g de mascarpone\r\n- 24 biscuits à la cuillère\r\n- 1/2 litre de café noir non sucré\r\n- 30 g de poudre de cacao amer					', 'Séparer les blancs des jaunes. Mélanger les jaunes + sucre + sucre vanillé. Ajouter le mascarpone au fouet.\r\n\r\nMonter les blancs en neige et les incorporer délicatement à la spatule au mélange précédent.\r\n\r\nPréparer du café noir.\r\n\r\nMouiller les biscuits dans le café.\r\n\r\nTapisser le fond du moule avec les biscuits. Recouvrir d''une couche de crème, œuf, sucre, mascarpone. Alterner biscuits et crème.\r\n\r\nTerminer par une couche de crème. Saupoudrer de cacao.\r\n\r\nMettre au réfrigérateur 4 heures minimum.					');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
