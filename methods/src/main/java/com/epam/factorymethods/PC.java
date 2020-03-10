package com.epam.factorymethods;

	public class PC implements Computer {

		private String RAM;
		private String HDD;
		private String CPU;

		public PC(String ram, String hdd, String cpu) {
			this.RAM = ram;
			this.HDD = hdd;
			this.CPU = cpu;
		}

		public String getRAM() {
			return this.RAM;
		}

		public String getHDD() {
			return this.HDD;
		}

		public String getCPU() {
			return this.CPU;
		}
		

}
	
