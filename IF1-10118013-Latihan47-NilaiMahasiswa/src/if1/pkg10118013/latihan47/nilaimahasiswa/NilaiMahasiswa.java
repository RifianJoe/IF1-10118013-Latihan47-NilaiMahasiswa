/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan47.nilaimahasiswa;

/**
 *
 * @author Rifian
 */
public final class NilaiMahasiswa {
    private double quiz;
    private double uts;
    private double uas;
    private final char index;
    private final String keterangan;
    private double nilaiAkhir;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public NilaiMahasiswa(double quiz, double uts, double uas){
        setQuiz(quiz);
        setUts(uts);
        setUas(uas);
        setNilaiAkhir( (0.2 * getQuiz()) + (0.3 * getUts()) + (0.5 * getUas()));
        
        if((nilaiAkhir >= 80) && (nilaiAkhir <= 100)){
                index = ('A');
        }
        else if ((nilaiAkhir >= 68) && (nilaiAkhir < 80)){
                index = 'B';
        }
        else if((nilaiAkhir >= 56) && (nilaiAkhir < 68)){
                index = 'C';
        }
        else if((nilaiAkhir >= 45) && (nilaiAkhir < 56)){
                index = 'D';
        }
        else {
                 index = 'E';
        }
        
        if(index == 'A'){
            keterangan = "Sangat Baik";
        }
        else if(index == 'B'){
             keterangan = "Baik";
        }
        else if(index == 'C'){
            keterangan = "Cukup";
        }
        else if(index == 'D'){
            keterangan = "Kurang";
        }
        else{
            keterangan = "Sangat Kurang";
        }
  
        System.out.println("QUIZ\t\t\t: " + getQuiz());
        System.out.println("UTS\t\t\t: " + getUts());
        System.out.println("UAS\t\t\t: " + getUas());
        System.out.println("");
        System.out.println("Nilai Akhir\t\t: " + getNilaiAkhir());
        System.out.println("");
        System.out.println("Index = " +index);
        System.out.println("Keterangan = " + keterangan);
        System.out.println();
    
    }
}
