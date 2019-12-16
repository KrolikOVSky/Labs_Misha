public class Lab3 
{   
    public static void main(String[] args) {
     int a=356, b=725, c=(b-a)%a+56;        
     System.out.printf("a=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a),a,a,a); 
     System.out.printf("b=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(b),b,b,b); 
     System.out.printf("c=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(c),c,c,c); 
     System.out.printf("-a=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(-a),-a,-a,-a);
     System.out.printf("a+b=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a+b),a+b,a+b,a+b);
     System.out.printf("a-b=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a-b),a-b,a-b,a-b);
     System.out.printf("a*b=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a*b),a*b,a*b,a*b);
     System.out.printf("a/b=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a/b),a/b,a/b,a/b);
     System.out.printf("a%%b=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a%b),a%b,a%b,a%b);
     System.out.printf("a++=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(a++),a,a,a);
     System.out.printf("b--=%s(2)=%x(16)=%o(8)=%s(10)\n",Integer.toBinaryString(b--),b,b,b);
    }
}
