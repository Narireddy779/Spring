package om.varanasi.serviceImplReal;

import om.varanasi.Repository.OwnerRepository;
import om.varanasi.service.Owner;

public class OwnerServiceImpl implements Owner {
	private OwnerRepository ownerRepository;
	private int add;

	public OwnerServiceImpl(OwnerRepository ownerRepository, int add) {
		this.ownerRepository = ownerRepository;
		this.add = add;
		System.out.println("Real OwnerServiceImplementation mock object created!....");
	}

	@Override
	public String addData() {
	
		return ownerRepository.add(add);
	}

}
