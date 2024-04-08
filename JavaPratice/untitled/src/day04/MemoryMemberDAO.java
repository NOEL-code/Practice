package day04;
import java.util.HashMap;

public class MemoryMemberDAO implements MemberDAO {

    HashMap<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getID(), member);
    }

    @Override
    public void update(Member member) {
        store.put(member.getID(), member);
    }

    @Override
    public void delete(Member member) {
        store.remove(member.getID());
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }
}
