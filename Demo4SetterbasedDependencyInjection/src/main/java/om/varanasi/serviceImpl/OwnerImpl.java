package om.varanasi.serviceImpl;

import om.varanasi.service.Owner;

public class OwnerImpl implements Owner{
	private int add;
	
	public OwnerImpl(int add) {
		this.add = add;
		//System.out.println("OwnerServiceImplementation mock Bean is created!....");
	}

	@Override
	public String addData() {
		return String.format("Added the data from the OwnerImpl %s", add);
		
	}

}
