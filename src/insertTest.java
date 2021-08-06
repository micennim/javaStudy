import java.util.Random;

public class insertTest {
    public static void main(String[] args){
        Random rd = new Random();
        String str = null;
        String[] firstName = {"김","이","박","최","정","강","윤","조","김","김","이"};
        String[] lastName = {"동현","지훈","성민","현우","준호","민석","민수","준혁","민준","지후","성민","정훈","상현","철수","동욱","진환","덕규","민기","재형","덕우"};
        String[] cl = {"이병","일병","상병","병장","이병","일병","상병","병장","일병","상병","하사","중사","상사","소위","중위","대위","소령"};
        String[] weapon_now_loc = {"1중대","2중대","본부중대","무기고"};

        String[] out_knd = {"반입"};


        for(int i=0; i<315; i++) {
            int a = rd.nextInt(100);
            int b = rd.nextInt(100);
            int num =rd.nextInt(1000000);
            while(num<99999){
                num=rd.nextInt(1000000);
            }
            int c = rd.nextInt(7);
            int d = rd.nextInt(3);
            int e = rd.nextInt(3);
            int fName = rd.nextInt(firstName.length);
            int lName = rd.nextInt(lastName.length);
            int cln = rd.nextInt(cl.length);
            int weapon_now_loc1 = rd.nextInt(weapon_now_loc.length);
            int out_knd1 = rd.nextInt(out_knd.length);
            int check;
            check = weapon_now_loc1;
            String name;
            String mClass;
            String status = null;
            String knd = null;
            String sort = "현역";
            String loc = "";
            String mugi_seq;
            String mugi_out_knd;
            String seq = "1중대";

            if(e==0){
                loc ="1생활관";
            }else if(e==1){
                loc = "2생활관";
            }else if(e==2){
                loc = "3생활관";
            }

            if(check==3){
                mugi_out_knd="";
                sort="";
                loc="무기고";
                name="";
                mClass="";
                mugi_seq="무기고";
            }else{
                mugi_out_knd=out_knd[out_knd1];
                name=firstName[fName]+lastName[lName];
                mClass=cl[cln];
                mugi_seq=weapon_now_loc[rd.nextInt(weapon_now_loc.length-1)];
            }


            if(d==0){
                knd ="K-1";
            }else if(d==1){
                knd = "K-2";
            }else if(d==2){
                knd = "K-3";
            }


            if(c<6){
                status ="정상";
            }else if(c>5){
                status = "불량";
            }








            // "INSERT INTO tb_weapon_mgmt(weapon_num,weapon_knd,weapon_status,weapon_detail_loc,sector_mgmt_seq,weapon_out_knd,owner_name,owner_class) VALUES("+num+","
            //System.out.println("INSERT INTO test(test1,test2) VALUES("+a+","+b+");");
            System.out.println("INSERT INTO tb_weapon_mgmt(weapon_num,weapon_knd,weapon_status,weapon_sort,weapon_detail_loc,sector_mgmt_seq,weapon_out_knd,owner_name,owner_class,weapon_now_loc) " +
                    "VALUES("+num+",'"+knd+"','"+status+"','"+sort+"','"+loc+"','"+mugi_seq+"','"+mugi_out_knd+"','"+name+"','"+mClass+"'"+",'"+weapon_now_loc[weapon_now_loc1]+"');");
        }

    }
}