package com.rauxasoft.gestionguerras.backend.business.services;

import com.rauxasoft.gestionguerras.backend.business.model.Guerra;
import java.util.List;

public interface GuerraServices {
    List<Guerra> getAllGuerras();
    Guerra getGuerraById(Long id);
    Guerra saveGuerra(Guerra guerra);
    Guerra updateGuerra(Guerra guerra);
    void deleteGuerra(Long id);
}
