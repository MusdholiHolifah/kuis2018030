package com.example.kuis2018030;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Mahasiswa extends ViewModel{
    private MutableLiveData<String> name,nim;

    public MutableLiveData<String> getName(){
        if(name == null){
            name = new MutableLiveData<>();
        }
        return name;
    }
    public MutableLiveData<String> getNim(){
        if(nim == null){
            nim = new MutableLiveData<>();
        }
        return nim;
    }

    public void setName(String name) {
        this.name.postValue(name);
    }
    public void setNim(String nim) {this.nim.postValue(nim);}
}

