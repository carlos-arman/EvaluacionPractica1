
package EJERCICIO1;

public class horas_trabajadas {
    public double HP;
    public int HT;
    public double SalarioLiquido;
    public      double SalarioTotal = 0;
    public      double renta = 0;

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
    public double getHP() {
        return HP;
    }

    public double getSalarioTotal() {
        return SalarioTotal;
    }

    public void setSalarioTotal(double SalarioTotal) {
        this.SalarioTotal = SalarioTotal;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public int getHT() {
        return HT;
    }

    public void setHT(int HT) {
        this.HT = HT;
    }
    //METODO 
    public double horasExtras(){
        
        
        if(this.getHT() <= 40){
           
           SalarioTotal = this.getHT() * this.getHP();
        }else if (this.getHT() > 40 && this.getHT()<=48){
            
            double HorasExtra = this.getHT() - 40;
            this.SalarioTotal = 40 * this.getHP() + (HorasExtra) * 2 * this.getHP();
            this.renta = SalarioTotal * 0.10;
            this.SalarioLiquido = SalarioTotal - renta;
        }else if(this.getHT() > 48){
            
            double HorasExtra = this.getHT() - 48;
            this.SalarioTotal = 40 * this.getHP() + (HorasExtra) * 3 * this.getHP()+ (8) * 2 * this.HP;
            this.renta = SalarioTotal * 0.10;
            this.SalarioLiquido= SalarioTotal - renta;
            
    }
        
        return SalarioTotal;
    }

    public double getSalarioLiquido() {
        return SalarioLiquido;
    }

    public void setSalarioLiquido(double SalarioLiquido) {
        this.SalarioLiquido = SalarioLiquido;
    }
    
    
    
}
