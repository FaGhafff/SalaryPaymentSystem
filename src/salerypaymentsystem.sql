-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2020 at 10:30 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `salerypaymentsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `cons`
--

CREATE TABLE `cons` (
  `salaryBase` double(10,2) NOT NULL,
  `annualIncrease` double(10,2) NOT NULL,
  `extraordinaryHousing` double(10,2) NOT NULL,
  `badWeather` double(10,2) NOT NULL,
  `deprivationOfServiecePlace` double(10,2) NOT NULL,
  `familyAllowance` double(10,2) NOT NULL,
  `childrenAllowance` double(10,2) NOT NULL,
  `seniorOrExpertAllowance` double(10,2) NOT NULL,
  `reward` double(10,2) NOT NULL,
  `importantsOfJob` double(10,2) NOT NULL,
  `sacrificePoints` double(10,2) NOT NULL,
  `insurance` double(10,2) NOT NULL,
  `pensionFund` double(10,2) NOT NULL,
  `tax` double(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_persian_ci;

--
-- Dumping data for table `cons`
--

INSERT INTO `cons` (`salaryBase`, `annualIncrease`, `extraordinaryHousing`, `badWeather`, `deprivationOfServiecePlace`, `familyAllowance`, `childrenAllowance`, `seniorOrExpertAllowance`, `reward`, `importantsOfJob`, `sacrificePoints`, `insurance`, `pensionFund`, `tax`) VALUES
(2000.00, 200.00, 56.00, 40.00, 733.00, 50.00, 23.00, 56.00, 30.00, 56.00, 300.00, 30.00, 300.00, 9.00);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `row` int(11) NOT NULL,
  `username` varchar(9) COLLATE utf8mb4_persian_ci NOT NULL,
  `namePersian` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `lastNamePersian` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `nameEnglish` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `lastNameEnglish` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `idNumber` varchar(10) COLLATE utf8mb4_persian_ci NOT NULL,
  `bcNumber` varchar(10) COLLATE utf8mb4_persian_ci NOT NULL,
  `birthPlace` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `issuanceOfBCPlace` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `sexuality` varchar(10) COLLATE utf8mb4_persian_ci NOT NULL,
  `fatherName` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `mobilePhoneNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `telephoneNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `fatherMobileNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `maritalStatus` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `childrenCount` int(2) NOT NULL,
  `healthIssue` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `healthStatus` varchar(70) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactName` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactLastName` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactRelation` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactMobileNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `methodOfIntroduction` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `diplomaType` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `diplomaScore` double(2,2) NOT NULL,
  `associateStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `associatePlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `associateScore` double(2,2) NOT NULL,
  `bachelorStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `bachelorPlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `bachelorScore` double(2,2) NOT NULL,
  `masterStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `masterPlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `masterScore` double(2,2) NOT NULL,
  `doctorateStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `doctoratePlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `doctorateScore` double(2,2) NOT NULL,
  `otherEducation` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `highestDegree` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `majorStatus` varchar(20) COLLATE utf8mb4_persian_ci NOT NULL,
  `startServiceYear` int(4) NOT NULL,
  `startServiceMonth` int(2) NOT NULL,
  `startServiceDay` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_persian_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`row`, `username`, `namePersian`, `lastNamePersian`, `nameEnglish`, `lastNameEnglish`, `idNumber`, `bcNumber`, `birthPlace`, `issuanceOfBCPlace`, `sexuality`, `fatherName`, `mobilePhoneNumber`, `telephoneNumber`, `fatherMobileNumber`, `maritalStatus`, `childrenCount`, `healthIssue`, `healthStatus`, `emergencyContactName`, `emergencyContactLastName`, `emergencyContactRelation`, `emergencyContactMobileNumber`, `methodOfIntroduction`, `diplomaType`, `diplomaScore`, `associateStatus`, `associatePlace`, `associateScore`, `bachelorStatus`, `bachelorPlace`, `bachelorScore`, `masterStatus`, `masterPlace`, `masterScore`, `doctorateStatus`, `doctoratePlace`, `doctorateScore`, `otherEducation`, `highestDegree`, `majorStatus`, `startServiceYear`, `startServiceMonth`, `startServiceDay`) VALUES
(1, '985360001', 'علی', 'فرقانی', 'ali', 'foghani', '1362942138', '123', '', 'تبریز', 'آقا', 'محسن', '9145030651', '4135518773', '-1', 'مجرد', 0, 'گوگل', 'سالم	', 'محمد', 'فرقانی', 'برادر', '9140000000', 'null methodOfIntroduction', 'ریاضی', 0.00, '', '', 0.00, '', 'null bachelorPlace', 0.00, '', '', 0.00, 'null doctorateStatus', '', 0.00, 'null otherEducation', 'highestDegree', 'majorStatus', 2020, 6, 6);

-- --------------------------------------------------------

--
-- Table structure for table `employment`
--

CREATE TABLE `employment` (
  `row` int(11) NOT NULL,
  `namePersian` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `lastNamePersian` varchar(30) CHARACTER SET utf8 COLLATE utf8_persian_ci NOT NULL,
  `nameEnglish` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `lastNameEnglish` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `idNumber` varchar(10) COLLATE utf8mb4_persian_ci NOT NULL,
  `bcNumber` varchar(10) COLLATE utf8mb4_persian_ci NOT NULL,
  `birthPlace` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `issuanceOfBCPlace` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `sexuality` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `fatherName` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `fatherMobileNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `mobilePhoneNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `telephoneNumber` varchar(11) COLLATE utf8mb4_persian_ci NOT NULL,
  `maritalStatus` varchar(30) COLLATE utf8mb4_persian_ci NOT NULL,
  `childrenCount` int(2) NOT NULL,
  `healthIssue` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `healthStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactName` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactLastName` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactRelation` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `emergencyContactMobileNumber` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `methodOfIntroduction` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `diplomaType` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `diplomaScore` double(50,2) NOT NULL,
  `associateStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `associatePlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `associateScore` double(50,2) NOT NULL,
  `bachelorStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `bachelorPlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `bachelorScore` double(50,2) NOT NULL,
  `masterStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `masterPlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `masterScore` double(50,2) NOT NULL,
  `doctorateStatus` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `doctoratePlace` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `doctorateScore` double(50,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_persian_ci;

-- --------------------------------------------------------

--
-- Table structure for table `legalreceipt`
--

CREATE TABLE `legalreceipt` (
  `username` varchar(9) COLLATE utf8mb4_persian_ci NOT NULL,
  `name` varchar(50) COLLATE utf8mb4_persian_ci NOT NULL,
  `salaryBase` double(10,2) NOT NULL,
  `annualIncrease` double(10,2) NOT NULL,
  `extraordinaryHousing` double(10,2) NOT NULL,
  `badWeather` double(10,2) NOT NULL,
  `deprivationOfServiecePlace` double(10,2) NOT NULL,
  `familyAllowance` double(10,2) NOT NULL,
  `childrenAllowance` double(10,2) NOT NULL,
  `seniorOrExpertAllowance` double(10,2) NOT NULL,
  `reward` double(10,2) NOT NULL,
  `importantsOfJob` double(10,2) NOT NULL,
  `sacrificePoints` double(10,2) NOT NULL,
  `insurance` double(10,2) NOT NULL,
  `pensionFund` double(10,2) NOT NULL,
  `tax` double(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_persian_ci;

--
-- Dumping data for table `legalreceipt`
--

INSERT INTO `legalreceipt` (`username`, `name`, `salaryBase`, `annualIncrease`, `extraordinaryHousing`, `badWeather`, `deprivationOfServiecePlace`, `familyAllowance`, `childrenAllowance`, `seniorOrExpertAllowance`, `reward`, `importantsOfJob`, `sacrificePoints`, `insurance`, `pensionFund`, `tax`) VALUES
('985360001', 'علی فرقانی', 2000.00, 200.00, 56.00, 40.00, 733.00, 50.00, 23.00, 56.00, 30.00, 56.00, 300.00, 30.00, 300.00, 9.00);

-- --------------------------------------------------------

--
-- Table structure for table `userpass`
--

CREATE TABLE `userpass` (
  `row` int(11) NOT NULL,
  `user` varchar(9) CHARACTER SET utf8 COLLATE utf8_persian_ci NOT NULL,
  `pass` varchar(32) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_persian_ci;

--
-- Dumping data for table `userpass`
--

INSERT INTO `userpass` (`row`, `user`, `pass`) VALUES
(1, '985360001', '202cb962ac59075b964b07152d234b70');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`username`),
  ADD KEY `row` (`row`);

--
-- Indexes for table `employment`
--
ALTER TABLE `employment`
  ADD KEY `index` (`row`);

--
-- Indexes for table `legalreceipt`
--
ALTER TABLE `legalreceipt`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `userpass`
--
ALTER TABLE `userpass`
  ADD PRIMARY KEY (`user`),
  ADD KEY `index` (`row`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `row` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `employment`
--
ALTER TABLE `employment`
  MODIFY `row` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `userpass`
--
ALTER TABLE `userpass`
  MODIFY `row` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
