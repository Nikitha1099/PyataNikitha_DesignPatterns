package com.epam.factory;


import com.epam.factorymethods.Computer;
import com.epam.factorymethods.PC;
import com.epam.factorymethods.Server;

public class ComputerFactory {

public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

	Computer comp = null;
	switch (type) {
	case PC:
		comp = new PC(ram, hdd, cpu);
		break;
	case SERVER:
		comp = new Server(ram, hdd, cpu);
		break;
	}

	return comp;
}
}