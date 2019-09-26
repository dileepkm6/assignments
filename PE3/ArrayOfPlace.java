import java.util.Scanner;

public class ArrayOfPlace {
    public String[] removeVowelsOfArray(String []places)
    {
        for(int index=0;index<places.length;index++)
        {
            places[index]=removeVowels(places[index]);
        }
        return places;
    }
    public String removeVowels(String placeName)
    {
        StringBuffer place=new StringBuffer(placeName);
        for(int index=0;index<place.length();index++)
        {
            if(place.charAt(index)==65 || place.charAt(index)==97 || place.charAt(index)==69 || place.charAt(index)==101 || place.charAt(index)== 73 || place.charAt(index)==105 || place.charAt(index)==79 || place.charAt(index)==111 || place.charAt(index)==85 || place.charAt(index)==117)
            {
                place.deleteCharAt(index);
            }
        }
        return place.toString();
    }
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        ArrayOfPlace arrayOfPlace=new ArrayOfPlace();
        System.out.println("enter the name of place with space:");
        String place=scanner.nextLine();
        String places[]=place.split(" ");
        places=arrayOfPlace.removeVowelsOfArray(places);
        System.out.println("places without vowels:");
        for(int index=0;index<places.length;index++)
        {
            System.out.println("Place Name without Vowels: "+places[index]);
        }
    }
}
