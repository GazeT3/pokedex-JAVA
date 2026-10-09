package com.gazete.pokedex.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gazete.pokedex.model.CapturedPokemonModel;
import com.gazete.pokedex.model.PokemonModel;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PokemonRepository {

    private static final String CATALOG_RESOURCE = "/pokemon-catalog.json";
    private static final Path COLLECTION_PATH = Path.of("Data/pokemon-collection.json");
    private final ObjectMapper mapper = new ObjectMapper();

    public List<PokemonModel> loadCatalog() throws IOException{
        try (InputStream in = PokemonRepository.class.getResourceAsStream(CATALOG_RESOURCE)){
            if(in == null){
                throw new IOException("Catálogo não encontrado"+CATALOG_RESOURCE);
            }
            return mapper.readValue(in, new TypeReference<List<PokemonModel>>() {
            });
        }
    }
}

