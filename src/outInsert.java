import java.util.Random;

public class outInsert {
    public static void main(String[] args){
        Random rd = new Random();
        int weapon_num;
        String[] weapon_knd={"'k-1'","'k-2'","'k-3'"};
        String[] weapon_detail_loc={"'1초소'","'2초소'","'위병소'"};
        String[] weapon_outpurpose={"'근무'","'휴가'"};
        String[] weapon_out_sector={"'1중대'","'3중대'","'2중대'"};
        String weapon_state="'정상'";


        for(int i=0; i<100;i++){
            weapon_num=rd.nextInt(1000000);

            System.out.println("INSERT INTO tb_weapon_out_list(weapon_num,weapon_knd,weapon_detail_loc,weapon_out_purpose,weapon_out_sector_mgmt_seq,weapon_state) VALUES ("
                    +weapon_num+","+weapon_knd[rd.nextInt(weapon_knd.length)]+","+weapon_detail_loc[rd.nextInt(weapon_detail_loc.length)]+","+weapon_outpurpose[rd.nextInt(weapon_outpurpose.length)]
                    +","+weapon_out_sector[rd.nextInt(weapon_out_sector.length)]+","+weapon_state+");");
        }
    }
}
