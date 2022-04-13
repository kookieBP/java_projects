
import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("알람을 확인한 시간을 입력하세요 ( (30분 단위로 입력 ex)3.5))");
//        double time = scan.nextDouble();

//        System.out.println("알람이 울렸으면 true, 안울렸으면 false 를 입력하세요");
//        ringingAlarm = scan.nextBoolean();

//        System.out.println("오늘의 기온을 입력하세요");
//        temper = scan.nextInt();

//        System.out.println("출근 수단 선택: 걸어서, 버스. 택시");
//        trans = scan.next();


        //카페출근하는날
        int temper;
        boolean takeAShower = false;
        boolean putUniform = false;
        boolean putSneakers = false;
        boolean leaveHome = false;
        boolean americano = false;
        boolean latte = false;
        boolean takeAWay = false;
        boolean haveHere = false;

        System.out.println("알람을 확인한 시간을 입력하세요 ( (30분 단위로 입력 ex)3.5))");
        double time = scan.nextDouble();

        if (4.5 <= time && time <= 5) {
            System.out.println("알람을 끄고 침대에서 일어난다");

        } else if (time < 4.5) {
            System.out.println("더 잔다");
            return;
        } else {
            System.out.println("보스에게 지각 보고하기");
        }

        if (4.5 <= time && time <= 5) {
            System.out.println("샤워 양치를 한다");
            takeAShower = true;
        } else if (5 < time) {
            System.out.println("세수 양치만 빠르게 한다");
        } else {
            System.out.println("더 잔다");
        }

        if (takeAShower) {
            System.out.println("기초화장품 바른다 + 화장을 한다");

        } else {
            System.out.println("기초화장품 바른다");
        }

        System.out.println("오늘의 기온을 입력하세요");
        temper = scan.nextInt();


        if (temper <= 18) {
            System.out.println("옷을 입고 외투를 챙기고 외투 주머니에 소지품을 넣는다");
            putUniform = true;
        } else if (temper <= 23) {
            System.out.println("가볍게 입는다");
        } else {
            System.out.println("짧은 옷을 입는다");
        }

        if (putUniform) {
            System.out.println("현관에 가서 운동화를 신는다");
            putSneakers = true;
        } else {
            System.out.println("현관에서 샌들을 신고 운동화는 따로 챙긴다");

        }

        if (putSneakers) {
            System.out.println("문을 열고 나간 후 문을 잠금다");
            leaveHome = true;
        } else {
            System.out.println("신발이 든 가방을 챙기고 문을 열고 나간 후 문을 잠금다 ");
        }


        System.out.println("출근 수단 선택: \"걸어서\",  \"버스\"',  \"택시\"");
        String trans = scan.next();

        if (leaveHome && trans.equals("걸어서")) {
            System.out.println("큰 길로 빠른걸음으로 카페까지 간다");
        } else if (leaveHome && trans.equals("버스")) {
            System.out.println("버스정류장으로 가서 버스 시간을 확인한다");
            System.out.println("버스가 왔으면 숫자 1, 안왔으면 0");
            int busOnTime = scan.nextInt();
            if (busOnTime == 1) {
                System.out.println("버스를 타고 요금을 낸다");
                System.out.println("자리가 있으면 숫자 1, 없으며 0을 입력");
                int takeASeat = scan.nextInt();
                if (takeASeat == 1) {
                    System.out.println("자리에 앉는다");
                } else {
                    System.out.println("서서간다");
                }
                System.out.println("목적지에서 내려서 카페까지 걸어간다");
            } else {
                System.out.println("버스가 안와서 택시를 타려면 \"택시\", 걸어가려면 \"걸어서\"");
                String secondOptionTaxi = scan.next();
                if (secondOptionTaxi.equals("택시")) {
                    System.out.println("택시가 많이 다니는 길가서 택시를 타고 카페까지 간다");
                } else {
                    System.out.println("큰 길로 빠른걸음으로 카페까지 간다");
                }
            }
        } else if (leaveHome && trans.equals("택시")) {
            System.out.println("택시가 많이 다니는 길로 간다");
            System.out.println("택시를 잡았으면 숫자 1, 못잡았으면 0 입력");
            int taxiOnTime = scan.nextInt();
            if (taxiOnTime == 1) {
                System.out.println("택시를 타고 카페에 도착한다");
            } else {
                System.out.println("택시가 안와서 버스를 타려면 \"버스\", 걸어가려면 \"걸어서\"");
                String secondOptionTaxi = scan.next();
                if (secondOptionTaxi.equals("버스")) {
                    System.out.println("버스를 타고 카페에 도착한다");
                } else {
                    System.out.println("큰 길로 빠른걸음으로 카페까지 간다");
                }
            }
        } else {
            System.out.println("다시 선택하세요");
        }


        System.out.println("열쇠를 가지고 있으면 'yes', 다른 사람이 가지고 있으면 'no'");
        String haveAKey = scan.next();

        if (haveAKey.equals("yes")) {
            System.out.println("열쇠로 자물쇠를 문을 열고 들어간다");
        } else {
            System.out.println("이미 열려 있으면 'yes', 안열려 있으면 'no'");
            String someoneHasAKey = scan.next();
            if (someoneHasAKey.equals("yes")) {
                System.out.println("문을 열고 들어간다");
            } else {
                System.out.println("10분정도 기다리고 오면 같이 문 열고 들어간다");
                if (someoneHasAKey.equals("no")) {
                    System.out.println("10분 기다려도 안오면 전화한다. 받으면 'yes', 안받으면 'no'");
                    String takeACall = scan.next();
                    if (takeACall.equals("yes")) {
                        System.out.println("빨리 오라고 하고 오면 같이 문을 열고들어간다");
                    } else if (takeACall.equals("no")) {
                        System.out.println("보스에게 상황을 알리고 보스가 오면 같이 문을 열고 들어간다");
                    } else {
                        System.out.println("누구든 오는걸 기다린다");
                    }
                }
            }
        }


        System.out.println("불을 켜고 야외 테이블 세팅한다. 쓰레기가 있으면 1, 없으면 0");
        int trash = scan.nextInt();
        if (trash == 1) {
            System.out.println("테이븛 세팅을 하고, 쓰레기를 치운다");
        } else {
            System.out.println("테이블 세팅만 한다");
        }

        System.out.println("에스프레소 상태 확인하기");
        System.out.println("에스프레소가 묽으면 \"fine\"을 입력 에스프레소가 잘 안나오면 \"grossa\"를 입력");
        String espresso = scan.next();
        if (espresso.equals("fine")) {
            System.out.println("그라인더를 fine 방향으로 조절한다");
        } else if (espresso.equals("grossa")) {
            System.out.println("그라인더를 grossa 방향으로 조절한다");
        } else {
            System.out.println("커피콩이 없거나 기계 고장 보스에게 전화하가");
        }


        System.out.println("손님 오면 인사하기 입력: \"안녕하세요\" ");
        System.out.println("점내 이용이면 숫자 0 입력, 테이크아웃 숫자 1 입력");
        int toGO = scan.nextInt();

        if (toGO == 0) {
            System.out.println("테이블 안내, 메뉴와 물 전달한다");
            haveHere = true;
        } else {
            System.out.println("테이크 아웃이면 주문을 받는다");
            takeAWay = true;
        }

        System.out.println("주문할 커피 묻고 아메리카노: \"A\", 라뗴: \"L\" 입력");
        String coffee = scan.next();

        if (coffee.equals("L")) {
            System.out.println("우유종류 선택 일반우유: \"F\", 두유: \"S\", 아몬드: \"A\" ");
            String milk = scan.next();

            switch (milk) {
                case "F":
                    System.out.println("일반 라떼");
                    break;
                case "S":
                    System.out.println("두유로 라뗴");
                    break;
                case "A":
                    System.out.println("아몬드 라뗴");
                default:
                    System.out.println("원하는 우유가 없다면 다른 메뉴를 권한다");
                    break;
            }
            latte = true;
        } else {
            System.out.println("원하는 우유가 없다면 다른 메뉴를 권한다");
            americano = true;
        }

        System.out.println("뜨거운거 찬거 질문 뜨거운거: \"H\" 찬거: \"C\"");
        String coffeeTemper = scan.next();

        if (americano && coffeeTemper.equals("H")) {
            System.out.println("뜨거운 아메리카노 숫자 0, 뜨거운 라떼 숫자 1 입력");
            int hotCoffee = scan.nextInt();

            if (hotCoffee == 0) {
                System.out.println("일반 온도면 숫자 0 입력, 더 뜨겁게는 숫자 1, 미지근하게 숫자 2 입력");
                int extraHot = scan.nextInt();

                if (extraHot == 0) {
                    System.out.println("컵에 물 붓고 샷 넣기");
                } else if (extraHot == 1) {
                    System.out.println("컵에 뜨거운 물을 넣어 컵을 데우고, 컵에 물 붓고 샷 넣기");
                } else {
                    System.out.println("컵에 물 붓고 샷 넣고, 얼음 몇조각을 따로 챙긴다");
                }
            }
        } else if (latte && coffeeTemper.equals("H")) {
            System.out.println("일반 온도면 숫자 0 입력, 더 뜨겁게는 숫자 1, 미지근하게 숫자 2 입력");
            int extraHot = scan.nextInt();

            if (extraHot == 0) {
                System.out.println("평소대로 우유스팀 하기");
            } else if (extraHot == 1) {
                System.out.println("평소보다 높은 온도까지 우유스팀 하기");
            } else {
                System.out.println("평소보다 낮은 온도까지 우유스팀 하기");
            }
        } else {
            System.out.println("주문할 커피 묻고 아메리카노: \"A\", 라뗴: \"L\" 입력");
            coffee = scan.next();

            if (coffee.equals("A")) {
                System.out.println("잔에 얼음 물 넣고 샷 넣기");
            } else {
                System.out.println("잔에 얼음 넣고 우유 넣고 샷 넣기");
            }
        }

        if (takeAWay) {
            System.out.println("한가하다 1, 내가 너무 바쁘다 2");
            int help = scan.nextInt();

            if (help == 1) {
                System.out.println("내가 직접 커피를 손님에게 건네고 인사한다");
            } else {
                System.out.println(" 다른 동료에게 부탁한다");
            }
        } else {
            System.out.println("드시고 가시는 손님 주문인지 확인");
        }

        if (haveHere) {
            System.out.println("한가하다 1, 내가 너무 바쁘다 2");
            int help = scan.nextInt();

            if (help == 1) {
                System.out.println("내가 직접 커피를 손님 테이블에 건네고 인사한다");
            } else {
                System.out.println("다른 동료에게 부탁한다");
            }
        } else {
            System.out.println("가지고 가시는 손님 주문인지 확인");
        }


        if (takeAWay) {
            System.out.println("계산을 한다. 카드 1, 현금 2 ");
            int cal = scan.nextInt();

            if (cal == 1) {
                System.out.println("카드 계산후 영수증이 필요하면 1 아니면 0");
                int bill = scan.nextInt();

                if (bill == 1) {
                    System.out.println("영수증을 건넨 후 인사를 한다");
                } else {
                    System.out.println("인사를 한다");
                }

            } else {
                System.out.println("거스름돈 있으면 1, 없으면 0, 잔돈이 없으면 2");
                cal = scan.nextInt();

                if (cal == 1) {
                    System.out.println("돈을 거슬러 주고 인사하기");
                } else if (cal == 0) {
                    System.out.println("인사를 한다");
                } else {
                    System.out.println("옆 가게에서 빌린 후 계산을 하고 인사를 한다");
                }
            }
        } else {
            System.out.println("계산을 못하는 이유, 안하는 이유를 찾아서 해결힌디");
        }


        System.out.println("퇴근시간이 됐고 다음 동료가 안왔으면 0, 왔으면 1 ");
        int timeUp = scan.nextInt();

        if (timeUp == 1) {
            System.out.println("안바쁘면 \"퇴근\", 너무 바쁘면 \"돕기\" 입력");
            String coworker = scan.next();

            if (coworker.equals("퇴근")) {
                System.out.println("인수인계 후 집에 갈 준비 후 퇴근");
            } else {
                System.out.println("바쁘면 같이 돕고 퇴근");
            }
        } else {
            System.out.println("보스에세 연락 후 추가근무 후 퇴근");
        }

        System.out.println("퇴근 후 마트에서 살게 있으면 \"m\", 집에 바로 갈거면 \"h\"");
        String afterWork = scan.next();

        if (afterWork.equals("h")) {
            System.out.println("집에 곧장 같다");
        } else if (afterWork.equals("m")) {
            System.out.println("마트에 들러서 필요한거 사고 집에 간다");
        } else {
            System.out.println("퇴근 후 일정이 있으면 끝내고 집에 간다");
        }

        System.out.println("집 도착후 바로 샤워 1, 운동 후 샤워 2");
        int shower = scan.nextInt();

        if (shower == 1) {
            System.out.println("샤워를 한다");
        } else {
            System.out.println("운동 후 샤워를 한다");
        }

        System.out.println("샤워 후 청소를 할 거면 1, 빨래 2, 청소&빨래 3, 둘 다 아님 4 ");
        int houseWork = scan.nextInt();

        if (houseWork == 1) {
            System.out.println("청소를 한다");
        } else if (houseWork == 2) {
            System.out.println("빨래를 한다");
        } else {
            System.out.println("청소와 빨래를 한다");
        }

        System.out.println("요리 후 밥을 먹고 산책 \"산책\", \"휴식\" 입력");
        String rest = scan.next();

        if (rest.equals("산책")) {
            System.out.println("산책을 다녀 온 후 휴식");
        } else {
            System.out.println("휴식을 취한다");
        }

        System.out.println("일과가 다 끝난 후 시간 입력(정수): ");
        int goToBed = scan.nextInt();

        if (goToBed < 22) {
            System.out.println("조금 더 하고 싶은 걸 하다가 침대로 간다");
        } else {
            System.out.println("자을 자러 침대에 간다");
        }

        System.out.println("내일 시프트 확인 후 출근 하면 1, 안하면 0");
        int sleep = scan.nextInt();

        if (sleep == 1) {
            System.out.println("알람을 설정하고 잔다");
        } else {
            System.out.println("휴대폰을 보다가 잔다");
        }

    }
}


