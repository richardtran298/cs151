package hw1;

import java.util.ArrayList;
import java.util.Arrays;

public class Section
{
    ArrayList<String> MF;
    ArrayList<String> SB;
    ArrayList<String> WB;
    ArrayList<String> EB;
    double price;
   
    public Section()
    {
        MF = new ArrayList<>(Arrays.asList("m1","m2","m3","m4","m5","m6","m7","m8","m9","m10",
                "m11","m12","m13","m14","m15","m16","m17","m18","m19","m20","m21","m21","m23",
                "m24","m25","m26","m27","m28","m29","m30","m31","m32","m33","m34","m35","m36",
                "m37","m38","m39","m40","m41","m42","m43","m44","m45","m46","m47","m48","m49",
                "m50","m51","m52","m53","m54","m55","m56","m57","m58","m59","m60","m61","m62",
                "m63","m64","m65","m66","m67","m68","m69","m70","m71","m72","m73","m74","m75",
                "m76","m77","m78","m79","m80","m81","m82","m83","m84","m85","m86","m87","m88",
                "m89","m90","m91","m92","m93","m94","m95","m96","m97","m98","m99","m100","m101",
                "m102","m103","m104","m105","m106","m107","m108","m109","m110","m111","m112",
                "m113","m114","m115","m116","m117","m118","m119","m120","m121","m122","m123",
                "m124","m125","m126","m127","m128","m129","m130","m131","m132","m133","m134",
                "m135","m136","m137","m138","m139","m140","m141","m142","m143","m144","m145",
                "m146","m147","m148","m149","m150"));
        //this.price = price;
        
    }
    
    public void getShow()
    {
        for (String s : MF)
        {
            System.out.print(s + " ");
        }
    }
}