package om.varanasi.serviceImplReal;

import om.varanasi.Repository.OwnerRepository;
import om.varanasi.service.Owner;

public class OwnerServiceImpl implements Owner {
	private OwnerRepository ownerRepository;
	private int add;

	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public OwnerServiceImpl() {
		System.out.println("OwnerServiceImpl default const Bean Created@....");
	};
	
	public OwnerServiceImpl(OwnerRepository ownerRepository, int add) {
		this.ownerRepository = ownerRepository;
		this.add = add;
		System.out.println("Real OwnerServiceImplementation Bean created!....");
	}
	 
	@Override
	public String addData() {

		return ownerRepository.add(add);
	}

}
