package day04;


public class MemberServiceImpl implements MemberService  {

    private MemoryMemberDAO memoryMemberDAO = new MemoryMemberDAO();

    @Override
    public void join(Member member) {
        memoryMemberDAO.save(member);
    }

    @Override
    public void leave(Member member) {
        memoryMemberDAO.delete(member);
    }

    @Override
    public void update(Member member) {
        memoryMemberDAO.update(member);
    }



    @Override
    public Member login(Long id, String password) {
        Member member = memoryMemberDAO.findById(id);
        if (member != null && member.getPassword().equals(password)) {
            return member;
        } else {
            return null;
        }
    }


    @Override
    public Member findById(Long id) {
        return memoryMemberDAO.findById(id);
    }
}
