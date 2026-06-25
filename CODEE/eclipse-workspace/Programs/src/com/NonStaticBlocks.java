package com;

public class NonStaticBlocks {
	{
			
			System.out.println("NSB - 1");
		}
		
		public static void main(String[] args) {
			NonStaticBlocks nsb = new NonStaticBlocks();
			System.out.println("end");
			
		}
		{
			System.out.println("NSB - 2");
		}
		static {
			System.out.println("SB - 1");
		}


}
