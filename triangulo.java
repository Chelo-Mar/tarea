public class triangulo
{
    double cateto1 = 0.0;
    double cateto2= 0.0;
    double hipo=0.0;
    
    double obtenerhipo(double cateto1, double cateto2){
        double hipo=0.0;
        hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        cateto1 =Math.sqrt(Math.pow(hipo, 2) + Math.pow(cateto2, 2));
        cateto2 =Math.sqrt(Math.pow(hipo, 2) + Math.pow(cateto2, 2));
        return hipo ;
    }
        
    double obtenercateto1(double hipo,double cateto2){
           double cateto1=0.0; 
           cateto1 =Math.sqrt(Math.pow(hipo, 2) + Math.pow(cateto2, 2));
           return cateto1;
    }
    }