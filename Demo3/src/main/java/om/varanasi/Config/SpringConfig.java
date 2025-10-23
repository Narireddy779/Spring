package om.varanasi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import om.varanasi.Repository.OwnerRepository;
import om.varanasi.RepositoryImpl.RepositoryImpl;
import om.varanasi.service.Owner;
import om.varanasi.serviceImplReal.OwnerServiceImpl;
@Configuration
public class SpringConfig {
	@Bean
	public Owner OwnerImpl() {
		return new om.varanasi.serviceImpl.OwnerImpl(40);
	}
	@Bean("OwnerService")
	public Owner ownerServiceImpl() {
		return new OwnerServiceImpl(ownerRepository(), 50);
	}
	@Bean
	public OwnerRepository ownerRepository() {
		return new RepositoryImpl();
	}
}
