-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 14-07-2017 a las 09:25:46
-- Versión del servidor: 5.5.55-0+deb8u1
-- Versión de PHP: 5.6.30-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `lmp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE IF NOT EXISTS `Usuarios` (
`Id` int(11) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `Direccion` varchar(255) NOT NULL,
  `DireccionAlternativa` varchar(255) NOT NULL,
  `NombrePerro` varchar(255) NOT NULL,
  `PesoPerro` int(11) NOT NULL,
  `Nombrefamiliar1` varchar(255) NOT NULL,
  `Celularfamiliar1` int(11) NOT NULL,
  `Nombrefamiliar2` varchar(255) NOT NULL,
  `Celularfamiliar2` int(11) NOT NULL,
  `Nombrefamiliar3` varchar(255) NOT NULL,
  `Celularfamiliar3` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Usuarios`
--

INSERT INTO `Usuarios` (`Id`, `Usuario`, `Password`, `Direccion`, `DireccionAlternativa`, `NombrePerro`, `PesoPerro`, `Nombrefamiliar1`, `Celularfamiliar1`, `Nombrefamiliar2`, `Celularfamiliar2`, `Nombrefamiliar3`, `Celularfamiliar3`) VALUES
(1, 'Florencia', 'Flor123', 'Rio123', 'Yatay240', 'Milo', 10, 'Ceci', 15698367, 'Leo', 158794284, 'Delfi', 14854757),
(2, 'Caro', 'caro123', 'yatay230', 'rio321', 'uma', 30, 'sole', 15697759, 'edu', 365248954, 'ari', 369418879);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
 ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
