package com.lucianomelo.certification_nlw.modules.students.useCases;

import com.lucianomelo.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.lucianomelo.certification_nlw.modules.students.repositories.CertificationStudentEntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    @Autowired   //Para utilizar um componente gerenciado pelo Spring coloca ele
    private CertificationStudentEntityRepository certificationStudentEntityRepository;

    public boolean execute(VerifyIfHasCertificationDTO dto) {
        var result = this.certificationStudentEntityRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        if (!result.isEmpty()) {
            return true;
        }
    return false;

    }

}
