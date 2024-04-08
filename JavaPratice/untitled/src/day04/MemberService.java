package day04;

public interface MemberService {
    void join(Member member);
    void leave(Member member);
    void update(Member member);

    Member login(Long id, String password);
    Member findById(Long id);
}
