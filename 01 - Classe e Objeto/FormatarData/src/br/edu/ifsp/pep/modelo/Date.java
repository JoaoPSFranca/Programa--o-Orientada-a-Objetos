package br.edu.ifsp.pep.modelo;

public class Date {
    int mes;
    int dia;
    int ano;

    public Date(int mes, int dia, int ano) {
        setMes(mes);
        setDia(dia);
        setAno(ano);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes <= 12 && mes >= 1)
            this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia <= 31 && dia >= 1)
            this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano >= 1800)
            this.ano = ano;
    }
    
    public String mnostrarData(int dia, int mes, int ano){
        if(dia < 10){
            if(mes < 10){
                return "0" + dia + "/" + "0" + mes + "/" + ano;
            }
            else{
                return "0" + dia + "/" + mes + "/" + ano;
            }
        }
        
        return dia + "/" + mes + "/" + ano;
    } 
}
