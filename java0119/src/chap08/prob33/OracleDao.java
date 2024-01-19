package chap08.prob33;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 select");
	}
	@Override
	public void insert() {
		System.out.println("오라클 insert");
	}
	@Override
	public void update() {
		System.out.println("오라클 update");
	}
	@Override
	public void delete() {
		System.out.println("오라클 delete");
	}
}
