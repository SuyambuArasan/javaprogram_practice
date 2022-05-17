package dineshPrograms;

public class Prime {

	public static void main(String[] args) {
		
	int i =0 ;
	int num = 0;
	String Primenumber ="";
	
	for(  i = 1; i<=20; i++)
	{
int counter =0;
for(  num=i; num>=1; num--)
{
	if(i%num==0)
{	
counter=counter+1;		
	}}
if(counter==2)	
{
	Primenumber= Primenumber+i+" "	;
	

}}

System.out.println(Primenumber);



		}}
