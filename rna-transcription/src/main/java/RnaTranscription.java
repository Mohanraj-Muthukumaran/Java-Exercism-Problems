class RnaTranscription {

    String transcribe(String dnaStrand) {
        int iterator;
        String rnaStrand = new String();
        for(iterator=0;iterator<dnaStrand.length();iterator++){
            /* Check for the strand and assign its transcribed strand
                G -> C
                C -> G
                T -> A
                A -> U 
            */
            if(dnaStrand.charAt(iterator) == 'G'){
                rnaStrand = rnaStrand + 'C';
            }
            else if(dnaStrand.charAt(iterator) == 'C'){
                rnaStrand = rnaStrand + 'G';   
            }
            else if(dnaStrand.charAt(iterator) == 'T'){
                rnaStrand = rnaStrand + 'A';
            }
            else if(dnaStrand.charAt(iterator) == 'A'){
                rnaStrand = rnaStrand + 'U';
            }
        }
        return rnaStrand;
    }

}
