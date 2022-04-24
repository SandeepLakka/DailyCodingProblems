package io.github.sandeeplakka.dcp;

/**
 * This problem was asked by Cisco.
 * <p>
 * Given an unsigned 8-bit integer, swap its even and odd bits.
 * The 1st and 2nd bit should be swapped, the 3rd and 4th bit should be swapped, and so on.
 * <p>
 * For example, 10101010 should be 01010101. 11100010 should be 11010001.
 * <p>
 * Bonus: Can you do this in one line?
 * <p>
 * Level : Medium
 */
public class EvenOddBitSwapper {

    public short swapBitsV1(short input) {
        //Get the even positioned bits
        short evenBits = (short) (input & 0xAA);
        //Get the odd positioned bits
        short oddBits = (short) (input & 0x55);
        //Shift even places to odd and odd places to even
        return (short) ((evenBits >> 1) | (oddBits << 1));
    }

    //Bonus : OneLiner
    public short swapBitsV2(short input) {
        return (short) (((input & 0xAA) >> 1) | ((input & 0x55) << 1));
    }

}
