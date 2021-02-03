package day05_Unary;

public class unaryOpertors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=10;
		int i2= -100;
		int i3= -(i1+i2);
		System.out.println("i1= " +i1);
		System.out.println("i2= " +i2);
		System.out.println("i3= " +i3);
		
		boolean flag =true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i=10, j=5;
		System.out.println(i++);//10 ayni satirda devreye girmez
		System.out.println(i);//11
		i++;
		--j;
		System.out.println("i="+i); // i=12
		System.out.println("j="+j); //j=4
		// yani println de sagada yada solda olmasi bir sey degistirmiyor
		
		int res=i++ + --j;
		i=i++;
		System.out.println("res="+res); //res 14- i 11- j 3
		//eger println den once bir isleme tabi olurlarsa ++ ya da -- degerin saginda olursa islemi mevcut degeriyle yapar
		// ++ ya da --degerin solunda olursa islem esnasinda yeni deger baza alinir.
		// yani ornekte oldugu gibi i sagda oldugu icin 11 olarak kalir
		// jnin minusi ise solda oldugu icin 4 den 3 e indirilerek hesaplanir
		// boylece sonuc 14 olur
		
		

		

	}

}
