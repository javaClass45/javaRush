package com.test.externalisable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

public class UserInfo implements Externalizable {

    private String name;
    private String familija;
    private String secretData;

    private static final long serialVersionID = 2L;

    public UserInfo(){

    }

    public UserInfo(String name, String familija, String secretData) {
        this.name = name;
        this.familija = familija;
        this.secretData = secretData;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeObject(this.getFamilija());
        out.writeObject(this.encryptString(this.getSecretData()));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        familija = (String) in.readObject();
        secretData = this.decryptString((String) in.readObject());
    }

    private String encryptString(String secretData) {
        String encryptedData = Base64.getEncoder().encodeToString(secretData.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decryptString(String data){
        String decripted = new String(Base64.getDecoder().decode(data));
        System.out.println(decripted);
        return decripted;
    }




    public String getName() {
        return name;
    }

    public String getFamilija() {
        return familija;
    }

    public String getSecretData() {
        return secretData;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", familija='" + familija + '\'' +
                ", secretData='" + secretData + '\'' +
                '}';
    }
}
