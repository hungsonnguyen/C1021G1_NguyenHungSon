package case_study.servie.Imp;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.model.person.Employee;
import case_study.servie.IFacilityService;
import case_study.until.ReadAndWrite;
import case_study.until.RegexData;

import java.io.*;
import java.util.*;

public class FacilityServiceImp implements IFacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static final String PROFILE_VILLA = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\data\\villa.csv";
    private static final String PROFILE_HOUSE = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\data\\house.csv";
    private static final String PROFILE_ROOM = "E:\\Code Gym\\Module 1\\Github\\Module2\\src\\data\\room.csv";


    private static Scanner scanner = new Scanner(System.in);

    private static final String REGEX_ID_VILLA = "^SVVL-[0-9]{4}$";
    private static final String REGEX_ID_HOUSE = "^SVHO-[0-9]{4}$";
    private static final String REGEX_ID_ROOM = "^SVRO-[0-9]{4}$";
    private static final String REGEX_NAME_SERVICE = "^[A-Z][a-z]+$";
    private static final String REGEX_AMOUNT_PEOPLE = "^[1-9]|([1][1-9])|(20)";
    private static final String REGEX_ID_AREA_USE = "^([3-9]\\d)|([1-9]\\d{2,})$";
    private static final String REGEX_ID_AREA_POOL = "^[0-9]{2}$";
    private static final String REGEX_ID_PRICE = "^[0-9]{1,}$";

    @Override
    public void dispalyFacility() {
        for (Map.Entry<Facility, Integer> facility : facilityIntegerMap.entrySet()) {
            System.out.println("Dịch vụ : " + facility.getKey() + "Số lần thuê" + facility.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addnewVilla() {
//        String name,
//        double area,
//        int price,
//        int rentalPeopleMax,
//        String styleRental,
//        String standardVilla,
//        double areaPool,
//        int floor

        System.out.print("Mời bạn tên IdService:");
        //String idService = scanner.nextLine();
        String idService = RegexData.checkStr(scanner.nextLine(),REGEX_ID_VILLA,
                "Bạn đã nhập sai định dạng ID Villa. Mời Nhập lại đúng định dạng SVVL-XXXX!");

        System.out.print("Mời bạn tên Villa:");
        //String name = scanner.nextLine();
        String name = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng Name Villa. Mời Nhập lại đúng định dạng 'Abcd'!");

        System.out.print("Mời bạn nhập diện tích sử dụng Villa:");
        //int area = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_AREA_USE,
                "Bạn đã nhập sai định dạng. Diện tích sử dụng phải là số thực lớn hơn 30m2"));

        System.out.print("Mời bạn nhập giá thuê Villa:");
        //int price = Integer.parseInt(scanner.nextLine());
        int price = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_PRICE,
                "Bạn đã nhập sai định dạng.Chi phí thuê là số dương"));

        System.out.print("Mời bạn nhập số lượng người tối đa của Villa:");
        //int rendtalPeopleMax = Integer.parseInt(scanner.nextLine());
        int rendtalPeopleMax = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_AMOUNT_PEOPLE,
                "Bạn đã nhập sai định dạng. Số lượng người tối đa phải >0 và nhỏ hơn <20"));

        System.out.print("Mời bạn nhập kiểu phòng Villa:");
        //String styleRental = scanner.nextLine();
        String styleRental = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng kiểu phòng Villa. Mời Nhập lại đúng định dạng 'Abcd'!");


        System.out.print("Mời bạn tiêu chuẩn Villa:");
        //String standardVilla = scanner.nextLine();
        String standardVilla = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng tiêu chuẩn Villa. Mời Nhập lại đúng định dạng 'Abcd'!");

        System.out.print("Mời bạn nhập diện tích hồ bơi Villa:");
        //double areaPool = Double.parseDouble(scanner.nextLine());
        double areaPool = Double.parseDouble(RegexData.checkStr(scanner.nextLine(),REGEX_ID_AREA_USE,
                "Bạn đã nhập sai định dạng. Diện tích sử dụng phải là số thực lớn hơn 30m2"));

        System.out.print("Mời bạn nhập số tầng của Villa:");
        //int floor = Integer.parseInt(scanner.nextLine());
        int floor = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_PRICE,
                "Bạn đã nhập sai định dạng.Số tầng là số dương"));



        Villa villa = new Villa(idService, name, area, price, rendtalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Thêm mới Villa thành công!");
    }

    @Override
    public void addnewHouse() {
//                 String name,
//                 double area,
//                 int price,
//                 int rentalPeopleMax,
//                 String styleRental,
//                 String standardRoom,
//                 int floor
        System.out.print("Mời bạn tên IdService:");
        //String idService = scanner.nextLine();
        String idService = RegexData.checkStr(scanner.nextLine(),REGEX_ID_HOUSE,
                "Bạn đã nhập sai định dạng ID House. Mời Nhập lại đúng định dạng SVVL-XXXX!");

        System.out.print("Mời bạn tên House:");
        //String name = scanner.nextLine();
        String name = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng Name House. Mời Nhập lại đúng định dạng 'Abcd'!");

        System.out.print("Mời bạn nhập diện tích sử dụng House:");
        //int area = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_AREA_USE,
                "Bạn đã nhập sai định dạng. Diện tích sử dụng phải là số thực lớn hơn 30m2"));

        System.out.print("Mời bạn nhập giá thuê House:");
        //int price = Integer.parseInt(scanner.nextLine());
        int price = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_PRICE,
                "Bạn đã nhập sai định dạng.Chi phí thuê là số dương"));

        System.out.print("Mời bạn nhập số lượng người tối đa của House:");
        //int rendtalPeopleMax = Integer.parseInt(scanner.nextLine());
        int rendtalPeopleMax = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_AMOUNT_PEOPLE,
                "Bạn đã nhập sai định dạng. Số lượng người tối đa phải >0 và nhỏ hơn <20"));

        System.out.print("Mời bạn nhập kiểu phòng House:");
        //String styleRental = scanner.nextLine();
        String styleRental = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng kiểu phòng House. Mời Nhập lại đúng định dạng 'Abcd'!");


        System.out.print("Mời bạn tiêu chuẩn House:");
        //String standardVilla = scanner.nextLine();
        String standardHouse = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng tiêu chuẩn House. Mời Nhập lại đúng định dạng 'Abcd'!");

        System.out.print("Mời bạn nhập số tầng của Villa:");
        //int floor = Integer.parseInt(scanner.nextLine());
        int floor = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_PRICE,
                "Bạn đã nhập sai định dạng.Số tầng là số dương"));


        House house = new House(idService, name, area, price, rendtalPeopleMax, styleRental, standardHouse, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Thêm mới House thành công!");
    }

    @Override
    public void addnewRoom() {
        //String name,
        //                double area,
        //                int price,
        //                int rentalPeopleMax,
        //                String styleRental,
        //                String servicePlus

        System.out.print("Mời bạn tên IdService:");
        //String idService = scanner.nextLine();
        String idService = RegexData.checkStr(scanner.nextLine(),REGEX_ID_ROOM,
                "Bạn đã nhập sai định dạng ID Room. Mời Nhập lại đúng định dạng SVVL-XXXX!");

        System.out.print("Mời bạn tên Room:");
        //String name = scanner.nextLine();
        String name = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng Name Room. Mời Nhập lại đúng định dạng 'Abcd'!");

        System.out.print("Mời bạn nhập diện tích sử dụng Room:");
        //int area = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_AREA_USE,
                "Bạn đã nhập sai định dạng. Diện tích sử dụng phải là số thực lớn hơn 30m2"));

        System.out.print("Mời bạn nhập giá thuê Room:");
        //int price = Integer.parseInt(scanner.nextLine());
        int price = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_ID_PRICE,
                "Bạn đã nhập sai định dạng.Chi phí thuê là số dương"));

        System.out.print("Mời bạn nhập số lượng người tối đa của Room:");
        //int rendtalPeopleMax = Integer.parseInt(scanner.nextLine());
        int rendtalPeopleMax = Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_AMOUNT_PEOPLE,
                "Bạn đã nhập sai định dạng. Số lượng người tối đa phải >0 và nhỏ hơn <20"));

        System.out.print("Mời bạn nhập kiểu phòng Room:");
        //String styleRental = scanner.nextLine();
        String styleRental = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng kiểu phòng Room. Mời Nhập lại đúng định dạng 'Abcd'!");


        System.out.print("Mời bạn nhập dịch vụ đi kèm Room:");
        //String standardVilla = scanner.nextLine();
        String servicePlus = RegexData.checkStr(scanner.nextLine(),REGEX_NAME_SERVICE,
                "Bạn đã nhập sai định dạng tiêu chuẩn tên dịch vụ đi kèm Room. Mời Nhập lại đúng định dạng 'Abcd'!");

        Room room = new Room(idService, name, area, price, rendtalPeopleMax, styleRental, servicePlus);
        facilityIntegerMap.put(room, 0);
    }
    public static void write(String link) {
        File file = new File(link);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriterVilla = new FileWriter(PROFILE_VILLA);
            FileWriter fileWriterHouse = new FileWriter(PROFILE_HOUSE);
            FileWriter fileWriterRoom = new FileWriter(PROFILE_ROOM);
            BufferedWriter bufferedWriterVilla = new BufferedWriter(fileWriterVilla);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);
            for (Map.Entry<Facility, Integer> entry: facilityIntegerMap.entrySet()){
                if (entry.getKey() instanceof Villa){
                    //String idService,
                    //                 String nameService,
                    //                 double areaUse,
                    //                 int price,
                    //                 int rentalPeopleMax,
                    //                 String styleRental,
                    //                 String standardVilla,
                    //                 double areaPool,
                    //                 int floor
                    bufferedWriterVilla.write(entry.getKey().getIdService()+","+
                            entry.getKey().getNameService()+","+
                            entry.getKey().getAreaUse()+","+
                            entry.getKey().getPrice()+","+
                            entry.getKey().getRentalPeopleMax()+","+
                            entry.getKey().getStyleRental()+","+
                            ((Villa) entry.getKey()).getStandardVilla()+","+
                            ((Villa) entry.getKey()).getAreaPool()+","+
                            ((Villa) entry.getKey()).getFloor()
                    );
                    bufferedWriterVilla.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //int id,
        //                    String name,
        //                    String dayOfBirth,
        //                    String gender,
        //                    String soCmnd,
        //                    String phoneNumber,
        //                    String email,
        //                    String prof,
        //                    String level,
        //                    int payment


    }
}
