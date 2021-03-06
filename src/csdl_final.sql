USE [master]
GO
/****** Object:  Database [DUAN1-QLKHO]    Script Date: 12/15/2021 9:05:18 PM ******/
CREATE DATABASE [DUAN1-QLKHO]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DUAN1-QLKHO', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\DUAN1-QLKHO.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'DUAN1-QLKHO_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\DUAN1-QLKHO_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [DUAN1-QLKHO] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DUAN1-QLKHO].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DUAN1-QLKHO] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET ARITHABORT OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DUAN1-QLKHO] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DUAN1-QLKHO] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET  DISABLE_BROKER 
GO
ALTER DATABASE [DUAN1-QLKHO] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DUAN1-QLKHO] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET RECOVERY FULL 
GO
ALTER DATABASE [DUAN1-QLKHO] SET  MULTI_USER 
GO
ALTER DATABASE [DUAN1-QLKHO] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DUAN1-QLKHO] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DUAN1-QLKHO] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DUAN1-QLKHO] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [DUAN1-QLKHO] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [DUAN1-QLKHO] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'DUAN1-QLKHO', N'ON'
GO
ALTER DATABASE [DUAN1-QLKHO] SET QUERY_STORE = OFF
GO
USE [DUAN1-QLKHO]
GO
/****** Object:  Table [dbo].[_user]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[_user](
	[username] [varchar](10) NOT NULL,
	[password] [varchar](50) NULL,
	[id] [char](5) NULL,
 CONSTRAINT [PK__user] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Export]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Export](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[staff_id] [char](5) NULL,
	[totalProduct] [int] NULL,
	[totalProductQuantity] [int] NULL,
	[date] [date] NULL,
	[note] [nvarchar](200) NULL,
 CONSTRAINT [PK_Export] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Export_details]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Export_details](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[export_id] [int] NULL,
	[product_batch_id] [int] NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_Export_details] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[invoice]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[invoice](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[staff_id] [char](5) NULL,
	[discount] [float] NULL,
	[amount] [money] NULL,
	[created_date] [date] NULL,
	[debt] [money] NULL,
	[payment_method] [nvarchar](50) NULL,
	[note] [nvarchar](200) NULL,
	[supplier_id] [int] NULL,
	[status] [int] NULL,
 CONSTRAINT [PK_invoice] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[invoice_details]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[invoice_details](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[invoice_id] [int] NULL,
	[product_batch_id] [int] NULL,
	[price] [money] NULL,
	[quantity] [int] NULL,
	[discount] [float] NULL,
	[product_id] [char](7) NULL,
 CONSTRAINT [PK_invoice_details] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[paid]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[paid](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[invoice_id] [int] NULL,
	[price] [float] NULL,
	[date] [date] NULL,
	[staff] [char](5) NULL,
 CONSTRAINT [PK_paid] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id] [char](7) NOT NULL,
	[_name] [nvarchar](200) NULL,
	[image] [varchar](200) NULL,
	[status] [int] NULL,
	[note] [nvarchar](200) NULL,
	[product_group] [int] NULL,
	[product_type] [int] NULL,
	[product_unit] [varchar](10) NULL,
	[vendors_id] [char](5) NULL,
	[price] [float] NULL,
 CONSTRAINT [PK_product] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_batch]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_batch](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[product_id] [char](7) NULL,
	[quantity] [int] NULL,
	[price] [float] NULL,
	[supplier_id] [int] NULL,
	[entered_date] [date] NULL,
	[note] [nvarchar](200) NULL,
 CONSTRAINT [PK_product_batch] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_group]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_group](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
	[descrpition] [nvarchar](200) NULL,
 CONSTRAINT [PK_product_group] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_type]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_type](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
	[description] [nvarchar](200) NULL,
 CONSTRAINT [PK_product_type] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product_unit]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product_unit](
	[id] [varchar](10) NOT NULL,
	[name] [nvarchar](50) NULL,
	[description] [nvarchar](200) NULL,
 CONSTRAINT [PK_product_unit] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shelves]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shelves](
	[id] [int] NOT NULL,
	[description] [nvarchar](200) NULL,
	[status] [bit] NULL,
	[color] [varchar](12) NULL,
 CONSTRAINT [PK_shelves] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shelves_details]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shelves_details](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[shelves_id] [int] NULL,
	[product_batch_id] [int] NULL,
	[quantity] [int] NULL,
 CONSTRAINT [PK_shelves_details] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[staff]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[staff](
	[id] [char](5) NOT NULL,
	[_name] [nvarchar](50) NULL,
	[image] [varchar](200) NULL,
	[phone] [char](10) NULL,
	[email] [varchar](50) NULL,
	[status] [bit] NULL,
	[role] [bit] NULL,
 CONSTRAINT [PK_staff] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[supplier]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[supplier](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NULL,
	[address] [nvarchar](50) NULL,
	[phone] [varchar](50) NULL,
	[email] [varchar](50) NULL,
	[STK] [varchar](50) NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_supplier] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[vendors]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vendors](
	[id] [char](5) NOT NULL,
	[name] [nvarchar](50) NULL,
	[origin] [nvarchar](50) NULL,
 CONSTRAINT [PK_vendors] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[_user] ([username], [password], [id]) VALUES (N'anntt', N'123', N'NV002')
INSERT [dbo].[_user] ([username], [password], [id]) VALUES (N'ductvh', N'abc', N'NV001')
INSERT [dbo].[_user] ([username], [password], [id]) VALUES (N'newuser', N'a', N'NV003')
GO
SET IDENTITY_INSERT [dbo].[Export] ON 

INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (9, N'NV001', 5, 41, CAST(N'2021-12-09' AS Date), N'')
INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (10, N'NV001', 2, 170, CAST(N'2021-12-11' AS Date), N'')
INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (11, N'NV001', 1, 100, CAST(N'2021-12-11' AS Date), N'')
INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (12, N'NV001', 15, 15, CAST(N'2021-12-11' AS Date), N'')
INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (13, N'NV001', 4, 13, CAST(N'2021-12-14' AS Date), N'')
INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (14, N'NV001', 4, 13, CAST(N'2021-12-14' AS Date), N'')
INSERT [dbo].[Export] ([id], [staff_id], [totalProduct], [totalProductQuantity], [date], [note]) VALUES (15, N'NV001', 2, 11, CAST(N'2021-12-14' AS Date), N'')
SET IDENTITY_INSERT [dbo].[Export] OFF
GO
SET IDENTITY_INSERT [dbo].[Export_details] ON 

INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (23, 9, 72, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (24, 9, 71, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (25, 9, 74, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (26, 9, 76, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (27, 9, 75, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (28, 10, 75, 120)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (29, 10, 74, 50)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (30, 11, 76, 100)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (31, 12, 76, 37)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (32, 12, 77, 3)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (33, 12, 84, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (34, 12, 82, 2)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (35, 12, 75, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (36, 12, 79, 3)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (37, 12, 78, 3)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (38, 12, 81, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (39, 12, 73, 99)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (40, 12, 83, 2)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (41, 12, 87, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (42, 12, 80, 3)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (43, 12, 74, 60)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (44, 12, 85, 2)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (45, 12, 86, 20)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (46, 13, 84, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (47, 13, 97, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (48, 13, 93, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (49, 13, 88, 100)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (50, 14, 100, 10)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (51, 14, 99, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (52, 14, 102, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (53, 15, 106, 1)
INSERT [dbo].[Export_details] ([id], [export_id], [product_batch_id], [quantity]) VALUES (54, 15, 85, 10)
SET IDENTITY_INSERT [dbo].[Export_details] OFF
GO
SET IDENTITY_INSERT [dbo].[invoice] ON 

INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (55, N'NV001', 437521000, 1761679000.0000, CAST(N'2021-12-09' AS Date), 0.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (56, N'NV001', 0, 17110000.0000, CAST(N'2021-12-09' AS Date), 0.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc
 Xác nhân bởi: Hoai Duc new', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (57, N'NV001', 0, 12110000.0000, CAST(N'2021-12-09' AS Date), 0.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (58, N'NV001', 0, 12100000.0000, CAST(N'2021-12-09' AS Date), 0.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc
 Xác nhân bởi: Hoai Duc', 2, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (59, N'NV001', 0, 12000000.0000, CAST(N'2021-12-09' AS Date), 0.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (60, N'NV002', 0, 12100000.0000, CAST(N'2021-12-11' AS Date), 12100000.0000, N'Tiền mặt', N'
 Hủy bởi: Hoai Duc
 Hủy bởi: Hoai Duc new
 Hủy bởi: Hoai Duc new
 Hủy bởi: Hoai Duc new', 1, 2)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (61, N'NV001', 0, 12100000.0000, CAST(N'2021-12-11' AS Date), 0.0000, N'Tiền mặt', N'', 2, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (62, N'NV001', 0, 120000000.0000, CAST(N'2021-12-11' AS Date), 0.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (63, N'NV001', 0, 12000000.0000, CAST(N'2021-12-11' AS Date), 12000000.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc new
 Xác nhân bởi: Hoai Duc new
 Xác nhân bởi: Hoai Duc new', 2, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (64, N'NV001', 0, 120000000.0000, CAST(N'2021-12-11' AS Date), 12000000.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (65, N'NV001', 0, 70000000.0000, CAST(N'2021-12-11' AS Date), 0.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (66, N'NV001', 950000000, 950000000.0000, CAST(N'2021-12-11' AS Date), 0.0000, N'Tiền mặt', N'', 2, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (67, N'NV001', 0, 872102300.0000, CAST(N'2021-12-11' AS Date), 0.0000, N'Tiền mặt', N'', 2, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (68, N'NV001', 0, 100000.0000, CAST(N'2021-12-11' AS Date), 100000.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (69, N'NV001', 0, 110000.0000, CAST(N'2021-12-13' AS Date), 110000.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (70, N'NV002', 700044, 6502256.0000, CAST(N'2021-12-14' AS Date), 0.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc new', 2, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (71, N'NV001', 0, 100120.0000, CAST(N'2021-12-14' AS Date), 0.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (72, N'NV001', 0, 7000000.0000, CAST(N'2021-12-14' AS Date), 7000000.0000, N'Tiền mặt', N'
 Hủy bởi: Hoai Duc new', 1, 2)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (73, N'NV001', 0, 0.0000, CAST(N'2021-12-14' AS Date), 0.0000, N'Tiền mặt', N'', 1, 0)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (74, N'NV001', 0, 12000000.0000, CAST(N'2021-12-14' AS Date), 12000000.0000, N'Tiền mặt', N'
 Xác nhân bởi: Hoai Duc new', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (75, N'NV001', 0, 24010110.0000, CAST(N'2021-12-14' AS Date), 0.0000, N'Tiền mặt', N'', 1, 0)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (76, N'NV001', 0, 19000110.0000, CAST(N'2021-12-14' AS Date), 0.0000, N'Tiền mặt', N'', 1, 1)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (77, N'NV001', 0, 12110110.0000, CAST(N'2021-12-14' AS Date), 0.0000, N'Tiền mặt', N'', 1, 0)
INSERT [dbo].[invoice] ([id], [staff_id], [discount], [amount], [created_date], [debt], [payment_method], [note], [supplier_id], [status]) VALUES (78, N'NV001', 0, 5000000.0000, CAST(N'2021-12-15' AS Date), 5000000.0000, N'Tiền mặt', N'', 1, 0)
SET IDENTITY_INSERT [dbo].[invoice] OFF
GO
SET IDENTITY_INSERT [dbo].[invoice_details] ON 

INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (95, 55, 71, 5000000.0000, 10, 7, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (96, 55, 72, 100000.0000, 1, 8, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (97, 55, 73, 7000000.0000, 99, 50, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (98, 55, 74, 12000000.0000, 120, 6, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (99, 55, 75, 10000.0000, 140, 6, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (100, 55, 76, 100000.0000, 147, 7, N'1      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (117, 57, 80, 5000000.0000, 1, 0, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (118, 57, 80, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (119, 57, 81, 7000000.0000, 1, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (120, 57, 81, 10000.0000, 1, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (126, 58, 83, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (127, 58, 83, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (128, 59, 83, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (129, 60, NULL, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (130, 60, NULL, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (131, 61, 84, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (132, 61, 85, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (133, 62, 86, 12000000.0000, 10, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (136, 64, 86, 12000000.0000, 10, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (137, 65, 87, 7000000.0000, 10, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (138, 66, 88, 12000000.0000, 100, 50, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (139, 66, 89, 7000000.0000, 100, 50, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (140, 67, 90, 100000.0000, 10, 0, N'1      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (141, 67, 91, 120.0000, 10, 0, N'5      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (142, 67, 91, 100000.0000, 10, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (143, 67, 92, 110.0000, 10, 0, N'6      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (144, 67, 93, 5000000.0000, 10, 0, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (145, 67, 94, 10000.0000, 10, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (146, 67, 95, 7000000.0000, 100, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (147, 67, 95, 12000000.0000, 10, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (148, 68, 96, 100000.0000, 1, 0, N'1      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (149, 69, 97, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (150, 69, 98, 10000.0000, 1, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (156, 70, 99, 110.0000, 10, 4, N'6      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (157, 70, 100, 10000.0000, 10, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (158, 70, 101, 7000000.0000, 1, 10, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (159, 70, 102, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (160, 70, 103, 120.0000, 10, 0, N'5      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (161, 71, 104, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (162, 71, 105, 120.0000, 1, 0, N'5      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (163, 72, NULL, 7000000.0000, 1, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (165, 74, 106, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (166, 75, NULL, 110.0000, 1, 0, N'6      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (167, 75, NULL, 10000.0000, 1, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (168, 75, NULL, 7000000.0000, 1, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (169, 75, NULL, 5000000.0000, 1, 0, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (170, 75, NULL, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (171, 76, 107, 7000000.0000, 1, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (172, 76, 107, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (173, 76, 108, 110.0000, 1, 0, N'6      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (174, 77, NULL, 110.0000, 1, 0, N'6      ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (175, 77, NULL, 10000.0000, 1, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (176, 77, NULL, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (177, 77, NULL, 7000000.0000, 1, 0, N'TL001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (178, 77, NULL, 5000000.0000, 1, 0, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (179, 78, NULL, 5000000.0000, 1, 0, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (182, 63, 108, 12000000.0000, 1, 0, N'TVSS4K ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (183, 56, 108, 5000000.0000, 1, 0, N'DH001  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (184, 56, 108, 10000.0000, 1, 0, N'SPMOI  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (185, 56, 108, 100000.0000, 1, 0, N'SPABC  ')
INSERT [dbo].[invoice_details] ([id], [invoice_id], [product_batch_id], [price], [quantity], [discount], [product_id]) VALUES (186, 56, 108, 12000000.0000, 1, 0, N'TVSS4K ')
SET IDENTITY_INSERT [dbo].[invoice_details] OFF
GO
SET IDENTITY_INSERT [dbo].[paid] ON 

INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (12, 55, 1761679000, CAST(N'2021-12-09' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (13, 56, 12547891, CAST(N'2021-12-09' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (14, 56, 4562109, CAST(N'2021-12-09' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (15, 58, 12100000, CAST(N'2021-12-09' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (16, 59, 12000000, CAST(N'2021-12-09' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (17, 57, 12110000, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (18, 60, 0, CAST(N'2021-12-11' AS Date), N'NV002')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (19, 61, 0, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (20, 61, 12100000, CAST(N'2021-12-11' AS Date), N'NV002')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (21, 62, 120000000, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (22, 63, 0, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (23, 64, 0, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (24, 65, 0, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (25, 65, 70000000, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (26, 66, 950000000, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (27, 67, 872102300, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (28, 68, 0, CAST(N'2021-12-11' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (29, 69, 210000, CAST(N'2021-12-13' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (30, 70, 30000, CAST(N'2021-12-14' AS Date), N'NV002')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (31, 70, 3502256, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (32, 71, 100120, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (33, 71, 100120, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (34, 72, 0, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (35, 73, 0, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (36, 74, 0, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (37, 75, 24010110, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (38, 76, 19000110, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (39, 77, 12110110, CAST(N'2021-12-14' AS Date), N'NV001')
INSERT [dbo].[paid] ([id], [invoice_id], [price], [date], [staff]) VALUES (40, 78, 0, CAST(N'2021-12-15' AS Date), N'NV001')
SET IDENTITY_INSERT [dbo].[paid] OFF
GO
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'1      ', N'Test', N'cpp.png', 1, N'Test', 3, 1, N'CAI', N'NSX01', 100000)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'5      ', N'100 chú mèo', NULL, 1, N'Mỗi chú 5 lạng :xD', 5, 4, N'1TMEO', N'NSX01', 120)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'6      ', N'100 chú mèo con', NULL, 1, N'1 chú 5 lạng :xD', 5, 4, N'1TMEO', N'NSX01', 110)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'DH001  ', N'Điều Hòa 01', NULL, 1, N'TSKT', 4, 6, N'CAI', N'LG_VN', 5000000)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'SPABC  ', N'San Pham Demo', NULL, 0, N'TSKT', 2, 1, N'CAI', N'SS-VN', 100000)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'SPMOI  ', N'Test 02', NULL, 1, N'Test 02', 1, 1, N'CAI', N'NSX01', 10000)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'SPNEW  ', N'San Pham neww', NULL, 1, N'Dang cap nhat', 4, 3, N'CAI', N'LG_VN', 6869000)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'TL001  ', N'Tủ Lạnh Mới', NULL, 0, N'', 4, 7, N'CAI', N'LG_VN', 7000000)
INSERT [dbo].[product] ([id], [_name], [image], [status], [note], [product_group], [product_type], [product_unit], [vendors_id], [price]) VALUES (N'TVSS4K ', N'Tivi Sam Sung 4k', N'ruby.jpg', 1, N'Chưa có', 1, 5, N'CAI', N'SS-VN', 12000000)
GO
SET IDENTITY_INSERT [dbo].[product_batch] ON 

INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (71, N'DH001  ', 0, 4650000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (72, N'SPABC  ', 0, 92000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (73, N'TL001  ', 0, 3500000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (74, N'TVSS4K ', 0, 11280000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (75, N'SPMOI  ', 0, 9400, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (76, N'1      ', 0, 93000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (77, N'DH001  ', 1, 5000000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (78, N'SPMOI  ', 1, 10000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (79, N'SPABC  ', 1, 100000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (80, N'TVSS4K ', 1, 12000000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (81, N'TL001  ', 0, 7000000, 1, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (82, N'SPABC  ', 0, 100000, 2, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (83, N'TVSS4K ', 0, 12000000, 2, CAST(N'2021-12-09' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (84, N'SPABC  ', 0, 100000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (85, N'TVSS4K ', 3, 12000000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (86, N'TVSS4K ', 0, 12000000, 1, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (87, N'TL001  ', 0, 7000000, 1, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (88, N'TVSS4K ', 0, 6000000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (89, N'TL001  ', 100, 3500000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (90, N'1      ', 10, 100000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (91, N'5      ', 10, 120, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (92, N'6      ', 10, 110, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (93, N'DH001  ', 9, 5000000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (94, N'SPMOI  ', 10, 10000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (95, N'TL001  ', 100, 7000000, 2, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (96, N'1      ', 1, 100000, 1, CAST(N'2021-12-11' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (97, N'SPABC  ', 0, 100000, 1, CAST(N'2021-12-13' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (98, N'SPMOI  ', 1, 10000, 1, CAST(N'2021-12-13' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (99, N'6      ', 9, 105.6, 2, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (100, N'SPMOI  ', 0, 10000, 2, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (101, N'TL001  ', 1, 6300000, 2, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (102, N'SPABC  ', 0, 100000, 2, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (103, N'5      ', 10, 120, 2, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (104, N'SPABC  ', 1, 100000, 1, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (105, N'5      ', 1, 120, 1, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (106, N'TVSS4K ', 1, 12000000, 1, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (107, N'TL001  ', 1, 7000000, 1, CAST(N'2021-12-14' AS Date), NULL)
INSERT [dbo].[product_batch] ([id], [product_id], [quantity], [price], [supplier_id], [entered_date], [note]) VALUES (108, N'6      ', 1, 110, 1, CAST(N'2021-12-14' AS Date), NULL)
SET IDENTITY_INSERT [dbo].[product_batch] OFF
GO
SET IDENTITY_INSERT [dbo].[product_group] ON 

INSERT [dbo].[product_group] ([id], [name], [descrpition]) VALUES (1, N'Điện tử', N'đồ điện tử gia dụng')
INSERT [dbo].[product_group] ([id], [name], [descrpition]) VALUES (2, N'Đồ nhựa', N'Đồ nhựa dẻo')
INSERT [dbo].[product_group] ([id], [name], [descrpition]) VALUES (3, N'Nhóm mới', N'test cbx')
INSERT [dbo].[product_group] ([id], [name], [descrpition]) VALUES (4, N'Điện Lạnh', N'Điều hòa, bình nước nóng, tủ lạnh...')
INSERT [dbo].[product_group] ([id], [name], [descrpition]) VALUES (5, N'Mèo Cưng', N'mèo cưng')
INSERT [dbo].[product_group] ([id], [name], [descrpition]) VALUES (6, N'Đồ Gia Dụng', N'Đồ gia dụng')
SET IDENTITY_INSERT [dbo].[product_group] OFF
GO
SET IDENTITY_INSERT [dbo].[product_type] ON 

INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (1, N'Đồ chơi trẻ em', N'Chua có mô t?')
INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (2, N'Ấm Siêu Tốc', N'Chưa có mô tả')
INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (3, N'Điều Hòa', N'Máy lạnh')
INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (4, N'Mèo Mướp', N'mèo VN')
INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (5, N'TV', N'Tivi')
INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (6, N'Máy Lạnh', N'điều hòa, máy lạnh')
INSERT [dbo].[product_type] ([id], [name], [description]) VALUES (7, N'Tủ Lạnh', N'tủ lạnh')
SET IDENTITY_INSERT [dbo].[product_type] OFF
GO
INSERT [dbo].[product_unit] ([id], [name], [description]) VALUES (N'1TMEO', N'Mèo', N'1 đơn vị = 100 con mèo')
INSERT [dbo].[product_unit] ([id], [name], [description]) VALUES (N'CAI', N'Cái', N'Chưa có mô tả')
GO
INSERT [dbo].[shelves] ([id], [description], [status], [color]) VALUES (0, N'Mặc định', 1, N'-2696737')
INSERT [dbo].[shelves] ([id], [description], [status], [color]) VALUES (1, N'mô ta', 1, N'-3407770')
INSERT [dbo].[shelves] ([id], [description], [status], [color]) VALUES (2, N'Chưa có mô tả', 1, N'-2696737')
INSERT [dbo].[shelves] ([id], [description], [status], [color]) VALUES (3, N'Chưa có mô tả', 1, N'-2696737')
INSERT [dbo].[shelves] ([id], [description], [status], [color]) VALUES (4, N'Chưa có mô tả', 1, N'-2696737')
INSERT [dbo].[shelves] ([id], [description], [status], [color]) VALUES (5, N'Chưa có mô tả', 1, N'-2696737')
GO
SET IDENTITY_INSERT [dbo].[shelves_details] ON 

INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (581, 1, 99, 9)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (582, 1, 108, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (583, 1, 77, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (584, 1, 93, 9)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (585, 1, 79, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (586, 1, 104, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (587, 1, 78, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (588, 1, 94, 10)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (589, 1, 98, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (590, 1, 95, 100)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (591, 1, 89, 100)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (592, 1, 107, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (593, 1, 101, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (594, 1, 80, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (595, 2, 85, 2)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (596, 2, 106, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (602, 0, 92, 20)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (607, 3, 103, 10)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (608, 3, 105, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (609, 0, 85, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (610, 0, 90, 20)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (611, 0, 96, 1)
INSERT [dbo].[shelves_details] ([id], [shelves_id], [product_batch_id], [quantity]) VALUES (612, 0, 91, 10)
SET IDENTITY_INSERT [dbo].[shelves_details] OFF
GO
INSERT [dbo].[staff] ([id], [_name], [image], [phone], [email], [status], [role]) VALUES (N'NV001', N'Hoai Duc new', N'fpl.png', N'0973588761', N'hoaiduc@gmail.com', 1, 1)
INSERT [dbo].[staff] ([id], [_name], [image], [phone], [email], [status], [role]) VALUES (N'NV002', N'Nguyen Thi Thuy An', N'fpl.png', N'0147852369', N'thuyan@gmail.com', 1, 0)
INSERT [dbo].[staff] ([id], [_name], [image], [phone], [email], [status], [role]) VALUES (N'NV003', N'Nhan Vien', NULL, N'0123456890', N'ductr@gmail.com', 1, 1)
INSERT [dbo].[staff] ([id], [_name], [image], [phone], [email], [status], [role]) VALUES (N'NV005', N'Nhân Viên mới', NULL, N'0123456789', N'sad@gmail.com', 1, 0)
GO
SET IDENTITY_INSERT [dbo].[supplier] ON 

INSERT [dbo].[supplier] ([id], [name], [address], [phone], [email], [STK], [status]) VALUES (1, N'Fpoly', N'137 Nguyễn Thị Thập', N'023644686868', N'mail@gmail.com', N'040087238123', 1)
INSERT [dbo].[supplier] ([id], [name], [address], [phone], [email], [STK], [status]) VALUES (2, N'Nhom 2', N'148 Dung Si Thanh Khe', N'0971965285', N'email@gmail.com', N'040087238123', 1)
SET IDENTITY_INSERT [dbo].[supplier] OFF
GO
INSERT [dbo].[vendors] ([id], [name], [origin]) VALUES (N'LG_VN', N'LG', N'Hàn Quốc')
INSERT [dbo].[vendors] ([id], [name], [origin]) VALUES (N'NSX01', N'Nhà SX 01', N'Việt Nam')
INSERT [dbo].[vendors] ([id], [name], [origin]) VALUES (N'SS-VN', N'SamSung', N'Han Quoc')
GO
ALTER TABLE [dbo].[_user]  WITH CHECK ADD  CONSTRAINT [FK__user_staff] FOREIGN KEY([id])
REFERENCES [dbo].[staff] ([id])
GO
ALTER TABLE [dbo].[_user] CHECK CONSTRAINT [FK__user_staff]
GO
ALTER TABLE [dbo].[Export]  WITH CHECK ADD  CONSTRAINT [FK_Export_staff] FOREIGN KEY([staff_id])
REFERENCES [dbo].[staff] ([id])
GO
ALTER TABLE [dbo].[Export] CHECK CONSTRAINT [FK_Export_staff]
GO
ALTER TABLE [dbo].[Export_details]  WITH CHECK ADD  CONSTRAINT [FK_Export_details_Export] FOREIGN KEY([export_id])
REFERENCES [dbo].[Export] ([id])
GO
ALTER TABLE [dbo].[Export_details] CHECK CONSTRAINT [FK_Export_details_Export]
GO
ALTER TABLE [dbo].[invoice]  WITH CHECK ADD  CONSTRAINT [FK_invoice_staff] FOREIGN KEY([staff_id])
REFERENCES [dbo].[staff] ([id])
GO
ALTER TABLE [dbo].[invoice] CHECK CONSTRAINT [FK_invoice_staff]
GO
ALTER TABLE [dbo].[invoice]  WITH CHECK ADD  CONSTRAINT [FK_invoice_supplier] FOREIGN KEY([supplier_id])
REFERENCES [dbo].[supplier] ([id])
GO
ALTER TABLE [dbo].[invoice] CHECK CONSTRAINT [FK_invoice_supplier]
GO
ALTER TABLE [dbo].[invoice_details]  WITH CHECK ADD  CONSTRAINT [FK_invoice_details_invoice] FOREIGN KEY([invoice_id])
REFERENCES [dbo].[invoice] ([id])
GO
ALTER TABLE [dbo].[invoice_details] CHECK CONSTRAINT [FK_invoice_details_invoice]
GO
ALTER TABLE [dbo].[invoice_details]  WITH CHECK ADD  CONSTRAINT [FK_invoice_details_product_batch] FOREIGN KEY([product_batch_id])
REFERENCES [dbo].[product_batch] ([id])
GO
ALTER TABLE [dbo].[invoice_details] CHECK CONSTRAINT [FK_invoice_details_product_batch]
GO
ALTER TABLE [dbo].[paid]  WITH CHECK ADD  CONSTRAINT [FK_paid_invoice] FOREIGN KEY([invoice_id])
REFERENCES [dbo].[invoice] ([id])
GO
ALTER TABLE [dbo].[paid] CHECK CONSTRAINT [FK_paid_invoice]
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_product_group] FOREIGN KEY([product_group])
REFERENCES [dbo].[product_group] ([id])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_product_group]
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_product_type] FOREIGN KEY([product_type])
REFERENCES [dbo].[product_type] ([id])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_product_type]
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_product_unit] FOREIGN KEY([product_unit])
REFERENCES [dbo].[product_unit] ([id])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_product_unit]
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK_product_vendors] FOREIGN KEY([vendors_id])
REFERENCES [dbo].[vendors] ([id])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK_product_vendors]
GO
ALTER TABLE [dbo].[product_batch]  WITH CHECK ADD  CONSTRAINT [FK_product_batch_product] FOREIGN KEY([product_id])
REFERENCES [dbo].[product] ([id])
GO
ALTER TABLE [dbo].[product_batch] CHECK CONSTRAINT [FK_product_batch_product]
GO
ALTER TABLE [dbo].[shelves_details]  WITH CHECK ADD  CONSTRAINT [FK_shelves_details_product_batch] FOREIGN KEY([product_batch_id])
REFERENCES [dbo].[product_batch] ([id])
GO
ALTER TABLE [dbo].[shelves_details] CHECK CONSTRAINT [FK_shelves_details_product_batch]
GO
ALTER TABLE [dbo].[shelves_details]  WITH CHECK ADD  CONSTRAINT [FK_shelves_details_shelves] FOREIGN KEY([shelves_id])
REFERENCES [dbo].[shelves] ([id])
GO
ALTER TABLE [dbo].[shelves_details] CHECK CONSTRAINT [FK_shelves_details_shelves]
GO
/****** Object:  StoredProcedure [dbo].[sp_KhoHang]    Script Date: 12/15/2021 9:05:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[sp_KhoHang] @kho int
as 
begin
select shelves_id,product._name,convert(char,product_batch.entered_date,105),shelves_details.quantity from shelves_details  inner join product_batch
on product_batch.id = shelves_details.product_batch_id 
inner join product on product_batch.product_id = product.id
where shelves_id = @kho
end
GO
USE [master]
GO
ALTER DATABASE [DUAN1-QLKHO] SET  READ_WRITE 
GO
