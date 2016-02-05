package test.toPhantom;

public class Assigns implements Testable {
    public int j1 = 4;
    public int y1 = j1 * 4;
    

	@Override
	public int runTest() 
	{

		{
	        int x = 9;
	        int y = 10;
	        int z = 0;

	        z += y;
	        z -= x;
			
	        if( z != 1 )	return 1;		
	        if( x != 9 )	return 2;		
	        if( y != 10 )	return 3;		
		}
		
		{
			int i1 = 8;
			int x1 = i1 * i1;

			if( x1 != 64 ) return 4; 
			if( y1 != 16 ) return 5; 			
		}

		// TODO move to conditionals tests
		{
		    
	        int x = 9;
	        int y = 10;

	        boolean b = !(x > y);
	        int b2 = ~x;
			
	        if( b != true)	return 6;
	        if( b2 != -10)	return 7;
		}
		
		return 0;
	}

}
