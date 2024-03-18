package com.lucianomelo.certification_nlw.modules.students.useCases;

import com.lucianomelo.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyIfHasCertificationDTO dto) {
        if (dto.getEmail().equals("messi@exemplo.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
    return false;

    }

}
