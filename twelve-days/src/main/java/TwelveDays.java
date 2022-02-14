import java.util.HashMap;

class TwelveDays {

    HashMap<Number, String> lyrics = new HashMap<Number, String>();

    public TwelveDays(){
        lyrics.put(1, "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.");
        lyrics.put(2, "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(3, "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(4, "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(5, "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(6, "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(7, "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(8, "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(9, "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(10, "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(11, "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        lyrics.put(12, "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
    }

    String verse(int verseNumber) {
        return lyrics.get(verseNumber) + "\n";
    }

    String verses(int startVerse, int endVerse) {
        int iterator;
        String song = new String();
        // iterating the entire lyrics
        for(iterator=startVerse;iterator<=endVerse;iterator++){
            if(iterator == endVerse){
                song = song + lyrics.get(iterator) + "\n";
            }
            else{
                song = song + lyrics.get(iterator) + "\n" + "\n";
            }
        }
        return song;
    }
    
    String sing() {
        int iterator;
        String song = new String();
        // iterating the entire lyrics
        for(iterator=0;iterator<12;iterator++){
            if(iterator == 11){
                song = song + lyrics.get(iterator+1) + "\n";
            }
            else{
                song = song + lyrics.get(iterator+1) + "\n" + "\n";
            }
        }
        return song;
    }

}