//     if((leaveHome) && (trans.equals("걸어서"))){
//            System.out.println("큰길로 빠른걸으으로 카페까지 간다");
//        }else if(trans.equals("버스")) {
//            System.out.println("버스정류장으로 가서 버스 시간을 확인한다");
//        }else {
//            System.out.println("택시가 많이 다니는 길로 간다");
//        }


//        //만약 takeAShower 가 true 이고 washFaceBrushTeeth 가 true 라면 "샤워하고 양치한다"
//        if (cleanBody) {
//            System.out.println("샤워하고 양치한다");
//            cleanBody = true;
//            //그렇지 않고 washFaceBrushTeeth 가 true 라면 "세수 양치만 빠르게 한다"
//        } else if (washFaceBrushTeeth) {
//            System.out.println("세수 양치만 빠르게 한다");
//            cleanBody = true;
//            //그렇지 않으면 "더 잔다"
//        } else {
//            System.out.println("더 잔다");
//            return;
//        }
//        //만약 "샤워하고 양치한다", "세수 양치만 빠르게 한다" 중 하나가 true 라면 "옷을 입는다"
//        if (cleanBody) {
//            System.out.println("옷을 입는다");
//            putUniform = true;
//        } else {
//            System.out.println("먼저 씻자!");
//        }
//        if (putUniform) {
//            System.out.println("화장품을 바른다");
//            doSkinCare= true;
//        } else {
//            System.out.println("먼저 옷을 입자!");
//        }
//        if (doSkinCare) {
//            System.out.println("가방을 챙긴다");
//            takeABag = true;
//        }else {
//            System.out.println("먼저 화장품을 바르자!");
//        }
//        if (takeABag) {
//            System.out.println("현관으로 가서 신발을 신는다");
//        }else {
//            System.out.println("먼저 가방을 챙기자!");
//        }}
