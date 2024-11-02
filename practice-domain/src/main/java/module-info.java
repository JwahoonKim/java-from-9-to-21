open module com.domain {
    exports org.domain;
    exports org.domain.repository;
    provides org.domain.repository.StringRepository with
        org.domain.repository.MemoryStringRepository,
        org.domain.repository.DatabaseStringRepository;
}