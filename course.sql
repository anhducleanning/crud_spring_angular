-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 04, 2022 at 01:58 PM
-- Server version: 5.7.33
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cource`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_id` int(11) NOT NULL,
  `title` varchar(80) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `description` varchar(500) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `link` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_id`, `title`, `description`, `link`) VALUES
(1, 'Java can ban', 'Giup ban lam quen voi ngon ngu Java', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ'),
(2, 'C# can ban va nang cao', 'Tim hieu va thuc hanh C# trong thuc te', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ'),
(3, 'JavaScrip can ban', 'Lam quen voi JavaScrip', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ'),
(4, 'Lam quen voi C++', 'Buoc dau lam quen voi ngon ngu lap trinh', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ'),
(5, 'Angular 13', 'Co gi moi trong Angular 13', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ'),
(6, 'Spring', 'New Spring', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ'),
(7, 'Spring', 'New Spring', 'https://www.youtube.com/watch?v=bXpwNyDS6LQ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `course_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
