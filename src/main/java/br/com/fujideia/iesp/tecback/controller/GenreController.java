package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.service.GenreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@Slf4j
@RequiredArgsConstructor
@RestController
public class GenreController {

    private final GenreService genreService;

    @GetMapping("/genres")
    @Cacheable(value = "genres")  // Definindo o cache para o nome "genres"
    public List<String> getAllGenres() {
        log.info("teste");
        return genreService.getAllGenres();
    }
}