-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2021 at 03:09 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `limas`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminId` int(3) NOT NULL,
  `adminUsername` varchar(99) NOT NULL,
  `adminName` varchar(99) NOT NULL,
  `adminEmail` varchar(99) NOT NULL,
  `adminMob` int(20) NOT NULL,
  `adminPass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminId`, `adminUsername`, `adminName`, `adminEmail`, `adminMob`, `adminPass`) VALUES
(1, 'admin', 'admin', 'admin@gmail.com', 987, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookId` int(255) NOT NULL,
  `bookName` varchar(99) NOT NULL,
  `edition` int(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `author` varchar(99) NOT NULL,
  `price` int(99) NOT NULL,
  `quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookId`, `bookName`, `edition`, `publisher`, `author`, `price`, `quantity`) VALUES
(1, 'hp', 3, 'r pub', 'j k rolling', 300, 3);

-- --------------------------------------------------------

--
-- Table structure for table `isuue`
--

CREATE TABLE `isuue` (
  `teacherId` int(50) DEFAULT NULL,
  `studentId` int(50) DEFAULT NULL,
  `staffId` int(50) DEFAULT NULL,
  `bookid` int(50) DEFAULT NULL,
  `fine` int(255) DEFAULT NULL,
  `dateIssued` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

CREATE TABLE `librarian` (
  `librarianId` int(3) NOT NULL,
  `librarianUsername` varchar(99) NOT NULL,
  `librarianName` varchar(99) NOT NULL,
  `librarianEmail` varchar(99) NOT NULL,
  `librarianMob` int(20) NOT NULL,
  `librarianPass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `librarian`
--

INSERT INTO `librarian` (`librarianId`, `librarianUsername`, `librarianName`, `librarianEmail`, `librarianMob`, `librarianPass`) VALUES
(1, 'a', 'a', 'a@gmail.com', 2323, 'a');

-- --------------------------------------------------------

--
-- Table structure for table `returned`
--

CREATE TABLE `returned` (
  `studentId` int(50) DEFAULT NULL,
  `teacherId` int(50) DEFAULT NULL,
  `staffId` int(50) DEFAULT NULL,
  `bookId` int(50) NOT NULL,
  `dateReturned` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staffId` int(255) NOT NULL,
  `staffName` varchar(99) NOT NULL,
  `staffUsername` varchar(50) NOT NULL,
  `staffEmail` varchar(50) NOT NULL,
  `staffMob` int(20) NOT NULL,
  `staffPass` varchar(255) NOT NULL,
  `totalBook` int(11) DEFAULT NULL,
  `fine` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staffId`, `staffName`, `staffUsername`, `staffEmail`, `staffMob`, `staffPass`, `totalBook`, `fine`) VALUES
(1, 'ram', 'ram p', 'r@gmail.com', 2332232, 'a', 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentId` int(255) NOT NULL,
  `studentName` varchar(99) NOT NULL,
  `studentMob` int(20) NOT NULL,
  `studentEmail` varchar(99) NOT NULL,
  `studentUsername` varchar(99) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `studentPass` varchar(255) NOT NULL,
  `studentRoll` int(50) NOT NULL,
  `semester` int(2) NOT NULL,
  `AdmissionDate` date NOT NULL DEFAULT current_timestamp(),
  `regularBook` int(2) DEFAULT NULL,
  `extraBook` int(2) DEFAULT NULL,
  `fine` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentId`, `studentName`, `studentMob`, `studentEmail`, `studentUsername`, `faculty`, `studentPass`, `studentRoll`, `semester`, `AdmissionDate`, `regularBook`, `extraBook`, `fine`) VALUES
(1, 'sam', 987, 'sam@gmail.com', 'sam', 'bct', 'sam', 0, 6, '2021-04-25', 2, 2, 0),
(2, 'a', 0, 'a', 'a', 'a', 'a', 3, 2, '2021-04-25', NULL, NULL, NULL),
(3, 'k', 987, 'k@gmail.com', 'k', 'sas', 'a', 87, 8, '0172-06-05', NULL, NULL, NULL),
(4, 'm', 6548, 'm@fgmd.com', 'm', 'SD', 'A', 5, 5, '0168-06-01', NULL, NULL, NULL),
(5, 'k', 87, 'g@g.com', 'k', '4', 'a', 87, 7, '2010-01-12', NULL, NULL, NULL),
(6, 'g', 98, 'g@g.com', 'g', 'sd', 's', 55, 2, '2010-01-10', NULL, NULL, NULL),
(7, 'b', 741, 'b@b.com', 'b', 's', 'a', 4, 4, '2010-10-10', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `teacherId` int(5) NOT NULL,
  `teacherUsername` varchar(99) NOT NULL,
  `teacherName` varchar(99) NOT NULL,
  `teacherMob` int(20) NOT NULL,
  `teacherEmail` varchar(99) NOT NULL,
  `faculty` varchar(99) NOT NULL,
  `teacherPass` varchar(255) NOT NULL,
  `totalBook` int(2) DEFAULT NULL,
  `fine` int(99) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminId`),
  ADD UNIQUE KEY `adminId` (`adminId`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bookId`),
  ADD UNIQUE KEY `bookId` (`bookId`);

--
-- Indexes for table `librarian`
--
ALTER TABLE `librarian`
  ADD PRIMARY KEY (`librarianId`),
  ADD UNIQUE KEY `librarianId` (`librarianId`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staffId`),
  ADD UNIQUE KEY `staffId` (`staffId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentId`),
  ADD UNIQUE KEY `studentId` (`studentId`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacherId`),
  ADD UNIQUE KEY `teacherId` (`teacherId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `adminId` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `bookId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `librarian`
--
ALTER TABLE `librarian`
  MODIFY `librarianId` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staffId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `studentId` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `teacherId` int(5) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
