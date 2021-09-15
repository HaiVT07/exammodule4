package codegym.service;


import codegym.model.ThanhPho;

import java.util.ArrayList;

public interface IThanhPhoService {

    ArrayList<ThanhPho> findAll();

    public ThanhPho findById(int id);

    public ThanhPho save(ThanhPho thanhPho);

    public void remove(ThanhPho thanhPho);


}
