/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author KANG_SNAKE
 */
class staff  extends Pegawai{
    private static final int gajistaff=50000;
    private static final int bonusstaff=10000;
    
    public int gaji(){
        return gajistaff;
        
    }
    public int bonus(){
        return bonusstaff;
    }
    
}
