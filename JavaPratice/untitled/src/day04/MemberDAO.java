package day04;

public interface MemberDAO {
    void save(Member member);
    void update(Member member);
    void delete(Member member);

    Member findById(Long id);
}
