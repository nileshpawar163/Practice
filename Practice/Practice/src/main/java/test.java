
public class test {

	    String s = "Welcome to UST Nilesh,@@@Very Good Afternoon$$$5%%";
		int len = s.length();	
	    int num=0;
	    
	    public static void main(String args []) {
	    	test t1=new test();
	    	t1.findDuplicate();
	    }
	    void findDuplicate() {
	    	char a[]=null;
			for(int i=0;i<len;i++)
			{
				num=0;
				if(s.charAt(i)!=a[i]) {
				for(int j=i+1;j<len;j++) {
				
				if(s.charAt(i)== s.charAt(j))
				{
					num++;
					a[i]=s.charAt(i);
				}
				
			}
				}
				if(num>1)
					System.out.println( s.charAt(i)+","+ num);

}
	    }
	    
	    
	    

}