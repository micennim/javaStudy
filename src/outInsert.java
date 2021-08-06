import java.util.Random;

public class outInsert {
    public static void main(String[] args){
        Random rd = new Random();
        int weapon_num;
        String[] weapon_knd={"'k-1'","'k-2'","'k-3'"};
        String[] weapon_detail_loc={"'1초소'","'2초소'","'위병소'","'행정반'","'지휘통제실'","'1초소'","'2초소'","'위병소'","'행정반'"};
        String[] weapon_outpurpose={"'근무'","'휴가'"};
        String[] weapon_out_sector={"'1중대'","'3중대'","'2중대'"};
        String[] firstName = {"김","이","박","최","정","강","윤","조","김","김","이"};
        String[] lastName = {"동현","지훈","성민","현우","준호","민석","민수","준혁","민준","지후","성민","정훈","상현","철수","동욱","진환","덕규"};
        String[] cl = {"이병","일병","상병","병장","하사","중사","상사","소위","중위","대위","소령","이병","일병","상병","병장","일병","상병"};
        String weapon_state="'정상'";


        for(int i=0; i<100;i++){
            weapon_num=rd.nextInt(1000000);
            int check;
            int fName = rd.nextInt(firstName.length);
            int lName = rd.nextInt(lastName.length);
            int cln = rd.nextInt(cl.length);
            String ch;
            check = rd.nextInt(weapon_outpurpose.length);

            if(check==1){
                ch=weapon_detail_loc[3];
            }else{
                ch=weapon_detail_loc[rd.nextInt(weapon_detail_loc.length-1)];
            }

            System.out.println("INSERT INTO tb_weapon_out_list(weapon_num,weapon_knd,weapon_detail_loc,weapon_out_purpose,weapon_out_sector_mgmt_seq,weapon_state,owner_name,owner_class,weapon_out_now_loc) VALUES ("
                    +weapon_num+","+weapon_knd[rd.nextInt(weapon_knd.length)]+","+ch+","+weapon_outpurpose[check]
                    +","+weapon_out_sector[rd.nextInt(weapon_out_sector.length)]+","+weapon_state+",'"+firstName[fName]+lastName[lName]+"','"+cl[cln]+"',"+weapon_out_sector[rd.nextInt(weapon_out_sector.length)]+");");
        }
    }
}
