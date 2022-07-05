-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 05, 2022 at 06:12 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pendaftaranbaru`
--

-- --------------------------------------------------------

--
-- Table structure for table `table_daftar`
--

CREATE TABLE `table_daftar` (
  `No_UN` char(7) NOT NULL,
  `Nama_Lengkap` varchar(50) NOT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Tanggal_Lahir` varchar(25) NOT NULL,
  `Asal_Sekolah` varchar(50) NOT NULL,
  `Agama` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `table_daftar`
--

INSERT INTO `table_daftar` (`No_UN`, `Nama_Lengkap`, `Jenis_Kelamin`, `Tanggal_Lahir`, `Asal_Sekolah`, `Agama`) VALUES
('7310986', 'Andhika Arya Sena', 'Laki-Laki', '17 Desember 2000', 'SMP Negeri 1 Depok', 'Protestan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `table_daftar`
--
ALTER TABLE `table_daftar`
  ADD PRIMARY KEY (`No_UN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
