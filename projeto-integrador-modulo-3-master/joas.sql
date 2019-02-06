-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Tempo de geração: 29/01/2019 às 14:02
-- Versão do servidor: 10.1.10-MariaDB
-- Versão do PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `joas`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `distribuidor`
--

CREATE TABLE `distribuidor` (
  `iddistribuidor` int(11) NOT NULL,
  `cnpj` varchar(30) DEFAULT NULL,
  `nomefantasia` varchar(50) DEFAULT NULL,
  `razaosocial` varchar(50) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cei` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `exemplar`
--

CREATE TABLE `exemplar` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `genero` varchar(10) DEFAULT NULL,
  `sinopse` varchar(100) DEFAULT NULL,
  `numlocalizacao` varchar(5) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `iddistribuidor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
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
-- Fazendo dump de dados para tabela `funcionario`
--

INSERT INTO `funcionario` (`codigo`, `nome`, `telefone`, `cep`, `email`, `rg`, `login`, `senha`, `cpf`) VALUES
(1, 'Jocimar', NULL, '21550-570', 'jocimar@infolink.com.br', NULL, 'qwertyu', 'asdfghjk', ''),
(2, 'Joana', NULL, '24244-244', 'joana4@louca.com.br', NULL, 'loucapra', 'dar4vezes', NULL),
(3, 'deu certo', NULL, '25874-987', 'deucerto@mesmo.com', NULL, 'deucertojk', 'deumuitocerto', NULL);

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `distribuidor`
--
ALTER TABLE `distribuidor`
  ADD PRIMARY KEY (`iddistribuidor`);

--
-- Índices de tabela `exemplar`
--
ALTER TABLE `exemplar`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `distribuidor`
--
ALTER TABLE `distribuidor`
  MODIFY `iddistribuidor` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `exemplar`
--
ALTER TABLE `exemplar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
