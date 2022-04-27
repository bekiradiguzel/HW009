public class Musluk {

    private int sure;
    private boolean dolduranMi;

    public Musluk(boolean dolduranMi,int sure) {this.dolduranMi = dolduranMi;setSure(sure);
    }

    public Musluk() {
        this(true,1);
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        if (sure>0){
            if(dolduranMi==true){
                this.sure=sure>0?sure:0;
            }else{this.sure = sure < 0 ? sure : -sure;;

    }}}

    public boolean isDolduranMi() {
        return dolduranMi;
    }

    public void setDolduranMi(boolean dolduranMi) {
        this.dolduranMi = dolduranMi;
    }
}
