-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-06-2017 a las 14:00:16
-- Versión del servidor: 5.7.9
-- Versión de PHP: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lovemypet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `Usuario` text NOT NULL,
  `Password` text NOT NULL,
  `Direccion` text NOT NULL,
  `DireccionAlternativa` text NOT NULL,
  `NombrePerro` text NOT NULL,
  `PesoPerro` int(11) NOT NULL,
  `RazaPerro` text NOT NULL,
  `NombreFamiliar` text NOT NULL,
  `Celular` int(11) NOT NULL,
  `NombreFamiliar2` text NOT NULL,
  `Celular2` int(11) NOT NULL,
  `NombreFamiliar3` text NOT NULL,
  `Celular3` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Usuario`, `Password`, `Direccion`, `DireccionAlternativa`, `NombrePerro`, `PesoPerro`, `RazaPerro`, `NombreFamiliar`, `Celular`, `NombreFamiliar2`, `Celular2`, `NombreFamiliar3`, `Celular3`) VALUES
('Carola', 'Carolaa123', 'Yatay240', 'yata20', 'lucho', 23, 'yorksire', 'lucia', 1543237890, 'alberto', 15678904, 'lucio', 1543278907);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
