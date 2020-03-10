package com.epam.factorytest;

	

	import com.epam.factorymethods.Computer;
	import com.epam.factory.ComputerFactory;
	import com.epam.factory.ComputerType;

	public class ComputerClient {

		public static void main(String[] args) {

			Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");

			Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
		
		}

	}


