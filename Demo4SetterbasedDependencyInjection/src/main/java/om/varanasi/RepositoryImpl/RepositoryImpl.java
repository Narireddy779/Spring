package om.varanasi.RepositoryImpl;

import om.varanasi.Repository.OwnerRepository;

public class RepositoryImpl implements OwnerRepository{
	public RepositoryImpl() {
		System.out.println("OwnerRepositoryImpl Bean is Created...");
	}

	@Override
	public String add(int add) {
		return String.format(" I am RepositoryImpl %s", add);
		
	}

}
