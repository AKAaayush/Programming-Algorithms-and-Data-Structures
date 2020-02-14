-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 08, 2020 at 09:36 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `model_chose_question`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `adminname` varchar(50) NOT NULL,
  `adminpassword` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `adminname`, `adminpassword`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `modulequestion`
--

CREATE TABLE `modulequestion` (
  `id` int(11) NOT NULL,
  `code` int(50) NOT NULL,
  `subject` varchar(250) NOT NULL,
  `question` varchar(250) NOT NULL,
  `answer1` varchar(250) NOT NULL,
  `answer2` varchar(250) NOT NULL,
  `answer3` varchar(250) NOT NULL,
  `answer4` varchar(250) NOT NULL,
  `rightanswer` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `modulequestion`
--

INSERT INTO `modulequestion` (`id`, `code`, `subject`, `question`, `answer1`, `answer2`, `answer3`, `answer4`, `rightanswer`) VALUES
(3, 200, 'Java', 'In Iterator, hasMoreElements() method of Enumeration has been changed to:', 'hasNextElement()', 'isNext()', 'hasNext()', 'name remains same', 'hasNext()'),
(4, 200, 'Java', 'TreeSet internally uses that one to store elements?', 'HashMap', 'LinkedHashMap', 'TreeMap', 'MapHash', 'TreeMap'),
(5, 200, 'Java', 'HashSet internally uses?', 'HashMap', 'LinkedHashMap', 'TreeMap', 'MapHash', 'HashMap'),
(6, 200, 'Java', 'An attempt to add the null key to a TreeSet will result in:', 'Will compile', 'Compile time Exception', 'Error', 'Runtime - NullPointerException ', 'Runtime - NullPointerException '),
(7, 200, 'Java', 'TreeSet maintains which order?', 'Ascending Order', 'Descending Order', 'Numeric Order', 'None of the above', 'Ascending Order'),
(8, 200, 'Java', 'Enumeration returned by ArrayList is', 'Fail-fast', 'Fail-safe', 'Fail-Slow', 'None of the above', 'Fail-fast'),
(9, 200, 'Java', 'LinkedHashMap permits', 'One null key', 'One key', 'One null key/Many null values', 'null value', 'One null key/Many null values'),
(10, 200, 'Java', 'How are you able to sort given HashMap on basis of values', 'It is not possible', 'Implement Comparator interface and override its compareTo method', 'Implement Comparator and Comparable interface', 'Implement Comparator interface and override its compare method', 'Implement Comparator interface and override its compare method'),
(11, 200, 'Java', ' The Comparator interface contains the method?', 'compareWith() ', 'compareTo()', 'compare()', 'compareto()', 'compare()'),
(12, 200, 'Java', 'Which of those is synchronized and does not allow null elements?', 'Vector', 'ConcurrentSkipListSet', 'CopyOnWriteArrayList', 'CopyOnWriteArraySet', 'ConcurrentSkipListSet'),
(13, 203, 'C', 'How many main() function we can have in our project?', '1', '2', 'No Limit', 'Depends on Compiler', '1'),
(14, 203, 'C', 'What is sizeof() in C?', 'Operator', 'Function', 'Macro', 'None of these', 'Operator'),
(15, 203, 'C', 'Which programming language is more faster among these?', 'Java', 'PHP', 'C', ' Visual Basic  ', 'C'),
(16, 203, 'C', 'Which of the following is executed by Preprocess?', 'void main(int argc , char ** argv)', '#include<stdio.h>', 'return 0', 'None of above', '#include<stdio.h>'),
(17, 203, 'C', 'How many loops are there in C', '2', '4', '3', '1', '3'),
(18, 203, 'C', 'When C Language was invented?', '1970', '1979', '1978', ' 1972', ' 1972'),
(19, 203, 'C', 'What is the meaning of below lines? void sum (int, int);', 'sum is function which takes int arguments', ' it will produce compilation error', 'sum is a function which takes two int arguments and returns void', ' Can\'t comment', 'sum is a function which takes two int arguments and returns void'),
(20, 203, 'C', 'The concept of two functions with same name is know as?', 'Operator Overloading', ' Function Overloading', 'Function Overriding', 'Function renaming', ' Function Overloading'),
(21, 203, 'C', 'What is the following is invalid header file in C? ', 'math.h', 'string.h', 'mathio.h', 'ctype.h', 'mathio.h'),
(22, 203, 'C', 'Libray function getch() belongs to which header file?', ' stdio.h', 'stdlibio.h', 'stdlib.h', ' conio.h', ' conio.h'),
(23, 202, 'C++', 'How many loops are there in C++ 98?', '1', '2', '3', '4', '3'),
(24, 202, 'C++', 'What following operator is called  ?:', 'Scope Resolution Operator', 'Conditional Operator', 'Ternary Operator', 'if else o/p', 'Ternary Operator'),
(25, 202, 'C++', 'What is size of int data type in cpp?', ' 2 Bytes', ' 4 Bytes', '1 Byte', ' Depends on Compiler', ' Depends on Compiler'),
(26, 202, 'C++', 'Which operator can not be overloaded?', '::', '*', '-', '+', '::'),
(27, 202, 'C++', 'Which operator has more precedance  in below list?', ' *', '++', '-', '+', '++'),
(28, 202, 'C++', 'Can we typecast void * into int *?', 'Yes', 'No', 'Undefined', ' Depends on Compiler', 'Yes'),
(29, 202, 'C++', 'What is currect syntax of for loop?', ' for(initialization;condition; increment/decrement)', 'for(increment/decrement; initialization; condition)', ' for(initialization, condition, increment/decrement', 'None of These', 'for(initialization;condition; increment/decrement)'),
(30, 202, 'C++', 'Can we overload functions in C++?', ' Yes', 'No', ' Compilation Error', 'Runtime Error', 'Yes'),
(31, 202, 'C++', 'How to access and edit data in data file handling using structures', ' read()', 'write()', 'write()/read()', 'without read()', 'write()/read()'),
(32, 202, 'C++', 'Which operator has highest precedence in * / % ?', ' *', ' /', ' %', ' all have same precedence', ' all have same precedence'),
(33, 201, 'C#', 'CLR is the .NET equivalent of _________.', 'Java Virtual Machine', 'Common Language Runtime', 'Common Type System', 'Common Language Specification', 'Java Virtual Machine'),
(34, 201, 'C#', 'The CLR is physically represented by an assembly named _______.', 'mscoree.dll', 'mcoree.dll', 'msoree.dll', 'mscor.dll', 'mscoree.dll'),
(35, 201, 'C#', 'SOAP stands for __________.', 'Simple Object Access Program', 'Simple Object Access Protocol', 'Simple Object Application Protocol', 'Simple Object Account Protocol', 'Simple Object Account Protocol'),
(36, 201, 'C#', 'The ____ language allows more than one method in a single class.', 'C#', 'J#', 'C++', 'C', 'C#'),
(37, 201, 'C#', 'In C#, a subroutine is called a ________.', 'Function', 'Metadata', 'Method', 'Managed code', 'Method'),
(38, 201, 'C#', 'All C# applications begin execution by calling the _____ method.', 'Class()', 'Main()', 'Submain()', 'Namespace', 'Main()'),
(39, 201, 'C#', 'A _______ is an identifier that denotes a storage location.', 'Constant', 'Reference type', 'Variable', 'Object', 'Variable'),
(40, 201, 'C#', '_________ are reserved, and cannot be used as identifiers.', 'Keywords', 'literal', 'variables', 'Identifiers', 'Keywords'),
(41, 201, 'C#', 'Boxing converts a value type on the stack to an ______ on the heap.', 'Bool type', 'Instance type', 'Class type', 'Object type', 'Object type'),
(42, 201, 'C#', 'The character pair ?: is a________________available in C#.', 'Unary operator', 'Ternary operator', 'Decision operator', 'Functional operator', 'Ternary operator');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `id` int(11) NOT NULL,
  `Firstname` varchar(30) NOT NULL,
  `Lastname` varchar(30) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `tokenno` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`id`, `Firstname`, `Lastname`, `Email`, `UserName`, `Password`, `tokenno`) VALUES
(2, 'a', 'a', 'a', 'a', 'a', 'x54go'),
(3, 'admin', 'admin', 'admin', 'admin', 'admin', '7j7u5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `modulequestion`
--
ALTER TABLE `modulequestion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `modulequestion`
--
ALTER TABLE `modulequestion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `tbluser`
--
ALTER TABLE `tbluser`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
