module com.api {
    uses org.domain.repository.StringRepository;
    requires com.domain;
    requires java.net.http;
}