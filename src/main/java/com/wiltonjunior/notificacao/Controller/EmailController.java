package com.wiltonjunior.notificacao.Controller;

import com.wiltonjunior.notificacao.Bussiness.DTO.TarefasDTO;
import com.wiltonjunior.notificacao.Bussiness.Service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO dto) {
        emailService.enviarEmail(dto);
        return ResponseEntity.ok().build();
    }
}
