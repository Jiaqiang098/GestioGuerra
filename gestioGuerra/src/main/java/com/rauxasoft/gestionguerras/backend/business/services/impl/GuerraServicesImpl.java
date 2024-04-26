package com.rauxasoft.gestionguerras.backend.business.services.impl;

import com.rauxasoft.gestionguerras.backend.business.model.Guerra;
import com.rauxasoft.gestionguerras.backend.business.services.GuerraServices;
import java.util.ArrayList;
import java.util.List;

public class GuerraServicesImpl implements GuerraServices {

    private List<Guerra> guerras = new ArrayList<>();

    @Override
    public List<Guerra> getAllGuerras() {
        return new ArrayList<>(guerras);
    }

    @Override
    public Guerra getGuerraById(Long id) {
        return guerras.stream()
                      .filter(g -> g.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }

    @Override
    public Guerra saveGuerra(Guerra guerra) {
        guerras.add(guerra);
        return guerra;
    }

    @Override
    public Guerra updateGuerra(Guerra guerra) {
        int index = guerras.indexOf(guerra);
        if (index != -1) {
            guerras.set(index, guerra);
            return guerra;
        }
        return null;
    }

    @Override
    public void deleteGuerra(Long id) {
        guerras.removeIf(g -> g.getId().equals(id));
    }
}
