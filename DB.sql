USE [master]
GO
/****** Object:  Database [labkurs1]    Script Date: 14-Nov-19 12:26:16 AM ******/
CREATE DATABASE [labkurs1]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'labkurs1', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.DARDANSQL\MSSQL\DATA\labkurs1.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'labkurs1_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.DARDANSQL\MSSQL\DATA\labkurs1_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [labkurs1] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [labkurs1].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [labkurs1] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [labkurs1] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [labkurs1] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [labkurs1] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [labkurs1] SET ARITHABORT OFF 
GO
ALTER DATABASE [labkurs1] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [labkurs1] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [labkurs1] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [labkurs1] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [labkurs1] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [labkurs1] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [labkurs1] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [labkurs1] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [labkurs1] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [labkurs1] SET  ENABLE_BROKER 
GO
ALTER DATABASE [labkurs1] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [labkurs1] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [labkurs1] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [labkurs1] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [labkurs1] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [labkurs1] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [labkurs1] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [labkurs1] SET RECOVERY FULL 
GO
ALTER DATABASE [labkurs1] SET  MULTI_USER 
GO
ALTER DATABASE [labkurs1] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [labkurs1] SET DB_CHAINING OFF 
GO
ALTER DATABASE [labkurs1] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [labkurs1] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [labkurs1] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'labkurs1', N'ON'
GO
ALTER DATABASE [labkurs1] SET QUERY_STORE = OFF
GO
USE [labkurs1]
GO
/****** Object:  Table [dbo].[Doktori]    Script Date: 14-Nov-19 12:26:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Doktori](
	[dID] [int] IDENTITY(1,1) NOT NULL,
	[dName] [varchar](20) NOT NULL,
	[dLast] [varchar](20) NOT NULL,
	[dVitiLindjes] [varchar](20) NOT NULL,
	[dNumber] [varchar](20) NOT NULL,
	[dRoli] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[dID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Pacienti]    Script Date: 14-Nov-19 12:26:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Pacienti](
	[pId] [int] IDENTITY(1,1) NOT NULL,
	[pName] [varchar](20) NULL,
	[pLast] [varchar](20) NULL,
	[pNumber] [int] NULL,
	[pvL] [varchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[pId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Terminet]    Script Date: 14-Nov-19 12:26:16 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Terminet](
	[tId] [int] IDENTITY(1,1) NOT NULL,
	[tKoha] [varchar](20) NOT NULL,
	[tData] [varchar](20) NOT NULL,
	[tDhoma] [varchar](10) NOT NULL,
	[pId] [int] NULL,
	[dID] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[tId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Doktori] ON 

INSERT [dbo].[Doktori] ([dID], [dName], [dLast], [dVitiLindjes], [dNumber], [dRoli]) VALUES (2, N'Dardan', N'Sejdiu', N'1997', N'049838696', N'Gjinekolog')
SET IDENTITY_INSERT [dbo].[Doktori] OFF
SET IDENTITY_INSERT [dbo].[Pacienti] ON 

INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (2, N'Dsa', N'SAD', 3213121, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (4, N'ASDFA', N'FASDF', 1231234321, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (5, N'asd', N'asd', 123, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (8, N'da', N'fass', 123, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (9, N'asd', N'asd', 123, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (10, N'asd', N'asd', 123, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (12, N'qwer', N'qwer', 123, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (13, N'asdasd', N'asdasd', 123134, NULL)
INSERT [dbo].[Pacienti] ([pId], [pName], [pLast], [pNumber], [pvL]) VALUES (14, N'Arif', N'Hoxha', 4654545, NULL)
SET IDENTITY_INSERT [dbo].[Pacienti] OFF
SET IDENTITY_INSERT [dbo].[Terminet] ON 

INSERT [dbo].[Terminet] ([tId], [tKoha], [tData], [tDhoma], [pId], [dID]) VALUES (1, N'asd', N'asd', N'asd', 8, 2)
INSERT [dbo].[Terminet] ([tId], [tKoha], [tData], [tDhoma], [pId], [dID]) VALUES (2, N'asd', N'asd', N'asd', 2, 2)
INSERT [dbo].[Terminet] ([tId], [tKoha], [tData], [tDhoma], [pId], [dID]) VALUES (3, N'asd', N'asd', N'asd', 2, 2)
INSERT [dbo].[Terminet] ([tId], [tKoha], [tData], [tDhoma], [pId], [dID]) VALUES (4, N'13:30', N'13:30', N'1992a', 13, 2)
INSERT [dbo].[Terminet] ([tId], [tKoha], [tData], [tDhoma], [pId], [dID]) VALUES (5, N'', N'', N'', 13, NULL)
INSERT [dbo].[Terminet] ([tId], [tKoha], [tData], [tDhoma], [pId], [dID]) VALUES (6, N'', N'', N'', 13, NULL)
SET IDENTITY_INSERT [dbo].[Terminet] OFF
ALTER TABLE [dbo].[Terminet]  WITH CHECK ADD FOREIGN KEY([dID])
REFERENCES [dbo].[Doktori] ([dID])
GO
ALTER TABLE [dbo].[Terminet]  WITH CHECK ADD FOREIGN KEY([pId])
REFERENCES [dbo].[Pacienti] ([pId])
GO
USE [master]
GO
ALTER DATABASE [labkurs1] SET  READ_WRITE 
GO
