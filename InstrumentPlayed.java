public class InstrumentPlayed {
    public InstrumentPlayed(int randNumForInstrument, String userName) {
        if (randNumForInstrument == 1) {
            System.out.println(userName + "'s choice of instrument for band is flute.");
        } else if (randNumForInstrument == 2) {
            System.out.println(userName + "'s choice of instrument for band is clarinet.");
        } else if (randNumForInstrument == 3) {
            System.out.println(userName + "'s choice of instrument for band is alto saxophone.");
        } else if (randNumForInstrument == 4) {
            System.out.println(userName + "'s choice of instrument for band is trumpet/cornet.");
        } else if (randNumForInstrument == 5) {
            System.out.println(userName + "'s choice of instrument for band is trombone.");
        } else if (randNumForInstrument == 6) {
            System.out.println(userName + "'s choice of instrument for band is baritone.");
        } else if (randNumForInstrument == 7) {
            System.out.println(userName + "'s choice of instrument(s) for band is percussion.");
        } else if (randNumForInstrument == 8) {
            System.out.println(userName + "'s choice of instrument for band is tuba.");
        } else {
            System.out.println(userName + " doesn't want to play in band.");
        }
    }
}
