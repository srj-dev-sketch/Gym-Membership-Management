import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GymMemberDAO {

    // CREATE - Add new member
    public void addMember(GymMember member) {

        String sql = "INSERT INTO gym_members (name, age, phone, plan, duration) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, member.getName());
            ps.setInt(2, member.getAge());
            ps.setString(3, member.getPhone());
            ps.setString(4, member.getPlan());
            ps.setInt(5, member.getDuration());

            ps.executeUpdate();

            System.out.println("Member added successfully!");

        } catch (Exception e) {
            System.out.println("Failed to add member.");
            e.printStackTrace();
        }
    }

    // READ - Get all members
    public List<GymMember> getAllMembers() {

        List<GymMember> members = new ArrayList<>();

        String sql = "SELECT * FROM gym_members";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                GymMember member = new GymMember(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("phone"),
                    rs.getString("plan"),
                    rs.getInt("duration")
                );

                members.add(member);
            }

        } catch (Exception e) {
            System.out.println("Failed to fetch members.");
            e.printStackTrace();
        }

        return members;
    }

    // UPDATE - Update member details
    public void updateMember(GymMember member) {

        String sql = "UPDATE gym_members SET name=?, age=?, phone=?, plan=?, duration=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, member.getName());
            ps.setInt(2, member.getAge());
            ps.setString(3, member.getPhone());
            ps.setString(4, member.getPlan());
            ps.setInt(5, member.getDuration());
            ps.setInt(6, member.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Member updated successfully!");
            } else {
                System.out.println("Member not found.");
            }

        } catch (Exception e) {
            System.out.println("Failed to update member.");
            e.printStackTrace();
        }
    }

    // DELETE - Delete member
    public void deleteMember(int id) {

        String sql = "DELETE FROM gym_members WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Member deleted successfully!");
            } else {
                System.out.println("Member not found.");
            }

        } catch (Exception e) {
            System.out.println("Failed to delete member.");
            e.printStackTrace();
        }
    }
}