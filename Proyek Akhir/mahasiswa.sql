-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2022 at 07:34 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `datamhs`
--

CREATE TABLE `datamhs` (
  `nim` varchar(9) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `fakultas` varchar(50) NOT NULL,
  `prodi` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tahun_masuk` int(4) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datamhs`
--

INSERT INTO `datamhs` (`nim`, `nama`, `fakultas`, `prodi`, `email`, `tahun_masuk`, `status`) VALUES
('123200020', 'Ergyna', 'Teknik Industri', 'Informatika', 'ergyna@gmail.com', 2020, 'Aktif'),
('123200105', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200106', 'Al Jauzi Abdurrohman', 'Teknik Industri', 'Informatika', 'aljauzir@gmail.com', 2020, 'Stress'),
('123200107', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200108', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200109', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200110', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200111', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200112', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200130', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy'),
('123200131', 'dummy', 'dummy', 'dummy', 'dummy', 2020, 'dummy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datamhs`
--
ALTER TABLE `datamhs`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
