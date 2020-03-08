package spasimo2;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	ArrayList<Integer> myarraylist;
	String s;
	int mod;
	int position;
	ArrayList<Integer> myarraylist3;
	String s2;
	int mod2;
	int position2;
	static String s3="as";
	
	public ArrayList<Integer> getMyarraylist3() {
		return myarraylist3;}


	public String getS2() {
		return s2;}


	public int getMod2() {
		return mod2;}


	public int getPosition2() {
		return position2;}


	public Calc(ArrayList<Integer> myarraylist, String s, int mod, int position) {
		super();
		this.myarraylist = myarraylist;
		this.s = s;
		this.mod = mod;
		this.position = position;}
	
	
	public void calculate(){
		s3=s3+" + "+s;
		List<Integer> fre=myarraylist.subList(0,position);
		Integer num1;
		
		myarraylist3=new ArrayList();

		for  (int l=0;l<fre.size();l++){
			num1=fre.get(l);
			myarraylist3.add(num1);}

	int max2=0;
	ArrayList<Integer> myarraylist4=new ArrayList();
	for  (int m=0;m<myarraylist3.size();m++){
	myarraylist4.add(mod/myarraylist3.get(m));}

	int min2=mod;
	 position2=0;
	 mod2=-1;
	 s2=new String();

	for (int j=0;j<myarraylist4.size();j++){
		if ((myarraylist4.get(j)<min2&&myarraylist4.get(j)>0))
		{min2=myarraylist4.get(j);
		position2=myarraylist4.indexOf(myarraylist4.get(j));
		s2= min2+"*"+myarraylist3.get(j);
		mod2=mod%myarraylist3.get(j);
		}
		
		else if (mod==1){
			position2=0;
			s2= min2+"*"+myarraylist3.get(0);
			mod2=mod%myarraylist3.get(0);}}


	if (mod2==0)
	{if (s3.startsWith("as"))
		{
		System.out.println("final breaking: "+s3.substring(5)+" + "+s2);
		System.exit(0);}}
		}
		
	}
	