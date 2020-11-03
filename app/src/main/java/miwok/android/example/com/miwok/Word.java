package miwok.android.example.com.miwok;


public class Word {

    private String engWord;
    private String miwWord;
    private int imageRes;
    private int audioRes;

    public Word(String engWord, String miwWord, int imageRes, int audioRes) {
        this.engWord = engWord;
        this.miwWord = miwWord;
        this.imageRes = imageRes;
        this.audioRes = audioRes;
    }

    public Word(String engWord, String miwWord, int audioRes) {
        this.engWord = engWord;
        this.miwWord = miwWord;
        this.audioRes = audioRes;
        imageRes = 0;
    }

    public String getEngWord() {
        return engWord;
    }

    public String getMiwWord() {
        return miwWord;
    }


    public int getImageRes() {
        return imageRes;
    }


    public int getAudioRes() {
        return audioRes;
    }

}


