package TeamSchedulePackage.service;

import TeamSchedulePackage.domain.Emp.Architect;
import TeamSchedulePackage.domain.Emp.Designer;
import TeamSchedulePackage.domain.Emp.Employee;
import TeamSchedulePackage.domain.Emp.Programmer;

/**
 * ClassName: TeamService <br/>
 * Description: 功能：关于开发团队成员的管理：添加、删除等。
 * 说明：
 * counter为静态变量，用来为开发团队新增成员自动生成团队中的唯一ID，
 * 即memberId。（提示：应使用增1的方式）
 * MAX_MEMBER：表示开发团队最大成员数
 * team数组：用来保存当前团队中的各成员对象
 * total：记录团队成员的实际人数
 * date: 2022/5/12 21:24<br/>
 *
 * @author li111<br />
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    int total = 0;

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i=0; i< team.length; i++){
            team[i] = this.team[i];
        }
        return team;
    }

    //将指定员工添加到团队当中
    public void addMember(Employee e) throws TeamException{
//        成员已满，无法添加
        if(total == MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        if(e instanceof Programmer){
            //该员工已是该团队成员
            for (int i=0; i<total; i++){
                if(team[i].getId() == e.getId()){
                    throw new TeamException("该员工已是该团队成员");
                }
            }

            Programmer p = (Programmer) e;
            //该员工已是某团队成员
            if(p.getStatus().getNAME().equals("BUSY")){
                throw new TeamException("该员工已是某团队成员");
            }
            //该员正在休假，无法添加
            if(p.getStatus().getNAME().equals("VOCATION")){
                throw new TeamException("该员正在休假，无法添加");
            }

            //获取各种人员人数
            int numArch=0,numDes=0,numPro=0;
            for (int i = 0; i < total; i++){
                if(team[i] instanceof Architect){
                    numArch++;
                }else if(team[i] instanceof Designer){
                    numDes++;
                }else if (team[i] instanceof Programmer){
                    numPro++;
                }
            }

            //团队中至多只能有一名架构师
            //团队中至多只能有两名设计师
            //团队中至多只能有三名程序员
            if(p instanceof Architect){
                if (numArch >= 1){
                    throw new TeamException("团队中至多只能有一名架构师");
                }
            }else if(p instanceof Designer){
                if (numDes >= 2){
                    throw new TeamException("团队中至多只能有两名设计师");
                }
            }else if (p instanceof Programmer){
                if (numPro >= 3){
                    throw new TeamException("团队中至多只能有三名程序员");
                }
            }

            team[total++] = p;
            p.setMemberId(counter++);
            p.setStatus(Status.BUSY);
        }else{
            //该成员不是开发人员，无法添加
            throw new TeamException("该成员不是开发人员，无法添加");
        }

    }

    //删除团队当中对应成员
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for(; i<total; i++){
            if(team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //未找到指定id
        if(i == total){
            throw new TeamException("未找到指定员工");
        }
        for (int j=i; j<total-1; j++){
            team[j] = team[j+1];
        }

        team[--total] = null;
    }
}
