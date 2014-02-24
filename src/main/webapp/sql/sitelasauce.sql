-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Client: 127.0.0.1
-- Généré le : Ven 21 Février 2014 à 11:46
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
-- Structure de la table `appartenance`
--

CREATE TABLE IF NOT EXISTS `appartenance` (
  `idEquipe` int(11) NOT NULL,
  `idMembre` int(11) NOT NULL,
  KEY `idEquipe` (`idEquipe`,`idMembre`),
  KEY `idMembre` (`idMembre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `equipe`
--

CREATE TABLE IF NOT EXISTS `equipe` (
  `idEquipe` int(11) NOT NULL AUTO_INCREMENT,
  `annéeMandat` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idEquipe`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `equipe`
--

INSERT INTO `equipe` (`idEquipe`, `annéeMandat`) VALUES
(1, '2013'),
(2, '2012'),
(3, '2011'),
(4, '2010');

-- --------------------------------------------------------

--
-- Structure de la table `evenement`
--

CREATE TABLE IF NOT EXISTS `evenement` (
  `idEvenement` int(11) NOT NULL AUTO_INCREMENT,
  `titreEvenement` varchar(100) DEFAULT NULL,
  `dateEvenement` date DEFAULT NULL,
  `detailEvenement` text NOT NULL,
  `lieuEvenement` varchar(100) NOT NULL,
  `idMembre` int(11) NOT NULL,
  PRIMARY KEY (`idEvenement`),
  KEY `idMembre` (`idMembre`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Contenu de la table `evenement`
--

INSERT INTO `evenement` (`idEvenement`, `titreEvenement`, `dateEvenement`, `detailEvenement`, `lieuEvenement`, `idMembre`) VALUES
(1, 'Repas Tour des Régions', '2014-02-05', 'Pensez bien à ramener votre propre assiette et vos couverts.', 'Résidence Saint-Joseph', 0),
(2, 'Repas Américain ', '2013-12-18', 'Pensez bien à ramener votre propre assiette et vos couverts.', 'Résidence Saint Joseph', 0),
(3, 'Repas Tour d''Asie', '2013-12-05', 'Pensez bien à ramener votre propre assiette et vos couverts.', 'Résidence Saint-Joseph', 0),
(4, 'Repas Montagnard', '2013-10-16', 'Pensez bien à ramener votre propre assiette et vos couverts.', 'Résidence Saint Joseph', 0),
(5, 'Premier Salon Gastronomique', '2013-10-09', 'Venez participer au salon gastro d''HEI !', 'HEI - Rue de Toul', 0);

-- --------------------------------------------------------

--
-- Structure de la table `membre`
--

CREATE TABLE IF NOT EXISTS `membre` (
  `idMembre` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) DEFAULT NULL,
  `prenom` varchar(100) DEFAULT NULL,
  `motdePasse` varchar(10) DEFAULT NULL,
  `mailHEI` varchar(100) DEFAULT NULL,
  `telephone` varchar(11) NOT NULL,
  PRIMARY KEY (`idMembre`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `membre`
--

INSERT INTO `membre` (`idMembre`, `nom`, `prenom`, `motdePasse`, `mailHEI`, `telephone`) VALUES
(1, 'GROSLERON', 'Juliette', 'julietteG', 'juliette.grosleron@hei.fr', '621635998'),
(2, 'SERRE', 'William', 'williamS', 'william.serre@hei.fr', '600000000'),
(3, 'BARBIEUX', 'Marine', 'marineB', 'marine.barbieux@hei.fr', '621635998'),
(4, 'LAQUET', 'Dimitri', 'dimitriL', 'dimitri.laquet@hei.fr', '600000000');

-- --------------------------------------------------------

--
-- Structure de la table `recette`
--

CREATE TABLE IF NOT EXISTS `recette` (
  `idRecette` int(11) NOT NULL AUTO_INCREMENT,
  `titrePlat` varchar(100) DEFAULT NULL,
  `difficulte` varchar(100) DEFAULT NULL,
  `typePlat` varchar(100) DEFAULT NULL,
  `ingredients` text,
  `texteRecette` text,
  `idMembre` int(11) DEFAULT NULL,
  PRIMARY KEY (`idRecette`),
  KEY `idMembre` (`idMembre`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `recette`
--

INSERT INTO `recette` (`idRecette`, `titrePlat`, `difficulte`, `typePlat`, `ingredients`, `texteRecette`, `idMembre`) VALUES
(1, 'Recette1', 'facile', 'entrée', 'ingrédient1', 'Contenu1', NULL),
(2, 'Recette 2', 'facile', 'dessert', 'bave de crapeau', 'melanger ', NULL),
(3, 'Recette 3', 'difficile', 'dessert', 'jus de citron', 'Remuer', NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
