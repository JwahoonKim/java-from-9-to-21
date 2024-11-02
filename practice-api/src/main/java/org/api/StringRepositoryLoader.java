package org.api;

import java.util.ServiceLoader;

import org.domain.repository.StringRepository;

public class StringRepositoryLoader {
    private static final String DEFAULT = "org.domain.repository.DatabaseStringRepository";

    public static StringRepository getDefault() {
        return getRepository(DEFAULT);
    }

    private static StringRepository getRepository(String name)
    {
        for (StringRepository repository : ServiceLoader.load(StringRepository.class)) {
            if (repository.getClass().getName().equals(name)) {
                return repository;
            } }
        throw new IllegalArgumentException("Repository not found: " + name);
    } }
