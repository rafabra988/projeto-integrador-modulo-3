-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 12-Fev-2019 às 06:43
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `joas`
--
CREATE DATABASE IF NOT EXISTS `joas` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `joas`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `distribuidor`
--

CREATE TABLE `distribuidor` (
  `iddistribuidor` int(11) NOT NULL,
  `cnpj` varchar(30) DEFAULT NULL,
  `nomefantasia` varchar(50) DEFAULT NULL,
  `razaosocial` varchar(50) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cei` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `distribuidor`
--

INSERT INTO `distribuidor` (`iddistribuidor`, `cnpj`, `nomefantasia`, `razaosocial`, `telefone`, `cei`) VALUES
(2, '15.456.789/0006-13', 'Manuela Top', 'Coisinha linda', '212587442', '987456321'),
(3, '15.456.789/0006-13', 'Candida Top', 'Coisinha linda', '212587442', '987456321'),
(4, '32.645.789/0001-19', 'Jocimar Top', 'Sou top mesmo', '2124523265', '951235746'),
(5, '424242424242', 'Ronaldinjho', 'Gaucho', '24242424', '24242424');

-- --------------------------------------------------------

--
-- Estrutura da tabela `exemplar`
--

CREATE TABLE `exemplar` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `genero` varchar(10) DEFAULT NULL,
  `sinopse` varchar(1000) DEFAULT NULL,
  `numlocalizacao` varchar(5) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `iddistribuidor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `exemplar`
--

INSERT INTO `exemplar` (`id`, `nome`, `genero`, `sinopse`, `numlocalizacao`, `quantidade`, `iddistribuidor`) VALUES
(1, 'God of War', 'Aventura', 'A história centra-se em torno de seu personagem, Kratos, um guerreiro espartano enganado para matar sua esposa e filha por seu antigo mestre, o deus da guerra Ares. ... Existem duas eras na série God of War. A primeira era são os primeiros sete jogos, baseados na mitologia grega, com a vingança sendo o motivo central.', '1/5', 10, NULL),
(8, 'Batman The Arkhan City', 'Estratégia', 'Na dramatização do jogo, o prefeito Quincy Sharp murou bairros inteiros de Gotham, criando Arkham City, uma cidade que funciona como uma super-prisão. A única regra é que seus habitantes, os variados bandidos de Gotham, não podem sair de lá. Batman, claro, não gosta nada disso. Como Bruce Wayne ele forma o partido Anti-Arkham.', '1/7', 5, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`codigo`, `nome`, `telefone`, `cep`, `email`, `rg`, `login`, `senha`, `cpf`) VALUES
(1, 'Jocimar', NULL, '21550-570', 'jocimar@infolink.com.br', NULL, 'JoAv', '1123581321', ''),
(2, 'Joana', NULL, '24244-244', 'joana4@louca.com.br', NULL, 'loucapra', 'dar4vezes', NULL),
(3, 'deu certo', NULL, '25874-987', 'deucerto@mesmo.com', NULL, 'deucertojk', 'deumuitocerto', NULL),
(4, 'Candida', '24518239', '22000000', 'candida@infolink.com.br', '7412589630', NULL, NULL, '15975325897'),
(12, 'Renanda linda me amor', '', '', 'dadada@gamail.com', '', NULL, NULL, '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `locacao`
--

CREATE TABLE `locacao` (
  `codigo` int(11) NOT NULL,
  `dataEmprestimo` date DEFAULT NULL,
  `dataPrevista` date DEFAULT NULL,
  `dataDevolucao` date DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `observacao` varchar(80) DEFAULT NULL,
  `exemplar` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `locacao`
--

INSERT INTO `locacao` (`codigo`, `dataEmprestimo`, `dataPrevista`, `dataDevolucao`, `status`, `observacao`, `exemplar`) VALUES
(11, '2018-11-18', '2018-11-18', '2018-12-01', 'Em dia', '', 'God of War'),
(12, '2018-12-18', '2018-12-18', '2018-12-31', 'Em dia', '', 'God of War');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`iddistribuidor`);

--
-- Indexes for table `exemplar`
--
ALTER TABLE `exemplar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codigo`);

--
-- Indexes for table `locacao`
--
ALTER TABLE `locacao`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `distribuidor`
--
ALTER TABLE `distribuidor`
  MODIFY `iddistribuidor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `exemplar`
--
ALTER TABLE `exemplar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `locacao`
--
ALTER TABLE `locacao`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
